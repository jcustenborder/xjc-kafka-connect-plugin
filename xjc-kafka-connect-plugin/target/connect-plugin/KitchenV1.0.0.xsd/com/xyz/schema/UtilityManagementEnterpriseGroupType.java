
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
 * <p>Java class for UtilityManagementEnterpriseGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityManagementEnterpriseGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.nrf-arts.org/IXRetail/namespace/}RequestIDCommonData" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData" minOccurs="0"/&gt;
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Configuration" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityConfigurationObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityDataObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="UtilityAlarm" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityAlarmObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="UtilityLog" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityLogObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="UtilityNotification" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityNotificationObjectGroupType" minOccurs="0"/&gt;
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
@XmlType(name = "UtilityManagementEnterpriseGroupType", propOrder = {
    "requestID",
    "response",
    "objectName",
    "configuration",
    "data",
    "utilityAlarm",
    "utilityLog",
    "utilityNotification"
})
public class UtilityManagementEnterpriseGroupType
    implements Connectable
{

    @XmlElement(name = "RequestID")
    protected RequestIDCommonData requestID;
    @XmlElement(name = "Response")
    protected ResponseCommonData response;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "Configuration")
    protected UtilityConfigurationObjectGroupType configuration;
    @XmlElement(name = "Data")
    protected UtilityDataObjectGroupType data;
    @XmlElement(name = "UtilityAlarm")
    protected UtilityAlarmObjectGroupType utilityAlarm;
    @XmlElement(name = "UtilityLog")
    protected UtilityLogObjectGroupType utilityLog;
    @XmlElement(name = "UtilityNotification")
    protected UtilityNotificationObjectGroupType utilityNotification;
    @XmlAttribute(name = "Action")
    protected String action;
    public final static Schema CONNECT_SCHEMA;

    static UtilityManagementEnterpriseGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.UtilityManagementEnterpriseGroupType");
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
        builder.field("UtilityAlarm", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UtilityLog", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UtilityNotification", fieldBuilder.build());
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
     *     {@link UtilityConfigurationObjectGroupType }
     *     
     */
    public UtilityConfigurationObjectGroupType getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityConfigurationObjectGroupType }
     *     
     */
    public void setConfiguration(UtilityConfigurationObjectGroupType value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityDataObjectGroupType }
     *     
     */
    public UtilityDataObjectGroupType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityDataObjectGroupType }
     *     
     */
    public void setData(UtilityDataObjectGroupType value) {
        this.data = value;
    }

    /**
     * Gets the value of the utilityAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityAlarmObjectGroupType }
     *     
     */
    public UtilityAlarmObjectGroupType getUtilityAlarm() {
        return utilityAlarm;
    }

    /**
     * Sets the value of the utilityAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityAlarmObjectGroupType }
     *     
     */
    public void setUtilityAlarm(UtilityAlarmObjectGroupType value) {
        this.utilityAlarm = value;
    }

    /**
     * Gets the value of the utilityLog property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityLogObjectGroupType }
     *     
     */
    public UtilityLogObjectGroupType getUtilityLog() {
        return utilityLog;
    }

    /**
     * Sets the value of the utilityLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityLogObjectGroupType }
     *     
     */
    public void setUtilityLog(UtilityLogObjectGroupType value) {
        this.utilityLog = value;
    }

    /**
     * Gets the value of the utilityNotification property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityNotificationObjectGroupType }
     *     
     */
    public UtilityNotificationObjectGroupType getUtilityNotification() {
        return utilityNotification;
    }

    /**
     * Sets the value of the utilityNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityNotificationObjectGroupType }
     *     
     */
    public void setUtilityNotification(UtilityNotificationObjectGroupType value) {
        this.utilityNotification = value;
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
        struct.put("utilityAlarm", this.utilityAlarm);
        struct.put("utilityLog", this.utilityLog);
        struct.put("utilityNotification", this.utilityNotification);
        struct.put("action", this.action);
        return struct;
    }

}
