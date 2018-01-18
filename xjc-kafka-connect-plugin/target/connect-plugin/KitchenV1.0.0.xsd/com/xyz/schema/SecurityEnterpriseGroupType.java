
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
 * <p>Java class for SecurityEnterpriseGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEnterpriseGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.nrf-arts.org/IXRetail/namespace/}RequestIDCommonData" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData" minOccurs="0"/&gt;
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecuritySystem" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityUser" type="{http://www.nrf-arts.org/IXRetail/namespace/}SecurityUserObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityAccess" type="{http://www.nrf-arts.org/IXRetail/namespace/}SecurityAccessObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityMonitoringParameters" type="{http://www.nrf-arts.org/IXRetail/namespace/}SecurityMonitoringObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityProtectionParameters" type="{http://www.nrf-arts.org/IXRetail/namespace/}SecurityProtectionParametersObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityNotification" type="{http://www.nrf-arts.org/IXRetail/namespace/}SecurityNotificationObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="SecurityLog" type="{http://www.nrf-arts.org/IXRetail/namespace/}SecurityLogObjectGroupType" minOccurs="0"/&gt;
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
@XmlType(name = "SecurityEnterpriseGroupType", propOrder = {
    "requestID",
    "response",
    "objectName",
    "securitySystem",
    "securityUser",
    "securityAccess",
    "securityMonitoringParameters",
    "securityProtectionParameters",
    "securityNotification",
    "securityLog"
})
public class SecurityEnterpriseGroupType
    implements Connectable
{

    @XmlElement(name = "RequestID")
    protected RequestIDCommonData requestID;
    @XmlElement(name = "Response")
    protected ResponseCommonData response;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "SecuritySystem")
    protected Object securitySystem;
    @XmlElement(name = "SecurityUser")
    protected SecurityUserObjectGroupType securityUser;
    @XmlElement(name = "SecurityAccess")
    protected SecurityAccessObjectGroupType securityAccess;
    @XmlElement(name = "SecurityMonitoringParameters")
    protected SecurityMonitoringObjectGroupType securityMonitoringParameters;
    @XmlElement(name = "SecurityProtectionParameters")
    protected SecurityProtectionParametersObjectGroupType securityProtectionParameters;
    @XmlElement(name = "SecurityNotification")
    protected SecurityNotificationObjectGroupType securityNotification;
    @XmlElement(name = "SecurityLog")
    protected SecurityLogObjectGroupType securityLog;
    @XmlAttribute(name = "Action")
    protected String action;
    public final static Schema CONNECT_SCHEMA;

    static SecurityEnterpriseGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.SecurityEnterpriseGroupType");
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
        builder.field("SecuritySystem", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("SecurityUser", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("SecurityAccess", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("SecurityMonitoringParameters", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("SecurityProtectionParameters", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("SecurityNotification", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("SecurityLog", fieldBuilder.build());
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
     * Gets the value of the securitySystem property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSecuritySystem() {
        return securitySystem;
    }

    /**
     * Sets the value of the securitySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSecuritySystem(Object value) {
        this.securitySystem = value;
    }

    /**
     * Gets the value of the securityUser property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityUserObjectGroupType }
     *     
     */
    public SecurityUserObjectGroupType getSecurityUser() {
        return securityUser;
    }

    /**
     * Sets the value of the securityUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityUserObjectGroupType }
     *     
     */
    public void setSecurityUser(SecurityUserObjectGroupType value) {
        this.securityUser = value;
    }

    /**
     * Gets the value of the securityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAccessObjectGroupType }
     *     
     */
    public SecurityAccessObjectGroupType getSecurityAccess() {
        return securityAccess;
    }

    /**
     * Sets the value of the securityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAccessObjectGroupType }
     *     
     */
    public void setSecurityAccess(SecurityAccessObjectGroupType value) {
        this.securityAccess = value;
    }

    /**
     * Gets the value of the securityMonitoringParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityMonitoringObjectGroupType }
     *     
     */
    public SecurityMonitoringObjectGroupType getSecurityMonitoringParameters() {
        return securityMonitoringParameters;
    }

    /**
     * Sets the value of the securityMonitoringParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityMonitoringObjectGroupType }
     *     
     */
    public void setSecurityMonitoringParameters(SecurityMonitoringObjectGroupType value) {
        this.securityMonitoringParameters = value;
    }

    /**
     * Gets the value of the securityProtectionParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityProtectionParametersObjectGroupType }
     *     
     */
    public SecurityProtectionParametersObjectGroupType getSecurityProtectionParameters() {
        return securityProtectionParameters;
    }

    /**
     * Sets the value of the securityProtectionParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityProtectionParametersObjectGroupType }
     *     
     */
    public void setSecurityProtectionParameters(SecurityProtectionParametersObjectGroupType value) {
        this.securityProtectionParameters = value;
    }

    /**
     * Gets the value of the securityNotification property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityNotificationObjectGroupType }
     *     
     */
    public SecurityNotificationObjectGroupType getSecurityNotification() {
        return securityNotification;
    }

    /**
     * Sets the value of the securityNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityNotificationObjectGroupType }
     *     
     */
    public void setSecurityNotification(SecurityNotificationObjectGroupType value) {
        this.securityNotification = value;
    }

    /**
     * Gets the value of the securityLog property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityLogObjectGroupType }
     *     
     */
    public SecurityLogObjectGroupType getSecurityLog() {
        return securityLog;
    }

    /**
     * Sets the value of the securityLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityLogObjectGroupType }
     *     
     */
    public void setSecurityLog(SecurityLogObjectGroupType value) {
        this.securityLog = value;
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
        struct.put("securitySystem", this.securitySystem);
        struct.put("securityUser", this.securityUser);
        struct.put("securityAccess", this.securityAccess);
        struct.put("securityMonitoringParameters", this.securityMonitoringParameters);
        struct.put("securityProtectionParameters", this.securityProtectionParameters);
        struct.put("securityNotification", this.securityNotification);
        struct.put("securityLog", this.securityLog);
        struct.put("action", this.action);
        return struct;
    }

}
