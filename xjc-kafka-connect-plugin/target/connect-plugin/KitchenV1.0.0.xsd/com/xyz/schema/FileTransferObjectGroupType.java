
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for FileTransferObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileTransferObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntryIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Command" type="{http://www.nrf-arts.org/IXRetail/namespace/}TransferCommandTypeCode"/&gt;
 *         &lt;element name="Source" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString64"/&gt;
 *         &lt;element name="Destination" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString64"/&gt;
 *         &lt;element name="CRCType" type="{http://www.nrf-arts.org/IXRetail/namespace/}CRCTypeCode"/&gt;
 *         &lt;element name="ServerIP" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="EraseStatus" type="{http://www.nrf-arts.org/IXRetail/namespace/}EraseStatusTypeCode"/&gt;
 *         &lt;element name="CopyStatus" type="{http://www.nrf-arts.org/IXRetail/namespace/}CopyStatusTypeCode"/&gt;
 *         &lt;element name="BulkTransfer" type="{http://www.nrf-arts.org/IXRetail/namespace/}BulkTransferObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="FileItems" type="{http://www.nrf-arts.org/IXRetail/namespace/}FileItemsObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="FileTransferNotification" type="{http://www.nrf-arts.org/IXRetail/namespace/}FileTransferNotificationObjectGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DeviceEnable" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="EraseRequired" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="Execute" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTransferObjectGroupType", propOrder = {
    "entryIndex",
    "command",
    "source",
    "destination",
    "crcType",
    "serverIP",
    "eraseStatus",
    "copyStatus",
    "bulkTransfer",
    "fileItems",
    "fileTransferNotification"
})
public class FileTransferObjectGroupType
    implements Connectable
{

    @XmlElement(name = "EntryIndex")
    protected int entryIndex;
    @XmlElement(name = "Command", required = true)
    protected String command;
    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "CRCType", required = true)
    protected String crcType;
    @XmlElement(name = "ServerIP", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String serverIP;
    @XmlElement(name = "EraseStatus", required = true)
    protected String eraseStatus;
    @XmlElement(name = "CopyStatus", required = true)
    protected String copyStatus;
    @XmlElement(name = "BulkTransfer")
    protected BulkTransferObjectGroupType bulkTransfer;
    @XmlElement(name = "FileItems")
    protected FileItemsObjectGroupType fileItems;
    @XmlElement(name = "FileTransferNotification")
    protected FileTransferNotificationObjectGroupType fileTransferNotification;
    @XmlAttribute(name = "DeviceEnable", required = true)
    protected boolean deviceEnable;
    @XmlAttribute(name = "EraseRequired", required = true)
    protected boolean eraseRequired;
    @XmlAttribute(name = "Execute")
    protected Boolean execute;
    public final static Schema CONNECT_SCHEMA;

    static FileTransferObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.FileTransferObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("EntryIndex", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Command", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Source", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Destination", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("CRCType", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ServerIP", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("EraseStatus", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("CopyStatus", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("BulkTransfer", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("FileItems", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("FileTransferNotification", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("DeviceEnable", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("EraseRequired", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Execute", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the entryIndex property.
     * 
     */
    public int getEntryIndex() {
        return entryIndex;
    }

    /**
     * Sets the value of the entryIndex property.
     * 
     */
    public void setEntryIndex(int value) {
        this.entryIndex = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the crcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRCType() {
        return crcType;
    }

    /**
     * Sets the value of the crcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRCType(String value) {
        this.crcType = value;
    }

    /**
     * Gets the value of the serverIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerIP() {
        return serverIP;
    }

    /**
     * Sets the value of the serverIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerIP(String value) {
        this.serverIP = value;
    }

    /**
     * Gets the value of the eraseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEraseStatus() {
        return eraseStatus;
    }

    /**
     * Sets the value of the eraseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEraseStatus(String value) {
        this.eraseStatus = value;
    }

    /**
     * Gets the value of the copyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyStatus() {
        return copyStatus;
    }

    /**
     * Sets the value of the copyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyStatus(String value) {
        this.copyStatus = value;
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
     * Gets the value of the deviceEnable property.
     * 
     */
    public boolean isDeviceEnable() {
        return deviceEnable;
    }

    /**
     * Sets the value of the deviceEnable property.
     * 
     */
    public void setDeviceEnable(boolean value) {
        this.deviceEnable = value;
    }

    /**
     * Gets the value of the eraseRequired property.
     * 
     */
    public boolean isEraseRequired() {
        return eraseRequired;
    }

    /**
     * Sets the value of the eraseRequired property.
     * 
     */
    public void setEraseRequired(boolean value) {
        this.eraseRequired = value;
    }

    /**
     * Gets the value of the execute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExecute() {
        return execute;
    }

    /**
     * Sets the value of the execute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExecute(Boolean value) {
        this.execute = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("entryIndex", this.entryIndex);
        struct.put("command", this.command);
        struct.put("source", this.source);
        struct.put("destination", this.destination);
        struct.put("crcType", this.crcType);
        struct.put("serverIP", this.serverIP);
        struct.put("eraseStatus", this.eraseStatus);
        struct.put("copyStatus", this.copyStatus);
        struct.put("bulkTransfer", this.bulkTransfer);
        struct.put("fileItems", this.fileItems);
        struct.put("fileTransferNotification", this.fileTransferNotification);
        struct.put("deviceEnable", this.deviceEnable);
        struct.put("eraseRequired", this.eraseRequired);
        struct.put("execute", this.execute);
        return struct;
    }

}
