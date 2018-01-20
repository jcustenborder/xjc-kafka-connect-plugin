
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.github.jcustenborder.kafka.connect.xml.Connectable;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.w3c.dom.Element;


/**
 * <p>Java class for CycleCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CycleCountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CycleCountID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemID"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;ItemIDCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BeginningUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GrossSalesUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReturnUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReceivedUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReturnToVendorUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransferInUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransferOutUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdjustmentUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurrentUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EndingUnitCount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TankID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TankProbeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Temperature" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TypeCode" type="{http://www.nrf-arts.org/IXRetail/namespace/}CycleCountTypeCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CycleCountType", propOrder = {
    "cycleCountID",
    "itemID",
    "beginningUnitCount",
    "grossSalesUnitCount",
    "returnUnitCount",
    "receivedUnitCount",
    "returnToVendorUnitCount",
    "transferInUnitCount",
    "transferOutUnitCount",
    "adjustmentUnitCount",
    "currentUnitCount",
    "endingUnitCount",
    "tankID",
    "tankProbeID",
    "temperature",
    "any"
})
public class CycleCountType
    implements Connectable
{

    @XmlElement(name = "CycleCountID", required = true)
    protected String cycleCountID;
    @XmlElement(name = "ItemID", required = true)
    protected CycleCountType.ItemID itemID;
    @XmlElement(name = "BeginningUnitCount")
    protected CycleCountType.BeginningUnitCount beginningUnitCount;
    @XmlElement(name = "GrossSalesUnitCount")
    protected CycleCountType.GrossSalesUnitCount grossSalesUnitCount;
    @XmlElement(name = "ReturnUnitCount")
    protected CycleCountType.ReturnUnitCount returnUnitCount;
    @XmlElement(name = "ReceivedUnitCount")
    protected CycleCountType.ReceivedUnitCount receivedUnitCount;
    @XmlElement(name = "ReturnToVendorUnitCount")
    protected CycleCountType.ReturnToVendorUnitCount returnToVendorUnitCount;
    @XmlElement(name = "TransferInUnitCount")
    protected CycleCountType.TransferInUnitCount transferInUnitCount;
    @XmlElement(name = "TransferOutUnitCount")
    protected CycleCountType.TransferOutUnitCount transferOutUnitCount;
    @XmlElement(name = "AdjustmentUnitCount")
    protected CycleCountType.AdjustmentUnitCount adjustmentUnitCount;
    @XmlElement(name = "CurrentUnitCount")
    protected CycleCountType.CurrentUnitCount currentUnitCount;
    @XmlElement(name = "EndingUnitCount")
    protected CycleCountType.EndingUnitCount endingUnitCount;
    @XmlElement(name = "TankID")
    protected String tankID;
    @XmlElement(name = "TankProbeID")
    protected String tankProbeID;
    @XmlElement(name = "Temperature")
    protected CycleCountType.Temperature temperature;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "TypeCode")
    protected String typeCode;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.CycleCountType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("CycleCountID", fieldBuilder.build());
        fieldBuilder = CycleCountType.ItemID.CONNECT_SCHEMA;
        builder.field("ItemID", fieldBuilder.build());
        fieldBuilder = CycleCountType.BeginningUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("BeginningUnitCount", fieldBuilder.build());
        fieldBuilder = CycleCountType.GrossSalesUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("GrossSalesUnitCount", fieldBuilder.build());
        fieldBuilder = CycleCountType.ReturnUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ReturnUnitCount", fieldBuilder.build());
        fieldBuilder = CycleCountType.ReceivedUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ReceivedUnitCount", fieldBuilder.build());
        fieldBuilder = CycleCountType.ReturnToVendorUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ReturnToVendorUnitCount", fieldBuilder.build());
        fieldBuilder = CycleCountType.TransferInUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("TransferInUnitCount", fieldBuilder.build());
        fieldBuilder = CycleCountType.TransferOutUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("TransferOutUnitCount", fieldBuilder.build());
        fieldBuilder = CycleCountType.AdjustmentUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("AdjustmentUnitCount", fieldBuilder.build());
        fieldBuilder = CycleCountType.CurrentUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("CurrentUnitCount", fieldBuilder.build());
        fieldBuilder = CycleCountType.EndingUnitCount.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("EndingUnitCount", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("TankID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("TankProbeID", fieldBuilder.build());
        fieldBuilder = CycleCountType.Temperature.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Temperature", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(Object.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("any", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("TypeCode", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
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
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.ItemID }
     *     
     */
    public CycleCountType.ItemID getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.ItemID }
     *     
     */
    public void setItemID(CycleCountType.ItemID value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the beginningUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.BeginningUnitCount }
     *     
     */
    public CycleCountType.BeginningUnitCount getBeginningUnitCount() {
        return beginningUnitCount;
    }

    /**
     * Sets the value of the beginningUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.BeginningUnitCount }
     *     
     */
    public void setBeginningUnitCount(CycleCountType.BeginningUnitCount value) {
        this.beginningUnitCount = value;
    }

    /**
     * Gets the value of the grossSalesUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.GrossSalesUnitCount }
     *     
     */
    public CycleCountType.GrossSalesUnitCount getGrossSalesUnitCount() {
        return grossSalesUnitCount;
    }

    /**
     * Sets the value of the grossSalesUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.GrossSalesUnitCount }
     *     
     */
    public void setGrossSalesUnitCount(CycleCountType.GrossSalesUnitCount value) {
        this.grossSalesUnitCount = value;
    }

    /**
     * Gets the value of the returnUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.ReturnUnitCount }
     *     
     */
    public CycleCountType.ReturnUnitCount getReturnUnitCount() {
        return returnUnitCount;
    }

    /**
     * Sets the value of the returnUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.ReturnUnitCount }
     *     
     */
    public void setReturnUnitCount(CycleCountType.ReturnUnitCount value) {
        this.returnUnitCount = value;
    }

    /**
     * Gets the value of the receivedUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.ReceivedUnitCount }
     *     
     */
    public CycleCountType.ReceivedUnitCount getReceivedUnitCount() {
        return receivedUnitCount;
    }

    /**
     * Sets the value of the receivedUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.ReceivedUnitCount }
     *     
     */
    public void setReceivedUnitCount(CycleCountType.ReceivedUnitCount value) {
        this.receivedUnitCount = value;
    }

    /**
     * Gets the value of the returnToVendorUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.ReturnToVendorUnitCount }
     *     
     */
    public CycleCountType.ReturnToVendorUnitCount getReturnToVendorUnitCount() {
        return returnToVendorUnitCount;
    }

    /**
     * Sets the value of the returnToVendorUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.ReturnToVendorUnitCount }
     *     
     */
    public void setReturnToVendorUnitCount(CycleCountType.ReturnToVendorUnitCount value) {
        this.returnToVendorUnitCount = value;
    }

    /**
     * Gets the value of the transferInUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.TransferInUnitCount }
     *     
     */
    public CycleCountType.TransferInUnitCount getTransferInUnitCount() {
        return transferInUnitCount;
    }

    /**
     * Sets the value of the transferInUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.TransferInUnitCount }
     *     
     */
    public void setTransferInUnitCount(CycleCountType.TransferInUnitCount value) {
        this.transferInUnitCount = value;
    }

    /**
     * Gets the value of the transferOutUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.TransferOutUnitCount }
     *     
     */
    public CycleCountType.TransferOutUnitCount getTransferOutUnitCount() {
        return transferOutUnitCount;
    }

    /**
     * Sets the value of the transferOutUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.TransferOutUnitCount }
     *     
     */
    public void setTransferOutUnitCount(CycleCountType.TransferOutUnitCount value) {
        this.transferOutUnitCount = value;
    }

    /**
     * Gets the value of the adjustmentUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.AdjustmentUnitCount }
     *     
     */
    public CycleCountType.AdjustmentUnitCount getAdjustmentUnitCount() {
        return adjustmentUnitCount;
    }

    /**
     * Sets the value of the adjustmentUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.AdjustmentUnitCount }
     *     
     */
    public void setAdjustmentUnitCount(CycleCountType.AdjustmentUnitCount value) {
        this.adjustmentUnitCount = value;
    }

    /**
     * Gets the value of the currentUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.CurrentUnitCount }
     *     
     */
    public CycleCountType.CurrentUnitCount getCurrentUnitCount() {
        return currentUnitCount;
    }

    /**
     * Sets the value of the currentUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.CurrentUnitCount }
     *     
     */
    public void setCurrentUnitCount(CycleCountType.CurrentUnitCount value) {
        this.currentUnitCount = value;
    }

    /**
     * Gets the value of the endingUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.EndingUnitCount }
     *     
     */
    public CycleCountType.EndingUnitCount getEndingUnitCount() {
        return endingUnitCount;
    }

    /**
     * Sets the value of the endingUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.EndingUnitCount }
     *     
     */
    public void setEndingUnitCount(CycleCountType.EndingUnitCount value) {
        this.endingUnitCount = value;
    }

    /**
     * Gets the value of the tankID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTankID() {
        return tankID;
    }

    /**
     * Sets the value of the tankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTankID(String value) {
        this.tankID = value;
    }

    /**
     * Gets the value of the tankProbeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTankProbeID() {
        return tankProbeID;
    }

    /**
     * Sets the value of the tankProbeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTankProbeID(String value) {
        this.tankProbeID = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link CycleCountType.Temperature }
     *     
     */
    public CycleCountType.Temperature getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleCountType.Temperature }
     *     
     */
    public void setTemperature(CycleCountType.Temperature value) {
        this.temperature = value;
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
     * {@link Object }
     * {@link Element }
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
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    @Override
    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("CycleCountID", this.getCycleCountID());
        if (null!= this.getItemID()) {
            struct.put("ItemID", this.getItemID().toConnectStruct());
        } else {
            struct.put("ItemID", null);
        }
        if (null!= this.getBeginningUnitCount()) {
            struct.put("BeginningUnitCount", this.getBeginningUnitCount().toConnectStruct());
        } else {
            struct.put("BeginningUnitCount", null);
        }
        if (null!= this.getGrossSalesUnitCount()) {
            struct.put("GrossSalesUnitCount", this.getGrossSalesUnitCount().toConnectStruct());
        } else {
            struct.put("GrossSalesUnitCount", null);
        }
        if (null!= this.getReturnUnitCount()) {
            struct.put("ReturnUnitCount", this.getReturnUnitCount().toConnectStruct());
        } else {
            struct.put("ReturnUnitCount", null);
        }
        if (null!= this.getReceivedUnitCount()) {
            struct.put("ReceivedUnitCount", this.getReceivedUnitCount().toConnectStruct());
        } else {
            struct.put("ReceivedUnitCount", null);
        }
        if (null!= this.getReturnToVendorUnitCount()) {
            struct.put("ReturnToVendorUnitCount", this.getReturnToVendorUnitCount().toConnectStruct());
        } else {
            struct.put("ReturnToVendorUnitCount", null);
        }
        if (null!= this.getTransferInUnitCount()) {
            struct.put("TransferInUnitCount", this.getTransferInUnitCount().toConnectStruct());
        } else {
            struct.put("TransferInUnitCount", null);
        }
        if (null!= this.getTransferOutUnitCount()) {
            struct.put("TransferOutUnitCount", this.getTransferOutUnitCount().toConnectStruct());
        } else {
            struct.put("TransferOutUnitCount", null);
        }
        if (null!= this.getAdjustmentUnitCount()) {
            struct.put("AdjustmentUnitCount", this.getAdjustmentUnitCount().toConnectStruct());
        } else {
            struct.put("AdjustmentUnitCount", null);
        }
        if (null!= this.getCurrentUnitCount()) {
            struct.put("CurrentUnitCount", this.getCurrentUnitCount().toConnectStruct());
        } else {
            struct.put("CurrentUnitCount", null);
        }
        if (null!= this.getEndingUnitCount()) {
            struct.put("EndingUnitCount", this.getEndingUnitCount().toConnectStruct());
        } else {
            struct.put("EndingUnitCount", null);
        }
        struct.put("TankID", this.getTankID());
        struct.put("TankProbeID", this.getTankProbeID());
        if (null!= this.getTemperature()) {
            struct.put("Temperature", this.getTemperature().toConnectStruct());
        } else {
            struct.put("Temperature", null);
        }
        if (null!= this.getAny()) {
            List<Struct> structs = new ArrayList();
            for (Object o: this.getAny()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("any", structs);
        }
        struct.put("TypeCode", this.getTypeCode());
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdjustmentUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.AdjustmentUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BeginningUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.BeginningUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CurrentUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.CurrentUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class EndingUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.EndingUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GrossSalesUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.GrossSalesUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.ItemID");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReceivedUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.ReceivedUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReturnToVendorUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.ReturnToVendorUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReturnUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.ReturnUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Temperature
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.Temperature");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TransferInUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.TransferInUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MeasurementCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TransferOutUnitCount
        extends MeasurementCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.TransferOutUnitCount");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }

}
