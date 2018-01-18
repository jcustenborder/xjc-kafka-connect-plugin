
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * An entry in the table of information describing data objects for
 *                 monitoring the device.
 * 
 * <p>Java class for MonitorConfigurationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorConfigurationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="Units" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMUnits"/&gt;
 *         &lt;element name="Description" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="Location" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="LotID" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorConfigurationObjectGroupType", propOrder = {
    "index",
    "name",
    "units",
    "description",
    "location",
    "lotID"
})
public class MonitorConfigurationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Units", required = true)
    protected String units;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "LotID", required = true)
    protected String lotID;
    public final static Schema CONNECT_SCHEMA;

    static MonitorConfigurationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MonitorConfigurationObjectGroupType");
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
        builder.field("Description", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Location", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("LotID", fieldBuilder.build());
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

    /**
     * Gets the value of the lotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotID() {
        return lotID;
    }

    /**
     * Sets the value of the lotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotID(String value) {
        this.lotID = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("name", this.name);
        struct.put("units", this.units);
        struct.put("description", this.description);
        struct.put("location", this.location);
        struct.put("lotID", this.lotID);
        return struct;
    }

}
