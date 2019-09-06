package com.github.jcustenborder.kafka.connect.xml;

import com.google.common.io.BaseEncoding;
import org.apache.kafka.connect.data.Struct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import simpletypes.SimpleTypes;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public abstract class AbstractRoundTripTest<T extends Connectable> {
  private static final Logger log = LoggerFactory.getLogger(AbstractRoundTripTest.class);


  protected abstract Class<?> objectFactoryClass();

  protected abstract Class<T> dataClass();

  protected abstract String dataFileName();

  JAXBContext context;
  Unmarshaller unmarshaller;

  @BeforeEach
  public void setupJAXBContext() throws JAXBException {
    Class<?> objectFactoryClass = objectFactoryClass();
    log.info("Configuring JAXBContext for '{}'", objectFactoryClass.getName());
    this.context = JAXBContext.newInstance(objectFactoryClass);
    this.unmarshaller = context.createUnmarshaller();
  }

  @TestFactory
  public Stream<DynamicTest> roundtrip() throws IOException, JAXBException, IllegalAccessException, InstantiationException {
    final T expected;
    final String dataFileName = dataFileName();
    log.info("Unmarshalling XML. dataFile = '{}'", dataFileName);
    try (InputStream inputStream = this.getClass().getResourceAsStream(dataFileName)) {
      Object value = unmarshaller.unmarshal(inputStream);

      if (dataClass().isInstance(value)) {
        expected = dataClass().cast(value);
      } else if (JAXBElement.class.isInstance(value)) {
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

    return Arrays.stream(dataClass().getMethods())
        .filter(method -> method.getName().startsWith("get") || method.getName().startsWith("is"))
        .filter(method -> !method.getName().equals("getClass"))
        .map(method -> dynamicTest(method.getName(), () -> {
          Object exp = method.invoke(expected);
          Object act = method.invoke(actual);

          if (byte[].class.equals(method.getReturnType())) {
            byte[] ebytes = (byte[]) exp;
            byte[] abytes = (byte[]) act;
            assertEquals(
                BaseEncoding.base32Hex().encode(ebytes),
                BaseEncoding.base32Hex().encode(abytes),
                String.format("%s should match.", method.getName())
            );
          } else {
            assertEquals(exp, act, String.format("%s should match.", method.getName()));
          }
        }));
  }

}
