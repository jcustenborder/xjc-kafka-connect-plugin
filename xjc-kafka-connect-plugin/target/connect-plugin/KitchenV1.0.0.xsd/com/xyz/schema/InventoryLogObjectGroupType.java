
package com.xyz.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Entry into log configuration parameters table
 * 
 * <p>Java class for InventoryLogObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryLogObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DataIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Interval" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMInterval"/&gt;
 *         &lt;element name="Deviation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ForcedInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaximumLogHoldDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LogHistory" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryLogHistoryObjectGroupType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Enable" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryLogObjectGroupType", propOrder = {
    "index",
    "dataIndex",
    "interval",
    "deviation",
    "forcedInterval",
    "maximumLogHoldDays",
    "logHistory"
})
public class InventoryLogObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "DataIndex")
    protected int dataIndex;
    @XmlElement(name = "Interval", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger interval;
    @XmlElement(name = "Deviation")
    protected int deviation;
    @XmlElement(name = "ForcedInterval")
    protected int forcedInterval;
    @XmlElement(name = "MaximumLogHoldDays")
    protected int maximumLogHoldDays;
    @XmlElement(name = "LogHistory", required = true)
    protected List<InventoryLogHistoryObjectGroupType> logHistory;
    @XmlAttribute(name = "Enable", required = true)
    protected boolean enable;
    public final static Schema CONNECT_SCHEMA;

    static InventoryLogObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryLogObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("DataIndex", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("Interval", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Deviation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ForcedInterval", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MaximumLogHoldDays", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("LogHistory", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Enable", fieldBuilder.build());
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
     * Gets the value of the dataIndex property.
     * 
     */
    public int getDataIndex() {
        return dataIndex;
    }

    /**
     * Sets the value of the dataIndex property.
     * 
     */
    public void setDataIndex(int value) {
        this.dataIndex = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInterval(BigInteger value) {
        this.interval = value;
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
     * Gets the value of the forcedInterval property.
     * 
     */
    public int getForcedInterval() {
        return forcedInterval;
    }

    /**
     * Sets the value of the forcedInterval property.
     * 
     */
    public void setForcedInterval(int value) {
        this.forcedInterval = value;
    }

    /**
     * Gets the value of the maximumLogHoldDays property.
     * 
     */
    public int getMaximumLogHoldDays() {
        return maximumLogHoldDays;
    }

    /**
     * Sets the value of the maximumLogHoldDays property.
     * 
     */
    public void setMaximumLogHoldDays(int value) {
        this.maximumLogHoldDays = value;
    }

    /**
     * Gets the value of the logHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryLogHistoryObjectGroupType }
     * 
     * 
     */
    public List<InventoryLogHistoryObjectGroupType> getLogHistory() {
        if (logHistory == null) {
            logHistory = new ArrayList<InventoryLogHistoryObjectGroupType>();
        }
        return this.logHistory;
    }

    /**
     * Gets the value of the enable property.
     * 
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("dataIndex", this.dataIndex);
        struct.put("interval", this.interval);
        struct.put("deviation", this.deviation);
        struct.put("forcedInterval", this.forcedInterval);
        struct.put("maximumLogHoldDays", this.maximumLogHoldDays);
        struct.put("logHistory", this.logHistory);
        struct.put("enable", this.enable);
        return struct;
    }

}
