
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Timestamp;


/**
 * Table of files on bulk media
 * 
 * <p>Java class for FileItemsObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileItemsObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntryIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FileName" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="ItemAccessed" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDateTime"/&gt;
 *         &lt;element name="ItemCreated" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDateTime"/&gt;
 *         &lt;element name="ItemModified" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDateTime"/&gt;
 *         &lt;element name="ItemVersion" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString8"/&gt;
 *         &lt;element name="ItemSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileItemsObjectGroupType", propOrder = {
    "entryIndex",
    "fileName",
    "itemAccessed",
    "itemCreated",
    "itemModified",
    "itemVersion",
    "itemSize"
})
public class FileItemsObjectGroupType
    implements Connectable
{

    @XmlElement(name = "EntryIndex")
    protected int entryIndex;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "ItemAccessed", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar itemAccessed;
    @XmlElement(name = "ItemCreated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar itemCreated;
    @XmlElement(name = "ItemModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar itemModified;
    @XmlElement(name = "ItemVersion", required = true)
    protected String itemVersion;
    @XmlElement(name = "ItemSize")
    protected int itemSize;
    @XmlAttribute(name = "Status", required = true)
    protected boolean status;
    public final static Schema CONNECT_SCHEMA;

    static FileItemsObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.FileItemsObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("EntryIndex", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("FileName", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        builder.field("ItemAccessed", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        builder.field("ItemCreated", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        builder.field("ItemModified", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ItemVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ItemSize", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Status", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the entryIndex property.
     * 
     */
    public int getEntryIndex() {
        return entryIndex;
    }

    /**
     * Sets the value of the entryIndex property.
     * 
     */
    public void setEntryIndex(int value) {
        this.entryIndex = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the itemAccessed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemAccessed() {
        return itemAccessed;
    }

    /**
     * Sets the value of the itemAccessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemAccessed(XMLGregorianCalendar value) {
        this.itemAccessed = value;
    }

    /**
     * Gets the value of the itemCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemCreated() {
        return itemCreated;
    }

    /**
     * Sets the value of the itemCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemCreated(XMLGregorianCalendar value) {
        this.itemCreated = value;
    }

    /**
     * Gets the value of the itemModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemModified() {
        return itemModified;
    }

    /**
     * Sets the value of the itemModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemModified(XMLGregorianCalendar value) {
        this.itemModified = value;
    }

    /**
     * Gets the value of the itemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemVersion() {
        return itemVersion;
    }

    /**
     * Sets the value of the itemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemVersion(String value) {
        this.itemVersion = value;
    }

    /**
     * Gets the value of the itemSize property.
     * 
     */
    public int getItemSize() {
        return itemSize;
    }

    /**
     * Sets the value of the itemSize property.
     * 
     */
    public void setItemSize(int value) {
        this.itemSize = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("entryIndex", this.entryIndex);
        struct.put("fileName", this.fileName);
        struct.put("itemAccessed", this.itemAccessed);
        struct.put("itemCreated", this.itemCreated);
        struct.put("itemModified", this.itemModified);
        struct.put("itemVersion", this.itemVersion);
        struct.put("itemSize", this.itemSize);
        struct.put("status", this.status);
        return struct;
    }

}
