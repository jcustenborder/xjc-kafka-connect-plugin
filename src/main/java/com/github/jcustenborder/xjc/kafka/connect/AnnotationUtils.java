package com.github.jcustenborder.xjc.kafka.connect;

import com.google.common.base.Preconditions;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JAnnotationValue;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

class AnnotationUtils {
  private static final Logger log = LoggerFactory.getLogger(AnnotationUtils.class);


  public static Map<String, Object> xmlSchemaType(JCodeModel codeModel, JFieldVar field) {
    final Map<String, Object> result = annotationAttributes(codeModel, field, XmlSchemaType.class);
    if (null == result) {
      return null;
    }
    return result;
  }

  public static Map<String, Object> xmlAttribute(JCodeModel codeModel, JFieldVar field) {
    final Map<String, Object> result = annotationAttributes(codeModel, field, XmlAttribute.class);
    if (null == result) {
      return null;
    }
    if ("##default".equals(result.get("name"))) {
      result.put("name", field.name());
    }
    if ("##default".equals(result.get("namespace"))) {
      result.remove("namespace");
    }
    return result;
  }

  public static Map<String, Object> xmlElement(JCodeModel codeModel, JFieldVar field) {
    final Map<String, Object> result = annotationAttributes(codeModel, field, XmlElement.class);
    if (null == result) {
      return null;
    }
    if ("##default".equals(result.get("name"))) {
      result.put("name", field.name());
    }
    if ("##default".equals(result.get("namespace"))) {
      result.remove("namespace");
    }
    return result;
  }

  public static Map<String, Object> annotationAttributes(JCodeModel codeModel, JFieldVar field, Class<?> cls) {
    Preconditions.checkNotNull(field, "field cannot be null.");
    Preconditions.checkNotNull(cls, "cls cannot be null.");
    Preconditions.checkState(cls.isAnnotation(), "cls must be an annotation.");
    final JClass jClass = codeModel.ref(cls);

    final Map<String, Object> result = new LinkedHashMap<>();
    boolean found = false;
    for (final JAnnotationUse annotationUse : field.annotations()) {
      if (jClass.equals(annotationUse.getAnnotationClass())) {
        found = true;
        for (Method method : cls.getMethods()) {
          log.trace("annotationAttributes() - looking for member '{}'", method.getName());
          final JAnnotationValue annotationValue = annotationUse.getAnnotationMembers().get(method.getName());
          if (null == annotationValue) {
            log.trace("annotationAttributes() - Setting default for '{}' to '{}'", method.getName(), method.getDefaultValue());
            result.put(method.getName(), method.getDefaultValue());
          } else {
            log.trace("annotationAttributes() - Return type for '{}' is '{}'", method.getName(), method.getReturnType());
            final StringWriter writer = new StringWriter();
            final JFormatter formatter = new JFormatter(writer);
            annotationValue.generate(formatter);
            final String stringValue = writer.toString();
            final Object value;

            if (boolean.class.equals(method.getReturnType())) {
              log.trace("annotationAttributes() - Parsing value for '{}' to '{}'. stringValue = '{}'", method.getName(), method.getReturnType(), stringValue);
              value = Boolean.parseBoolean(stringValue);
            } else if (String.class.equals(method.getReturnType()) || Class.class.equals(method.getReturnType())) {
              value = stringValue.replaceAll("^\\\"(.*)\\\"$", "$1");
              if (value == "\u0000") {
                continue;
              }
            } else if (long.class.equals(method.getReturnType())) {
              value = Long.parseLong(stringValue);
            } else if (int.class.equals(method.getReturnType())) {
              value = Integer.parseInt(stringValue);
            } else {
              throw new IllegalStateException(
                  String.format("Could not parse type for %s.%s: %s", cls.getName(), method.getName(), method.getReturnType().getName())
              );
            }
            result.put(method.getName(), value);
          }
        }
      }
    }
    if (!found) {
      return null;
    }

    return result;
  }

  public static Map<String, Object> attributes(JFieldVar field, JClass cls) {
    Preconditions.checkNotNull(field, "field cannot be null.");
    Preconditions.checkNotNull(cls, "cls cannot be null.");

    final Map<String, Object> result = new LinkedHashMap<>();

    for (JAnnotationUse annotationUse : field.annotations()) {
      if (cls.equals(annotationUse.getAnnotationClass())) {
        for (Map.Entry<String, JAnnotationValue> kvp : annotationUse.getAnnotationMembers().entrySet()) {
          final String memberName = kvp.getKey();
          final JAnnotationValue annotationValue = kvp.getValue();
          log.trace("attributes() - memberName = '{}' annotationValue = '{}'", memberName, annotationValue);
          final StringWriter writer = new StringWriter();
          final JFormatter formatter = new JFormatter(writer);
          annotationValue.generate(formatter);
          log.trace("attributes() - memberName = '{}' value = '{}'", memberName, writer.toString());
          result.put(kvp.getKey(), writer.toString());
        }
      }
    }

    return result;
  }
}
