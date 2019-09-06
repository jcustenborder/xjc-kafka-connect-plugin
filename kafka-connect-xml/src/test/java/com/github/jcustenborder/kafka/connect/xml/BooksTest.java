package com.github.jcustenborder.kafka.connect.xml;

import books.BooksForm;
import books.ObjectFactory;

public class BooksTest extends AbstractRoundTripTest<BooksForm> {

  @Override
  protected Class<?> objectFactoryClass() {
    return ObjectFactory.class;
  }

  @Override
  protected Class<BooksForm> dataClass() {
    return BooksForm.class;
  }

  @Override
  protected String dataFileName() {
    return "books.xml";
  }
}
