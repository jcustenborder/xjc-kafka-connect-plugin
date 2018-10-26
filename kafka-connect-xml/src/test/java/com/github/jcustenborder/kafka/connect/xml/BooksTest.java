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

//import books.ObjectFactory;

import com.github.jcustenborder.kafka.connect.xml.books.BookForm;
import com.github.jcustenborder.kafka.connect.xml.books.BooksForm;
import com.github.jcustenborder.kafka.connect.xml.books.ObjectFactory;
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
    final BooksForm expected;
    try (InputStream inputStream = this.getClass().getResourceAsStream("books.xml")) {
      JAXBElement o = (JAXBElement) unmarshaller.unmarshal(inputStream);
      expected = (BooksForm) o.getValue();
      rootStruct = expected.toStruct();
    }
    rootStruct.validate();
    List<Struct> array = rootStruct.getArray("book");
    assertNotNull(array, "book is null");
    assertEquals(2, array.size());
    Struct struct = array.get(0);
//    assertEquals(true, struct.getBoolean("test_boolean"), "test_boolean does not match.");
    assertEquals("bk001", struct.getString("id"), "id does not match.");
    assertEquals("Writer", struct.getString("author"), "author does not match.");
    assertEquals("The First Book", struct.getString("title"), "title does not match.");

    BooksForm actual = new BooksForm();
    actual.fromStruct(rootStruct);

    assertEquals(expected.getBook().size(), actual.getBook().size());
    for (int i = 0; i < expected.getBook().size(); i++) {
      BookForm expectedBookForm = expected.getBook().get(i);
      BookForm actualBookForm = actual.getBook().get(i);
      assertEquals(expectedBookForm.getAuthor(), actualBookForm.getAuthor());
      assertEquals(expectedBookForm.getGenre(), actualBookForm.getGenre());
      assertEquals(expectedBookForm.getId(), actualBookForm.getId());
      assertEquals(expectedBookForm.getPrice(), actualBookForm.getPrice());
      assertEquals(expectedBookForm.getPubDate(), actualBookForm.getPubDate());
      assertEquals(expectedBookForm.getReview(), actualBookForm.getReview());
      assertEquals(expectedBookForm.getTitle(), actualBookForm.getTitle());
    }


  }
}
