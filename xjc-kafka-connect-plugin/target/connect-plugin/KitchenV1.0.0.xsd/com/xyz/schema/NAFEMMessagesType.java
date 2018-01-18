
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Timestamp;


/**
 * Textual messages and a code
 * 
 * <p>Java class for NAFEMMessagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAFEMMessagesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="Message" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDateTime"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Enable" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAFEMMessagesType", propOrder = {
    "index",
    "message",
    "code",
    "timestamp"
})
@XmlSeeAlso({
    AdministrationMessagesType.class,
    BulkTransferMessagesObjectGroupType.class,
    InventoryMessageObjectGroupType.class,
    MaintenanceMessageObjectGroupType.class,
    MonitorMessageObjectGroupType.class,
    SecurityMessageObjectGroupType.class,
    UtilityMessageObjectGroupType.class
})
public class NAFEMMessagesType
    implements Connectable
{

    @XmlElement(name = "Index", required = true)
    protected Object index;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "Code")
    protected int code;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "Enable", required = true)
    protected boolean enable;
    public final static Schema CONNECT_SCHEMA;

    static NAFEMMessagesType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.NAFEMMessagesType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Message", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Code", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        builder.field("Timestamp", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Enable", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIndex(Object value) {
        this.index = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the enable property.
     * 
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("message", this.message);
        struct.put("code", this.code);
        struct.put("timestamp", this.timestamp);
        struct.put("enable", this.enable);
        return struct;
    }

}
