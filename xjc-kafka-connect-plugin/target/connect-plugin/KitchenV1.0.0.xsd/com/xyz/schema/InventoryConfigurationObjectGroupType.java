
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * An entry in the table of descriptions of inventory
 *             items.
 * 
 * <p>Java class for InventoryConfigurationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryConfigurationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItemName" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="Description" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString128"/&gt;
 *         &lt;element name="Units" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="VendorNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItemCode" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString16"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryConfigurationObjectGroupType", propOrder = {
    "index",
    "itemName",
    "description",
    "units",
    "vendorNumber",
    "itemCode"
})
public class InventoryConfigurationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "ItemName", required = true)
    protected String itemName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Units", required = true)
    protected String units;
    @XmlElement(name = "VendorNumber")
    protected int vendorNumber;
    @XmlElement(name = "ItemCode", required = true)
    protected String itemCode;
    public final static Schema CONNECT_SCHEMA;

    static InventoryConfigurationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryConfigurationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ItemName", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Description", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Units", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("VendorNumber", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ItemCode", fieldBuilder.build());
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
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
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
     * Gets the value of the vendorNumber property.
     * 
     */
    public int getVendorNumber() {
        return vendorNumber;
    }

    /**
     * Sets the value of the vendorNumber property.
     * 
     */
    public void setVendorNumber(int value) {
        this.vendorNumber = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("itemName", this.itemName);
        struct.put("description", this.description);
        struct.put("units", this.units);
        struct.put("vendorNumber", this.vendorNumber);
        struct.put("itemCode", this.itemCode);
        return struct;
    }

}
