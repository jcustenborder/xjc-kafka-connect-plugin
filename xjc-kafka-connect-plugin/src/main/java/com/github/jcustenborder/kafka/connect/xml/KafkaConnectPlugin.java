/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.xml;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import org.jvnet.jaxb2_commons.plugin.AbstractParameterizablePlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sun.codemodel.JType.parse;

public class KafkaConnectPlugin extends AbstractParameterizablePlugin {
  static final String TO_CONNECT_STRUCT = "toStruct";
  static final String FROM_CONNECT_STRUCT = "fromStruct";
  static final Class<?> CLASS_JNARROWED;
  static final Class<?> CLASS_JREFERENCEDCLASS;
  private static final Logger log = LoggerFactory.getLogger(KafkaConnectPlugin.class);
  private static final String CONNECT_SCHEMA_FIELD = "CONNECT_SCHEMA";

  static {
    try {
      CLASS_JNARROWED = Class.forName("com.sun.codemodel.JNarrowedClass");
      CLASS_JREFERENCEDCLASS = Class.forName("com.sun.codemodel.JCodeModel$JReferencedClass");
    } catch (ClassNotFoundException e) {
      throw new IllegalStateException(e);
    }
  }

  Types types;
  Map<JType, StaticTypeState> jTypeLookup;
  Map<String, XmlTypeState> xmlTypeLookup;
  Map<JType, DefinedTypeState> definedTypeStateLookup = new HashMap<>();

  @Override
  public String getOptionName() {
    return "Xconnect";
  }

  @Override
  public String getUsage() {
    return "TBD";
  }

  JFieldVar processSchema(JCodeModel codeModel, ClassOutline classOutline, List<FieldState> fieldStates) {
    final JFieldVar schemaVariable = classOutline.implClass.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, this.types.schema(), CONNECT_SCHEMA_FIELD);

    final JBlock constructorBlock = classOutline.implClass.init();
    final JVar builderVar = constructorBlock.decl(this.types.schemaBuilder(), "builder", this.types.schemaBuilder().staticInvoke("struct"));
    final String schemaName = String.format("%s.%s", classOutline._package()._package().name(), classOutline.implClass.name());
    constructorBlock.invoke(builderVar, "name").arg(schemaName);
    constructorBlock.invoke(builderVar, "optional");

    final JVar fieldBuilderVar = constructorBlock.decl(this.types.schemaBuilder(), "fieldBuilder");

    for (FieldState fieldState : fieldStates) {
      if (fieldState.schemaBuilder() instanceof JInvocation) {
        constructorBlock.assign(fieldBuilderVar, fieldState.schemaBuilder());
        if (!fieldState.required()) {
          constructorBlock.invoke(fieldBuilderVar, "optional");
        }

        constructorBlock.invoke(builderVar, "field")
            .arg(fieldState.name())
            .arg(fieldBuilderVar.invoke("build"));
      } else {
        constructorBlock.invoke(builderVar, "field")
            .arg(fieldState.name())
            .arg(fieldState.schemaBuilder());
      }
    }


    //Build the schema
    constructorBlock.assign(schemaVariable, builderVar.invoke("build"));
    return schemaVariable;
  }

  void add(Map<JType, StaticTypeState> result, JExpression schemaBuilder, JExpression schema, String readMethod, String writeMethod, JCodeModel codeModel, Class<?>... classes) {
    ImmutableStaticTypeState.Builder builder = ImmutableStaticTypeState.builder();

    for (Class<?> cls : classes) {
      final JType type;
      if (cls.isPrimitive()) {
        type = parse(codeModel, cls.getName());
      } else {
        type = codeModel.ref(cls);
      }
      builder.addTypes(type);
    }
    builder.readMethod(readMethod);
    builder.writeMethod(writeMethod);
    builder.schema(schema);
    builder.schemaBuilder(schemaBuilder);
    StaticTypeState typeState = builder.build();
    for (JType type : typeState.types()) {
      result.put(type, typeState);
    }
  }

  Map<JType, StaticTypeState> buildTypeLookup(JCodeModel codeModel) {
    Map<JType, StaticTypeState> result = new HashMap<>();

    add(result, this.types.schemaBuilder().staticInvoke("bool"), this.types.schema().staticRef("BOOLEAN_SCHEMA"), "toBoolean", "fromBoolean", codeModel, boolean.class, Boolean.class);
    add(result, this.types.schemaBuilder().staticInvoke("float32"), this.types.schema().staticRef("FLOAT32_SCHEMA"), "toFloat32", "fromFloat32", codeModel, float.class, Float.class);
    add(result, this.types.schemaBuilder().staticInvoke("float64"), this.types.schema().staticRef("FLOAT64_SCHEMA"), "toFloat64", "fromFloat64", codeModel, double.class, Double.class);
    add(result, this.types.schemaBuilder().staticInvoke("int8"), this.types.schema().staticRef("INT8_SCHEMA"), "toInt8", "fromInt8", codeModel, byte.class, Byte.class);
    add(result, this.types.schemaBuilder().staticInvoke("int16"), this.types.schema().staticRef("INT16_SCHEMA"), "toInt16", "fromInt16", codeModel, short.class, Short.class);
    add(result, this.types.schemaBuilder().staticInvoke("int32"), this.types.schema().staticRef("IN32_SCHEMA"), "toInt32", "fromInt32", codeModel, int.class, Integer.class);
    add(result, this.types.schemaBuilder().staticInvoke("int64"), this.types.schema().staticRef("IN64_SCHEMA"), "toInt64", "fromInt64", codeModel, long.class, Long.class);
    add(result, this.types.schemaBuilder().staticInvoke("int64"), this.types.schema().staticRef("IN64_SCHEMA"), "toInt64", "fromInt64BigInteger", codeModel, BigInteger.class);
    add(result, this.types.schemaBuilder().staticInvoke("bytes"), this.types.schema().staticRef("BYTES_SCHEMA"), "toBytes", "fromBytes", codeModel, byte[].class);
    add(result, this.types.schemaBuilder().staticInvoke("string"), this.types.schema().staticRef("STRING_SCHEMA"), "toString", "fromString", codeModel, String.class);
    add(result, this.types.decimal().staticInvoke("builder").arg(JExpr.lit(12)), null, "toDecimal", "fromDecimal", codeModel, BigDecimal.class);

    add(result, this.types.connectableHelper().staticInvoke("qnameBuilder"), null, "toQname", "fromQname", codeModel, QName.class);
    add(result, this.types.schemaBuilder().staticInvoke("int64"), this.types.schema().staticRef("IN64_SCHEMA"), "toDuration", "fromDuration", codeModel, Duration.class);

    return ImmutableMap.copyOf(result);
  }

  void add(Map<String, XmlTypeState> result, JExpression schemaBuilder, JExpression schema, String readMethod, String writeMethod, String... xmlTypes) {
    com.github.jcustenborder.kafka.connect.xml.ImmutableXmlTypeState.Builder builder = com.github.jcustenborder.kafka.connect.xml.ImmutableXmlTypeState.builder();
    builder.addXmlTypes(xmlTypes);
    builder.schema(schema);
    builder.readMethod(readMethod);
    builder.writeMethod(writeMethod);
    builder.schemaBuilder(schemaBuilder);
    XmlTypeState typeState = builder.build();
    for (String type : typeState.xmlTypes()) {
      result.put(type, typeState);
    }
  }

  Map<String, XmlTypeState> buildXmlTypeLookup() {
    Map<String, XmlTypeState> result = new HashMap<>();
    add(result, this.types.date().staticInvoke("builder"), this.types.date().staticRef("SCHEMA"), "toDate", "fromDate", "date");
    add(result, this.types.time().staticInvoke("builder"), this.types.time().staticRef("SCHEMA"), "toTime", "fromTime", "time");
    add(result, this.types.timestamp().staticInvoke("builder"), this.types.timestamp().staticRef("BOOLEAN_SCHEMA"), "toDateTime", "fromDateTime", "dateTime");
    add(result, this.types.schemaBuilder().staticInvoke("int32"), this.types.schema().staticRef("INT32_SCHEMA"), "toInt32", "fromInt32", "unsignedShort", "int");
    add(result, this.types.schemaBuilder().staticInvoke("int64"), this.types.schema().staticRef("INT64_SCHEMA"), "toInt64", "fromInt64BigInteger",
        "negativeInteger", "nonNegativeInteger", "nonPositiveInteger", "negativeInteger",
        "unsignedLong", "positiveInteger"
    );
    add(result, this.types.schemaBuilder().staticInvoke("int64"), this.types.schema().staticRef("INT64_SCHEMA"), "toInt64", "fromInt64",
        "unsignedInt"
    );
    add(result, this.types.schemaBuilder().staticInvoke("string"), this.types.schema().staticRef("STRING_SCHEMA"), "toString", "fromString",
        "anySimpleType", "normalizedString", "anyURI", "ENTITY", "Name", "NCName", "token",
        "ID", "IDREF", "language", "NMTOKEN"
    );
    add(result, this.types.schemaBuilder().staticInvoke("int32"), this.types.schema().staticRef("INT32_SCHEMA"), "toXmlgDay", "fromXmlgDay", "gDay");
    add(result, this.types.schemaBuilder().staticInvoke("int32"), this.types.schema().staticRef("INT32_SCHEMA"), "toXmlgMonth", "fromXmlgMonth", "gMonth");
    add(result, this.types.date().staticInvoke("builder"), this.types.schema().staticRef("INT32_SCHEMA"), "toXmlgMonthDay", "fromXmlgMonthDay", "gMonthDay");
    add(result, this.types.date().staticInvoke("builder"), this.types.schema().staticRef("INT32_SCHEMA"), "toXmlgYearMonth", "fromXmlgYearMonth", "gYearMonth");
    add(result, this.types.schemaBuilder().staticInvoke("int32"), this.types.schema().staticRef("INT32_SCHEMA"), "toXmlgYear", "fromXmlgYear", "gYear");
    add(result, this.types.schemaBuilder().staticInvoke("bytes"), this.types.schema().staticRef("BYTES_SCHEMA"), "toBytes", "fromBytes", "base64Binary", "hexBinary");
    add(result, this.types.schemaBuilder().staticInvoke("int16"), this.types.schema().staticRef("INT16_SCHEMA"), "toInt16", "fromInt16", "unsignedByte");
    add(result, this.types.schemaBuilder().staticInvoke("array").arg(this.types.schema().staticRef("STRING")), null, "toArray", "fromArray", "IDREFS");


    return ImmutableMap.copyOf(result);
  }

  void setupImportedClasses(JCodeModel codeModel) {
    this.types = Types.build(codeModel);
    this.jTypeLookup = buildTypeLookup(codeModel);
    this.xmlTypeLookup = buildXmlTypeLookup();
  }

  void processToStruct(JFieldVar schemaField, JCodeModel codeModel, ClassOutline classOutline, List<FieldState> fieldStates) {

    final JMethod method = classOutline.implClass.method(JMod.PUBLIC, this.types.struct(), TO_CONNECT_STRUCT);
    method.annotate(Override.class);
    final JBlock methodBody = method.body();
    final JVar structVar = methodBody.decl(this.types.struct(), "struct", JExpr._new(this.types.struct()).arg(schemaField));

    for (FieldState fieldState : fieldStates) {

      JInvocation callAddMethod = this.types.connectableHelper().staticInvoke(fieldState.readMethod())
          .arg(structVar)
          .arg(JExpr.lit(fieldState.name()))
          .arg(JExpr._this().ref(fieldState.fieldVar()));

      for (JExpression arg : fieldState.readMethodArgs()) {
        callAddMethod.arg(arg);
      }

      methodBody.add(callAddMethod);
    }

    methodBody._return(structVar);
  }

  void processFromStruct(JCodeModel codeModel, ClassOutline classOutline, List<FieldState> fieldStates) {
    final JMethod method = classOutline.implClass.method(JMod.PUBLIC, void.class, FROM_CONNECT_STRUCT);
    final JVar structVar = method.param(this.types.struct(), "struct");
    method.annotate(Override.class);
    final JBlock methodBody = method.body();

    for (FieldState fieldState : fieldStates) {
      JInvocation callAddMethod = this.types.connectableHelper().staticInvoke(fieldState.writeMethod())
          .arg(structVar)
          .arg(JExpr.lit(fieldState.name()));

      for (JExpression arg : fieldState.writeMethodArgs()) {
        callAddMethod.arg(arg);
      }

      methodBody.assign(
          JExpr._this().ref(fieldState.fieldVar()),
          callAddMethod
      );
    }
  }

  State type(JCodeModel codeModel, ClassOutline classOutline, JFieldVar field, JType type) {

    if (this.types.blackListTypes().contains(type)) {
      throw new TypeTooGenericException(classOutline, field, null, type);
    }


    State jTypeState = this.jTypeLookup.get(type);

    if (null != jTypeState) {
      return jTypeState;
    }

    if (type instanceof JDefinedClass) {
      return this.definedTypeStateLookup.computeIfAbsent(type, jType -> {
        JDefinedClass jDefinedClass = (JDefinedClass) type;
        ImmutableDefinedTypeState.Builder builder = ImmutableDefinedTypeState.builder();
        if (null != AnnotationUtils.annotationAttributes(codeModel, field, XmlEnum.class)) {
          builder.schemaBuilder(this.types.schemaBuilder().staticInvoke("string"));
          builder.readMethod("toString");
          builder.writeMethod("toEnum");
          builder.addWriteMethodArgs(jDefinedClass.dotclass());
        } else {
          builder.schemaBuilder(jDefinedClass.staticRef(CONNECT_SCHEMA_FIELD));
          builder.readMethod("toStruct");
          builder.writeMethod("fromStruct");
          builder.addWriteMethodArgs(jDefinedClass.dotclass());
          builder.schema(jDefinedClass.staticRef(CONNECT_SCHEMA_FIELD));
        }
        builder.type(type);
        return builder.build();
      });
    }

    if (CLASS_JNARROWED.equals(type.getClass())) {
      return this.definedTypeStateLookup.computeIfAbsent(type, jType -> {
        final JClass jClass = (JClass) field.type();
        final JClass basis;
        final List<JClass> args;
        try {
          Class<?> jnarrowedCls = Class.forName("com.sun.codemodel.JNarrowedClass");
          java.lang.reflect.Field basisField = jnarrowedCls.getDeclaredField("basis");
          basisField.setAccessible(true);
          java.lang.reflect.Field argsField = jnarrowedCls.getDeclaredField("args");
          argsField.setAccessible(true);
          basis = (JClass) basisField.get(jClass);
          args = (List<JClass>) argsField.get(jClass);
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
          throw new IllegalStateException(e);
        }

        ImmutableDefinedTypeState.Builder builder = ImmutableDefinedTypeState.builder()
            .type(type);

        if (this.types.qNameMap().equals(jClass)) {
          // This case pops up when anyattribute is in use.
          JInvocation schemaBuilder = this.types.schemaBuilder().staticInvoke("map")
              .arg(this.types.connectableHelper().staticRef("QNAME_SCHEMA"))
              .arg(this.types.schema().staticRef("OPTIONAL_STRING_SCHEMA"));
          builder.schemaBuilder(schemaBuilder);
          builder.readMethod("toQNameMap");
          builder.writeMethod("fromQNameMap");
          return builder.build();
        } else if (this.types.list().equals(basis)) {
          JClass valueType = args.get(0);
          State valueState = type(codeModel, classOutline, field, valueType);

          JInvocation schemaBuilder = this.types.schemaBuilder().staticInvoke("array")
              .arg(valueState.schema());
          builder.schemaBuilder(schemaBuilder);
          builder.readMethod("toArray");
          builder.writeMethod("fromArray");
          builder.addWriteMethodArgs(valueType.dotclass());
          return builder.build();
        } else if (this.types.map().equals(basis)) {
          JClass keyType = args.get(0);
          State keyState = type(codeModel, classOutline, field, keyType);
          JClass valueType = args.get(1);
          State valueState = type(codeModel, classOutline, field, valueType);
          JInvocation schemaBuilder = this.types.schemaBuilder().staticInvoke("map")
              .arg(keyState.schema())
              .arg(valueState.schema());
          builder.schemaBuilder(schemaBuilder);
          builder.readMethod("toMap");
          builder.writeMethod("fromMap");
          builder.addWriteMethodArgs(keyType.dotclass());
          builder.addWriteMethodArgs(valueType.dotclass());
          return builder.build();
        } else {
          throw new UnsupportedTypeException(
              classOutline,
              field,
              field.type(),
              basis
          );
        }
      });
    }


    throw new UnsupportedTypeException(
        classOutline,
        field,
        null,
        field.type()
    );
  }


  FieldState field(JCodeModel codeModel, ClassOutline classOutline, final String fieldName, final JFieldVar jFieldVar) {
    try {
      log.trace("field() - processing name = '{}' type = '{}'", fieldName, jFieldVar.type().name());
      final com.github.jcustenborder.kafka.connect.xml.ImmutableFieldState.Builder fieldState = com.github.jcustenborder.kafka.connect.xml.ImmutableFieldState.builder();
      final String name = AnnotationUtils.name(codeModel, jFieldVar, fieldName);
      final boolean required = AnnotationUtils.required(codeModel, jFieldVar);
      final String xmlType = AnnotationUtils.xmlType(codeModel, jFieldVar);

      fieldState.required(required);
      fieldState.name(name);
      fieldState.fieldVar(jFieldVar);

      if (!Strings.isNullOrEmpty(xmlType)) {
        log.trace("field() - xmlType = '{}'", xmlType);
        XmlTypeState xmlTypeState = this.xmlTypeLookup.get(xmlType);
        if (null == xmlTypeState) {
          throw new UnsupportedOperationException(
              String.format("%s is not a supported xml type.", xmlType)
          );
        }
        fieldState.from(xmlTypeState);
      } else {
        State jTypeState = type(codeModel, classOutline, jFieldVar, jFieldVar.type());

        if (null != jTypeState) {
          fieldState.from(jTypeState);
        } else if (CLASS_JREFERENCEDCLASS.equals(jFieldVar.type().getClass())) {
          log.warn("Nothing for {}", jFieldVar.type().fullName());
        } else {
          throw new UnsupportedTypeException(
              classOutline,
              jFieldVar,
              null,
              jFieldVar.type()
          );
        }
      }
      return fieldState.build();
    } catch (Exception ex) {
      throw new IllegalStateException(

          String.format(
              "Exception thrown while building field '%s'. %s",
              fieldName,
              classOutline.implClass.name()
          ),
          ex);
    }
  }

  void fields(JCodeModel codeModel, ClassOutline classOutline, List<FieldState> fieldStates) {
    final Map<String, JFieldVar> fields = classOutline.implClass.fields();

    for (final Map.Entry<String, JFieldVar> kvp : fields.entrySet()) {
      final String fieldName = kvp.getKey();
      if (CONNECT_SCHEMA_FIELD.equals(fieldName)) {
        continue;
      }

      final JFieldVar jFieldVar = kvp.getValue();
      final FieldState fieldState = field(codeModel, classOutline, fieldName, jFieldVar);
      fieldStates.add(fieldState);
    }

    if (classOutline.getSuperClass() != null) {
      fields(codeModel, classOutline.getSuperClass(), fieldStates);
    }
  }

  List<FieldState> fields(JCodeModel codeModel, ClassOutline classOutline) {
    List<FieldState> result = new ArrayList<>();
    fields(codeModel, classOutline, result);
    return result;
  }

  @Override
  public boolean run(Outline model, Options options, ErrorHandler errorHandler) throws
      SAXException {
    try {
      JCodeModel codeModel = model.getCodeModel();
      setupImportedClasses(codeModel);
      for (ClassOutline classOutline : model.getClasses()) {
        classOutline.implClass._implements(this.types.connectable());
        log.trace("run - {}", classOutline.implClass.name());

        List<FieldState> fieldStates = fields(codeModel, classOutline);
        log.trace("Found {} field(s). {}", fieldStates.size(), fieldStates);

        JFieldVar schemaField = processSchema(codeModel, classOutline, fieldStates);
        processToStruct(schemaField, codeModel, classOutline, fieldStates);
        processFromStruct(codeModel, classOutline, fieldStates);
      }
      return true;
    } catch (Exception e) {
      errorHandler.error(new SAXParseException("Exception thrown while processing: " + e.getMessage(), null, e));
      return false;
    }
  }


}
