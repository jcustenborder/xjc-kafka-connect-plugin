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

import com.google.common.collect.ImmutableSet;
import com.google.common.io.BaseEncoding;
import org.apache.kafka.connect.data.Struct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


public abstract class AbstractRoundTripTest<T extends Connectable> {
  private static final Logger log = LoggerFactory.getLogger(AbstractRoundTripTest.class);
  JAXBContext context;
  Unmarshaller unmarshaller;


  protected abstract Class<?> objectFactoryClass();

  protected abstract Class<T> dataClass();

  protected abstract String dataFileName();


  @BeforeEach
  public void setupJAXBContext() throws JAXBException {
    Class<?> objectFactoryClass = objectFactoryClass();
    log.info("Configuring JAXBContext for '{}'", objectFactoryClass.getName());
    this.context = JAXBContext.newInstance(objectFactoryClass);
    this.unmarshaller = context.createUnmarshaller();
  }


  @TestFactory
  public Stream<DynamicTest> roundtrip()
      throws IOException, JAXBException, IllegalAccessException, InstantiationException {
    final T expected;
    final String dataFileName = dataFileName();
    log.info("Unmarshalling XML. dataFile = '{}'", dataFileName);
    try (InputStream inputStream = this.getClass().getResourceAsStream(dataFileName)) {
      Object value = unmarshaller.unmarshal(inputStream);

      if (dataClass().isInstance(value)) {
        expected = dataClass().cast(value);
      } else if (value instanceof JAXBElement) {
        JAXBElement o = (JAXBElement) value;
        expected = dataClass().cast(o.getValue());
      } else {
        throw new UnsupportedOperationException("" +
            String.format("%s is not supported", value.getClass())
        );
      }
    }
    Struct rootStruct = expected.toStruct();
    final T actual = dataClass().newInstance();
    actual.fromStruct(rootStruct);

    return Arrays.stream(actual.getClass().getMethods())
        .filter(this::isTestableMethod)
        .map(method -> dynamicTest(method.getName(),
            () -> assertOnParentMethod(method, expected, actual)));
  }


  public void assertOnParentMethod(Method method, final Object expected, final Object actual) {
    try {
      Object exp = method.invoke(expected);
      Object act = method.invoke(actual);

      assertOnValue(method, exp, act);
    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }


  private void assertOnValue(final Method method, final Object exp, final Object act) {
    if (exp != null && Connectable.class.isAssignableFrom(exp.getClass())) {
      assertOnClass(exp, act);
    } else if (exp != null && Collection.class.isAssignableFrom(exp.getClass())) {
      assertOnCollection(method, (Collection<?>) exp, (Collection<?>) act);
    } else if (byte[].class.equals(method.getReturnType())) {
      assertOnBytes(method, (byte[]) exp, (byte[]) act);
    } else if (XMLGregorianCalendar.class.isAssignableFrom(method.getReturnType())) {
      assertOnXMLGregorianCalendar(method, (XMLGregorianCalendar) exp, (XMLGregorianCalendar) act);
    } else if (BigDecimal.class.isAssignableFrom(method.getReturnType())) {
      assertOnBigDecimal(method, (BigDecimal) exp, (BigDecimal) act);
    } else {
      assertEquals(exp, act, createMessage(method));
    }
  }


  public void assertOnClass(final Object expected, final Object actual) {
    Arrays.stream(actual.getClass().getMethods())
        .filter(this::isTestableMethod)
        .forEach(method -> assertOnParentMethod(method, expected, actual));
  }


  private void assertOnBigDecimal(final Method method, final BigDecimal exp, final BigDecimal act) {
    BigDecimal eValue = exp;
    BigDecimal aValue = act;

    // align scales
    int scale = Math.max(eValue.scale(), aValue.scale());
    eValue = eValue.setScale(scale, RoundingMode.HALF_UP);
    aValue = aValue.setScale(scale, RoundingMode.HALF_UP);

    assertEquals(eValue, aValue, createMessage(method));
  }


  private void assertOnXMLGregorianCalendar(final Method method, final XMLGregorianCalendar exp, final XMLGregorianCalendar act) {
    XMLGregorianCalendar eValue = exp;
    XMLGregorianCalendar aValue = act;

    assertEquals(eValue.getYear(), aValue.getYear(), createMessage(method));
    assertEquals(eValue.getMonth(), aValue.getMonth(), createMessage(method));
    assertEquals(eValue.getDay(), aValue.getDay(), createMessage(method));
    assertEquals(eValue.getHour(), aValue.getHour(), createMessage(method));
    assertEquals(eValue.getMinute(), aValue.getMinute(), createMessage(method));
    assertEquals(eValue.getSecond(), aValue.getSecond(), createMessage(method));
  }


  private void assertOnBytes(final Method method, final byte[] exp, final byte[] act) {
    byte[] ebytes = exp;
    byte[] abytes = act;
    assertEquals(
        BaseEncoding.base32Hex().encode(ebytes),
        BaseEncoding.base32Hex().encode(abytes),
        createMessage(method));
  }


  private void assertOnCollection(Method method, final Collection<?> exp, final Collection<?> act) {
    Collection<?> eCollection = exp;
    Collection<?> aCollection = act;

    assertEquals(eCollection.size(), aCollection.size(), "Collection sizes differ");

    Iterator<?> eIter = eCollection.iterator();
    Iterator<?> aIter = aCollection.iterator();

    while (eIter.hasNext()) {
      Object eVal = eIter.next();
      Object aVal = aIter.next();

      assertOnValue(method, eVal, aVal);
    }
  }


  private boolean isTestableMethod(Method method) {
    if (method == null) {
      return false;
    }

    Set<String> excludes = ImmutableSet.of("getClass", "getChars");

    String name = method.getName();
    return !excludes.contains(name) &&
        (name.startsWith("get") || name.startsWith("is"));
  }


  private String createMessage(final Method method) {
    return String.format("%s#%s() should match.", method.getDeclaringClass().getCanonicalName(), method.getName());
  }
}
