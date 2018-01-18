
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.nrf-arts.org/IXRetail/namespace/}XMLPOSCommonMethod"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdministrationEnterpriseGroup" type="{http://www.nrf-arts.org/IXRetail/namespace/}AdministrationEnterpriseGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssetManagementEnterpriseGroup" type="{http://www.nrf-arts.org/IXRetail/namespace/}AssetManagementEnterpriseGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BulkTransferEnterpriseGroup" type="{http://www.nrf-arts.org/IXRetail/namespace/}BulkTransferEnterpriseGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClockCalendarEnterpriseGroup" type="{http://www.nrf-arts.org/IXRetail/namespace/}ClockCalendarEnterpriseGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryManagementEnterpriseGroup" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryManagementEnterpriseGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceEnterpriseGroup" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceEnterpriseGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MonitorEnterpriseGroup" type="{http://www.nrf-arts.org/IXRetail/namespace/}MonitorEnterpriseGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SecurityEnterpriseGroup" type="{http://www.nrf-arts.org/IXRetail/namespace/}SecurityEnterpriseGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UtilityManagementEnterpriseGroup" type="{http://www.nrf-arts.org/IXRetail/namespace/}UtilityManagementEnterpriseGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Severity" type="{http://www.nrf-arts.org/IXRetail/namespace/}SeverityCodeEnumeration" /&gt;
 *       &lt;attribute name="MajorVersion" type="{http://www.w3.org/2001/XMLSchema}int" fixed="1" /&gt;
 *       &lt;attribute name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="FixVersion" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "administrationEnterpriseGroup",
    "assetManagementEnterpriseGroup",
    "bulkTransferEnterpriseGroup",
    "clockCalendarEnterpriseGroup",
    "inventoryManagementEnterpriseGroup",
    "maintenanceEnterpriseGroup",
    "monitorEnterpriseGroup",
    "securityEnterpriseGroup",
    "utilityManagementEnterpriseGroup",
    "any"
})
@XmlRootElement(name = "Kitchen")
public class Kitchen
    extends XMLPOSCommonMethod
    implements Connectable
{

    @XmlElement(name = "AdministrationEnterpriseGroup")
    protected List<AdministrationEnterpriseGroupType> administrationEnterpriseGroup;
    @XmlElement(name = "AssetManagementEnterpriseGroup")
    protected List<AssetManagementEnterpriseGroupType> assetManagementEnterpriseGroup;
    @XmlElement(name = "BulkTransferEnterpriseGroup")
    protected List<BulkTransferEnterpriseGroupType> bulkTransferEnterpriseGroup;
    @XmlElement(name = "ClockCalendarEnterpriseGroup")
    protected List<ClockCalendarEnterpriseGroupType> clockCalendarEnterpriseGroup;
    @XmlElement(name = "InventoryManagementEnterpriseGroup")
    protected List<InventoryManagementEnterpriseGroupType> inventoryManagementEnterpriseGroup;
    @XmlElement(name = "MaintenanceEnterpriseGroup")
    protected List<MaintenanceEnterpriseGroup> maintenanceEnterpriseGroup;
    @XmlElement(name = "MonitorEnterpriseGroup")
    protected List<MonitorEnterpriseGroupType> monitorEnterpriseGroup;
    @XmlElement(name = "SecurityEnterpriseGroup")
    protected List<SecurityEnterpriseGroupType> securityEnterpriseGroup;
    @XmlElement(name = "UtilityManagementEnterpriseGroup")
    protected List<UtilityManagementEnterpriseGroupType> utilityManagementEnterpriseGroup;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Severity")
    protected SeverityCodeEnumeration severity;
    @XmlAttribute(name = "MajorVersion")
    protected Integer majorVersion;
    @XmlAttribute(name = "MinorVersion")
    protected Integer minorVersion;
    @XmlAttribute(name = "FixVersion")
    protected Integer fixVersion;
    public final static Schema CONNECT_SCHEMA;

    static Kitchen() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.Kitchen");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("AdministrationEnterpriseGroup", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("AssetManagementEnterpriseGroup", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("BulkTransferEnterpriseGroup", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ClockCalendarEnterpriseGroup", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("InventoryManagementEnterpriseGroup", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MaintenanceEnterpriseGroup", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MonitorEnterpriseGroup", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("SecurityEnterpriseGroup", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UtilityManagementEnterpriseGroup", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("any", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Severity", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MajorVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("MinorVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("FixVersion", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the administrationEnterpriseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrationEnterpriseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrationEnterpriseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrationEnterpriseGroupType }
     * 
     * 
     */
    public List<AdministrationEnterpriseGroupType> getAdministrationEnterpriseGroup() {
        if (administrationEnterpriseGroup == null) {
            administrationEnterpriseGroup = new ArrayList<AdministrationEnterpriseGroupType>();
        }
        return this.administrationEnterpriseGroup;
    }

    /**
     * Gets the value of the assetManagementEnterpriseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetManagementEnterpriseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetManagementEnterpriseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetManagementEnterpriseGroupType }
     * 
     * 
     */
    public List<AssetManagementEnterpriseGroupType> getAssetManagementEnterpriseGroup() {
        if (assetManagementEnterpriseGroup == null) {
            assetManagementEnterpriseGroup = new ArrayList<AssetManagementEnterpriseGroupType>();
        }
        return this.assetManagementEnterpriseGroup;
    }

    /**
     * Gets the value of the bulkTransferEnterpriseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulkTransferEnterpriseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBulkTransferEnterpriseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BulkTransferEnterpriseGroupType }
     * 
     * 
     */
    public List<BulkTransferEnterpriseGroupType> getBulkTransferEnterpriseGroup() {
        if (bulkTransferEnterpriseGroup == null) {
            bulkTransferEnterpriseGroup = new ArrayList<BulkTransferEnterpriseGroupType>();
        }
        return this.bulkTransferEnterpriseGroup;
    }

    /**
     * Gets the value of the clockCalendarEnterpriseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clockCalendarEnterpriseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClockCalendarEnterpriseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClockCalendarEnterpriseGroupType }
     * 
     * 
     */
    public List<ClockCalendarEnterpriseGroupType> getClockCalendarEnterpriseGroup() {
        if (clockCalendarEnterpriseGroup == null) {
            clockCalendarEnterpriseGroup = new ArrayList<ClockCalendarEnterpriseGroupType>();
        }
        return this.clockCalendarEnterpriseGroup;
    }

    /**
     * Gets the value of the inventoryManagementEnterpriseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryManagementEnterpriseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryManagementEnterpriseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryManagementEnterpriseGroupType }
     * 
     * 
     */
    public List<InventoryManagementEnterpriseGroupType> getInventoryManagementEnterpriseGroup() {
        if (inventoryManagementEnterpriseGroup == null) {
            inventoryManagementEnterpriseGroup = new ArrayList<InventoryManagementEnterpriseGroupType>();
        }
        return this.inventoryManagementEnterpriseGroup;
    }

    /**
     * Gets the value of the maintenanceEnterpriseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceEnterpriseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceEnterpriseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceEnterpriseGroup }
     * 
     * 
     */
    public List<MaintenanceEnterpriseGroup> getMaintenanceEnterpriseGroup() {
        if (maintenanceEnterpriseGroup == null) {
            maintenanceEnterpriseGroup = new ArrayList<MaintenanceEnterpriseGroup>();
        }
        return this.maintenanceEnterpriseGroup;
    }

    /**
     * Gets the value of the monitorEnterpriseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitorEnterpriseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitorEnterpriseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitorEnterpriseGroupType }
     * 
     * 
     */
    public List<MonitorEnterpriseGroupType> getMonitorEnterpriseGroup() {
        if (monitorEnterpriseGroup == null) {
            monitorEnterpriseGroup = new ArrayList<MonitorEnterpriseGroupType>();
        }
        return this.monitorEnterpriseGroup;
    }

    /**
     * Gets the value of the securityEnterpriseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityEnterpriseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityEnterpriseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityEnterpriseGroupType }
     * 
     * 
     */
    public List<SecurityEnterpriseGroupType> getSecurityEnterpriseGroup() {
        if (securityEnterpriseGroup == null) {
            securityEnterpriseGroup = new ArrayList<SecurityEnterpriseGroupType>();
        }
        return this.securityEnterpriseGroup;
    }

    /**
     * Gets the value of the utilityManagementEnterpriseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilityManagementEnterpriseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilityManagementEnterpriseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UtilityManagementEnterpriseGroupType }
     * 
     * 
     */
    public List<UtilityManagementEnterpriseGroupType> getUtilityManagementEnterpriseGroup() {
        if (utilityManagementEnterpriseGroup == null) {
            utilityManagementEnterpriseGroup = new ArrayList<UtilityManagementEnterpriseGroupType>();
        }
        return this.utilityManagementEnterpriseGroup;
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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityCodeEnumeration }
     *     
     */
    public SeverityCodeEnumeration getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityCodeEnumeration }
     *     
     */
    public void setSeverity(SeverityCodeEnumeration value) {
        this.severity = value;
    }

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMajorVersion() {
        if (majorVersion == null) {
            return  1;
        } else {
            return majorVersion;
        }
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMajorVersion(Integer value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMinorVersion() {
        if (minorVersion == null) {
            return  0;
        } else {
            return minorVersion;
        }
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinorVersion(Integer value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the fixVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getFixVersion() {
        if (fixVersion == null) {
            return  0;
        } else {
            return fixVersion;
        }
    }

    /**
     * Sets the value of the fixVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFixVersion(Integer value) {
        this.fixVersion = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("administrationEnterpriseGroup", this.administrationEnterpriseGroup);
        struct.put("assetManagementEnterpriseGroup", this.assetManagementEnterpriseGroup);
        struct.put("bulkTransferEnterpriseGroup", this.bulkTransferEnterpriseGroup);
        struct.put("clockCalendarEnterpriseGroup", this.clockCalendarEnterpriseGroup);
        struct.put("inventoryManagementEnterpriseGroup", this.inventoryManagementEnterpriseGroup);
        struct.put("maintenanceEnterpriseGroup", this.maintenanceEnterpriseGroup);
        struct.put("monitorEnterpriseGroup", this.monitorEnterpriseGroup);
        struct.put("securityEnterpriseGroup", this.securityEnterpriseGroup);
        struct.put("utilityManagementEnterpriseGroup", this.utilityManagementEnterpriseGroup);
        struct.put("any", this.any);
        struct.put("severity", this.severity);
        struct.put("majorVersion", this.majorVersion);
        struct.put("minorVersion", this.minorVersion);
        struct.put("fixVersion", this.fixVersion);
        return struct;
    }

}
