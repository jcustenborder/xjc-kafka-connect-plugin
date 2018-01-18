
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for XMLPOSCommonMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XMLPOSCommonMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageID" type="{http://www.nrf-arts.org/IXRetail/namespace/}RequestIDCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="DateTime" type="{http://www.nrf-arts.org/IXRetail/namespace/}DateTimeCommonData" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Response" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseType" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="SensorID" type="{http://www.nrf-arts.org/IXRetail/namespace/}SensorIDType" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="LogicalDeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="CheckHealth" type="{http://www.nrf-arts.org/IXRetail/namespace/}CheckHealthCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Claim" type="{http://www.nrf-arts.org/IXRetail/namespace/}ClaimCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ClearInput" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ClearInputProperties" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ClearOutput" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Close" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="CompareFirmwareVersion" type="{http://www.nrf-arts.org/IXRetail/namespace/}CompareFirmwareVersionCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="DirectIO" type="{http://www.nrf-arts.org/IXRetail/namespace/}DirectIOCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Error" type="{http://www.nrf-arts.org/IXRetail/namespace/}ErrorCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Open" type="{http://www.nrf-arts.org/IXRetail/namespace/}OpenCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Release" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ResetStatistics" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResetStatisticsCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="RetrieveStatistics" type="{http://www.nrf-arts.org/IXRetail/namespace/}RetrieveStatisticsCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="UpdateFirmware" type="{http://www.nrf-arts.org/IXRetail/namespace/}UpdateFirmwareCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="UpdateStatistics" type="{http://www.nrf-arts.org/IXRetail/namespace/}UpdateStatisticsCommonData" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MessageType" type="{http://www.nrf-arts.org/IXRetail/namespace/}MessageTypeCode" default="Request" /&gt;
 *       &lt;attribute name="Action" type="{http://www.nrf-arts.org/IXRetail/namespace/}ActionCommonDataTypeCodes" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMLPOSCommonMethod", propOrder = {
    "messageID",
    "dateTime",
    "response",
    "sensorID",
    "logicalDeviceName",
    "checkHealth",
    "claim",
    "clearInput",
    "clearInputProperties",
    "clearOutput",
    "close",
    "compareFirmwareVersion",
    "directIO",
    "error",
    "open",
    "release",
    "resetStatistics",
    "retrieveStatistics",
    "updateFirmware",
    "updateStatistics"
})
@XmlSeeAlso({
    Kitchen.class
})
public class XMLPOSCommonMethod
    implements Connectable
{

    @XmlElement(name = "MessageID")
    protected RequestIDCommonData messageID;
    @XmlElement(name = "DateTime")
    protected List<DateTimeCommonData> dateTime;
    @XmlElement(name = "Response")
    protected ResponseType response;
    @XmlElement(name = "SensorID")
    protected List<SensorIDType> sensorID;
    @XmlElement(name = "LogicalDeviceName")
    protected String logicalDeviceName;
    @XmlElement(name = "CheckHealth")
    protected CheckHealthCommonData checkHealth;
    @XmlElement(name = "Claim")
    protected ClaimCommonData claim;
    @XmlElement(name = "ClearInput")
    protected Object clearInput;
    @XmlElement(name = "ClearInputProperties")
    protected Object clearInputProperties;
    @XmlElement(name = "ClearOutput")
    protected Object clearOutput;
    @XmlElement(name = "Close")
    protected Object close;
    @XmlElement(name = "CompareFirmwareVersion")
    protected CompareFirmwareVersionCommonData compareFirmwareVersion;
    @XmlElement(name = "DirectIO")
    protected DirectIOCommonData directIO;
    @XmlElement(name = "Error")
    protected ErrorCommonData error;
    @XmlElement(name = "Open")
    protected OpenCommonData open;
    @XmlElement(name = "Release")
    protected Object release;
    @XmlElement(name = "ResetStatistics")
    protected ResetStatisticsCommonData resetStatistics;
    @XmlElement(name = "RetrieveStatistics")
    protected RetrieveStatisticsCommonData retrieveStatistics;
    @XmlElement(name = "UpdateFirmware")
    protected UpdateFirmwareCommonData updateFirmware;
    @XmlElement(name = "UpdateStatistics")
    protected UpdateStatisticsCommonData updateStatistics;
    @XmlAttribute(name = "MessageType")
    protected String messageType;
    @XmlAttribute(name = "Action")
    protected String action;
    public final static Schema CONNECT_SCHEMA;

    static XMLPOSCommonMethod() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.XMLPOSCommonMethod");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MessageID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("DateTime", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Response", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("SensorID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("LogicalDeviceName", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("CheckHealth", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Claim", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ClearInput", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ClearInputProperties", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ClearOutput", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Close", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("CompareFirmwareVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("DirectIO", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Error", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Open", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Release", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ResetStatistics", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("RetrieveStatistics", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UpdateFirmware", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UpdateStatistics", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MessageType", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Action", fieldBuilder.build());
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
     * {@link DateTimeCommonData }
     * 
     * 
     */
    public List<DateTimeCommonData> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<DateTimeCommonData>();
        }
        return this.dateTime;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the sensorID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensorID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensorID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorIDType }
     * 
     * 
     */
    public List<SensorIDType> getSensorID() {
        if (sensorID == null) {
            sensorID = new ArrayList<SensorIDType>();
        }
        return this.sensorID;
    }

    /**
     * Gets the value of the logicalDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalDeviceName() {
        return logicalDeviceName;
    }

    /**
     * Sets the value of the logicalDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalDeviceName(String value) {
        this.logicalDeviceName = value;
    }

    /**
     * Gets the value of the checkHealth property.
     * 
     * @return
     *     possible object is
     *     {@link CheckHealthCommonData }
     *     
     */
    public CheckHealthCommonData getCheckHealth() {
        return checkHealth;
    }

    /**
     * Sets the value of the checkHealth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckHealthCommonData }
     *     
     */
    public void setCheckHealth(CheckHealthCommonData value) {
        this.checkHealth = value;
    }

    /**
     * Gets the value of the claim property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimCommonData }
     *     
     */
    public ClaimCommonData getClaim() {
        return claim;
    }

    /**
     * Sets the value of the claim property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimCommonData }
     *     
     */
    public void setClaim(ClaimCommonData value) {
        this.claim = value;
    }

    /**
     * Gets the value of the clearInput property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClearInput() {
        return clearInput;
    }

    /**
     * Sets the value of the clearInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClearInput(Object value) {
        this.clearInput = value;
    }

    /**
     * Gets the value of the clearInputProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClearInputProperties() {
        return clearInputProperties;
    }

    /**
     * Sets the value of the clearInputProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClearInputProperties(Object value) {
        this.clearInputProperties = value;
    }

    /**
     * Gets the value of the clearOutput property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClearOutput() {
        return clearOutput;
    }

    /**
     * Sets the value of the clearOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClearOutput(Object value) {
        this.clearOutput = value;
    }

    /**
     * Gets the value of the close property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClose() {
        return close;
    }

    /**
     * Sets the value of the close property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClose(Object value) {
        this.close = value;
    }

    /**
     * Gets the value of the compareFirmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFirmwareVersionCommonData }
     *     
     */
    public CompareFirmwareVersionCommonData getCompareFirmwareVersion() {
        return compareFirmwareVersion;
    }

    /**
     * Sets the value of the compareFirmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFirmwareVersionCommonData }
     *     
     */
    public void setCompareFirmwareVersion(CompareFirmwareVersionCommonData value) {
        this.compareFirmwareVersion = value;
    }

    /**
     * Gets the value of the directIO property.
     * 
     * @return
     *     possible object is
     *     {@link DirectIOCommonData }
     *     
     */
    public DirectIOCommonData getDirectIO() {
        return directIO;
    }

    /**
     * Sets the value of the directIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectIOCommonData }
     *     
     */
    public void setDirectIO(DirectIOCommonData value) {
        this.directIO = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCommonData }
     *     
     */
    public ErrorCommonData getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCommonData }
     *     
     */
    public void setError(ErrorCommonData value) {
        this.error = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link OpenCommonData }
     *     
     */
    public OpenCommonData getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenCommonData }
     *     
     */
    public void setOpen(OpenCommonData value) {
        this.open = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRelease(Object value) {
        this.release = value;
    }

    /**
     * Gets the value of the resetStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link ResetStatisticsCommonData }
     *     
     */
    public ResetStatisticsCommonData getResetStatistics() {
        return resetStatistics;
    }

    /**
     * Sets the value of the resetStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetStatisticsCommonData }
     *     
     */
    public void setResetStatistics(ResetStatisticsCommonData value) {
        this.resetStatistics = value;
    }

    /**
     * Gets the value of the retrieveStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveStatisticsCommonData }
     *     
     */
    public RetrieveStatisticsCommonData getRetrieveStatistics() {
        return retrieveStatistics;
    }

    /**
     * Sets the value of the retrieveStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveStatisticsCommonData }
     *     
     */
    public void setRetrieveStatistics(RetrieveStatisticsCommonData value) {
        this.retrieveStatistics = value;
    }

    /**
     * Gets the value of the updateFirmware property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateFirmwareCommonData }
     *     
     */
    public UpdateFirmwareCommonData getUpdateFirmware() {
        return updateFirmware;
    }

    /**
     * Sets the value of the updateFirmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateFirmwareCommonData }
     *     
     */
    public void setUpdateFirmware(UpdateFirmwareCommonData value) {
        this.updateFirmware = value;
    }

    /**
     * Gets the value of the updateStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatisticsCommonData }
     *     
     */
    public UpdateStatisticsCommonData getUpdateStatistics() {
        return updateStatistics;
    }

    /**
     * Sets the value of the updateStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatisticsCommonData }
     *     
     */
    public void setUpdateStatistics(UpdateStatisticsCommonData value) {
        this.updateStatistics = value;
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
        if (messageType == null) {
            return "Request";
        } else {
            return messageType;
        }
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
        struct.put("messageID", this.messageID);
        struct.put("dateTime", this.dateTime);
        struct.put("response", this.response);
        struct.put("sensorID", this.sensorID);
        struct.put("logicalDeviceName", this.logicalDeviceName);
        struct.put("checkHealth", this.checkHealth);
        struct.put("claim", this.claim);
        struct.put("clearInput", this.clearInput);
        struct.put("clearInputProperties", this.clearInputProperties);
        struct.put("clearOutput", this.clearOutput);
        struct.put("close", this.close);
        struct.put("compareFirmwareVersion", this.compareFirmwareVersion);
        struct.put("directIO", this.directIO);
        struct.put("error", this.error);
        struct.put("open", this.open);
        struct.put("release", this.release);
        struct.put("resetStatistics", this.resetStatistics);
        struct.put("retrieveStatistics", this.retrieveStatistics);
        struct.put("updateFirmware", this.updateFirmware);
        struct.put("updateStatistics", this.updateStatistics);
        struct.put("messageType", this.messageType);
        struct.put("action", this.action);
        return struct;
    }

}
