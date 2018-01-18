
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
 * Entry into table of protection parameters
 * 
 * <p>Java class for SecurityProtectionParametersObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityProtectionParametersObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="Area" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="Type" type="{http://www.nrf-arts.org/IXRetail/namespace/}ProtectionTypeCode"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Alarm" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="Fault" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="Supervisor" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="ResetAlarm" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="ResetFault" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="Clear" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="Test" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityProtectionParametersObjectGroupType", propOrder = {
    "index",
    "name",
    "area",
    "type"
})
public class SecurityProtectionParametersObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Area", required = true)
    protected String area;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Alarm", required = true)
    protected boolean alarm;
    @XmlAttribute(name = "Fault", required = true)
    protected boolean fault;
    @XmlAttribute(name = "Supervisor", required = true)
    protected boolean supervisor;
    @XmlAttribute(name = "ResetAlarm", required = true)
    protected boolean resetAlarm;
    @XmlAttribute(name = "ResetFault", required = true)
    protected boolean resetFault;
    @XmlAttribute(name = "Clear", required = true)
    protected boolean clear;
    @XmlAttribute(name = "Test", required = true)
    protected boolean test;
    public final static Schema CONNECT_SCHEMA;

    static SecurityProtectionParametersObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.SecurityProtectionParametersObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Name", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Area", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Type", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Alarm", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Fault", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Supervisor", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ResetAlarm", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ResetFault", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Clear", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Test", fieldBuilder.build());
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the alarm property.
     * 
     */
    public boolean isAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     */
    public void setAlarm(boolean value) {
        this.alarm = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     */
    public boolean isFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     */
    public void setFault(boolean value) {
        this.fault = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     */
    public boolean isSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     */
    public void setSupervisor(boolean value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the resetAlarm property.
     * 
     */
    public boolean isResetAlarm() {
        return resetAlarm;
    }

    /**
     * Sets the value of the resetAlarm property.
     * 
     */
    public void setResetAlarm(boolean value) {
        this.resetAlarm = value;
    }

    /**
     * Gets the value of the resetFault property.
     * 
     */
    public boolean isResetFault() {
        return resetFault;
    }

    /**
     * Sets the value of the resetFault property.
     * 
     */
    public void setResetFault(boolean value) {
        this.resetFault = value;
    }

    /**
     * Gets the value of the clear property.
     * 
     */
    public boolean isClear() {
        return clear;
    }

    /**
     * Sets the value of the clear property.
     * 
     */
    public void setClear(boolean value) {
        this.clear = value;
    }

    /**
     * Gets the value of the test property.
     * 
     */
    public boolean isTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     */
    public void setTest(boolean value) {
        this.test = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("name", this.name);
        struct.put("area", this.area);
        struct.put("type", this.type);
        struct.put("alarm", this.alarm);
        struct.put("fault", this.fault);
        struct.put("supervisor", this.supervisor);
        struct.put("resetAlarm", this.resetAlarm);
        struct.put("resetFault", this.resetFault);
        struct.put("clear", this.clear);
        struct.put("test", this.test);
        return struct;
    }

}
