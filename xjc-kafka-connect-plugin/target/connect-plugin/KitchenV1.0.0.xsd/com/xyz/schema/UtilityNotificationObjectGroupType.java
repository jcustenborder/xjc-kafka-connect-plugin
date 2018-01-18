
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for UtilityNotificationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityNotificationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UtilityMessage" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityMessageObjectGroupType"/&gt;
 *         &lt;element name="UtilityAcknowledgement" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityAcknowledgeObjectGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityNotificationObjectGroupType", propOrder = {
    "utilityMessage",
    "utilityAcknowledgement"
})
public class UtilityNotificationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "UtilityMessage", required = true)
    protected UtilityMessageObjectGroupType utilityMessage;
    @XmlElement(name = "UtilityAcknowledgement")
    protected UtilityAcknowledgeObjectGroupType utilityAcknowledgement;
    public final static Schema CONNECT_SCHEMA;

    static UtilityNotificationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.UtilityNotificationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("UtilityMessage", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UtilityAcknowledgement", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the utilityMessage property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityMessageObjectGroupType }
     *     
     */
    public UtilityMessageObjectGroupType getUtilityMessage() {
        return utilityMessage;
    }

    /**
     * Sets the value of the utilityMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityMessageObjectGroupType }
     *     
     */
    public void setUtilityMessage(UtilityMessageObjectGroupType value) {
        this.utilityMessage = value;
    }

    /**
     * Gets the value of the utilityAcknowledgement property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityAcknowledgeObjectGroupType }
     *     
     */
    public UtilityAcknowledgeObjectGroupType getUtilityAcknowledgement() {
        return utilityAcknowledgement;
    }

    /**
     * Sets the value of the utilityAcknowledgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityAcknowledgeObjectGroupType }
     *     
     */
    public void setUtilityAcknowledgement(UtilityAcknowledgeObjectGroupType value) {
        this.utilityAcknowledgement = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("utilityMessage", this.utilityMessage);
        struct.put("utilityAcknowledgement", this.utilityAcknowledgement);
        return struct;
    }

}
