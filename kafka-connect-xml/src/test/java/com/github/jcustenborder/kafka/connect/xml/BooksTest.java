package com.github.jcustenborder.kafka.connect.xml;

import books.BookForm;
import books.BooksForm;
import books.ObjectFactory;
import org.apache.kafka.connect.data.Struct;
import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.InputStream;

public class BooksTest {

  @Test
  public void test() throws JAXBException, IOException {
    JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();

    try(InputStream inputStream = this.getClass().getResourceAsStream("books.xml")) {
      JAXBElement<BooksForm> object = unmarshaller.unmarshal(new StreamSource(inputStream), BooksForm.class);
      Connectable connectable = object.getValue();
      Struct struct = connectable.toConnectStruct();
      struct.validate();
    }




  }

}
