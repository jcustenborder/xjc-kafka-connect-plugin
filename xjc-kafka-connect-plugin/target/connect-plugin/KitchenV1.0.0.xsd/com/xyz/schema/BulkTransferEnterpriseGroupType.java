
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
 * The Bulk Transfer Object Group module
 * 
 * <p>Java class for BulkTransferEnterpriseGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkTransferEnterpriseGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.nrf-arts.org/IXRetail/namespace/}RequestIDCommonData" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData" minOccurs="0"/&gt;
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BulkTransfer" type="{http://www.nrf-arts.org/IXRetail/namespace/}BulkTransferObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="FileItems" type="{http://www.nrf-arts.org/IXRetail/namespace/}FileItemsObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="FileTransfer" type="{http://www.nrf-arts.org/IXRetail/namespace/}FileTransferObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="FileTransferNotification" type="{http://www.nrf-arts.org/IXRetail/namespace/}FileTransferNotificationObjectGroupType" minOccurs="0"/&gt;
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
@XmlType(name = "BulkTransferEnterpriseGroupType", propOrder = {
    "requestID",
    "response",
    "objectName",
    "bulkTransfer",
    "fileItems",
    "fileTransfer",
    "fileTransferNotification"
})
public class BulkTransferEnterpriseGroupType
    implements Connectable
{

    @XmlElement(name = "RequestID")
    protected RequestIDCommonData requestID;
    @XmlElement(name = "Response")
    protected ResponseCommonData response;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "BulkTransfer")
    protected BulkTransferObjectGroupType bulkTransfer;
    @XmlElement(name = "FileItems")
    protected FileItemsObjectGroupType fileItems;
    @XmlElement(name = "FileTransfer")
    protected FileTransferObjectGroupType fileTransfer;
    @XmlElement(name = "FileTransferNotification")
    protected FileTransferNotificationObjectGroupType fileTransferNotification;
    @XmlAttribute(name = "Action")
    protected String action;
    public final static Schema CONNECT_SCHEMA;

    static BulkTransferEnterpriseGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.BulkTransferEnterpriseGroupType");
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
        builder.field("BulkTransfer", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("FileItems", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("FileTransfer", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("FileTransferNotification", fieldBuilder.build());
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
     * Gets the value of the bulkTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link BulkTransferObjectGroupType }
     *     
     */
    public BulkTransferObjectGroupType getBulkTransfer() {
        return bulkTransfer;
    }

    /**
     * Sets the value of the bulkTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkTransferObjectGroupType }
     *     
     */
    public void setBulkTransfer(BulkTransferObjectGroupType value) {
        this.bulkTransfer = value;
    }

    /**
     * Gets the value of the fileItems property.
     * 
     * @return
     *     possible object is
     *     {@link FileItemsObjectGroupType }
     *     
     */
    public FileItemsObjectGroupType getFileItems() {
        return fileItems;
    }

    /**
     * Sets the value of the fileItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileItemsObjectGroupType }
     *     
     */
    public void setFileItems(FileItemsObjectGroupType value) {
        this.fileItems = value;
    }

    /**
     * Gets the value of the fileTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransferObjectGroupType }
     *     
     */
    public FileTransferObjectGroupType getFileTransfer() {
        return fileTransfer;
    }

    /**
     * Sets the value of the fileTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransferObjectGroupType }
     *     
     */
    public void setFileTransfer(FileTransferObjectGroupType value) {
        this.fileTransfer = value;
    }

    /**
     * Gets the value of the fileTransferNotification property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransferNotificationObjectGroupType }
     *     
     */
    public FileTransferNotificationObjectGroupType getFileTransferNotification() {
        return fileTransferNotification;
    }

    /**
     * Sets the value of the fileTransferNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransferNotificationObjectGroupType }
     *     
     */
    public void setFileTransferNotification(FileTransferNotificationObjectGroupType value) {
        this.fileTransferNotification = value;
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
        struct.put("bulkTransfer", this.bulkTransfer);
        struct.put("fileItems", this.fileItems);
        struct.put("fileTransfer", this.fileTransfer);
        struct.put("fileTransferNotification", this.fileTransferNotification);
        struct.put("action", this.action);
        return struct;
    }

}
