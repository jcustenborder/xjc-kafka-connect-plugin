
package com.xyz.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageID" type="{http://www.nrf-arts.org/IXRetail/namespace/}RequestIDCommonData"/&gt;
 *         &lt;element name="DateTime" type="{http://www.nrf-arts.org/IXRetail/namespace/}DateTimeCommonData" minOccurs="0"/&gt;
 *         &lt;element name="InventoryAction" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Response" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData" minOccurs="0"/&gt;
 *         &lt;element name="Requestor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MajorVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="2" /&gt;
 *       &lt;attribute name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="0" /&gt;
 *       &lt;attribute name="FixVersion" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="0" /&gt;
 *       &lt;attribute name="ActionCode" type="{http://www.nrf-arts.org/IXRetail/namespace/}ActionCommonDataTypeCodes" /&gt;
 *       &lt;attribute name="MessageType" type="{http://www.nrf-arts.org/IXRetail/namespace/}MessageTypeCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageID",
    "dateTime",
    "inventoryAction",
    "response",
    "requestor"
})
@XmlRootElement(name = "Inventory")
public class Inventory {

    @XmlElement(name = "MessageID", required = true)
    protected RequestIDCommonData messageID;
    @XmlElement(name = "DateTime")
    protected DateTimeCommonData dateTime;
    @XmlElement(name = "InventoryAction", required = true)
    protected List<InventoryType> inventoryAction;
    @XmlElement(name = "Response")
    protected ResponseCommonData response;
    @XmlElement(name = "Requestor")
    protected String requestor;
    @XmlAttribute(name = "MajorVersion", required = true)
    protected BigInteger majorVersion;
    @XmlAttribute(name = "MinorVersion")
    protected BigInteger minorVersion;
    @XmlAttribute(name = "FixVersion")
    protected BigInteger fixVersion;
    @XmlAttribute(name = "ActionCode")
    protected String actionCode;
    @XmlAttribute(name = "MessageType")
    protected String messageType;
    public final static Schema CONNECT_SCHEMA;

    static Inventory() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.Inventory");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = RequestIDCommonData.CONNECT_SCHEMA;
        builder.field("MessageID", fieldBuilder.build());
        fieldBuilder = DateTimeCommonData.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("DateTime", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryType.CONNECT_SCHEMA);
        builder.field("InventoryAction", fieldBuilder.build());
        fieldBuilder = ResponseCommonData.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Response", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Requestor", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("MajorVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        fieldBuilder.optional();
        builder.field("MinorVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        fieldBuilder.optional();
        builder.field("FixVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ActionCode", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MessageType", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link RequestIDCommonData }
     *     
     */
    public RequestIDCommonData getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestIDCommonData }
     *     
     */
    public void setMessageID(RequestIDCommonData value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeCommonData }
     *     
     */
    public DateTimeCommonData getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeCommonData }
     *     
     */
    public void setDateTime(DateTimeCommonData value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the inventoryAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryType }
     * 
     * 
     */
    public List<InventoryType> getInventoryAction() {
        if (inventoryAction == null) {
            inventoryAction = new ArrayList<InventoryType>();
        }
        return this.inventoryAction;
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
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestor(String value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMajorVersion() {
        if (majorVersion == null) {
            return new BigInteger("2");
        } else {
            return majorVersion;
        }
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMajorVersion(BigInteger value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinorVersion() {
        if (minorVersion == null) {
            return new BigInteger("0");
        } else {
            return minorVersion;
        }
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinorVersion(BigInteger value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the fixVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFixVersion() {
        if (fixVersion == null) {
            return new BigInteger("0");
        } else {
            return fixVersion;
        }
    }

    /**
     * Sets the value of the fixVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFixVersion(BigInteger value) {
        this.fixVersion = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getMessageID()) {
            struct.put("MessageID", this.getMessageID().toConnectStruct());
        } else {
            struct.put("MessageID", null);
        }
        if (null!= this.getDateTime()) {
            struct.put("DateTime", this.getDateTime().toConnectStruct());
        } else {
            struct.put("DateTime", null);
        }
        if (null!= this.getInventoryAction()) {
            List<Struct> structs = new ArrayList();
            for (InventoryType o: this.getInventoryAction()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("InventoryAction", structs);
        }
        if (null!= this.getResponse()) {
            struct.put("Response", this.getResponse().toConnectStruct());
        } else {
            struct.put("Response", null);
        }
        struct.put("Requestor", this.getRequestor());
        struct.put("MajorVersion", this.getMajorVersion());
        struct.put("MinorVersion", this.getMinorVersion());
        struct.put("FixVersion", this.getFixVersion());
        struct.put("ActionCode", this.getActionCode());
        struct.put("MessageType", this.getMessageType());
        return struct;
    }

}
