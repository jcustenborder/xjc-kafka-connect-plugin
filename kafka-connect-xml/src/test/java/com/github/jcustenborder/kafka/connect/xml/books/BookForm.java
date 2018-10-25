
package com.github.jcustenborder.kafka.connect.xml.books;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.github.jcustenborder.kafka.connect.xml.Connectable;
import com.github.jcustenborder.kafka.connect.xml.ConnectableHelper;
import org.apache.kafka.connect.data.Date;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for BookForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="pub_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="review" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookForm", propOrder = {
    "author",
    "title",
    "genre",
    "price",
    "pubDate",
    "review"
})
public class BookForm
    implements Connectable
{

    @XmlElement(required = true)
    protected String author;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String genre;
    protected float price;
    @XmlElement(name = "pub_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pubDate;
    @XmlElement(required = true)
    protected String review;
    @XmlAttribute(name = "id")
    protected String id;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.BookForm");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("author", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("title", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("genre", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.float32();
        fieldBuilder.optional();
        builder.field("price", fieldBuilder.build());
        fieldBuilder = Date.builder();
        builder.field("pub_date", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("review", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("id", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
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
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the pubDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPubDate() {
        return pubDate;
    }

    /**
     * Sets the value of the pubDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPubDate(XMLGregorianCalendar value) {
        this.pubDate = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReview() {
        return review;
    }

    /**
     * Sets the value of the review property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReview(String value) {
        this.review = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    @Override
    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        ConnectableHelper.toString(struct, "author", this.author);
        ConnectableHelper.toString(struct, "title", this.title);
        ConnectableHelper.toString(struct, "genre", this.genre);
        ConnectableHelper.toFloat32(struct, "price", this.price);
        ConnectableHelper.toDate(struct, "pub_date", this.pubDate);
        ConnectableHelper.toString(struct, "review", this.review);
        ConnectableHelper.toString(struct, "id", this.id);
        return struct;
    }

    @Override
    public void fromStruct(Struct struct) {
        this.author = ConnectableHelper.fromString(struct, "author");
        this.title = ConnectableHelper.fromString(struct, "title");
        this.genre = ConnectableHelper.fromString(struct, "genre");
        this.price = ConnectableHelper.fromFloat32(struct, "price");
        this.pubDate = ConnectableHelper.fromDate(struct, "pub_date");
        this.review = ConnectableHelper.fromString(struct, "review");
        this.id = ConnectableHelper.fromString(struct, "id");
    }

}
