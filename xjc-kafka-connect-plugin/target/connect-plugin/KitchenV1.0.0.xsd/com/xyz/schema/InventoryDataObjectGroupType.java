
package com.xyz.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Timestamp;


/**
 * An entry in the table of collected information for inventory
 *             items
 * 
 * <p>Java class for InventoryDataObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryDataObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntryIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CurrentUsage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalUsage" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMCounter"/&gt;
 *         &lt;element name="Status" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryStatusTypeCode"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryDataObjectGroupType", propOrder = {
    "entryIndex",
    "currentUsage",
    "totalUsage",
    "status",
    "timestamp"
})
public class InventoryDataObjectGroupType
    implements Connectable
{

    @XmlElement(name = "EntryIndex")
    protected int entryIndex;
    @XmlElement(name = "CurrentUsage")
    protected int currentUsage;
    @XmlElement(name = "TotalUsage", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalUsage;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    public final static Schema CONNECT_SCHEMA;

    static InventoryDataObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryDataObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("EntryIndex", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("CurrentUsage", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("TotalUsage", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Status", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        builder.field("Timestamp", fieldBuilder.build());
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
     * Gets the value of the currentUsage property.
     * 
     */
    public int getCurrentUsage() {
        return currentUsage;
    }

    /**
     * Sets the value of the currentUsage property.
     * 
     */
    public void setCurrentUsage(int value) {
        this.currentUsage = value;
    }

    /**
     * Gets the value of the totalUsage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUsage() {
        return totalUsage;
    }

    /**
     * Sets the value of the totalUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUsage(BigInteger value) {
        this.totalUsage = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("entryIndex", this.entryIndex);
        struct.put("currentUsage", this.currentUsage);
        struct.put("totalUsage", this.totalUsage);
        struct.put("status", this.status);
        struct.put("timestamp", this.timestamp);
        return struct;
    }

}
