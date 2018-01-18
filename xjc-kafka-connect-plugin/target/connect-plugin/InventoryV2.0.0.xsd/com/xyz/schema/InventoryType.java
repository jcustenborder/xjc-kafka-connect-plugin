
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.w3c.dom.Element;


/**
 * <p>Java class for InventoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;RequestIDCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Response" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cancellation" type="{http://www.nrf-arts.org/IXRetail/namespace/}CancellationType" minOccurs="0"/&gt;
 *         &lt;element name="Completion" type="{http://www.nrf-arts.org/IXRetail/namespace/}ItemLocationType" minOccurs="0"/&gt;
 *         &lt;element name="CycleCount" type="{http://www.nrf-arts.org/IXRetail/namespace/}CycleCountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CycleCountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;DateTimeCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedData" type="{http://www.nrf-arts.org/IXRetail/namespace/}ExpectedDataType" minOccurs="0"/&gt;
 *         &lt;element name="FromLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}ItemLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fulfillment" type="{http://www.nrf-arts.org/IXRetail/namespace/}FulfillmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryAdjustment" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryAdjustmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryItem" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryPosition" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryPositionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemID" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ItemIDCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}ItemLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Operator" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;OperatorCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Quantity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;QuantityCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="QuantityDispatched" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;QuantityCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reservation" type="{http://www.nrf-arts.org/IXRetail/namespace/}ReservationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Scope" type="{http://www.nrf-arts.org/IXRetail/namespace/}ScopeType" minOccurs="0"/&gt;
 *         &lt;element name="ToLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}ItemLocationType" minOccurs="0"/&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionNumber" type="{http://www.nrf-arts.org/IXRetail/namespace/}TransactionNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActionCode" type="{http://www.nrf-arts.org/IXRetail/namespace/}ActionCommonDataTypeCodes" default="Update" /&gt;
 *       &lt;attribute name="Type" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryTypeCodes" default="Inventory" /&gt;
 *       &lt;attribute name="InventoryState" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryStatusCodes" default="AvailableOnHand" /&gt;
 *       &lt;attribute name="AcceptedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryType", propOrder = {
    "requestID",
    "response",
    "cancellation",
    "completion",
    "cycleCount",
    "cycleCountID",
    "dateTime",
    "deliveryMethod",
    "disposition",
    "expectedData",
    "fromLocation",
    "fulfillment",
    "inventoryAdjustment",
    "inventoryItem",
    "inventoryLocation",
    "inventoryPosition",
    "itemID",
    "itemLocation",
    "operator",
    "quantity",
    "quantityDispatched",
    "reservationID",
    "reservation",
    "scope",
    "toLocation",
    "trackingNumber",
    "transactionNumber",
    "any"
})
public class InventoryType {

    @XmlElement(name = "RequestID")
    protected InventoryType.RequestID requestID;
    @XmlElement(name = "Response")
    protected InventoryType.Response response;
    @XmlElement(name = "Cancellation")
    protected CancellationType cancellation;
    @XmlElement(name = "Completion")
    protected ItemLocationType completion;
    @XmlElement(name = "CycleCount")
    protected List<CycleCountType> cycleCount;
    @XmlElement(name = "CycleCountID")
    protected String cycleCountID;
    @XmlElement(name = "DateTime", required = true)
    protected List<InventoryType.DateTime> dateTime;
    @XmlElement(name = "DeliveryMethod")
    protected String deliveryMethod;
    @XmlElement(name = "Disposition")
    protected String disposition;
    @XmlElement(name = "ExpectedData")
    protected ExpectedDataType expectedData;
    @XmlElement(name = "FromLocation")
    protected List<ItemLocationType> fromLocation;
    @XmlElement(name = "Fulfillment")
    protected List<FulfillmentType> fulfillment;
    @XmlElement(name = "InventoryAdjustment")
    protected List<InventoryAdjustmentType> inventoryAdjustment;
    @XmlElement(name = "InventoryItem")
    protected List<InventoryItemType> inventoryItem;
    @XmlElement(name = "InventoryLocation")
    protected List<InventoryLocationType> inventoryLocation;
    @XmlElement(name = "InventoryPosition")
    protected List<InventoryPositionType> inventoryPosition;
    @XmlElement(name = "ItemID")
    protected List<InventoryType.ItemID> itemID;
    @XmlElement(name = "ItemLocation")
    protected List<ItemLocationType> itemLocation;
    @XmlElement(name = "Operator")
    protected List<InventoryType.Operator> operator;
    @XmlElement(name = "Quantity")
    protected InventoryType.Quantity quantity;
    @XmlElement(name = "QuantityDispatched")
    protected InventoryType.QuantityDispatched quantityDispatched;
    @XmlElement(name = "ReservationID")
    protected String reservationID;
    @XmlElement(name = "Reservation")
    protected List<ReservationType> reservation;
    @XmlElement(name = "Scope")
    protected ScopeType scope;
    @XmlElement(name = "ToLocation")
    protected ItemLocationType toLocation;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "TransactionNumber")
    protected List<TransactionNumberType> transactionNumber;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "ActionCode")
    protected String actionCode;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "InventoryState")
    protected String inventoryState;
    @XmlAttribute(name = "AcceptedFlag")
    protected Boolean acceptedFlag;
    public final static Schema CONNECT_SCHEMA;

    static InventoryType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = InventoryType.RequestID.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("RequestID", fieldBuilder.build());
        fieldBuilder = InventoryType.Response.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Response", fieldBuilder.build());
        fieldBuilder = CancellationType.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Cancellation", fieldBuilder.build());
        fieldBuilder = ItemLocationType.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Completion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(CycleCountType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("CycleCount", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("CycleCountID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryType.DateTime.CONNECT_SCHEMA);
        builder.field("DateTime", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("DeliveryMethod", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Disposition", fieldBuilder.build());
        fieldBuilder = ExpectedDataType.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ExpectedData", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(ItemLocationType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("FromLocation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(FulfillmentType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("Fulfillment", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryAdjustmentType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("InventoryAdjustment", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryItemType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("InventoryItem", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryLocationType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("InventoryLocation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryPositionType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("InventoryPosition", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryType.ItemID.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("ItemID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(ItemLocationType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("ItemLocation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryType.Operator.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("Operator", fieldBuilder.build());
        fieldBuilder = InventoryType.Quantity.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Quantity", fieldBuilder.build());
        fieldBuilder = InventoryType.QuantityDispatched.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("QuantityDispatched", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ReservationID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(ReservationType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("Reservation", fieldBuilder.build());
        fieldBuilder = ScopeType.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Scope", fieldBuilder.build());
        fieldBuilder = ItemLocationType.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ToLocation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("TrackingNumber", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(TransactionNumberType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("TransactionNumber", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(Object.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("any", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ActionCode", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Type", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("InventoryState", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.boolean();
        fieldBuilder.optional();
        builder.field("AcceptedFlag", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryType.RequestID }
     *     
     */
    public InventoryType.RequestID getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryType.RequestID }
     *     
     */
    public void setRequestID(InventoryType.RequestID value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryType.Response }
     *     
     */
    public InventoryType.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryType.Response }
     *     
     */
    public void setResponse(InventoryType.Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the cancellation property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationType }
     *     
     */
    public CancellationType getCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationType }
     *     
     */
    public void setCancellation(CancellationType value) {
        this.cancellation = value;
    }

    /**
     * Gets the value of the completion property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationType }
     *     
     */
    public ItemLocationType getCompletion() {
        return completion;
    }

    /**
     * Sets the value of the completion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationType }
     *     
     */
    public void setCompletion(ItemLocationType value) {
        this.completion = value;
    }

    /**
     * Gets the value of the cycleCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cycleCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCycleCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CycleCountType }
     * 
     * 
     */
    public List<CycleCountType> getCycleCount() {
        if (cycleCount == null) {
            cycleCount = new ArrayList<CycleCountType>();
        }
        return this.cycleCount;
    }

    /**
     * Gets the value of the cycleCountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleCountID() {
        return cycleCountID;
    }

    /**
     * Sets the value of the cycleCountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleCountID(String value) {
        this.cycleCountID = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryType.DateTime }
     * 
     * 
     */
    public List<InventoryType.DateTime> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<InventoryType.DateTime>();
        }
        return this.dateTime;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposition(String value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the expectedData property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedDataType }
     *     
     */
    public ExpectedDataType getExpectedData() {
        return expectedData;
    }

    /**
     * Sets the value of the expectedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedDataType }
     *     
     */
    public void setExpectedData(ExpectedDataType value) {
        this.expectedData = value;
    }

    /**
     * Gets the value of the fromLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLocationType }
     * 
     * 
     */
    public List<ItemLocationType> getFromLocation() {
        if (fromLocation == null) {
            fromLocation = new ArrayList<ItemLocationType>();
        }
        return this.fromLocation;
    }

    /**
     * Gets the value of the fulfillment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fulfillment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFulfillment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FulfillmentType }
     * 
     * 
     */
    public List<FulfillmentType> getFulfillment() {
        if (fulfillment == null) {
            fulfillment = new ArrayList<FulfillmentType>();
        }
        return this.fulfillment;
    }

    /**
     * Gets the value of the inventoryAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryAdjustmentType }
     * 
     * 
     */
    public List<InventoryAdjustmentType> getInventoryAdjustment() {
        if (inventoryAdjustment == null) {
            inventoryAdjustment = new ArrayList<InventoryAdjustmentType>();
        }
        return this.inventoryAdjustment;
    }

    /**
     * Gets the value of the inventoryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryItemType }
     * 
     * 
     */
    public List<InventoryItemType> getInventoryItem() {
        if (inventoryItem == null) {
            inventoryItem = new ArrayList<InventoryItemType>();
        }
        return this.inventoryItem;
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryLocationType }
     * 
     * 
     */
    public List<InventoryLocationType> getInventoryLocation() {
        if (inventoryLocation == null) {
            inventoryLocation = new ArrayList<InventoryLocationType>();
        }
        return this.inventoryLocation;
    }

    /**
     * Gets the value of the inventoryPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryPositionType }
     * 
     * 
     */
    public List<InventoryPositionType> getInventoryPosition() {
        if (inventoryPosition == null) {
            inventoryPosition = new ArrayList<InventoryPositionType>();
        }
        return this.inventoryPosition;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryType.ItemID }
     * 
     * 
     */
    public List<InventoryType.ItemID> getItemID() {
        if (itemID == null) {
            itemID = new ArrayList<InventoryType.ItemID>();
        }
        return this.itemID;
    }

    /**
     * Gets the value of the itemLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLocationType }
     * 
     * 
     */
    public List<ItemLocationType> getItemLocation() {
        if (itemLocation == null) {
            itemLocation = new ArrayList<ItemLocationType>();
        }
        return this.itemLocation;
    }

    /**
     * Gets the value of the operator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryType.Operator }
     * 
     * 
     */
    public List<InventoryType.Operator> getOperator() {
        if (operator == null) {
            operator = new ArrayList<InventoryType.Operator>();
        }
        return this.operator;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryType.Quantity }
     *     
     */
    public InventoryType.Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryType.Quantity }
     *     
     */
    public void setQuantity(InventoryType.Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityDispatched property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryType.QuantityDispatched }
     *     
     */
    public InventoryType.QuantityDispatched getQuantityDispatched() {
        return quantityDispatched;
    }

    /**
     * Sets the value of the quantityDispatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryType.QuantityDispatched }
     *     
     */
    public void setQuantityDispatched(InventoryType.QuantityDispatched value) {
        this.quantityDispatched = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationID(String value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the reservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationType }
     * 
     * 
     */
    public List<ReservationType> getReservation() {
        if (reservation == null) {
            reservation = new ArrayList<ReservationType>();
        }
        return this.reservation;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeType }
     *     
     */
    public ScopeType getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeType }
     *     
     */
    public void setScope(ScopeType value) {
        this.scope = value;
    }

    /**
     * Gets the value of the toLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationType }
     *     
     */
    public ItemLocationType getToLocation() {
        return toLocation;
    }

    /**
     * Sets the value of the toLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationType }
     *     
     */
    public void setToLocation(ItemLocationType value) {
        this.toLocation = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionNumberType }
     * 
     * 
     */
    public List<TransactionNumberType> getTransactionNumber() {
        if (transactionNumber == null) {
            transactionNumber = new ArrayList<TransactionNumberType>();
        }
        return this.transactionNumber;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
        if (actionCode == null) {
            return "Update";
        } else {
            return actionCode;
        }
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "Inventory";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the inventoryState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryState() {
        if (inventoryState == null) {
            return "AvailableOnHand";
        } else {
            return inventoryState;
        }
    }

    /**
     * Sets the value of the inventoryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryState(String value) {
        this.inventoryState = value;
    }

    /**
     * Gets the value of the acceptedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptedFlag() {
        return acceptedFlag;
    }

    /**
     * Sets the value of the acceptedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptedFlag(Boolean value) {
        this.acceptedFlag = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getRequestID()) {
            struct.put("RequestID", this.getRequestID().toConnectStruct());
        } else {
            struct.put("RequestID", null);
        }
        if (null!= this.getResponse()) {
            struct.put("Response", this.getResponse().toConnectStruct());
        } else {
            struct.put("Response", null);
        }
        if (null!= this.getCancellation()) {
            struct.put("Cancellation", this.getCancellation().toConnectStruct());
        } else {
            struct.put("Cancellation", null);
        }
        if (null!= this.getCompletion()) {
            struct.put("Completion", this.getCompletion().toConnectStruct());
        } else {
            struct.put("Completion", null);
        }
        if (null!= this.getCycleCount()) {
            List<Struct> structs = new ArrayList();
            for (CycleCountType o: this.getCycleCount()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("CycleCount", structs);
        }
        struct.put("CycleCountID", this.getCycleCountID());
        if (null!= this.getDateTime()) {
            List<Struct> structs = new ArrayList();
            for (InventoryType.DateTime o: this.getDateTime()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("DateTime", structs);
        }
        struct.put("DeliveryMethod", this.getDeliveryMethod());
        struct.put("Disposition", this.getDisposition());
        if (null!= this.getExpectedData()) {
            struct.put("ExpectedData", this.getExpectedData().toConnectStruct());
        } else {
            struct.put("ExpectedData", null);
        }
        if (null!= this.getFromLocation()) {
            List<Struct> structs = new ArrayList();
            for (ItemLocationType o: this.getFromLocation()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("FromLocation", structs);
        }
        if (null!= this.getFulfillment()) {
            List<Struct> structs = new ArrayList();
            for (FulfillmentType o: this.getFulfillment()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("Fulfillment", structs);
        }
        if (null!= this.getInventoryAdjustment()) {
            List<Struct> structs = new ArrayList();
            for (InventoryAdjustmentType o: this.getInventoryAdjustment()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("InventoryAdjustment", structs);
        }
        if (null!= this.getInventoryItem()) {
            List<Struct> structs = new ArrayList();
            for (InventoryItemType o: this.getInventoryItem()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("InventoryItem", structs);
        }
        if (null!= this.getInventoryLocation()) {
            List<Struct> structs = new ArrayList();
            for (InventoryLocationType o: this.getInventoryLocation()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("InventoryLocation", structs);
        }
        if (null!= this.getInventoryPosition()) {
            List<Struct> structs = new ArrayList();
            for (InventoryPositionType o: this.getInventoryPosition()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("InventoryPosition", structs);
        }
        if (null!= this.getItemID()) {
            List<Struct> structs = new ArrayList();
            for (InventoryType.ItemID o: this.getItemID()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("ItemID", structs);
        }
        if (null!= this.getItemLocation()) {
            List<Struct> structs = new ArrayList();
            for (ItemLocationType o: this.getItemLocation()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("ItemLocation", structs);
        }
        if (null!= this.getOperator()) {
            List<Struct> structs = new ArrayList();
            for (InventoryType.Operator o: this.getOperator()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("Operator", structs);
        }
        if (null!= this.getQuantity()) {
            struct.put("Quantity", this.getQuantity().toConnectStruct());
        } else {
            struct.put("Quantity", null);
        }
        if (null!= this.getQuantityDispatched()) {
            struct.put("QuantityDispatched", this.getQuantityDispatched().toConnectStruct());
        } else {
            struct.put("QuantityDispatched", null);
        }
        struct.put("ReservationID", this.getReservationID());
        if (null!= this.getReservation()) {
            List<Struct> structs = new ArrayList();
            for (ReservationType o: this.getReservation()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("Reservation", structs);
        }
        if (null!= this.getScope()) {
            struct.put("Scope", this.getScope().toConnectStruct());
        } else {
            struct.put("Scope", null);
        }
        if (null!= this.getToLocation()) {
            struct.put("ToLocation", this.getToLocation().toConnectStruct());
        } else {
            struct.put("ToLocation", null);
        }
        struct.put("TrackingNumber", this.getTrackingNumber());
        if (null!= this.getTransactionNumber()) {
            List<Struct> structs = new ArrayList();
            for (TransactionNumberType o: this.getTransactionNumber()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("TransactionNumber", structs);
        }
        if (null!= this.getAny()) {
            List<Struct> structs = new ArrayList();
            for (Object o: this.getAny()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("any", structs);
        }
        struct.put("ActionCode", this.getActionCode());
        struct.put("Type", this.getType());
        struct.put("InventoryState", this.getInventoryState());
        struct.put("AcceptedFlag", this.isAcceptedFlag());
        return struct;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;DateTimeCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DateTime
        extends DateTimeCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static DateTime() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.DateTime");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ItemIDCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ItemID
        extends ItemIDCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static ItemID() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.ItemID");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;OperatorCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Operator
        extends OperatorCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static Operator() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.Operator");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;QuantityCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Quantity
        extends QuantityCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static Quantity() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.Quantity");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;QuantityCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class QuantityDispatched
        extends QuantityCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static QuantityDispatched() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.QuantityDispatched");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;RequestIDCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestID
        extends RequestIDCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static RequestID() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.RequestID");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Response
        extends ResponseCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static Response() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.Response");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }

}
