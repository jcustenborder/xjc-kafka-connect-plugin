package com.github.jcustenborder.kafka.connect.xml;

import org.apache.kafka.connect.data.Struct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class ConnectableHelper {
  private static final Logger log = LoggerFactory.getLogger(ConnectableHelper.class);

  public static void addInt64(Struct struct, String field, Number value) {
    log.trace("addInt64() - field = '{}' value = '{}'", field, value);
    Long result = null != value ? value.longValue() : null;
    struct.put(field, result);
  }

  public static void addInt32(Struct struct, String field, Number value) {
    log.trace("addInt32() - field = '{}' value = '{}'", field, value);
    Integer result = null != value ? value.intValue() : null;
    struct.put(field, result);
  }

  public static void addInt16(Struct struct, String field, Number value) {
    log.trace("addInt16() - field = '{}' value = '{}'", field, value);
    Short result = null != value ? value.shortValue() : null;
    struct.put(field, result);
  }

  public static void addInt8(Struct struct, String field, Number value) {
    log.trace("addInt8() - field = '{}' value = '{}'", field, value);
    Byte result = null != value ? value.byteValue() : null;
    struct.put(field, result);
  }

  public static void addFloat64(Struct struct, String field, Number value) {
    log.trace("addFloat64() - field = '{}' value = '{}'", field, value);
    Double result = null != value ? value.doubleValue() : null;
    struct.put(field, result);
  }

  public static void addFloat32(Struct struct, String field, Number value) {
    log.trace("addFloat32() - field = '{}' value = '{}'", field, value);
    Float result = null != value ? value.floatValue() : null;
    struct.put(field, result);
  }

  public static void addDate(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("addDate() - field = '{}' value = '{}'", field, value);

  }

  public static void addTime(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("addTime() - field = '{}' value = '{}'", field, value);

  }

  public static void addTimestamp(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("addTimestamp() - field = '{}' value = '{}'", field, value);

  }

  public static void addConnectableList(Struct struct, String field, List<? extends Connectable> value) {
    log.trace("addConnectableList() - field = '{}' value = '{}'", field, value);

  }

  public static void addString(Struct struct, String field, String value) {
    log.trace("addString() - field = '{}' value = '{}'", field, value);

  }

  public static void addString(Struct struct, String field, Enum value) {
    log.trace("addString() - field = '{}' value = '{}'", field, value);

  }

  public static void addConnectable(Struct struct, String field, Connectable value) {
    log.trace("addConnectable() - field = '{}' value = '{}'", field, value);

  }

  public static void addXmlgDay(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("addXmlgDay() - field = '{}' value = '{}'", field, value);

  }

  public static void addXmlgMonth(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("addXmlgMonth() - field = '{}' value = '{}'", field, value);

  }

  public static void addXmlgMonthDay(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("addXmlgMonthDay() - field = '{}' value = '{}'", field, value);

  }

  public static void addXmlgYear(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("addXmlgYear() - field = '{}' value = '{}'", field, value);

  }

  public static void addXmlgYearMonth(Struct struct, String field, XMLGregorianCalendar value) {
    log.trace("addXmlgYearMonth() - field = '{}' value = '{}'", field, value);

  }

  public static <T extends Connectable> List<T> fromListToConnectableList(Struct input, String field, Class<T> cls) {
    final List<T> result = new ArrayList<>();
    final List<Struct> structs = input.getArray(field);

    if (null != structs & !structs.isEmpty()) {
      for (Struct struct : structs) {
        T item = fromStructToConnectable(struct, cls);
        result.add(item);
      }
    }
    return result;
  }

  private static <T extends Connectable> T fromStructToConnectable(Struct struct, Class<T> cls) {
    final T result;
    try {
      result = cls.newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      throw new IllegalStateException(
          String.format(
              "Exception thrown while creating instance of %s", cls
          ),
          e
      );
    }
    result.fromStruct(struct);
    return result;
  }

  public static <T extends Connectable> T fromStructToConnectable(Struct input, String field, Class<T> cls) {
    final T result;
    final Struct struct = input.getStruct(field);

    if (null == struct) {
      result = null;
    } else {
      try {
        result = cls.newInstance();
      } catch (InstantiationException | IllegalAccessException e) {
        throw new IllegalStateException(
            String.format(
                "Exception thrown while creating instance of %s", cls
            ),
            e
        );
      }
      result.fromStruct(struct);
    }

    return result;
  }

  public static void toString(Struct struct, String field, String value) {
    struct.put(field, value);
  }

  public static void toFloat32(Struct struct, String field, float value) {
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
    return struct.getString(field);
  }


  public static Float fromFloat32(Struct struct, String field) {
    return struct.getFloat32(field);
  }

  public static XMLGregorianCalendar fromDate(Struct struct, String field) {
    final XMLGregorianCalendar result;
    final Date date = (Date) struct.get(field);

    if (null == date) {
      result = null;
    } else {
      GregorianCalendar calendar = new GregorianCalendar();
      calendar.setTime(date);
      try {
        result = DatatypeFactory.newInstance().newXMLGregorianCalendar();
        result.setYear(calendar.get(Calendar.YEAR));
        result.setMonth(calendar.get(Calendar.MONTH) + 1);
        result.setDay(calendar.get(Calendar.DAY_OF_MONTH));
      } catch (DatatypeConfigurationException e) {
        throw new IllegalStateException(e);
      }
    }

    return result;
  }

  public static void toArray(Struct struct, String field, List<? extends Connectable> value) {
    final List<Struct> result;

    if (null == value) {
      result = null;
    } else {
      result = new ArrayList<>(value.size());
      for (Connectable o : value) {
        Struct s = o.toStruct();
        result.add(s);
      }

    }
    struct.put(field, result);
  }

  public static <T extends Connectable> List<T> fromArray(Struct struct, String field, Class<T> cls) {
    List<Struct> structs = struct.getArray(field);
    List<T> result;

    if (null == structs) {
      result = null;
    } else {
      result = new ArrayList<>(structs.size());
      for (Struct s : structs) {
        T o;
        try {
          o = cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
          throw new IllegalStateException(e);
        }
        o.fromStruct(s);
        result.add(o);
      }
    }


    return result;
  }
}
