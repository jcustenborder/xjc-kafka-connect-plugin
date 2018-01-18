
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for FileTransferNotificationObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileTransferNotificationObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BulkTransferMessage" type="{http://www.nrf-arts.org/IXRetail/namespace/}BulkTransferMessagesObjectGroupType"/&gt;
 *         &lt;element name="BulkTransferAcknowledge" type="{http://www.nrf-arts.org/IXRetail/namespace/}BulkTransferAcknowledgementObjectGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTransferNotificationObjectGroupType", propOrder = {
    "bulkTransferMessage",
    "bulkTransferAcknowledge"
})
public class FileTransferNotificationObjectGroupType
    implements Connectable
{

    @XmlElement(name = "BulkTransferMessage", required = true)
    protected BulkTransferMessagesObjectGroupType bulkTransferMessage;
    @XmlElement(name = "BulkTransferAcknowledge")
    protected BulkTransferAcknowledgementObjectGroupType bulkTransferAcknowledge;
    public final static Schema CONNECT_SCHEMA;

    static FileTransferNotificationObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.FileTransferNotificationObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("BulkTransferMessage", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("BulkTransferAcknowledge", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the bulkTransferMessage property.
     * 
     * @return
     *     possible object is
     *     {@link BulkTransferMessagesObjectGroupType }
     *     
     */
    public BulkTransferMessagesObjectGroupType getBulkTransferMessage() {
        return bulkTransferMessage;
    }

    /**
     * Sets the value of the bulkTransferMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkTransferMessagesObjectGroupType }
     *     
     */
    public void setBulkTransferMessage(BulkTransferMessagesObjectGroupType value) {
        this.bulkTransferMessage = value;
    }

    /**
     * Gets the value of the bulkTransferAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link BulkTransferAcknowledgementObjectGroupType }
     *     
     */
    public BulkTransferAcknowledgementObjectGroupType getBulkTransferAcknowledge() {
        return bulkTransferAcknowledge;
    }

    /**
     * Sets the value of the bulkTransferAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkTransferAcknowledgementObjectGroupType }
     *     
     */
    public void setBulkTransferAcknowledge(BulkTransferAcknowledgementObjectGroupType value) {
        this.bulkTransferAcknowledge = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("bulkTransferMessage", this.bulkTransferMessage);
        struct.put("bulkTransferAcknowledge", this.bulkTransferAcknowledge);
        return struct;
    }

}
