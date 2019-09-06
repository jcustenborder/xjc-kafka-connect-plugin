package com.github.jcustenborder.kafka.connect.xml;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class ConnectableHelperTest {
  static final String TEST_FIELD = "test";

  static Struct struct(Schema fieldSchema) {
    Schema structSchema = SchemaBuilder.struct()
        .field(TEST_FIELD, fieldSchema)
        .build();
    return new Struct(structSchema);
  }


  @TestFactory
  public Stream<DynamicTest> booleanRoundTrip() {
    return Stream.of(
        true,
        false,
        null
    ).map(expected -> dynamicTest(String.format("%s", expected), () -> {
      final Struct struct = struct(Schema.OPTIONAL_BOOLEAN_SCHEMA);
      ConnectableHelper.toBoolean(struct, TEST_FIELD, expected);
      final Boolean actual = ConnectableHelper.fromBoolean(struct, TEST_FIELD);
      assertEquals(expected, actual);
    }));
  }

  @TestFactory
  public Stream<DynamicTest> int8RoundTrip() {
    return Stream.of(
        Byte.MAX_VALUE,
        Byte.MIN_VALUE,
        null
    ).map(expected -> dynamicTest(String.format("%s", expected), () -> {
      final Struct struct = struct(Schema.OPTIONAL_INT8_SCHEMA);
      ConnectableHelper.toInt8(struct, TEST_FIELD, expected);
      final Byte actual = ConnectableHelper.fromInt8(struct, TEST_FIELD);
      assertEquals(expected, actual);
    }));
  }

  @TestFactory
  public Stream<DynamicTest> int16RoundTrip() {
    return Stream.of(
        Short.MAX_VALUE,
        Short.MIN_VALUE,
        null
    ).map(expected -> dynamicTest(String.format("%s", expected), () -> {
      final Struct struct = struct(Schema.OPTIONAL_INT16_SCHEMA);
      ConnectableHelper.toInt16(struct, TEST_FIELD, expected);
      final Short actual = ConnectableHelper.fromInt16(struct, TEST_FIELD);
      assertEquals(expected, actual);
    }));
  }

  @TestFactory
  public Stream<DynamicTest> int32RoundTrip() {
    return Stream.of(
        Integer.MAX_VALUE,
        Integer.MIN_VALUE,
        null
    ).map(expected -> dynamicTest(String.format("%s", expected), () -> {
      final Struct struct = struct(Schema.OPTIONAL_INT32_SCHEMA);
      ConnectableHelper.toInt32(struct, TEST_FIELD, expected);
      final Integer actual = ConnectableHelper.fromInt32(struct, TEST_FIELD);
      assertEquals(expected, actual);
    }));
  }

  @TestFactory
  public Stream<DynamicTest> int64RoundTrip() {
    return Stream.of(
        Long.MAX_VALUE,
        Long.MIN_VALUE,
        null
    ).map(expected -> dynamicTest(String.format("%s", expected), () -> {
      final Struct struct = struct(Schema.OPTIONAL_INT64_SCHEMA);
      ConnectableHelper.toInt64(struct, TEST_FIELD, expected);
      final Long actual = ConnectableHelper.fromInt64(struct, TEST_FIELD);
      assertEquals(expected, actual);
    }));
  }
  @TestFactory
  public Stream<DynamicTest> int64BigIntegerRoundTrip() {
    return Stream.of(
        BigInteger.ONE,
        BigInteger.TEN,
        null
    ).map(expected -> dynamicTest(String.format("%s", expected), () -> {
      final Struct struct = struct(Schema.OPTIONAL_INT64_SCHEMA);
      ConnectableHelper.toInt64(struct, TEST_FIELD, expected);
      final BigInteger actual = ConnectableHelper.fromInt64BigInteger(struct, TEST_FIELD);
      assertEquals(expected, actual);
    }));
  }

  @TestFactory
  public Stream<DynamicTest> float32RoundTrip() {
    return Stream.of(
        Float.MAX_VALUE,
        Float.MIN_VALUE,
        null
    ).map(expected -> dynamicTest(String.format("%s", expected), () -> {
      final Struct struct = struct(Schema.OPTIONAL_FLOAT32_SCHEMA);
      ConnectableHelper.toFloat32(struct, TEST_FIELD, expected);
      final Float actual = ConnectableHelper.fromFloat32(struct, TEST_FIELD);
      assertEquals(expected, actual);
    }));
  }

  @TestFactory
  public Stream<DynamicTest> float64RoundTrip() {
    return Stream.of(
        Double.MAX_VALUE,
        Double.MIN_VALUE,
        null
    ).map(expected -> dynamicTest(String.format("%s", expected), () -> {
      final Struct struct = struct(Schema.OPTIONAL_FLOAT64_SCHEMA);
      ConnectableHelper.toFloat64(struct, TEST_FIELD, expected);
      final Double actual = ConnectableHelper.fromFloat64(struct, TEST_FIELD);
      assertEquals(expected, actual);
    }));
  }

  @TestFactory
  public Stream<DynamicTest> stringRoundTrip() {
    return Stream.of(
        "",
        "This is a test",
        null
    ).map(expected -> dynamicTest(String.format("%s-", expected), () -> {
      final Struct struct = struct(Schema.OPTIONAL_STRING_SCHEMA);
      ConnectableHelper.toString(struct, TEST_FIELD, expected);
      final String actual = ConnectableHelper.fromString(struct, TEST_FIELD);
      assertEquals(expected, actual);
    }));
  }
}
