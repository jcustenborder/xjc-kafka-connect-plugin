
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for SecurityNotificationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityNotificationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SecurityMessage" type="{http://www.nrf-arts.org/IXRetail/namespace/}SecurityMessageObjectGroupType"/&gt;
 *         &lt;element name="SecurityAcknowledge" type="{http://www.nrf-arts.org/IXRetail/namespace/}SecurityAcknowledgeObjectGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityNotificationObjectGroupType", propOrder = {
    "securityMessage",
    "securityAcknowledge"
})
public class SecurityNotificationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "SecurityMessage", required = true)
    protected SecurityMessageObjectGroupType securityMessage;
    @XmlElement(name = "SecurityAcknowledge")
    protected SecurityAcknowledgeObjectGroupType securityAcknowledge;
    public final static Schema CONNECT_SCHEMA;

    static SecurityNotificationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.SecurityNotificationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("SecurityMessage", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("SecurityAcknowledge", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the securityMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityMessageObjectGroupType }
     *     
     */
    public SecurityMessageObjectGroupType getSecurityMessage() {
        return securityMessage;
    }

    /**
     * Sets the value of the securityMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityMessageObjectGroupType }
     *     
     */
    public void setSecurityMessage(SecurityMessageObjectGroupType value) {
        this.securityMessage = value;
    }

    /**
     * Gets the value of the securityAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAcknowledgeObjectGroupType }
     *     
     */
    public SecurityAcknowledgeObjectGroupType getSecurityAcknowledge() {
        return securityAcknowledge;
    }

    /**
     * Sets the value of the securityAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAcknowledgeObjectGroupType }
     *     
     */
    public void setSecurityAcknowledge(SecurityAcknowledgeObjectGroupType value) {
        this.securityAcknowledge = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("securityMessage", this.securityMessage);
        struct.put("securityAcknowledge", this.securityAcknowledge);
        return struct;
    }

}
