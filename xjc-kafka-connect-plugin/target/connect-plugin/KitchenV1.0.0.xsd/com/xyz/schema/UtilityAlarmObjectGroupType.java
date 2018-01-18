
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
 * An entry in the table of history data for each utility type
 *             logged
 * 
 * <p>Java class for UtilityAlarmObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityAlarmObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CriticalLimitHigh" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMValue"/&gt;
 *         &lt;element name="CriticalLimitLow" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMValue"/&gt;
 *         &lt;element name="WarningLimitHigh" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMValue"/&gt;
 *         &lt;element name="WarningLimitLow" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMValue"/&gt;
 *         &lt;element name="Deviation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Clear" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="Bypass" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityAlarmObjectGroupType", propOrder = {
    "index",
    "criticalLimitHigh",
    "criticalLimitLow",
    "warningLimitHigh",
    "warningLimitLow",
    "deviation"
})
public class UtilityAlarmObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "CriticalLimitHigh")
    protected int criticalLimitHigh;
    @XmlElement(name = "CriticalLimitLow")
    protected int criticalLimitLow;
    @XmlElement(name = "WarningLimitHigh")
    protected int warningLimitHigh;
    @XmlElement(name = "WarningLimitLow")
    protected int warningLimitLow;
    @XmlElement(name = "Deviation")
    protected int deviation;
    @XmlAttribute(name = "Clear", required = true)
    protected boolean clear;
    @XmlAttribute(name = "Bypass", required = true)
    protected boolean bypass;
    public final static Schema CONNECT_SCHEMA;

    static UtilityAlarmObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.UtilityAlarmObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("CriticalLimitHigh", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("CriticalLimitLow", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("WarningLimitHigh", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("WarningLimitLow", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Deviation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Clear", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
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
     * Gets the value of the criticalLimitHigh property.
     * 
     */
    public int getCriticalLimitHigh() {
        return criticalLimitHigh;
    }

    /**
     * Sets the value of the criticalLimitHigh property.
     * 
     */
    public void setCriticalLimitHigh(int value) {
        this.criticalLimitHigh = value;
    }

    /**
     * Gets the value of the criticalLimitLow property.
     * 
     */
    public int getCriticalLimitLow() {
        return criticalLimitLow;
    }

    /**
     * Sets the value of the criticalLimitLow property.
     * 
     */
    public void setCriticalLimitLow(int value) {
        this.criticalLimitLow = value;
    }

    /**
     * Gets the value of the warningLimitHigh property.
     * 
     */
    public int getWarningLimitHigh() {
        return warningLimitHigh;
    }

    /**
     * Sets the value of the warningLimitHigh property.
     * 
     */
    public void setWarningLimitHigh(int value) {
        this.warningLimitHigh = value;
    }

    /**
     * Gets the value of the warningLimitLow property.
     * 
     */
    public int getWarningLimitLow() {
        return warningLimitLow;
    }

    /**
     * Sets the value of the warningLimitLow property.
     * 
     */
    public void setWarningLimitLow(int value) {
        this.warningLimitLow = value;
    }

    /**
     * Gets the value of the deviation property.
     * 
     */
    public int getDeviation() {
        return deviation;
    }

    /**
     * Sets the value of the deviation property.
     * 
     */
    public void setDeviation(int value) {
        this.deviation = value;
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
     * Gets the value of the bypass property.
     * 
     */
    public boolean isBypass() {
        return bypass;
    }

    /**
     * Sets the value of the bypass property.
     * 
     */
    public void setBypass(boolean value) {
        this.bypass = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("criticalLimitHigh", this.criticalLimitHigh);
        struct.put("criticalLimitLow", this.criticalLimitLow);
        struct.put("warningLimitHigh", this.warningLimitHigh);
        struct.put("warningLimitLow", this.warningLimitLow);
        struct.put("deviation", this.deviation);
        struct.put("clear", this.clear);
        struct.put("bypass", this.bypass);
        return struct;
    }

}
