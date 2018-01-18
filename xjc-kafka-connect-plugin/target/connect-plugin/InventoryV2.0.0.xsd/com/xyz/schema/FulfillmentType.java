
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for FulfillmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfillmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemID"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ItemIDCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InventoryLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryLocationType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;QuantityCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentType", propOrder = {
    "itemID",
    "inventoryLocation",
    "quantity"
})
public class FulfillmentType {

    @XmlElement(name = "ItemID", required = true)
    protected FulfillmentType.ItemID itemID;
    @XmlElement(name = "InventoryLocation")
    protected InventoryLocationType inventoryLocation;
    @XmlElement(name = "Quantity")
    protected FulfillmentType.Quantity quantity;
    public final static Schema CONNECT_SCHEMA;

    static FulfillmentType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.FulfillmentType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = FulfillmentType.ItemID.CONNECT_SCHEMA;
        builder.field("ItemID", fieldBuilder.build());
        fieldBuilder = InventoryLocationType.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("InventoryLocation", fieldBuilder.build());
        fieldBuilder = FulfillmentType.Quantity.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Quantity", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentType.ItemID }
     *     
     */
    public FulfillmentType.ItemID getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentType.ItemID }
     *     
     */
    public void setItemID(FulfillmentType.ItemID value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocationType }
     *     
     */
    public InventoryLocationType getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Sets the value of the inventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocationType }
     *     
     */
    public void setInventoryLocation(InventoryLocationType value) {
        this.inventoryLocation = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentType.Quantity }
     *     
     */
    public FulfillmentType.Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentType.Quantity }
     *     
     */
    public void setQuantity(FulfillmentType.Quantity value) {
        this.quantity = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getItemID()) {
            struct.put("ItemID", this.getItemID().toConnectStruct());
        } else {
            struct.put("ItemID", null);
        }
        if (null!= this.getInventoryLocation()) {
            struct.put("InventoryLocation", this.getInventoryLocation().toConnectStruct());
        } else {
            struct.put("InventoryLocation", null);
        }
        if (null!= this.getQuantity()) {
            struct.put("Quantity", this.getQuantity().toConnectStruct());
        } else {
            struct.put("Quantity", null);
        }
        return struct;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ItemIDCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ItemID
        extends ItemIDCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static ItemID() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.ItemID");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;QuantityCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Quantity
        extends QuantityCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static Quantity() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.Quantity");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }

}
