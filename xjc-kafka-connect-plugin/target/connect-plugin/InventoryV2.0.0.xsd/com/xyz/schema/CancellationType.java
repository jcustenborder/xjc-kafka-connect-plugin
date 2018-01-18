
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for CancellationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTime" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;DateTimeCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReasonCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ReasonCodeCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ItemIDCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "CancellationType", propOrder = {
    "dateTime",
    "reasonCode",
    "itemID",
    "quantity"
})
public class CancellationType {

    @XmlElement(name = "DateTime")
    protected CancellationType.DateTime dateTime;
    @XmlElement(name = "ReasonCode", required = true)
    protected CancellationType.ReasonCode reasonCode;
    @XmlElement(name = "ItemID")
    protected CancellationType.ItemID itemID;
    @XmlElement(name = "Quantity")
    protected CancellationType.Quantity quantity;
    public final static Schema CONNECT_SCHEMA;

    static CancellationType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.CancellationType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = CancellationType.DateTime.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("DateTime", fieldBuilder.build());
        fieldBuilder = CancellationType.ReasonCode.CONNECT_SCHEMA;
        builder.field("ReasonCode", fieldBuilder.build());
        fieldBuilder = CancellationType.ItemID.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ItemID", fieldBuilder.build());
        fieldBuilder = CancellationType.Quantity.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Quantity", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationType.DateTime }
     *     
     */
    public CancellationType.DateTime getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationType.DateTime }
     *     
     */
    public void setDateTime(CancellationType.DateTime value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationType.ReasonCode }
     *     
     */
    public CancellationType.ReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationType.ReasonCode }
     *     
     */
    public void setReasonCode(CancellationType.ReasonCode value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationType.ItemID }
     *     
     */
    public CancellationType.ItemID getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationType.ItemID }
     *     
     */
    public void setItemID(CancellationType.ItemID value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationType.Quantity }
     *     
     */
    public CancellationType.Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationType.Quantity }
     *     
     */
    public void setQuantity(CancellationType.Quantity value) {
        this.quantity = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getDateTime()) {
            struct.put("DateTime", this.getDateTime().toConnectStruct());
        } else {
            struct.put("DateTime", null);
        }
        if (null!= this.getReasonCode()) {
            struct.put("ReasonCode", this.getReasonCode().toConnectStruct());
        } else {
            struct.put("ReasonCode", null);
        }
        if (null!= this.getItemID()) {
            struct.put("ItemID", this.getItemID().toConnectStruct());
        } else {
            struct.put("ItemID", null);
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

        static DateTime() {
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

        static ReasonCode() {
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
