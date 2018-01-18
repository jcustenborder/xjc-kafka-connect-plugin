
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
 * Entry of maintenance unscheduled configuration item
 *             table
 * 
 * <p>Java class for MaintenanceUnscheduledItemDataObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceUnscheduledItemDataObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaximumValue" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMCounter"/&gt;
 *         &lt;element name="AccumulatedValue" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMCounter"/&gt;
 *         &lt;element name="Status" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceStatusTypeCode"/&gt;
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
@XmlType(name = "MaintenanceUnscheduledItemDataObjectGroupType", propOrder = {
    "index",
    "maximumValue",
    "accumulatedValue",
    "status",
    "timestamp"
})
public class MaintenanceUnscheduledItemDataObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "MaximumValue", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumValue;
    @XmlElement(name = "AccumulatedValue", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger accumulatedValue;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceUnscheduledItemDataObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceUnscheduledItemDataObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("MaximumValue", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("AccumulatedValue", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Status", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        builder.field("Timestamp", fieldBuilder.build());
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
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumValue(BigInteger value) {
        this.maximumValue = value;
    }

    /**
     * Gets the value of the accumulatedValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccumulatedValue() {
        return accumulatedValue;
    }

    /**
     * Sets the value of the accumulatedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccumulatedValue(BigInteger value) {
        this.accumulatedValue = value;
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
        struct.put("index", this.index);
        struct.put("maximumValue", this.maximumValue);
        struct.put("accumulatedValue", this.accumulatedValue);
        struct.put("status", this.status);
        struct.put("timestamp", this.timestamp);
        return struct;
    }

}
