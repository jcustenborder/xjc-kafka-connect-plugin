
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
