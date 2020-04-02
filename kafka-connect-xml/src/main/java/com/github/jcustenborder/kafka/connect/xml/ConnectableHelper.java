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

import com.google.common.base.Preconditions;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.errors.DataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.function.Function;

public class ConnectableHelper {
  public static final Schema QNAME_SCHEMA = qnameBuilder().build();
  static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");
  private static final Logger log = LoggerFactory.getLogger(ConnectableHelper.class);

  public static final SchemaBuilder qnameBuilder() {
    return SchemaBuilder.struct()
        .name(QName.class.getName())
        .field("localPart", Schema.STRING_SCHEMA)
        .field("prefix", Schema.OPTIONAL_STRING_SCHEMA)
        .field("namespaceURI", Schema.OPTIONAL_STRING_SCHEMA);
  }

  public static void toInt64(Struct struct, String field, Number value) {
    log.trace("toInt64() - field = '{}' value = '{}'", field, value);
    Long result = null != value ? value.longValue() : null;
    struct.put(field, result);
  }

  public static void toInt16(Struct struct, String field, Number value) {
    log.trace("toInt16() - field = '{}' value = '{}'", field, value);
    Short result = null != value ? value.shortValue() : null;
    struct.put(field, result);
  }

  public static void toInt8(Struct struct, String field, Number value) {
    log.trace("toInt8() - field = '{}' value = '{}'", field, value);
    Byte result = null != value ? value.byteValue() : null;
    struct.put(field, result);
  }

  public static void toFloat64(Struct struct, String field, Number value) {
    log.trace("toFloat64() - field = '{}' value = '{}'", field, value);
    Double result = null != value ? value.doubleValue() : null;
    struct.put(field, result);
  }

  public static void toFloat32(Struct struct, String field, Number value) {
    log.trace("addFloat32() - field = '{}' value = '{}'", field, value);
    Float result = null != value ? value.floatValue() : null;
    struct.put(field, result);
  }

  public static void toString(Struct struct, String field, String value) {
    log.trace("toString() - field = '{}' value = '{}'", field, value);
    struct.put(field, value);
  }

  public static void toDate(Struct struct, String field, XMLGregorianCalendar value) {
    Date result;

    if (null == value) {
      result = null;
    } else {
      result = value.toGregorianCalendar().getTime();
    }

    struct.put(field, result);
  }

  public static String fromString(Struct struct, String field) {
    log.trace("fromString() - field = '{}'", field);
    return struct.getString(field);
  }

  public static Boolean fromBoolean(Struct struct, String field) {
    log.trace("fromBoolean() - field = '{}'", field);
    return struct.getBoolean(field);
  }

  public static void toBoolean(Struct struct, String field, Boolean value) {
    log.trace("toBoolean() - field = '{}' value = '{}'", field, value);
    struct.put(field, value);
  }

  public static Float fromFloat32(Struct struct, String field) {
    log.trace("fromFloat32() - field = '{}'", field);
    return struct.getFloat32(field);
  }

  public static XMLGregorianCalendar fromDate(Struct struct, String field) {
    log.trace("fromDate() - field = '{}'", field);
    return readXmlG(struct, field, Date.class, (xmlGregorianCalendar, connectValue) -> {
      GregorianCalendar calendar = new GregorianCalendar();
      calendar.setTime(connectValue);
      xmlGregorianCalendar.setYear(calendar.get(Calendar.YEAR));
      xmlGregorianCalendar.setMonth(calendar.get(Calendar.MONTH) + 1);
      xmlGregorianCalendar.setDay(calendar.get(Calendar.DAY_OF_MONTH));
    });
  }

  public static void toArray(Struct struct, String field, List<?> value) {
    final List<Object> result;
    if (null == value) {
      result = null;
    } else {
      result = new ArrayList<>(value.size());
      for (Object o : value) {
        if (o instanceof Connectable) {
          result.add(((Connectable)o).toStruct());
        } else {
          result.add(o);
        }
      }

    }
    struct.put(field, result);
  }

  public static <T> List<T> fromArray(Struct struct, String field, Class<T> cls) {
    List<Object> structs = struct.getArray(field);
    List<T> result;

    if (null == structs) {
      result = null;
    } else {
      result = new ArrayList<>(structs.size());
      for (Object s : structs) {
        if (s instanceof Struct && Connectable.class.isAssignableFrom(cls)) {
          T o;
          try {
            o = cls.newInstance();
          } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException(e);
          }
          ((Connectable)o).fromStruct((Struct)s);
          result.add(o);
        } else if (cls.isInstance(s)){
          result.add(cls.cast(s));
        } else {
          throw new IllegalArgumentException("Element not castable to the target class");
        }
      }
    }


    return result;
  }

  public static Integer fromInt32(Struct struct, String field) {
    log.trace("fromInt32() - field = '{}'", field);
    return struct.getInt32(field);
  }

  public static Long fromInt64(Struct struct, String field) {
    log.trace("fromInt64() - field = '{}'", field);
    return struct.getInt64(field);
  }

  public static void toStruct(Struct struct, String field, Connectable value) {
    log.trace("fromStruct() - field ='{}' value = '{}'", field, value);
    Struct fieldStruct;
    if (null == value) {
      fieldStruct = null;
    } else {
      fieldStruct = value.toStruct();
    }
    struct.put(field, fieldStruct);
  }

  public static <T extends Connectable> T fromStruct(Struct struct, String field, Class<T> aClass) {
    log.trace("fromStruct() - field ='{}' aClass = '{}'", field, aClass);
    final T result;
    Struct fieldStruct = struct.getStruct(field);
    if (null == fieldStruct) {
      result = null;
    } else {
      try {
        result = aClass.newInstance();
      } catch (InstantiationException | IllegalAccessException e) {
        throw new DataException("Exception while creating instance of " + aClass.getName(), e);
      }
      result.fromStruct(fieldStruct);
    }
    return result;
  }

  public static void toBytes(Struct struct, String field, byte[] value) {
    log.trace("toBytes() - field = '{}'", field);
    struct.put(field, value);
  }

  public static void toDateTime(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("toString() - field = '{}' value = '{}'", field, value);
    Date result;

    if (null == value) {
      result = null;
    } else {
      result = value.toGregorianCalendar().getTime();
    }

    struct.put(field, result);
  }


  public static void toDecimal(Struct struct, String field, BigDecimal value, boolean forceDecimalScale, int scale,
      RoundingMode roundingMode) {
    log.trace("toString() - field = '{}' value = '{}' forcingScale = '{}' scale = '{}' roundingMode = '{}'", field, value,
        forceDecimalScale, scale, roundingMode);

    if (value == null || !forceDecimalScale) {
      struct.put(field, value);
    } else {
      struct.put(field, value.setScale(scale, roundingMode == null ? RoundingMode.HALF_UP : roundingMode));
    }
  }

  public static void toXmlgDay(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("toXmlgDay() - field = '{}' value = '{}'", field, value);
    writeXmlG(struct, field, value, new Function<XMLGregorianCalendar, Object>() {
      @Override
      public Object apply(XMLGregorianCalendar xmlGregorianCalendar) {
        return xmlGregorianCalendar.getDay();
      }
    });
  }

  public static void toXmlgMonth(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("toXmlgMonth() - field = '{}' value = '{}'", field, value);
    writeXmlG(struct, field, value, new Function<XMLGregorianCalendar, Object>() {
      @Override
      public Object apply(XMLGregorianCalendar xmlGregorianCalendar) {
        return xmlGregorianCalendar.getMonth();
      }
    });
  }

  public static void toXmlgYear(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("toXmlgYear() - field = '{}' value = '{}'", field, value);
    writeXmlG(struct, field, value, new Function<XMLGregorianCalendar, Object>() {
      @Override
      public Object apply(XMLGregorianCalendar xmlGregorianCalendar) {
        return xmlGregorianCalendar.getYear();
      }
    });
  }

  public static void toInt32(Struct struct, String field, Number value) {
    log.trace("toInt32() - field = '{}' value = '{}'", field, value);
    Integer result = null != value ? value.intValue() : null;
    struct.put(field, result);
  }

  public static void toTime(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("toTime() - field = '{}' value = '{}'", field, value);
    writeXmlG(struct, field, value, new Function<XMLGregorianCalendar, Object>() {
      @Override
      public Object apply(XMLGregorianCalendar xmlGregorianCalendar) {
        GregorianCalendar calendar = value.toGregorianCalendar(UTC_TIME_ZONE, null, null);
        return calendar.getTime();
      }
    });
  }

  public static byte[] fromBytes(Struct struct, String field) {
    log.trace("fromBytes() - field = '{}'", field);
    return struct.getBytes(field);
  }

  public static Byte fromInt8(Struct struct, String field) {
    log.trace("fromInt8() - field = '{}'", field);
    return struct.getInt8(field);
  }


  public static XMLGregorianCalendar fromDateTime(Struct struct, String field) {
    log.trace("fromDateTime() - field = '{}'", field);
    XMLGregorianCalendar result;
    Object value = struct.get(field);

    if (null == value) {
      result = null;
    } else {
      Preconditions.checkState(value instanceof Date, "%s(%s) should be a Date.", struct.schema().name(), field);
      Date date = (Date) value;
      GregorianCalendar c = new GregorianCalendar();
      c.setTime(date);
      try {
        result = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        result.setTimezone(0);
      } catch (DatatypeConfigurationException e) {
        throw new DataException("Exception thrown", e);
      }
    }

    return result;
  }

  public static BigDecimal fromDecimal(Struct struct, String field) {
    log.trace("fromDecimal() - field = '{}'", field);
    Object value = struct.get(field);
    BigDecimal result = null == value ? null : (BigDecimal) value;
    return result;
  }

  public static Double fromFloat64(Struct struct, String field) {
    log.trace("fromFloat64() - field = '{}'", field);
    return struct.getFloat64(field);
  }

  private static XMLGregorianCalendar createXMLGregorianCalendar() {
    return createXMLGregorianCalendar(null);
  }

  private static XMLGregorianCalendar createXMLGregorianCalendar(GregorianCalendar calendar) {
    XMLGregorianCalendar result;
    try {
      if (null == calendar) {
        result = DatatypeFactory.newInstance().newXMLGregorianCalendar();
      } else {
        result = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
      }
    } catch (DatatypeConfigurationException e) {
      throw new DataException("Exception while creating XMLGregorianCalendar", e);
    }
    return result;
  }


  public static XMLGregorianCalendar fromXmlgDay(Struct struct, String field) {
    log.trace("fromXmlgDay() - field = '{}'", field);
    return readXmlG(struct, field, Integer.class, new FromXmlG<Integer>() {
      @Override
      public void apply(XMLGregorianCalendar xmlGregorianCalendar, Integer connectValue) {
        xmlGregorianCalendar.setDay(connectValue);
      }
    });
  }

  public static BigInteger fromInt64BigInteger(Struct struct, String field) {
    log.trace("fromInt64BigInteger() - field = '{}'", field);
    Long value = struct.getInt64(field);
    BigInteger result = null != value ? BigInteger.valueOf(value) : null;
    return result;
  }

  public static Short fromInt16(Struct struct, String field) {
    log.trace("fromInt16() - field = '{}'", field);
    return struct.getInt16(field);
  }

  public static Struct fromQName(QName qName) {
    Struct result = new Struct(QNAME_SCHEMA);
    result.put("localPart", qName.getLocalPart());
    result.put("prefix", qName.getPrefix());
    result.put("namespaceURI", qName.getNamespaceURI());
    return result;
  }

  public static QName toQName(Struct struct) {
    final String localPart = struct.getString("localPart");
    final String prefix = struct.getString("prefix");
    final String namespaceURI = struct.getString("namespaceURI");
    return new QName(namespaceURI, localPart, prefix);
  }

  public static void toQNameMap(Struct struct, String field, Map<QName, String> value) {
    Map<Struct, String> result;
    if (null == value) {
      result = null;
    } else {
      result = new LinkedHashMap<>(value.size());
      for (Map.Entry<QName, String> e : value.entrySet()) {
        Struct key = fromQName(e.getKey());
        result.put(key, e.getValue());
      }
    }
    struct.put(field, result);
  }

  public static Map<QName, String> fromQNameMap(Struct struct, String field) {
    Map<QName, String> result;
    Map structValue = struct.getMap(field);
    if (null == structValue) {
      result = null;
    } else {
      result = new LinkedHashMap<>();
      for (Object k : structValue.keySet()) {
        final Struct qNameStruct = (Struct) k;
        final QName key = toQName(qNameStruct);
        final String value = (String) structValue.get(k);
        result.put(key, value);
      }
    }
    return result;
  }

  public static XMLGregorianCalendar fromXmlgMonth(Struct struct, String field) {
    log.trace("fromXmlgMonth() - field = '{}'", field);
    return readXmlG(struct, field, Integer.class, new FromXmlG<Integer>() {
      @Override
      public void apply(XMLGregorianCalendar xmlGregorianCalendar, Integer connectValue) {
        xmlGregorianCalendar.setMonth(connectValue);
      }
    });
  }

  public static void toXmlgMonthDay(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("toXmlgMonthDay() - field = '{}' value = '{}'", field, value);
    writeXmlG(struct, field, value, new Function<XMLGregorianCalendar, Object>() {
      @Override
      public Object apply(XMLGregorianCalendar xmlGregorianCalendar) {
        return xmlGregorianCalendar.toGregorianCalendar(UTC_TIME_ZONE, null, null).getTime();
      }
    });
  }

  public static void toXmlgYearMonth(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("toXmlgYearMonth() - field = '{}' value = '{}'", field, value);
    writeXmlG(struct, field, value, new Function<XMLGregorianCalendar, Object>() {
      @Override
      public Object apply(XMLGregorianCalendar xmlGregorianCalendar) {
        return xmlGregorianCalendar.toGregorianCalendar(UTC_TIME_ZONE, null, null).getTime();
      }
    });
  }

  public static XMLGregorianCalendar fromXmlgMonthDay(Struct struct, String field) {
    log.trace("fromXmlgMonthDay() - field = '{}'", field);
    return readXmlG(struct, field, Date.class, new FromXmlG<Date>() {
      @Override
      public void apply(XMLGregorianCalendar xmlGregorianCalendar, Date connectValue) {
        GregorianCalendar calendar = new GregorianCalendar(UTC_TIME_ZONE);
        calendar.setTime(connectValue);
        xmlGregorianCalendar.clear();

        // XMLGregorianCalendar is 1 based for month - plain GregorianCalendar is 0 based.
        xmlGregorianCalendar.setMonth(calendar.get(Calendar.MONTH) + 1);
        xmlGregorianCalendar.setDay(calendar.get(Calendar.DAY_OF_MONTH));
      }
    });
  }

  public static XMLGregorianCalendar fromXmlgYearMonth(Struct struct, String field) {
    log.trace("fromXmlgMonthDay() - field = '{}'", field);
    return readXmlG(struct, field, Date.class, new FromXmlG<Date>() {
      @Override
      public void apply(XMLGregorianCalendar xmlGregorianCalendar, Date connectValue) {
        GregorianCalendar calendar = new GregorianCalendar(UTC_TIME_ZONE);
        calendar.setTime(connectValue);
        xmlGregorianCalendar.clear();

        // XMLGregorianCalendar is 1 based for month - plain GregorianCalendar is 0 based.
        xmlGregorianCalendar.setMonth(calendar.get(Calendar.MONTH) + 1);
        xmlGregorianCalendar.setYear(calendar.get(Calendar.YEAR));
      }
    });
  }

  public static XMLGregorianCalendar fromTime(Struct struct, String field) {
    return readXmlG(struct, field, Date.class, (xmlGregorianCalendar, connectValue) -> {
      GregorianCalendar calendar = new GregorianCalendar(UTC_TIME_ZONE);
      calendar.setTime(connectValue);
      xmlGregorianCalendar.setTime(
          calendar.get(Calendar.HOUR_OF_DAY),
          calendar.get(Calendar.MINUTE),
          calendar.get(Calendar.SECOND)
      );
      xmlGregorianCalendar.setTimezone(0);
    });
  }

  public static void toQname(Struct struct, String field, QName value) {
    log.trace("toQname() - field = '{}' value ='{}'", field, value);
    Struct fieldStruct;

    if (null == value) {
      fieldStruct = null;
    } else {
      fieldStruct = fromQName(value);
    }

    struct.put(field, fieldStruct);
  }

  public static QName fromQname(Struct struct, String field) {
    QName result;
    Struct fieldStruct = struct.getStruct(field);
    if (null == fieldStruct) {
      result = null;
    } else {
      result = toQName(struct);
    }
    return result;
  }

  public static void toDuration(Struct struct, String field, Duration value) {
    log.trace("toDuration() - field = '{}' value ='{}'", field, value);
    Long connectValue;
    if (value == null) {
      connectValue = null;
    } else {
      connectValue = value.getTimeInMillis(new Date(0));
    }
    log.trace(
        "toDuration() - field = '{}' connectValue = '{}' result = '{}'",
        field,
        value,
        connectValue
    );
    struct.put(field, connectValue);
  }

  public static Duration fromDuration(Struct struct, String field) {
    log.trace("toDuration() - field = '{}'", field);
    Duration result;
    Long connectValue = struct.getInt64(field);
    if (null == connectValue) {
      result = null;
    } else {
      try {
        result = DatatypeFactory.newInstance().newDuration(connectValue);
      } catch (DatatypeConfigurationException e) {
        throw new DataException("Exception while creating Duration", e);
      }
    }
    log.trace(
        "fromDuration() - field = '{}' connectValue = '{}' result = '{}'",
        field,
        result,
        connectValue
    );
    return result;
  }

  static void writeXmlG(Struct struct, String field, XMLGregorianCalendar value, Function<XMLGregorianCalendar, Object> function) {
    log.trace("writeXmlG() - field = '{}' value = '{}'", field, value);
    Object result;

    if (null == value) {
      result = null;
    } else {
      result = function.apply(value);
    }

    log.trace(
        "writeXmlG() - field = '{}' connectValue = '{}' result = '{}'",
        field,
        value,
        result
    );
    struct.put(field, result);
  }

  static <T> XMLGregorianCalendar readXmlG(Struct struct, String field, Class<T> storageClass, FromXmlG<T> transform) {
    log.trace("readXmlG() - field = '{}'", field);
    final XMLGregorianCalendar result;
    Object v = struct.get(field);

    if (null == v) {
      result = null;
    } else {
      if (!storageClass.isInstance(v)) {
        throw new DataException(
            String.format(
                "Field %s(%s) was expected to be a %s but was %s.",
                struct.schema().name(),
                field,
                storageClass.getName(),
                v.getClass().getName()
            )
        );
      }
      T connectValue = storageClass.cast(v);
      XMLGregorianCalendar calendar = createXMLGregorianCalendar();
      transform.apply(calendar, connectValue);
      result = calendar;
    }
    log.trace(
        "readXmlG() - field = '{}' connectValue = '{}' result = '{}'",
        field,
        v,
        result
    );
    return result;
  }

  public static XMLGregorianCalendar fromXmlgYear(Struct struct, String field) {
    log.trace("fromXmlgYear() - field = '{}'", field);
    return readXmlG(struct, field, Integer.class, (xmlGregorianCalendar, connectValue) -> {
      xmlGregorianCalendar.setYear(connectValue);
    });
  }


  public static void fromEnum(final Struct struct, final String field, final Enum enumClass) {
    struct.put(field, enumClass.name());
  }


  public static <T extends Enum> T toEnum(final Struct struct, final String field, final Class<T> enumType) {
    return (T) Enum.valueOf(enumType, struct.getString(field));
  }


  interface FromXmlG<T> {
    void apply(XMLGregorianCalendar xmlGregorianCalendar, T connectValue);
  }
}
