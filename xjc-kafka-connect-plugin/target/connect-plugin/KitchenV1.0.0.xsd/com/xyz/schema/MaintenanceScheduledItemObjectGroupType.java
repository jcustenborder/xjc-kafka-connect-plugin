
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
 * Entry into maintenance scheduled items table
 * 
 * <p>Java class for MaintenanceScheduledItemObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceScheduledItemObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScheduledItemConfiguation" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceScheduledItemConfigurationObjectGroupType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ScheduledItemData" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceScheduledItemDataObjectGroupType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceScheduledItemObjectGroupType", propOrder = {
    "scheduledItemConfiguation",
    "scheduledItemData"
})
public class MaintenanceScheduledItemObjectGroupType
    implements Connectable
{

    @XmlElement(name = "ScheduledItemConfiguation", required = true)
    protected List<MaintenanceScheduledItemConfigurationObjectGroupType> scheduledItemConfiguation;
    @XmlElement(name = "ScheduledItemData", required = true)
    protected List<MaintenanceScheduledItemDataObjectGroupType> scheduledItemData;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceScheduledItemObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceScheduledItemObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("ScheduledItemConfiguation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ScheduledItemData", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the scheduledItemConfiguation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledItemConfiguation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledItemConfiguation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceScheduledItemConfigurationObjectGroupType }
     * 
     * 
     */
    public List<MaintenanceScheduledItemConfigurationObjectGroupType> getScheduledItemConfiguation() {
        if (scheduledItemConfiguation == null) {
            scheduledItemConfiguation = new ArrayList<MaintenanceScheduledItemConfigurationObjectGroupType>();
        }
        return this.scheduledItemConfiguation;
    }

    /**
     * Gets the value of the scheduledItemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledItemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledItemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceScheduledItemDataObjectGroupType }
     * 
     * 
     */
    public List<MaintenanceScheduledItemDataObjectGroupType> getScheduledItemData() {
        if (scheduledItemData == null) {
            scheduledItemData = new ArrayList<MaintenanceScheduledItemDataObjectGroupType>();
        }
        return this.scheduledItemData;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("scheduledItemConfiguation", this.scheduledItemConfiguation);
        struct.put("scheduledItemData", this.scheduledItemData);
        return struct;
    }

}
