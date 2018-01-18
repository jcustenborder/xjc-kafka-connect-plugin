
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
 * <p>Java class for MonitorEnterpriseGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorEnterpriseGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.nrf-arts.org/IXRetail/namespace/}RequestIDCommonData" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData" minOccurs="0"/&gt;
 *         &lt;element name="ObjectName" type="{http://www.nrf-arts.org/IXRetail/namespace/}MonitorObjectName" minOccurs="0"/&gt;
 *         &lt;element name="Configuration" type="{http://www.nrf-arts.org/IXRetail/namespace/}MonitorConfigurationObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.nrf-arts.org/IXRetail/namespace/}MonitorDataObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="MonitorAlarm" type="{http://www.nrf-arts.org/IXRetail/namespace/}MonitorAlarmObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="MonitorLog" type="{http://www.nrf-arts.org/IXRetail/namespace/}MonitorLogObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="MonitorNotification" type="{http://www.nrf-arts.org/IXRetail/namespace/}MonitorNotificationObjectGroupType" minOccurs="0"/&gt;
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
@XmlType(name = "MonitorEnterpriseGroupType", propOrder = {
    "requestID",
    "response",
    "objectName",
    "configuration",
    "data",
    "monitorAlarm",
    "monitorLog",
    "monitorNotification"
})
public class MonitorEnterpriseGroupType
    implements Connectable
{

    @XmlElement(name = "RequestID")
    protected RequestIDCommonData requestID;
    @XmlElement(name = "Response")
    protected ResponseCommonData response;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "Configuration")
    protected MonitorConfigurationObjectGroupType configuration;
    @XmlElement(name = "Data")
    protected MonitorDataObjectGroupType data;
    @XmlElement(name = "MonitorAlarm")
    protected MonitorAlarmObjectGroupType monitorAlarm;
    @XmlElement(name = "MonitorLog")
    protected MonitorLogObjectGroupType monitorLog;
    @XmlElement(name = "MonitorNotification")
    protected MonitorNotificationObjectGroupType monitorNotification;
    @XmlAttribute(name = "Action")
    protected String action;
    public final static Schema CONNECT_SCHEMA;

    static MonitorEnterpriseGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MonitorEnterpriseGroupType");
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
        builder.field("Configuration", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Data", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MonitorAlarm", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MonitorLog", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MonitorNotification", fieldBuilder.build());
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
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorConfigurationObjectGroupType }
     *     
     */
    public MonitorConfigurationObjectGroupType getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorConfigurationObjectGroupType }
     *     
     */
    public void setConfiguration(MonitorConfigurationObjectGroupType value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorDataObjectGroupType }
     *     
     */
    public MonitorDataObjectGroupType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorDataObjectGroupType }
     *     
     */
    public void setData(MonitorDataObjectGroupType value) {
        this.data = value;
    }

    /**
     * Gets the value of the monitorAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorAlarmObjectGroupType }
     *     
     */
    public MonitorAlarmObjectGroupType getMonitorAlarm() {
        return monitorAlarm;
    }

    /**
     * Sets the value of the monitorAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorAlarmObjectGroupType }
     *     
     */
    public void setMonitorAlarm(MonitorAlarmObjectGroupType value) {
        this.monitorAlarm = value;
    }

    /**
     * Gets the value of the monitorLog property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorLogObjectGroupType }
     *     
     */
    public MonitorLogObjectGroupType getMonitorLog() {
        return monitorLog;
    }

    /**
     * Sets the value of the monitorLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorLogObjectGroupType }
     *     
     */
    public void setMonitorLog(MonitorLogObjectGroupType value) {
        this.monitorLog = value;
    }

    /**
     * Gets the value of the monitorNotification property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorNotificationObjectGroupType }
     *     
     */
    public MonitorNotificationObjectGroupType getMonitorNotification() {
        return monitorNotification;
    }

    /**
     * Sets the value of the monitorNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorNotificationObjectGroupType }
     *     
     */
    public void setMonitorNotification(MonitorNotificationObjectGroupType value) {
        this.monitorNotification = value;
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
        struct.put("configuration", this.configuration);
        struct.put("data", this.data);
        struct.put("monitorAlarm", this.monitorAlarm);
        struct.put("monitorLog", this.monitorLog);
        struct.put("monitorNotification", this.monitorNotification);
        struct.put("action", this.action);
        return struct;
    }

}
