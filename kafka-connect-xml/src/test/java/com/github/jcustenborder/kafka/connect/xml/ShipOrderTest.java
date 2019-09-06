package com.github.jcustenborder.kafka.connect.xml;

import generated.ObjectFactory;
import generated.Shiporder;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class ShipOrderTest extends AbstractRoundTripTest<Shiporder> {
  private static final Logger log = LoggerFactory.getLogger(ShipOrderTest.class);

  @Override
  protected Class<?> objectFactoryClass() {
    return ObjectFactory.class;
  }

  @Override
  protected Class<Shiporder> dataClass() {
    return Shiporder.class;
  }

  @Override
  protected String dataFileName() {
    return "shiporder.xml";
  }


  @Test
  public void foo() throws DatatypeConfigurationException {
    Duration duration = DatatypeFactory.newInstance().newDuration(1000);
    log.info("{}", duration);
  }
}
