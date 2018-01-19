
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.kafka.connect.data.Date;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for InventoryItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryItemType"&gt;
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
 *         &lt;element name="ItemLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}ItemLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FromLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}ItemLocationType" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;QuantityCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReasonCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ReasonCodeCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ToLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}ItemLocationType" minOccurs="0"/&gt;
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
@XmlType(name = "InventoryItemType", propOrder = {
    "itemID",
    "itemLocation",
    "inventoryLocation",
    "fromLocation",
    "plannedDate",
    "quantity",
    "reasonCode",
    "toLocation"
})
public class InventoryItemType {

    @XmlElement(name = "ItemID")
    protected InventoryItemType.ItemID itemID;
    @XmlElement(name = "ItemLocation")
    protected List<ItemLocationType> itemLocation;
    @XmlElement(name = "InventoryLocation")
    protected List<InventoryLocationType> inventoryLocation;
    @XmlElement(name = "FromLocation")
    protected ItemLocationType fromLocation;
    @XmlElement(name = "PlannedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar plannedDate;
    @XmlElement(name = "Quantity")
    protected InventoryItemType.Quantity quantity;
    @XmlElement(name = "ReasonCode")
    protected InventoryItemType.ReasonCode reasonCode;
    @XmlElement(name = "ToLocation")
    protected ItemLocationType toLocation;
    @XmlAttribute(name = "State")
    protected String state;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryItemType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = InventoryItemType.ItemID.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ItemID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(ItemLocationType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("ItemLocation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryLocationType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("InventoryLocation", fieldBuilder.build());
        fieldBuilder = ItemLocationType.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("FromLocation", fieldBuilder.build());
        fieldBuilder = Date.builder();
        fieldBuilder.optional();
        builder.field("PlannedDate", fieldBuilder.build());
        fieldBuilder = InventoryItemType.Quantity.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Quantity", fieldBuilder.build());
        fieldBuilder = InventoryItemType.ReasonCode.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ReasonCode", fieldBuilder.build());
        fieldBuilder = ItemLocationType.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ToLocation", fieldBuilder.build());
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
     *     {@link InventoryItemType.ItemID }
     *     
     */
    public InventoryItemType.ItemID getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemType.ItemID }
     *     
     */
    public void setItemID(InventoryItemType.ItemID value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the itemLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLocationType }
     * 
     * 
     */
    public List<ItemLocationType> getItemLocation() {
        if (itemLocation == null) {
            itemLocation = new ArrayList<ItemLocationType>();
        }
        return this.itemLocation;
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
     * Gets the value of the fromLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationType }
     *     
     */
    public ItemLocationType getFromLocation() {
        return fromLocation;
    }

    /**
     * Sets the value of the fromLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationType }
     *     
     */
    public void setFromLocation(ItemLocationType value) {
        this.fromLocation = value;
    }

    /**
     * Gets the value of the plannedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedDate() {
        return plannedDate;
    }

    /**
     * Sets the value of the plannedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedDate(XMLGregorianCalendar value) {
        this.plannedDate = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryItemType.Quantity }
     *     
     */
    public InventoryItemType.Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemType.Quantity }
     *     
     */
    public void setQuantity(InventoryItemType.Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryItemType.ReasonCode }
     *     
     */
    public InventoryItemType.ReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemType.ReasonCode }
     *     
     */
    public void setReasonCode(InventoryItemType.ReasonCode value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the toLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationType }
     *     
     */
    public ItemLocationType getToLocation() {
        return toLocation;
    }

    /**
     * Sets the value of the toLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationType }
     *     
     */
    public void setToLocation(ItemLocationType value) {
        this.toLocation = value;
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
        if (null!= this.getItemLocation()) {
            List<Struct> structs = new ArrayList();
            for (ItemLocationType o: this.getItemLocation()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("ItemLocation", structs);
        }
        if (null!= this.getInventoryLocation()) {
            List<Struct> structs = new ArrayList();
            for (InventoryLocationType o: this.getInventoryLocation()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("InventoryLocation", structs);
        }
        if (null!= this.getFromLocation()) {
            struct.put("FromLocation", this.getFromLocation().toConnectStruct());
        } else {
            struct.put("FromLocation", null);
        }
        struct.put("PlannedDate", this.getPlannedDate());
        if (null!= this.getQuantity()) {
            struct.put("Quantity", this.getQuantity().toConnectStruct());
        } else {
            struct.put("Quantity", null);
        }
        if (null!= this.getReasonCode()) {
            struct.put("ReasonCode", this.getReasonCode().toConnectStruct());
        } else {
            struct.put("ReasonCode", null);
        }
        if (null!= this.getToLocation()) {
            struct.put("ToLocation", this.getToLocation().toConnectStruct());
        } else {
            struct.put("ToLocation", null);
        }
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ReasonCodeCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReasonCode
        extends ReasonCodeCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.ReasonCode");
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
