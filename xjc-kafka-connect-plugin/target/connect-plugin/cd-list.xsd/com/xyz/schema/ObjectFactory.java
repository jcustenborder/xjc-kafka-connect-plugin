
package com.xyz.schema;

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

    private final static QName _Title_QNAME = new QName("http://edutechwiki.unige.ch/en/XML/", "title");
    private final static QName _Heading_QNAME = new QName("http://edutechwiki.unige.ch/en/XML/", "heading");
    private final static QName _P_QNAME = new QName("http://edutechwiki.unige.ch/en/XML/", "p");
    private final static QName _Artist_QNAME = new QName("http://edutechwiki.unige.ch/en/XML/", "artist");
    private final static QName _Genre_QNAME = new QName("http://edutechwiki.unige.ch/en/XML/", "genre");
    private final static QName _Duration_QNAME = new QName("http://edutechwiki.unige.ch/en/XML/", "duration");
    private final static QName _Rating_QNAME = new QName("http://edutechwiki.unige.ch/en/XML/", "rating");
    private final static QName _Publisher_QNAME = new QName("http://edutechwiki.unige.ch/en/XML/", "publisher");
    private final static QName _Composer_QNAME = new QName("http://edutechwiki.unige.ch/en/XML/", "composer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xyz.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CdList }
     * 
     */
    public CdList createCdList() {
        return new CdList();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Cd }
     * 
     */
    public Cd createCd() {
        return new Cd();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link TrackList }
     * 
     */
    public TrackList createTrackList() {
        return new TrackList();
    }

    /**
     * Create an instance of {@link Track }
     * 
     */
    public Track createTrack() {
        return new Track();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://edutechwiki.unige.ch/en/XML/", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://edutechwiki.unige.ch/en/XML/", name = "heading")
    public JAXBElement<String> createHeading(String value) {
        return new JAXBElement<String>(_Heading_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://edutechwiki.unige.ch/en/XML/", name = "p")
    public JAXBElement<String> createP(String value) {
        return new JAXBElement<String>(_P_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://edutechwiki.unige.ch/en/XML/", name = "artist")
    public JAXBElement<String> createArtist(String value) {
        return new JAXBElement<String>(_Artist_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://edutechwiki.unige.ch/en/XML/", name = "genre")
    public JAXBElement<String> createGenre(String value) {
        return new JAXBElement<String>(_Genre_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://edutechwiki.unige.ch/en/XML/", name = "duration")
    public JAXBElement<String> createDuration(String value) {
        return new JAXBElement<String>(_Duration_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://edutechwiki.unige.ch/en/XML/", name = "rating")
    public JAXBElement<String> createRating(String value) {
        return new JAXBElement<String>(_Rating_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://edutechwiki.unige.ch/en/XML/", name = "publisher")
    public JAXBElement<String> createPublisher(String value) {
        return new JAXBElement<String>(_Publisher_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://edutechwiki.unige.ch/en/XML/", name = "composer")
    public JAXBElement<String> createComposer(String value) {
        return new JAXBElement<String>(_Composer_QNAME, String.class, null, value);
    }

}
