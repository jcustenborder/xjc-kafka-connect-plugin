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

import org.apache.kafka.connect.data.Decimal;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
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


  @ParameterizedTest
  @CsvSource(
      {
          "230.00, 230.00, false, 6, HALF_UP",
          "230.00, 230.000000, true, 6, HALF_UP",
          "230.5, 231, true, 0, HALF_UP",
          "230.5, 230, true, 0, FLOOR",
          "230.5, 231, true, 0, CEILING",
          // check it handle's nulls
          ", , true, 0, CEILING",
          "230.5, 231, true, 0, ",
      }
  )
  public void decimalRoundTrip(BigDecimal in, BigDecimal expected, boolean forceScale, int scale, RoundingMode roundingMode) {
    Struct struct = struct(Decimal.builder(scale).optional());
    ConnectableHelper.toDecimal(struct, TEST_FIELD, in, forceScale, scale, roundingMode);
    BigDecimal actual = ConnectableHelper.fromDecimal(struct, TEST_FIELD);

    assertEquals(expected, actual);
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
