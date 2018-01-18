
package com.xyz.schema;

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
 * Entry into maintenance process data table
 * 
 * <p>Java class for MaintenanceProcessItemDataObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceProcessItemDataObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TargetValue" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMValue"/&gt;
 *         &lt;element name="ActualValue" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMValue"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
@XmlType(name = "MaintenanceProcessItemDataObjectGroupType", propOrder = {
    "index",
    "targetValue",
    "actualValue",
    "status",
    "timestamp"
})
public class MaintenanceProcessItemDataObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "TargetValue")
    protected int targetValue;
    @XmlElement(name = "ActualValue")
    protected int actualValue;
    @XmlElement(name = "Status", required = true)
    protected Object status;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceProcessItemDataObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceProcessItemDataObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("TargetValue", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ActualValue", fieldBuilder.build());
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
     * Gets the value of the targetValue property.
     * 
     */
    public int getTargetValue() {
        return targetValue;
    }

    /**
     * Sets the value of the targetValue property.
     * 
     */
    public void setTargetValue(int value) {
        this.targetValue = value;
    }

    /**
     * Gets the value of the actualValue property.
     * 
     */
    public int getActualValue() {
        return actualValue;
    }

    /**
     * Sets the value of the actualValue property.
     * 
     */
    public void setActualValue(int value) {
        this.actualValue = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatus(Object value) {
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
        struct.put("targetValue", this.targetValue);
        struct.put("actualValue", this.actualValue);
        struct.put("status", this.status);
        struct.put("timestamp", this.timestamp);
        return struct;
    }

}
