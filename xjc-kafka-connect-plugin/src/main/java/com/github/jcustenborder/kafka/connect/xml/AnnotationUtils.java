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

  public static boolean required(JCodeModel codeModel, JFieldVar field) {
    final Map<String, Object> xmlElementValues = xmlElement(codeModel, field);

    if (null != xmlElementValues && !xmlElementValues.isEmpty()) {
      return (boolean) xmlElementValues.getOrDefault("required", false);
    }

    final Map<String, Object> xmlAttributeValues = xmlAttribute(codeModel, field);

    if (null != xmlAttributeValues && !xmlAttributeValues.isEmpty()) {
      return (boolean) xmlAttributeValues.getOrDefault("required", false);
    }

    return false;
  }

  public static String name(JCodeModel codeModel, JFieldVar field, String fieldName) {
    final Map<String, Object> xmlElementValues = xmlElement(codeModel, field);

    if (null != xmlElementValues && !xmlElementValues.isEmpty()) {
      return (String) xmlElementValues.getOrDefault("name", fieldName);
    }

    final Map<String, Object> xmlAttributeValues = xmlAttribute(codeModel, field);

    if (null != xmlAttributeValues && !xmlAttributeValues.isEmpty()) {
      return (String) xmlAttributeValues.getOrDefault("name", fieldName);
    }

    return fieldName;
  }

  public static String xmlType(JCodeModel codeModel, JFieldVar jFieldVar) {
    final Map<String, Object> xmlSchemaTypeValues = AnnotationUtils.xmlSchemaType(codeModel, jFieldVar);
    final String name;
    if (null != xmlSchemaTypeValues && !xmlSchemaTypeValues.isEmpty()) {
      name = (String) xmlSchemaTypeValues.get("name");
    } else {
      name = null;
    }

    return name;
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
          final Map<String, JAnnotationValue> annotationMembers;
          try {
            annotationMembers = annotationUse.getAnnotationMembers();
          } catch (NullPointerException ex) {
            log.trace("Exception thrown while trying to read annotationMembers from {}", annotationUse, ex);
            continue;
          }
          final JAnnotationValue annotationValue = annotationMembers.get(method.getName());
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
