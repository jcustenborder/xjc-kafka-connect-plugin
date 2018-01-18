
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for MaintenanceEnterpriseGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceEnterpriseGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.nrf-arts.org/IXRetail/namespace/}RequestIDCommonData" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData" minOccurs="0"/&gt;
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessItem" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceProcessItemObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledItem" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceScheduledItemObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="UnscheduledItem" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceUnscheduledItemObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceLog" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceLogObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceNotification" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceNotificationObjectGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Action" type="{http://www.nrf-arts.org/IXRetail/namespace/}ActionCommonDataTypeCodes" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceEnterpriseGroup", propOrder = {
    "requestID",
    "response",
    "objectName",
    "processItem",
    "scheduledItem",
    "unscheduledItem",
    "maintenanceLog",
    "maintenanceNotification"
})
public class MaintenanceEnterpriseGroup
    implements Connectable
{

    @XmlElement(name = "RequestID")
    protected RequestIDCommonData requestID;
    @XmlElement(name = "Response")
    protected ResponseCommonData response;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "ProcessItem")
    protected MaintenanceProcessItemObjectGroupType processItem;
    @XmlElement(name = "ScheduledItem")
    protected MaintenanceScheduledItemObjectGroupType scheduledItem;
    @XmlElement(name = "UnscheduledItem")
    protected MaintenanceUnscheduledItemObjectGroupType unscheduledItem;
    @XmlElement(name = "MaintenanceLog")
    protected MaintenanceLogObjectGroupType maintenanceLog;
    @XmlElement(name = "MaintenanceNotification")
    protected MaintenanceNotificationObjectGroupType maintenanceNotification;
    @XmlAttribute(name = "Action")
    protected String action;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceEnterpriseGroup() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceEnterpriseGroup");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("RequestID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Response", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ObjectName", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ProcessItem", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ScheduledItem", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UnscheduledItem", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MaintenanceLog", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MaintenanceNotification", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Action", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link RequestIDCommonData }
     *     
     */
    public RequestIDCommonData getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestIDCommonData }
     *     
     */
    public void setRequestID(RequestIDCommonData value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCommonData }
     *     
     */
    public ResponseCommonData getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCommonData }
     *     
     */
    public void setResponse(ResponseCommonData value) {
        this.response = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the processItem property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceProcessItemObjectGroupType }
     *     
     */
    public MaintenanceProcessItemObjectGroupType getProcessItem() {
        return processItem;
    }

    /**
     * Sets the value of the processItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceProcessItemObjectGroupType }
     *     
     */
    public void setProcessItem(MaintenanceProcessItemObjectGroupType value) {
        this.processItem = value;
    }

    /**
     * Gets the value of the scheduledItem property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceScheduledItemObjectGroupType }
     *     
     */
    public MaintenanceScheduledItemObjectGroupType getScheduledItem() {
        return scheduledItem;
    }

    /**
     * Sets the value of the scheduledItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceScheduledItemObjectGroupType }
     *     
     */
    public void setScheduledItem(MaintenanceScheduledItemObjectGroupType value) {
        this.scheduledItem = value;
    }

    /**
     * Gets the value of the unscheduledItem property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceUnscheduledItemObjectGroupType }
     *     
     */
    public MaintenanceUnscheduledItemObjectGroupType getUnscheduledItem() {
        return unscheduledItem;
    }

    /**
     * Sets the value of the unscheduledItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceUnscheduledItemObjectGroupType }
     *     
     */
    public void setUnscheduledItem(MaintenanceUnscheduledItemObjectGroupType value) {
        this.unscheduledItem = value;
    }

    /**
     * Gets the value of the maintenanceLog property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceLogObjectGroupType }
     *     
     */
    public MaintenanceLogObjectGroupType getMaintenanceLog() {
        return maintenanceLog;
    }

    /**
     * Sets the value of the maintenanceLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceLogObjectGroupType }
     *     
     */
    public void setMaintenanceLog(MaintenanceLogObjectGroupType value) {
        this.maintenanceLog = value;
    }

    /**
     * Gets the value of the maintenanceNotification property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceNotificationObjectGroupType }
     *     
     */
    public MaintenanceNotificationObjectGroupType getMaintenanceNotification() {
        return maintenanceNotification;
    }

    /**
     * Sets the value of the maintenanceNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceNotificationObjectGroupType }
     *     
     */
    public void setMaintenanceNotification(MaintenanceNotificationObjectGroupType value) {
        this.maintenanceNotification = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("requestID", this.requestID);
        struct.put("response", this.response);
        struct.put("objectName", this.objectName);
        struct.put("processItem", this.processItem);
        struct.put("scheduledItem", this.scheduledItem);
        struct.put("unscheduledItem", this.unscheduledItem);
        struct.put("maintenanceLog", this.maintenanceLog);
        struct.put("maintenanceNotification", this.maintenanceNotification);
        struct.put("action", this.action);
        return struct;
    }

}
