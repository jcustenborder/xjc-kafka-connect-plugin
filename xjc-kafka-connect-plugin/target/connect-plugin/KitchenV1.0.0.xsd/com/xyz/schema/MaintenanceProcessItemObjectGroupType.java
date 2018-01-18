
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Entry into maintenance process items table
 * 
 * <p>Java class for MaintenanceProcessItemObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceProcessItemObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessItemConfiguration" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceProcessItemConfigurationObjectGroupType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ProcessItemData" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceProcessItemObjectGroupType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ProcessItemAlarm" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceProcessItemAlarmObjectGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceProcessItemObjectGroupType", propOrder = {
    "processItemConfiguration",
    "processItemData",
    "processItemAlarm"
})
public class MaintenanceProcessItemObjectGroupType
    implements Connectable
{

    @XmlElement(name = "ProcessItemConfiguration", required = true)
    protected List<MaintenanceProcessItemConfigurationObjectGroupType> processItemConfiguration;
    @XmlElement(name = "ProcessItemData", required = true)
    protected List<MaintenanceProcessItemObjectGroupType> processItemData;
    @XmlElement(name = "ProcessItemAlarm")
    protected List<MaintenanceProcessItemAlarmObjectGroupType> processItemAlarm;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceProcessItemObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceProcessItemObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("ProcessItemConfiguration", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ProcessItemData", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ProcessItemAlarm", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the processItemConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processItemConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessItemConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceProcessItemConfigurationObjectGroupType }
     * 
     * 
     */
    public List<MaintenanceProcessItemConfigurationObjectGroupType> getProcessItemConfiguration() {
        if (processItemConfiguration == null) {
            processItemConfiguration = new ArrayList<MaintenanceProcessItemConfigurationObjectGroupType>();
        }
        return this.processItemConfiguration;
    }

    /**
     * Gets the value of the processItemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processItemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessItemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceProcessItemObjectGroupType }
     * 
     * 
     */
    public List<MaintenanceProcessItemObjectGroupType> getProcessItemData() {
        if (processItemData == null) {
            processItemData = new ArrayList<MaintenanceProcessItemObjectGroupType>();
        }
        return this.processItemData;
    }

    /**
     * Gets the value of the processItemAlarm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processItemAlarm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessItemAlarm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceProcessItemAlarmObjectGroupType }
     * 
     * 
     */
    public List<MaintenanceProcessItemAlarmObjectGroupType> getProcessItemAlarm() {
        if (processItemAlarm == null) {
            processItemAlarm = new ArrayList<MaintenanceProcessItemAlarmObjectGroupType>();
        }
        return this.processItemAlarm;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("processItemConfiguration", this.processItemConfiguration);
        struct.put("processItemData", this.processItemData);
        struct.put("processItemAlarm", this.processItemAlarm);
        return struct;
    }

}
