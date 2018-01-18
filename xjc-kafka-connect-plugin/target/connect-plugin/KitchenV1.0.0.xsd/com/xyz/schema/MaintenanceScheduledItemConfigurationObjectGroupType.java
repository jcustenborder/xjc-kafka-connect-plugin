
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Entry into maintenance scheduled items table
 * 
 * <p>Java class for MaintenanceScheduledItemConfigurationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceScheduledItemConfigurationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString255"/&gt;
 *         &lt;element name="Units" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMUnits"/&gt;
 *         &lt;element name="Equipment" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString255"/&gt;
 *         &lt;element name="Location" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString255"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceScheduledItemConfigurationObjectGroupType", propOrder = {
    "index",
    "name",
    "units",
    "equipment",
    "location"
})
public class MaintenanceScheduledItemConfigurationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Units", required = true)
    protected String units;
    @XmlElement(name = "Equipment", required = true)
    protected String equipment;
    @XmlElement(name = "Location", required = true)
    protected String location;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceScheduledItemConfigurationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceScheduledItemConfigurationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Name", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Units", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Equipment", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Location", fieldBuilder.build());
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

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("name", this.name);
        struct.put("units", this.units);
        struct.put("equipment", this.equipment);
        struct.put("location", this.location);
        return struct;
    }

}
