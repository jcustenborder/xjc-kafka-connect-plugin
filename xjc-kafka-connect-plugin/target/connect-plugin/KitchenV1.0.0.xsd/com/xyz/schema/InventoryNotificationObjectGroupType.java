
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for InventoryNotificationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryNotificationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InventoryMessage" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryMessageObjectGroupType"/&gt;
 *         &lt;element name="InventoryAcknowledgement" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryAcknowledgementObjectGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryNotificationObjectGroupType", propOrder = {
    "inventoryMessage",
    "inventoryAcknowledgement"
})
public class InventoryNotificationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "InventoryMessage", required = true)
    protected InventoryMessageObjectGroupType inventoryMessage;
    @XmlElement(name = "InventoryAcknowledgement")
    protected InventoryAcknowledgementObjectGroupType inventoryAcknowledgement;
    public final static Schema CONNECT_SCHEMA;

    static InventoryNotificationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryNotificationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("InventoryMessage", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("InventoryAcknowledgement", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the inventoryMessage property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryMessageObjectGroupType }
     *     
     */
    public InventoryMessageObjectGroupType getInventoryMessage() {
        return inventoryMessage;
    }

    /**
     * Sets the value of the inventoryMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryMessageObjectGroupType }
     *     
     */
    public void setInventoryMessage(InventoryMessageObjectGroupType value) {
        this.inventoryMessage = value;
    }

    /**
     * Gets the value of the inventoryAcknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryAcknowledgementObjectGroupType }
     *     
     */
    public InventoryAcknowledgementObjectGroupType getInventoryAcknowledgement() {
        return inventoryAcknowledgement;
    }

    /**
     * Sets the value of the inventoryAcknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryAcknowledgementObjectGroupType }
     *     
     */
    public void setInventoryAcknowledgement(InventoryAcknowledgementObjectGroupType value) {
        this.inventoryAcknowledgement = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("inventoryMessage", this.inventoryMessage);
        struct.put("inventoryAcknowledgement", this.inventoryAcknowledgement);
        return struct;
    }

}
