
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for MaintenanceProcessItemConfigurationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceProcessItemConfigurationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="Equipment" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceProcessItemConfigurationObjectGroupType", propOrder = {
    "index",
    "itemName",
    "units",
    "equipment",
    "location"
})
public class MaintenanceProcessItemConfigurationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index", required = true)
    protected Object index;
    @XmlElement(name = "ItemName", required = true)
    protected Object itemName;
    @XmlElement(name = "Units", required = true)
    protected Object units;
    @XmlElement(name = "Equipment", required = true)
    protected Object equipment;
    @XmlElement(name = "Location", required = true)
    protected Object location;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceProcessItemConfigurationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceProcessItemConfigurationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ItemName", fieldBuilder.build());
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
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIndex(Object value) {
        this.index = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setItemName(Object value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnits(Object value) {
        this.units = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEquipment(Object value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocation(Object value) {
        this.location = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("itemName", this.itemName);
        struct.put("units", this.units);
        struct.put("equipment", this.equipment);
        struct.put("location", this.location);
        return struct;
    }

}
