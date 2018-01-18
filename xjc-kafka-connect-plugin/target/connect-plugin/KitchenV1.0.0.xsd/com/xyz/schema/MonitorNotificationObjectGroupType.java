
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for MonitorNotificationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorNotificationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MonitorMessage" type="{http://www.nrf-arts.org/IXRetail/namespace/}MonitorMessageObjectGroupType"/&gt;
 *         &lt;element name="MonitorAcknowledge" type="{http://www.nrf-arts.org/IXRetail/namespace/}MonitorAcknowledgeObjectGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorNotificationObjectGroupType", propOrder = {
    "monitorMessage",
    "monitorAcknowledge"
})
public class MonitorNotificationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "MonitorMessage", required = true)
    protected MonitorMessageObjectGroupType monitorMessage;
    @XmlElement(name = "MonitorAcknowledge")
    protected MonitorAcknowledgeObjectGroupType monitorAcknowledge;
    public final static Schema CONNECT_SCHEMA;

    static MonitorNotificationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MonitorNotificationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("MonitorMessage", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MonitorAcknowledge", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the monitorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorMessageObjectGroupType }
     *     
     */
    public MonitorMessageObjectGroupType getMonitorMessage() {
        return monitorMessage;
    }

    /**
     * Sets the value of the monitorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorMessageObjectGroupType }
     *     
     */
    public void setMonitorMessage(MonitorMessageObjectGroupType value) {
        this.monitorMessage = value;
    }

    /**
     * Gets the value of the monitorAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorAcknowledgeObjectGroupType }
     *     
     */
    public MonitorAcknowledgeObjectGroupType getMonitorAcknowledge() {
        return monitorAcknowledge;
    }

    /**
     * Sets the value of the monitorAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorAcknowledgeObjectGroupType }
     *     
     */
    public void setMonitorAcknowledge(MonitorAcknowledgeObjectGroupType value) {
        this.monitorAcknowledge = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("monitorMessage", this.monitorMessage);
        struct.put("monitorAcknowledge", this.monitorAcknowledge);
        return struct;
    }

}
