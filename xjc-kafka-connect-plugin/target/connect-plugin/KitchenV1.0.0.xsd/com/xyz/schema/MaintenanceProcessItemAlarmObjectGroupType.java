
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * An entry in the table of information to configure
 *             alarms
 * 
 * <p>Java class for MaintenanceProcessItemAlarmObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceProcessItemAlarmObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AlarmOperation" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Clear" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="Bypass" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceProcessItemAlarmObjectGroupType", propOrder = {
    "index",
    "alarmOperation"
})
public class MaintenanceProcessItemAlarmObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "AlarmOperation", required = true)
    protected Object alarmOperation;
    @XmlAttribute(name = "Clear")
    protected Boolean clear;
    @XmlAttribute(name = "Bypass")
    protected Boolean bypass;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceProcessItemAlarmObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceProcessItemAlarmObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("AlarmOperation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Clear", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Bypass", fieldBuilder.build());
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
     * Gets the value of the alarmOperation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAlarmOperation() {
        return alarmOperation;
    }

    /**
     * Sets the value of the alarmOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAlarmOperation(Object value) {
        this.alarmOperation = value;
    }

    /**
     * Gets the value of the clear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClear() {
        return clear;
    }

    /**
     * Sets the value of the clear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClear(Boolean value) {
        this.clear = value;
    }

    /**
     * Gets the value of the bypass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypass() {
        return bypass;
    }

    /**
     * Sets the value of the bypass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypass(Boolean value) {
        this.bypass = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("alarmOperation", this.alarmOperation);
        struct.put("clear", this.clear);
        struct.put("bypass", this.bypass);
        return struct;
    }

}
