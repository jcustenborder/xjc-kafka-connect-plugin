/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.xml;

import com.google.common.base.CaseFormat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JConditional;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldRef;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JForEach;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPrimitiveType;
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
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
//import org.jvnet.jaxb2_commons.plugin.Customizations;


public class KafkaConnectPlugin extends AbstractParameterizablePlugin {
  private static final Logger log = LoggerFactory.getLogger(KafkaConnectPlugin.class);

  @Override
  public String getOptionName() {
    return "Xconnect";
  }

  @Override
  public String getUsage() {
    return "TBD";
  }

  private static final String CONNECT_SCHEMA_FIELD = "CONNECT_SCHEMA";

  JFieldVar processSchema(JCodeModel codeModel, ClassOutline classOutline, List<Field> fields) {
    final JFieldVar schemaVariable = classOutline.implClass.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, connectSchemaJClass, CONNECT_SCHEMA_FIELD);
//    final JMethod staticConstructor = classOutline.implClass.constructor(JMod.STATIC);

    final JBlock constructorBlock = classOutline.implClass.init();
    final JVar builderVar = constructorBlock.decl(connectSchemaBuilderJClass, "builder", connectSchemaBuilderJClass.staticInvoke("struct"));
    final String schemaName = String.format("%s.%s", classOutline._package()._package().name(), classOutline.implClass.name());
    constructorBlock.invoke(builderVar, "name").arg(schemaName);
    constructorBlock.invoke(builderVar, "optional");

    final JVar fieldBuilderVar = constructorBlock.decl(connectSchemaBuilderJClass, "fieldBuilder");

    for (Field field : fields) {
      if (field.type != Type.STRUCT) {
        constructorBlock.assign(fieldBuilderVar, field.schemaBuilder);
        if (!field.required) {
          constructorBlock.invoke(fieldBuilderVar, "optional");
        }

        constructorBlock.invoke(builderVar, "field").arg(field.name).arg(fieldBuilderVar.invoke("build"));
      } else {
        constructorBlock.invoke(builderVar, "field").arg(field.name).arg(field.schemaBuilder);
      }
    }


    //Build the schema
    constructorBlock.assign(schemaVariable, builderVar.invoke("build"));
    return schemaVariable;
  }


  JClass connectStructJClass;
  JClass connectTimestampJClass;
  JClass connectTimeJClass;
  JClass connectDateJClass;
  JClass connectDecimalJClass;
  JClass connectSchemaBuilderJClass;
  JClass connectSchemaJClass;
  JClass connectListOfStructJClass;
  JClass connectableJClass;
  JClass timezoneJClass;

  JClass typeList;
  JClass typeArrayList;
  JClass typeBigDecimal;
  JClass typeXMLGregorianCalendar;
  Map<JType, JExpression> typeLookup;

  void setupImportedClasses(JCodeModel codeModel) {
    typeList = codeModel.ref(List.class);
    connectStructJClass = codeModel.ref("org.apache.kafka.connect.data.Struct");
    typeArrayList = codeModel.ref(ArrayList.class).narrow(connectStructJClass);
    connectListOfStructJClass = typeList.narrow(connectStructJClass);
    connectDateJClass = codeModel.ref("org.apache.kafka.connect.data.Date");
    connectTimeJClass = codeModel.ref("org.apache.kafka.connect.data.Time");
    connectDecimalJClass = codeModel.ref("org.apache.kafka.connect.data.Decimal");
    connectTimestampJClass = codeModel.ref("org.apache.kafka.connect.data.Timestamp");
    connectSchemaBuilderJClass = codeModel.ref("org.apache.kafka.connect.data.SchemaBuilder");
    connectSchemaJClass = codeModel.ref("org.apache.kafka.connect.data.Schema");
    connectableJClass = codeModel.ref("com.github.jcustenborder.kafka.connect.xml.Connectable");
    timezoneJClass = codeModel.ref(TimeZone.class);

    Map<JType, JExpression> typeLookup = new HashMap<>();
    typeLookup.put(JPrimitiveType.parse(codeModel, boolean.class.getName()), connectSchemaBuilderJClass.staticInvoke("boolean"));
    typeLookup.put(codeModel.ref(Boolean.class), connectSchemaBuilderJClass.staticInvoke("boolean"));
    typeLookup.put(JPrimitiveType.parse(codeModel, float.class.getName()), connectSchemaBuilderJClass.staticInvoke("float32"));
    typeLookup.put(codeModel.ref(Float.class), connectSchemaBuilderJClass.staticInvoke("float32"));
    typeLookup.put(JPrimitiveType.parse(codeModel, double.class.getName()), connectSchemaBuilderJClass.staticInvoke("float64"));
    typeLookup.put(codeModel.ref(Double.class), connectSchemaBuilderJClass.staticInvoke("float64"));
    typeLookup.put(JPrimitiveType.parse(codeModel, byte.class.getName()), connectSchemaBuilderJClass.staticInvoke("int8"));
    typeLookup.put(codeModel.ref(Byte.class), connectSchemaBuilderJClass.staticInvoke("int8"));
    typeLookup.put(JPrimitiveType.parse(codeModel, short.class.getName()), connectSchemaBuilderJClass.staticInvoke("int16"));
    typeLookup.put(codeModel.ref(Short.class), connectSchemaBuilderJClass.staticInvoke("int16"));
    typeLookup.put(JPrimitiveType.parse(codeModel, int.class.getName()), connectSchemaBuilderJClass.staticInvoke("int32"));
    typeLookup.put(codeModel.ref(Integer.class), connectSchemaBuilderJClass.staticInvoke("int32"));
    typeLookup.put(JPrimitiveType.parse(codeModel, long.class.getName()), connectSchemaBuilderJClass.staticInvoke("int64"));
    typeLookup.put(codeModel.ref(Long.class), connectSchemaBuilderJClass.staticInvoke("int64"));
    typeLookup.put(codeModel.ref(BigInteger.class), connectSchemaBuilderJClass.staticInvoke("int64"));
    //TODO: This needs to be configurable some how.
    typeLookup.put(codeModel.ref(BigDecimal.class), connectDecimalJClass.staticInvoke("builder").arg(JExpr.lit(12)));

    typeLookup.put(codeModel.ref(String.class), connectSchemaBuilderJClass.staticInvoke("string"));
    this.typeLookup = typeLookup;

    typeXMLGregorianCalendar = codeModel.ref(XMLGregorianCalendar.class);
  }

  JMethod findMethod(JCodeModel codeModel, ClassOutline classOutline, Field field) {
    final String methodName;

    if (field.fieldVar.type().equals(codeModel.ref(Boolean.class)) || field.fieldVar.type().equals(JPrimitiveType.parse(codeModel, boolean.class.getName()))) {
      methodName = "is" + CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, field.fieldVar.name());
    } else {
      methodName = "get" + CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, field.fieldVar.name());
    }
    JMethod result = classOutline.implClass.getMethod(methodName, new JType[0]);

    if (null == result) {
      for (JMethod method : classOutline.implClass.methods()) {
        if (methodName.equalsIgnoreCase(method.name())) {
          result = method;
          break;
        }
      }
    }

    return result;
  }

  static final String STRUCT_METHOD_NAME = "toConnectStruct";

  void processToStruct(JFieldVar schemaField, JCodeModel codeModel, ClassOutline classOutline, List<Field> fields) {

    final JMethod method = classOutline.implClass.method(JMod.PUBLIC, connectStructJClass, STRUCT_METHOD_NAME);
    method.annotate(Override.class);
    final JBlock methodBody = method.body();
    final JVar structVar = methodBody.decl(connectStructJClass, "struct", JExpr._new(connectStructJClass).arg(schemaField));

    for (Field field : fields) {
      final JMethod getterMethod = findMethod(codeModel, classOutline, field);

      if (null == getterMethod) {
        Preconditions.checkNotNull(getterMethod,
            "Could not find getter method for %s.%s",
            classOutline.implClass.fullName(),
            field.fieldVar.name()
        );
      }
      JInvocation invokeGetter = JExpr._this().invoke(getterMethod);


      if (Type.ARRAY == field.type) {
        final JConditional nullCheck = methodBody._if(JExpr._null().ne(invokeGetter));
        final JVar structs = nullCheck._then().decl(connectListOfStructJClass, "structs", JExpr._new(typeArrayList));
        final JFieldRef oField = JExpr.ref("o");

        JForEach forLoop = nullCheck._then().forEach(field.arrayType, "o", invokeGetter);
        forLoop.body().add(structs.invoke("add").arg(oField.invoke(STRUCT_METHOD_NAME)));

        nullCheck._then().add(
            structVar.invoke("put")
                .arg(field.name)
                .arg(structs)
        );

      } else if (Type.STRUCT == field.type) {
        final JInvocation invokeStruct = invokeGetter.invoke(STRUCT_METHOD_NAME);
        final JConditional nullCheck = methodBody._if(JExpr._null().ne(invokeGetter));
        nullCheck.
            _then()
            .add(structVar.invoke("put")
                .arg(field.name)
                .arg(invokeStruct));
        nullCheck._else()
            .add(structVar.invoke("put")
                .arg(field.name)
                .arg(JExpr._null()));

      } else if (Type.VALUE == field.type) {
        methodBody.add(
            structVar.invoke("put")
                .arg(field.name)
                .arg(invokeGetter)
        );
      } else if (Type.XML_CALENDER == field.type) {
        final JConditional nullCheck = methodBody._if(JExpr._null().ne(invokeGetter));
        final JInvocation invokeGetTime = invokeGetter.invoke("toGregorianCalendar")
            .arg(codeModel.ref(TimeZone.class).staticInvoke("getTimeZone").arg("UTC"))
            .arg(JExpr._null())
            .arg(JExpr._null())
            .invoke("getTime");


        nullCheck._then()
            .add(structVar.invoke("put")
                .arg(field.name)
                .arg(invokeGetTime)
            );

        nullCheck._else()
            .add(structVar.invoke("put")
                .arg(field.name)
                .arg(JExpr._null()));


      } else if (Type.VALUE == field.type) {
        methodBody.add(
            structVar.invoke("put")
                .arg(field.name)
                .arg(invokeGetter)
        );
      } else if (Type.XML_ENUM == field.type) {
        final JInvocation invokeValue = invokeGetter.invoke("value");
        final JConditional nullCheck = methodBody._if(JExpr._null().ne(invokeGetter));
        nullCheck._then()
            .add(structVar.invoke("put")
                .arg(field.name)
                .arg(invokeValue));
        nullCheck._else()
            .add(structVar.invoke("put")
                .arg(field.name)
                .arg(JExpr._null()));
      }
    }

    methodBody._return(structVar);
  }

  void processFromStruct(JCodeModel codeModel, ClassOutline classOutline) {

  }

  enum Type {
    VALUE,
    ARRAY,
    STRUCT,
    XML_ENUM,
    XML_CALENDER;
  }

  static class Field {
    public String name;
    public JFieldVar fieldVar;
    public boolean required;
    public Type type;
    public JExpression schemaBuilder;
    public JType arrayType;

    @Override
    public String toString() {
      return MoreObjects.toStringHelper(this)
          .omitNullValues()
          .add("name", this.name)
          .add("required", this.required)
          .add("type", this.type)
          .toString();
    }
  }

  static final Class<?> CLASS_JNARROWED;
  static final Class<?> CLASS_JREFERENCEDCLASS;
  static final Class<?> CLASS_JARRAYCLASS;

  static {
    try {
      CLASS_JNARROWED = Class.forName("com.sun.codemodel.JNarrowedClass");
      CLASS_JREFERENCEDCLASS = Class.forName("com.sun.codemodel.JCodeModel$JReferencedClass");
      CLASS_JARRAYCLASS = Class.forName("com.sun.codemodel.JArrayClass");
    } catch (ClassNotFoundException e) {
      throw new IllegalStateException(e);
    }
  }


  List<Field> fields(JCodeModel codeModel, ClassOutline classOutline) {
    List<Field> result = new ArrayList<>();
    final Map<String, JFieldVar> fields = classOutline.implClass.fields();

    for (final Map.Entry<String, JFieldVar> kvp : fields.entrySet()) {
      final String fieldName = kvp.getKey();
      final JFieldVar jFieldVar = kvp.getValue();
      log.trace("processSchema() - processing name = '{}' type = '{}'", fieldName, jFieldVar.type().name());

      final Field field = new Field();
      result.add(field);
      field.fieldVar = jFieldVar;

      final Map<String, Object> xmlElementValues = AnnotationUtils.xmlElement(codeModel, jFieldVar);
      final Map<String, Object> xmlAttributeValues = AnnotationUtils.xmlAttribute(codeModel, jFieldVar);
      final Map<String, Object> xmlSchemaTypeValues = AnnotationUtils.xmlSchemaType(codeModel, jFieldVar);
      final Map<String, Object> xmlMixed = AnnotationUtils.annotationAttributes(codeModel, jFieldVar, XmlMixed.class);

      if (null != xmlMixed) {
        throw new UnsupportedOperationException(
            String.format("%s.%s is marked with XmlMixed.", classOutline.implClass.fullName(), jFieldVar.name())
        );
      }


      if (null != xmlElementValues && !xmlElementValues.isEmpty()) {
        field.required = (boolean) xmlElementValues.getOrDefault("required", false);
        field.name = (String) xmlElementValues.getOrDefault("name", fieldName);
      } else if (null != xmlAttributeValues && !xmlAttributeValues.isEmpty()) {
        field.required = (boolean) xmlAttributeValues.getOrDefault("required", false);
        field.name = (String) xmlAttributeValues.getOrDefault("name", fieldName);
      } else {
        field.required = false;
        field.name = fieldName;
      }

      Preconditions.checkNotNull(field.name, "fieldName cannot be null. %s", classOutline.implClass.fullName());

      if (null != xmlSchemaTypeValues && !xmlSchemaTypeValues.isEmpty()) {
        final String name = (String) xmlSchemaTypeValues.get("name");
        switch (name) {
          case "date":
            field.schemaBuilder = connectDateJClass.staticInvoke("builder");
            field.type = Type.XML_CALENDER;
            break;
          case "time":
            field.schemaBuilder = connectTimeJClass.staticInvoke("builder");
            field.type = Type.XML_CALENDER;
            break;
          case "dateTime":
            field.schemaBuilder = connectTimestampJClass.staticInvoke("builder");
            field.type = Type.XML_CALENDER;
            break;
          case "positiveInteger":
          case "unsignedLong":
            field.schemaBuilder = connectSchemaBuilderJClass.staticInvoke("int64");
            field.type = Type.VALUE;
            break;
          case "anySimpleType":
          case "anyURI":
          case "ID":
          case "string":
            field.schemaBuilder = connectSchemaBuilderJClass.staticInvoke("string");
            field.type = Type.VALUE;

            if (jFieldVar.type() instanceof JDefinedClass) {
              JDefinedClass jDefinedClass = (JDefinedClass) jFieldVar.type();

              if (ClassType.ENUM.equals(jDefinedClass.getClassType())) {
                field.type = Type.XML_ENUM;
              }
            }
            break;
          default:
            throw new IllegalStateException(
                String.format("Unknown type %s", name)
            );
        }
      } else if (typeLookup.containsKey(jFieldVar.type())) {
        field.schemaBuilder = typeLookup.get(jFieldVar.type());
        field.type = Type.VALUE;
      } else if (jFieldVar.type() instanceof JDefinedClass) {
        JDefinedClass jDefinedClass = (JDefinedClass) jFieldVar.type();

        if (null != AnnotationUtils.annotationAttributes(codeModel, jFieldVar, XmlEnum.class)) {
          field.schemaBuilder = connectSchemaBuilderJClass.staticInvoke("string");
          field.type = Type.XML_ENUM;
        } else {
          field.schemaBuilder = jDefinedClass.staticRef(CONNECT_SCHEMA_FIELD);
          field.type = Type.STRUCT;
        }
      } else if (CLASS_JNARROWED.equals(jFieldVar.type().getClass())) {
        final JClass jClass = (JClass) jFieldVar.type();
        final JClass basis;
        final List<JClass> args;
        try {
          java.lang.reflect.Field basisField = CLASS_JNARROWED.getDeclaredField("basis");
          basisField.setAccessible(true);
          java.lang.reflect.Field argsField = CLASS_JNARROWED.getDeclaredField("args");
          argsField.setAccessible(true);
          basis = (JClass) basisField.get(jClass);
          args = (List<JClass>) argsField.get(jClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
          throw new IllegalStateException(e);
        }

        if (typeList.equals(basis)) {
          JClass listType = args.get(0);

          if (listType.name().equals("String")) {
            field.schemaBuilder = connectSchemaBuilderJClass.staticInvoke("array")
                .arg(connectSchemaJClass.staticRef("STRING_SCHEMA"));
            field.type = Type.VALUE;
          } else {
            field.schemaBuilder = connectSchemaBuilderJClass.staticInvoke("array")
                .arg(listType.staticRef(CONNECT_SCHEMA_FIELD));
            field.type = Type.ARRAY;
            field.arrayType = listType;
          }
        } else {
          throw new IllegalStateException(
              String.format("%s is not supported.", basis.fullName())
          );
        }
      } else if (CLASS_JARRAYCLASS.equals(jFieldVar.type().getClass())) {
        final JClass jClass = (JClass) jFieldVar.type();
        try {
          java.lang.reflect.Field componentTypeField = CLASS_JARRAYCLASS.getDeclaredField("componentType");
          componentTypeField.setAccessible(true);
          final JType componentType = (JType) componentTypeField.get(jClass);

          if (componentType.name().equals("byte")) {
            field.schemaBuilder = connectSchemaBuilderJClass.staticInvoke("bytes");
            field.type = Type.VALUE;
          } else {
            throw new IllegalStateException(
                String.format("%s[] is not supported.", componentType.fullName())
            );
          }
        } catch (NoSuchFieldException | IllegalAccessException e) {
          throw new IllegalStateException(e);
        }
      } else if (CLASS_JREFERENCEDCLASS.equals(jFieldVar.type().getClass())) {
        log.warn("Nothing for {}", jFieldVar.type().fullName());
      } else {
        throw new UnsupportedOperationException(
            String.format(
                "%s is not supported.",
                jFieldVar.type().getClass().getName()
            )
        );
      }

      Preconditions.checkNotNull(field.schemaBuilder,
          "%s.%s: %s was not handled",
          classOutline.implClass.fullName(),
          jFieldVar.name(),
          jFieldVar.type().fullName()
      );
    }

    return result;
  }


  @Override
  public boolean run(Outline model, Options options, ErrorHandler errorHandler) throws SAXException {
    try {
      JCodeModel codeModel = model.getCodeModel();
      setupImportedClasses(codeModel);
      for (ClassOutline classOutline : model.getClasses()) {
        classOutline.implClass._implements(this.connectableJClass);
        log.trace("run - {}", classOutline.implClass.name());

        List<Field> fields = fields(codeModel, classOutline);
        log.trace("Found {} field(s). {}", fields.size(), fields);

        JFieldVar schemaField = processSchema(codeModel, classOutline, fields);
        processToStruct(schemaField, codeModel, classOutline, fields);
//      processFromStruct(codeModel, classOutline);
      }
      return true;
    } catch (Exception e) {
      errorHandler.error(new SAXParseException("Exception thrown while processing: " + e.getMessage(), null));
      return false;
    }
  }


}
