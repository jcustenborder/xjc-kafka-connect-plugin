
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for MaintenanceNotificationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceNotificationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaintenanceMessage" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceMessageObjectGroupType"/&gt;
 *         &lt;element name="MaintenanceAcknowledge" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceAcknowledgeObjectGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceNotificationObjectGroupType", propOrder = {
    "maintenanceMessage",
    "maintenanceAcknowledge"
})
public class MaintenanceNotificationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "MaintenanceMessage", required = true)
    protected MaintenanceMessageObjectGroupType maintenanceMessage;
    @XmlElement(name = "MaintenanceAcknowledge")
    protected MaintenanceAcknowledgeObjectGroupType maintenanceAcknowledge;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceNotificationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceNotificationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("MaintenanceMessage", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MaintenanceAcknowledge", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the maintenanceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceMessageObjectGroupType }
     *     
     */
    public MaintenanceMessageObjectGroupType getMaintenanceMessage() {
        return maintenanceMessage;
    }

    /**
     * Sets the value of the maintenanceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceMessageObjectGroupType }
     *     
     */
    public void setMaintenanceMessage(MaintenanceMessageObjectGroupType value) {
        this.maintenanceMessage = value;
    }

    /**
     * Gets the value of the maintenanceAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceAcknowledgeObjectGroupType }
     *     
     */
    public MaintenanceAcknowledgeObjectGroupType getMaintenanceAcknowledge() {
        return maintenanceAcknowledge;
    }

    /**
     * Sets the value of the maintenanceAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceAcknowledgeObjectGroupType }
     *     
     */
    public void setMaintenanceAcknowledge(MaintenanceAcknowledgeObjectGroupType value) {
        this.maintenanceAcknowledge = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("maintenanceMessage", this.maintenanceMessage);
        struct.put("maintenanceAcknowledge", this.maintenanceAcknowledge);
        return struct;
    }

}
