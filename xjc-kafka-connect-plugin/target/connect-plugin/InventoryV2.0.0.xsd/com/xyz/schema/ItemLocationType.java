
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for ItemLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ItemIDCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InventoryLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;QuantityCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateTime" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;DateTimeCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="State" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryStatusCodes" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemLocationType", propOrder = {
    "itemID",
    "inventoryLocation",
    "quantity",
    "dateTime",
    "disposition"
})
public class ItemLocationType {

    @XmlElement(name = "ItemID")
    protected ItemLocationType.ItemID itemID;
    @XmlElement(name = "InventoryLocation")
    protected List<InventoryLocationType> inventoryLocation;
    @XmlElement(name = "Quantity")
    protected ItemLocationType.Quantity quantity;
    @XmlElement(name = "DateTime")
    protected List<ItemLocationType.DateTime> dateTime;
    @XmlElement(name = "Disposition")
    protected String disposition;
    @XmlAttribute(name = "State")
    protected String state;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.ItemLocationType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = ItemLocationType.ItemID.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ItemID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryLocationType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("InventoryLocation", fieldBuilder.build());
        fieldBuilder = ItemLocationType.Quantity.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Quantity", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(ItemLocationType.DateTime.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("DateTime", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Disposition", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("State", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationType.ItemID }
     *     
     */
    public ItemLocationType.ItemID getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationType.ItemID }
     *     
     */
    public void setItemID(ItemLocationType.ItemID value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryLocationType }
     * 
     * 
     */
    public List<InventoryLocationType> getInventoryLocation() {
        if (inventoryLocation == null) {
            inventoryLocation = new ArrayList<InventoryLocationType>();
        }
        return this.inventoryLocation;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationType.Quantity }
     *     
     */
    public ItemLocationType.Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationType.Quantity }
     *     
     */
    public void setQuantity(ItemLocationType.Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLocationType.DateTime }
     * 
     * 
     */
    public List<ItemLocationType.DateTime> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<ItemLocationType.DateTime>();
        }
        return this.dateTime;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposition(String value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getItemID()) {
            struct.put("ItemID", this.getItemID().toConnectStruct());
        } else {
            struct.put("ItemID", null);
        }
        if (null!= this.getInventoryLocation()) {
            List<Struct> structs = new ArrayList();
            for (InventoryLocationType o: this.getInventoryLocation()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("InventoryLocation", structs);
        }
        if (null!= this.getQuantity()) {
            struct.put("Quantity", this.getQuantity().toConnectStruct());
        } else {
            struct.put("Quantity", null);
        }
        if (null!= this.getDateTime()) {
            List<Struct> structs = new ArrayList();
            for (ItemLocationType.DateTime o: this.getDateTime()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("DateTime", structs);
        }
        struct.put("Disposition", this.getDisposition());
        struct.put("State", this.getState());
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;DateTimeCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DateTime
        extends DateTimeCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.DateTime");
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

        static {
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

        static {
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
