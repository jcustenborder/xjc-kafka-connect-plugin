
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Identifies Component parts of assetd defined in the Asset
 *             ManagementID
 * 
 * <p>Java class for AssetManagementComponentPartIDObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetManagementComponentPartIDObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PartManufacturer" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString64"/&gt;
 *         &lt;element name="DeviceName" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString64"/&gt;
 *         &lt;element name="PartSerialNumber" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="PartModel" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="PartSoftwareVersion" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString8"/&gt;
 *         &lt;element name="PartContactName" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString255"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetManagementComponentPartIDObjectGroupType", propOrder = {
    "index",
    "partManufacturer",
    "deviceName",
    "partSerialNumber",
    "partModel",
    "partSoftwareVersion",
    "partContactName"
})
public class AssetManagementComponentPartIDObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "PartManufacturer", required = true)
    protected String partManufacturer;
    @XmlElement(name = "DeviceName", required = true)
    protected String deviceName;
    @XmlElement(name = "PartSerialNumber", required = true)
    protected String partSerialNumber;
    @XmlElement(name = "PartModel", required = true)
    protected String partModel;
    @XmlElement(name = "PartSoftwareVersion", required = true)
    protected String partSoftwareVersion;
    @XmlElement(name = "PartContactName", required = true)
    protected String partContactName;
    public final static Schema CONNECT_SCHEMA;

    static AssetManagementComponentPartIDObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.AssetManagementComponentPartIDObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("PartManufacturer", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("DeviceName", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("PartSerialNumber", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("PartModel", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("PartSoftwareVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("PartContactName", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the partManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartManufacturer() {
        return partManufacturer;
    }

    /**
     * Sets the value of the partManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartManufacturer(String value) {
        this.partManufacturer = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the partSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartSerialNumber() {
        return partSerialNumber;
    }

    /**
     * Sets the value of the partSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartSerialNumber(String value) {
        this.partSerialNumber = value;
    }

    /**
     * Gets the value of the partModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartModel() {
        return partModel;
    }

    /**
     * Sets the value of the partModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartModel(String value) {
        this.partModel = value;
    }

    /**
     * Gets the value of the partSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartSoftwareVersion() {
        return partSoftwareVersion;
    }

    /**
     * Sets the value of the partSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartSoftwareVersion(String value) {
        this.partSoftwareVersion = value;
    }

    /**
     * Gets the value of the partContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartContactName() {
        return partContactName;
    }

    /**
     * Sets the value of the partContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartContactName(String value) {
        this.partContactName = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("partManufacturer", this.partManufacturer);
        struct.put("deviceName", this.deviceName);
        struct.put("partSerialNumber", this.partSerialNumber);
        struct.put("partModel", this.partModel);
        struct.put("partSoftwareVersion", this.partSoftwareVersion);
        struct.put("partContactName", this.partContactName);
        return struct;
    }

}
