
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}artist"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}title"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}genre" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}duration" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}rating" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}price" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}publisher" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}track-list" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "artist",
    "title",
    "genre",
    "duration",
    "rating",
    "price",
    "publisher",
    "description",
    "trackList"
})
@XmlRootElement(name = "cd")
public class Cd {

    @XmlElement(required = true)
    protected String artist;
    @XmlElement(required = true)
    protected String title;
    protected String genre;
    protected String duration;
    protected String rating;
    protected Price price;
    protected String publisher;
    protected Description description;
    @XmlElement(name = "track-list")
    protected TrackList trackList;
    public final static Schema CONNECT_SCHEMA;

    static Cd() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.Cd");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("artist", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("title", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("genre", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("duration", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("rating", fieldBuilder.build());
        fieldBuilder = Price.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("price", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("publisher", fieldBuilder.build());
        fieldBuilder = Description.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("description", fieldBuilder.build());
        fieldBuilder = TrackList.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("track-list", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
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
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the trackList property.
     * 
     * @return
     *     possible object is
     *     {@link TrackList }
     *     
     */
    public TrackList getTrackList() {
        return trackList;
    }

    /**
     * Sets the value of the trackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackList }
     *     
     */
    public void setTrackList(TrackList value) {
        this.trackList = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("artist", this.getArtist());
        struct.put("title", this.getTitle());
        struct.put("genre", this.getGenre());
        struct.put("duration", this.getDuration());
        struct.put("rating", this.getRating());
        if (null!= this.getPrice()) {
            struct.put("price", this.getPrice().toConnectStruct());
        } else {
            struct.put("price", null);
        }
        struct.put("publisher", this.getPublisher());
        if (null!= this.getDescription()) {
            struct.put("description", this.getDescription().toConnectStruct());
        } else {
            struct.put("description", null);
        }
        if (null!= this.getTrackList()) {
            struct.put("track-list", this.getTrackList().toConnectStruct());
        } else {
            struct.put("track-list", null);
        }
        return struct;
    }

}
