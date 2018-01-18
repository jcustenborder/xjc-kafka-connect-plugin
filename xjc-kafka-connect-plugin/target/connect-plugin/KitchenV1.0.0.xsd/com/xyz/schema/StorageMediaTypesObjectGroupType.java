
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Table of bulk media i.e. hard disks, flash,
 *             EEPROM...
 * 
 * <p>Java class for StorageMediaTypesObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageMediaTypesObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="MediaName" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="MediaSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UsedSpace" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FreeSpace" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MediaType" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString16"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageMediaTypesObjectGroupType", propOrder = {
    "index",
    "mediaName",
    "mediaSize",
    "usedSpace",
    "freeSpace",
    "mediaType"
})
public class StorageMediaTypesObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index", required = true)
    protected Object index;
    @XmlElement(name = "MediaName", required = true)
    protected String mediaName;
    @XmlElement(name = "MediaSize")
    protected int mediaSize;
    @XmlElement(name = "UsedSpace")
    protected int usedSpace;
    @XmlElement(name = "FreeSpace")
    protected int freeSpace;
    @XmlElement(name = "MediaType", required = true)
    protected String mediaType;
    public final static Schema CONNECT_SCHEMA;

    static StorageMediaTypesObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.StorageMediaTypesObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("MediaName", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MediaSize", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UsedSpace", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("FreeSpace", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("MediaType", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIndex(Object value) {
        this.index = value;
    }

    /**
     * Gets the value of the mediaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaName() {
        return mediaName;
    }

    /**
     * Sets the value of the mediaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaName(String value) {
        this.mediaName = value;
    }

    /**
     * Gets the value of the mediaSize property.
     * 
     */
    public int getMediaSize() {
        return mediaSize;
    }

    /**
     * Sets the value of the mediaSize property.
     * 
     */
    public void setMediaSize(int value) {
        this.mediaSize = value;
    }

    /**
     * Gets the value of the usedSpace property.
     * 
     */
    public int getUsedSpace() {
        return usedSpace;
    }

    /**
     * Sets the value of the usedSpace property.
     * 
     */
    public void setUsedSpace(int value) {
        this.usedSpace = value;
    }

    /**
     * Gets the value of the freeSpace property.
     * 
     */
    public int getFreeSpace() {
        return freeSpace;
    }

    /**
     * Sets the value of the freeSpace property.
     * 
     */
    public void setFreeSpace(int value) {
        this.freeSpace = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("mediaName", this.mediaName);
        struct.put("mediaSize", this.mediaSize);
        struct.put("usedSpace", this.usedSpace);
        struct.put("freeSpace", this.freeSpace);
        struct.put("mediaType", this.mediaType);
        return struct;
    }

}
