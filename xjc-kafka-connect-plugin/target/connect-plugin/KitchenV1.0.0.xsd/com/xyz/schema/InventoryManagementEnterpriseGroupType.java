
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
 * <p>Java class for InventoryManagementEnterpriseGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryManagementEnterpriseGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.nrf-arts.org/IXRetail/namespace/}RequestIDCommonData" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData" minOccurs="0"/&gt;
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Configuration" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryConfigurationObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryDataObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Storage" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryStorageObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Log" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryLogObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Notification" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryNotificationObjectGroupType" minOccurs="0"/&gt;
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
@XmlType(name = "InventoryManagementEnterpriseGroupType", propOrder = {
    "requestID",
    "response",
    "objectName",
    "configuration",
    "data",
    "storage",
    "log",
    "notification"
})
public class InventoryManagementEnterpriseGroupType
    implements Connectable
{

    @XmlElement(name = "RequestID")
    protected RequestIDCommonData requestID;
    @XmlElement(name = "Response")
    protected ResponseCommonData response;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "Configuration")
    protected InventoryConfigurationObjectGroupType configuration;
    @XmlElement(name = "Data")
    protected InventoryDataObjectGroupType data;
    @XmlElement(name = "Storage")
    protected InventoryStorageObjectGroupType storage;
    @XmlElement(name = "Log")
    protected InventoryLogObjectGroupType log;
    @XmlElement(name = "Notification")
    protected InventoryNotificationObjectGroupType notification;
    @XmlAttribute(name = "Action")
    protected String action;
    public final static Schema CONNECT_SCHEMA;

    static InventoryManagementEnterpriseGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryManagementEnterpriseGroupType");
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
        builder.field("Storage", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Log", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Notification", fieldBuilder.build());
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
     *     {@link InventoryConfigurationObjectGroupType }
     *     
     */
    public InventoryConfigurationObjectGroupType getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryConfigurationObjectGroupType }
     *     
     */
    public void setConfiguration(InventoryConfigurationObjectGroupType value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDataObjectGroupType }
     *     
     */
    public InventoryDataObjectGroupType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDataObjectGroupType }
     *     
     */
    public void setData(InventoryDataObjectGroupType value) {
        this.data = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryStorageObjectGroupType }
     *     
     */
    public InventoryStorageObjectGroupType getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryStorageObjectGroupType }
     *     
     */
    public void setStorage(InventoryStorageObjectGroupType value) {
        this.storage = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLogObjectGroupType }
     *     
     */
    public InventoryLogObjectGroupType getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLogObjectGroupType }
     *     
     */
    public void setLog(InventoryLogObjectGroupType value) {
        this.log = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryNotificationObjectGroupType }
     *     
     */
    public InventoryNotificationObjectGroupType getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNotificationObjectGroupType }
     *     
     */
    public void setNotification(InventoryNotificationObjectGroupType value) {
        this.notification = value;
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
        struct.put("storage", this.storage);
        struct.put("log", this.log);
        struct.put("notification", this.notification);
        struct.put("action", this.action);
        return struct;
    }

}
