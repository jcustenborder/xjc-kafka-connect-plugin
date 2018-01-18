
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for AssetManagementEnterpriseGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetManagementEnterpriseGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.nrf-arts.org/IXRetail/namespace/}RequestIDCommonData" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData" minOccurs="0"/&gt;
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentID" type="{http://www.nrf-arts.org/IXRetail/namespace/}AssetManagementEquipmentIDObjectGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ComponentPartID" type="{http://www.nrf-arts.org/IXRetail/namespace/}AssetManagementComponentPartIDObjectGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AssetManagementEnterpriseGroupType", propOrder = {
    "requestID",
    "response",
    "objectName",
    "equipmentID",
    "componentPartID"
})
public class AssetManagementEnterpriseGroupType
    implements Connectable
{

    @XmlElement(name = "RequestID")
    protected RequestIDCommonData requestID;
    @XmlElement(name = "Response")
    protected ResponseCommonData response;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "EquipmentID")
    protected List<AssetManagementEquipmentIDObjectGroupType> equipmentID;
    @XmlElement(name = "ComponentPartID")
    protected List<AssetManagementComponentPartIDObjectGroupType> componentPartID;
    @XmlAttribute(name = "Action")
    protected String action;
    public final static Schema CONNECT_SCHEMA;

    static AssetManagementEnterpriseGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.AssetManagementEnterpriseGroupType");
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
        builder.field("EquipmentID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ComponentPartID", fieldBuilder.build());
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
     * Gets the value of the equipmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetManagementEquipmentIDObjectGroupType }
     * 
     * 
     */
    public List<AssetManagementEquipmentIDObjectGroupType> getEquipmentID() {
        if (equipmentID == null) {
            equipmentID = new ArrayList<AssetManagementEquipmentIDObjectGroupType>();
        }
        return this.equipmentID;
    }

    /**
     * Gets the value of the componentPartID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentPartID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentPartID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetManagementComponentPartIDObjectGroupType }
     * 
     * 
     */
    public List<AssetManagementComponentPartIDObjectGroupType> getComponentPartID() {
        if (componentPartID == null) {
            componentPartID = new ArrayList<AssetManagementComponentPartIDObjectGroupType>();
        }
        return this.componentPartID;
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
        struct.put("equipmentID", this.equipmentID);
        struct.put("componentPartID", this.componentPartID);
        struct.put("action", this.action);
        return struct;
    }

}
