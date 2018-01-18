
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.kafka.connect.data.Date;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Timestamp;


/**
 * Entry into maintenance scheduled items data table
 * 
 * <p>Java class for MaintenanceScheduledItemDataObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceScheduledItemDataObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DueDate" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDate"/&gt;
 *         &lt;element name="LastDate" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDate"/&gt;
 *         &lt;element name="Status" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceStatusTypeCode"/&gt;
 *         &lt;element name="DateTimestamp" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceScheduledItemDataObjectGroupType", propOrder = {
    "index",
    "dueDate",
    "lastDate",
    "status",
    "dateTimestamp"
})
public class MaintenanceScheduledItemDataObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "DueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "LastDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDate;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "DateTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimestamp;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceScheduledItemDataObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceScheduledItemDataObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = Date.builder();
        builder.field("DueDate", fieldBuilder.build());
        fieldBuilder = Date.builder();
        builder.field("LastDate", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Status", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        builder.field("DateTimestamp", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the lastDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDate() {
        return lastDate;
    }

    /**
     * Sets the value of the lastDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDate(XMLGregorianCalendar value) {
        this.lastDate = value;
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
     * Gets the value of the dateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimestamp() {
        return dateTimestamp;
    }

    /**
     * Sets the value of the dateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimestamp(XMLGregorianCalendar value) {
        this.dateTimestamp = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("dueDate", this.dueDate);
        struct.put("lastDate", this.lastDate);
        struct.put("status", this.status);
        struct.put("dateTimestamp", this.dateTimestamp);
        return struct;
    }

}
