
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
 * Entry into the utility management log
 * 
 * <p>Java class for UtilityLogObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityLogObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntryIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Interval" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMInterval"/&gt;
 *         &lt;element name="Deviation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ForcedInterval" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMInterval"/&gt;
 *         &lt;element name="MaximumLogHoldDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UtilityLogHistory" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityLogHistoryObjectGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "UtilityLogObjectGroupType", propOrder = {
    "entryIndex",
    "index",
    "interval",
    "deviation",
    "forcedInterval",
    "maximumLogHoldDays",
    "utilityLogHistory"
})
public class UtilityLogObjectGroupType
    implements Connectable
{

    @XmlElement(name = "EntryIndex")
    protected int entryIndex;
    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Interval", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger interval;
    @XmlElement(name = "Deviation")
    protected int deviation;
    @XmlElement(name = "ForcedInterval", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger forcedInterval;
    @XmlElement(name = "MaximumLogHoldDays")
    protected int maximumLogHoldDays;
    @XmlElement(name = "UtilityLogHistory")
    protected List<UtilityLogHistoryObjectGroupType> utilityLogHistory;
    @XmlAttribute(name = "Enable", required = true)
    protected boolean enable;
    public final static Schema CONNECT_SCHEMA;

    static UtilityLogObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.UtilityLogObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("EntryIndex", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("Interval", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Deviation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("ForcedInterval", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MaximumLogHoldDays", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UtilityLogHistory", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Enable", fieldBuilder.build());
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
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getForcedInterval() {
        return forcedInterval;
    }

    /**
     * Sets the value of the forcedInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setForcedInterval(BigInteger value) {
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
     * Gets the value of the utilityLogHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilityLogHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilityLogHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UtilityLogHistoryObjectGroupType }
     * 
     * 
     */
    public List<UtilityLogHistoryObjectGroupType> getUtilityLogHistory() {
        if (utilityLogHistory == null) {
            utilityLogHistory = new ArrayList<UtilityLogHistoryObjectGroupType>();
        }
        return this.utilityLogHistory;
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
        struct.put("entryIndex", this.entryIndex);
        struct.put("index", this.index);
        struct.put("interval", this.interval);
        struct.put("deviation", this.deviation);
        struct.put("forcedInterval", this.forcedInterval);
        struct.put("maximumLogHoldDays", this.maximumLogHoldDays);
        struct.put("utilityLogHistory", this.utilityLogHistory);
        struct.put("enable", this.enable);
        return struct;
    }

}
