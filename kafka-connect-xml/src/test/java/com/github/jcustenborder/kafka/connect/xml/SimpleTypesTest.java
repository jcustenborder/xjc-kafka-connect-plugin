package com.github.jcustenborder.kafka.connect.xml;

import simpletypes.ObjectFactory;
import simpletypes.SimpleTypes;

public class SimpleTypesTest extends AbstractRoundTripTest<SimpleTypes> {

  @Override
  protected Class<?> objectFactoryClass() {
    return ObjectFactory.class;
  }

  @Override
  protected Class<SimpleTypes> dataClass() {
    return SimpleTypes.class;
  }

  @Override
  protected String dataFileName() {
    return "simpleTypes.xml";
  }

}
