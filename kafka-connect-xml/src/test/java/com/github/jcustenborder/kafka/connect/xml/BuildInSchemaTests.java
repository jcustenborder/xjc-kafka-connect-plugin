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

import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;

//import simpletypes.ObjectFactory;

public class BuildInSchemaTests {

  @Test
  public void test() throws JAXBException, IOException {
//    JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
//    Unmarshaller unmarshaller = context.createUnmarshaller();
//
//    Struct rootStruct;
//    try (InputStream inputStream = this.getClass().getResourceAsStream("simpleTypes.xml")) {
//      JAXBElement o = (JAXBElement) unmarshaller.unmarshal(inputStream);
//      Connectable connectable = (Connectable) o.getValue();
//      rootStruct = connectable.toConnectStruct();
//    }
//    rootStruct.validate();
////        <test_anyURI>http://www.google.com</test_anyURI>
//    assertEquals("http://www.google.com", rootStruct.get("test_anyURI"), "test_anyURI does not match");
////    <test_base64Binary>Zm9vCg</test_base64Binary>
//    assertArrayEquals("foo\n".getBytes(), rootStruct.getBytes("test_base64Binary"), "test_base64Binary does not match");
////    <test_boolean>true</test_boolean>
//    assertEquals(true, rootStruct.get("test_boolean"), "test_base64Binary does not match");
////    <test_byte>1</test_byte>
//    assertEquals((byte)1, rootStruct.get("test_byte"), "test_byte does not match");
////    <test_date>2012-11-12</test_date>
//
//
////    <test_dateTime>2012-11-12T12:00:00</test_dateTime>
////    <test_decimal>123412.20</test_decimal>
////    <test_double>123412.20</test_double>
////    <test_ENTITIES>asdf</test_ENTITIES>
////    <test_ENTITY>asdf</test_ENTITY>
////    <test_float>123.41</test_float>
////    <test_gDay>---31</test_gDay>
////    <test_gMonth>--02</test_gMonth>
////    <test_gYear>2001</test_gYear>
////    <test_hexBinary>0FB8</test_hexBinary>
////    <test_int>1234</test_int>
////    <test_integer>1234</test_integer>
////    <test_long>9182734</test_long>
////    <test_Name>asdfasdf</test_Name>
////    <test_NCName>asdfasdf</test_NCName>
////    <test_negativeInteger>-12341234</test_negativeInteger>
////    <test_nonNegativeInteger>12341234</test_nonNegativeInteger>
////    <test_nonPositiveInteger>-12341234</test_nonPositiveInteger>
////    <test_normalizedString>asdfasdfa</test_normalizedString>
////    <test_positiveInteger>123412</test_positiveInteger>
////    <test_short>12341</test_short>
////        <test_string>this is a string</test_string>
////    <test_time>12:00:00</test_time>
////    <test_token>dasfasdf</test_token>
////    <test_unsignedByte>123</test_unsignedByte>
////    <test_unsignedInt>123456</test_unsignedInt>
////    <test_unsignedLong>123456789</test_unsignedLong>
////    <test_unsignedShort>1234</test_unsignedShort>

  }


}
