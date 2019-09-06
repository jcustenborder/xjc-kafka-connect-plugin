package com.github.jcustenborder.kafka.connect.xml;

import simpletypeattributes.SimpleTypeAttributes;
import simpletypeattributes.ObjectFactory;


public class SimpleTypeAttributesTest extends AbstractRoundTripTest<SimpleTypeAttributes> {

  @Override
  protected Class<?> objectFactoryClass() {
    return ObjectFactory.class;
  }

  @Override
  protected Class<SimpleTypeAttributes> dataClass() {
    return SimpleTypeAttributes.class;
  }

  @Override
  protected String dataFileName() {
    return "simpleTypeAttributes.xml";
  }

}
