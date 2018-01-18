
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.kafka.connect.data.Date;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Identifies objects to be tracked as physical assets
 * 
 * <p>Java class for AssetManagementEquipmentIDObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetManagementEquipmentIDObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Manufacturer" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString64"/&gt;
 *         &lt;element name="EquipmentType" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMEquipmentTypeCode"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="Model" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="ManufacturedDate" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDate"/&gt;
 *         &lt;element name="InstalledDate" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDate"/&gt;
 *         &lt;element name="SoftwareVersion" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString8"/&gt;
 *         &lt;element name="NAFEMVersion" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString8"/&gt;
 *         &lt;element name="ContactNumber" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString128"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetManagementEquipmentIDObjectGroupType", propOrder = {
    "index",
    "manufacturer",
    "equipmentType",
    "serialNumber",
    "model",
    "manufacturedDate",
    "installedDate",
    "softwareVersion",
    "nafemVersion",
    "contactNumber"
})
public class AssetManagementEquipmentIDObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    @XmlElement(name = "EquipmentType", required = true)
    protected String equipmentType;
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "ManufacturedDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manufacturedDate;
    @XmlElement(name = "InstalledDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar installedDate;
    @XmlElement(name = "SoftwareVersion", required = true)
    protected String softwareVersion;
    @XmlElement(name = "NAFEMVersion", required = true)
    protected String nafemVersion;
    @XmlElement(name = "ContactNumber", required = true)
    protected String contactNumber;
    public final static Schema CONNECT_SCHEMA;

    static AssetManagementEquipmentIDObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.AssetManagementEquipmentIDObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Manufacturer", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("EquipmentType", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("SerialNumber", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Model", fieldBuilder.build());
        fieldBuilder = Date.builder();
        builder.field("ManufacturedDate", fieldBuilder.build());
        fieldBuilder = Date.builder();
        builder.field("InstalledDate", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("SoftwareVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("NAFEMVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ContactNumber", fieldBuilder.build());
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
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the manufacturedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Sets the value of the manufacturedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufacturedDate(XMLGregorianCalendar value) {
        this.manufacturedDate = value;
    }

    /**
     * Gets the value of the installedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstalledDate() {
        return installedDate;
    }

    /**
     * Sets the value of the installedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstalledDate(XMLGregorianCalendar value) {
        this.installedDate = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the nafemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAFEMVersion() {
        return nafemVersion;
    }

    /**
     * Sets the value of the nafemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAFEMVersion(String value) {
        this.nafemVersion = value;
    }

    /**
     * Gets the value of the contactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the value of the contactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber(String value) {
        this.contactNumber = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("manufacturer", this.manufacturer);
        struct.put("equipmentType", this.equipmentType);
        struct.put("serialNumber", this.serialNumber);
        struct.put("model", this.model);
        struct.put("manufacturedDate", this.manufacturedDate);
        struct.put("installedDate", this.installedDate);
        struct.put("softwareVersion", this.softwareVersion);
        struct.put("nafemVersion", this.nafemVersion);
        struct.put("contactNumber", this.contactNumber);
        return struct;
    }

}
