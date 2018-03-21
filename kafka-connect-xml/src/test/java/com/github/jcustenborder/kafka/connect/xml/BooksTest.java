package com.github.jcustenborder.kafka.connect.xml;

import books.ObjectFactory;
import org.apache.kafka.connect.data.Struct;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BooksTest {
  @Test
  public void test() throws JAXBException, IOException {
    JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();

    Struct rootStruct;
    try (InputStream inputStream = this.getClass().getResourceAsStream("books.xml")) {
      JAXBElement o = (JAXBElement) unmarshaller.unmarshal(inputStream);
      Connectable connectable = (Connectable) o.getValue();
      rootStruct = connectable.toConnectStruct();
    }
    rootStruct.validate();
    List<Struct> array = rootStruct.getArray("book");
    assertNotNull(array, "book is null");
    assertEquals(2, array.size());
    Struct struct = array.get(0);
    assertEquals("bk001", struct.getString("id"), "id does not match.");
    assertEquals("Writer", struct.getString("author"), "author does not match.");
    assertEquals("The First Book", struct.getString("title"), "title does not match.");
  }
}
