
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * A utility type entry.
 * 
 * <p>Java class for UtilityConfigurationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityConfigurationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntryIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="UtilityType" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityConfigurationTypeCode"/&gt;
 *         &lt;element name="Description" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="RatedValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Units" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMUnits"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityConfigurationObjectGroupType", propOrder = {
    "entryIndex",
    "name",
    "utilityType",
    "description",
    "ratedValue",
    "units"
})
public class UtilityConfigurationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "EntryIndex")
    protected int entryIndex;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "UtilityType", required = true)
    protected String utilityType;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "RatedValue")
    protected int ratedValue;
    @XmlElement(name = "Units", required = true)
    protected String units;
    public final static Schema CONNECT_SCHEMA;

    static UtilityConfigurationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.UtilityConfigurationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("EntryIndex", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Name", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("UtilityType", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Description", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("RatedValue", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Units", fieldBuilder.build());
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
     * Gets the value of the utilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtilityType() {
        return utilityType;
    }

    /**
     * Sets the value of the utilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtilityType(String value) {
        this.utilityType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the ratedValue property.
     * 
     */
    public int getRatedValue() {
        return ratedValue;
    }

    /**
     * Sets the value of the ratedValue property.
     * 
     */
    public void setRatedValue(int value) {
        this.ratedValue = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("entryIndex", this.entryIndex);
        struct.put("name", this.name);
        struct.put("utilityType", this.utilityType);
        struct.put("description", this.description);
        struct.put("ratedValue", this.ratedValue);
        struct.put("units", this.units);
        return struct;
    }

}
