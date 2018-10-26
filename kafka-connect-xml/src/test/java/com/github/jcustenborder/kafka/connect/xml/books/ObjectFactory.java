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

package com.github.jcustenborder.kafka.connect.xml.books;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xyz.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Books_QNAME = new QName("urn:books", "books");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xyz.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BooksForm }
     * 
     */
    public BooksForm createBooksForm() {
        return new BooksForm();
    }

    /**
     * Create an instance of {@link BookForm }
     * 
     */
    public BookForm createBookForm() {
        return new BookForm();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooksForm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BooksForm }{@code >}
     */
    @XmlElementDecl(namespace = "urn:books", name = "books")
    public JAXBElement<BooksForm> createBooks(BooksForm value) {
        return new JAXBElement<BooksForm>(_Books_QNAME, BooksForm.class, null, value);
    }

}
