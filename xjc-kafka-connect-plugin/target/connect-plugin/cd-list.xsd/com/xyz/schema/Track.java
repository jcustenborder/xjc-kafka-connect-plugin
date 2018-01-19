
package com.xyz.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}title"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}artist" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}genre" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}duration" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}composer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="no"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;maxInclusive value="99"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "artist",
    "genre",
    "duration",
    "composer"
})
@XmlRootElement(name = "track")
public class Track {

    @XmlElement(required = true)
    protected String title;
    protected String artist;
    protected String genre;
    protected String duration;
    protected String composer;
    @XmlAttribute(name = "no")
    protected BigInteger no;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.Track");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("title", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("artist", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("genre", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("duration", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("composer", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        fieldBuilder.optional();
        builder.field("no", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtist(String value) {
        this.artist = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the composer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComposer() {
        return composer;
    }

    /**
     * Sets the value of the composer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComposer(String value) {
        this.composer = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNo(BigInteger value) {
        this.no = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("title", this.getTitle());
        struct.put("artist", this.getArtist());
        struct.put("genre", this.getGenre());
        struct.put("duration", this.getDuration());
        struct.put("composer", this.getComposer());
        struct.put("no", this.getNo());
        return struct;
    }

}
