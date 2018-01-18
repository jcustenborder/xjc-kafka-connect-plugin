
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
 * <p>Java class for MaintenanceUnscheduledItemObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceUnscheduledItemObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnscheduledItemConfiguration" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceUnscheduledItemConfigurationObjectGroupType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="UnscheduledItemData" type="{http://www.nrf-arts.org/IXRetail/namespace/}MaintenanceUnscheduledItemDataObjectGroupType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceUnscheduledItemObjectGroupType", propOrder = {
    "unscheduledItemConfiguration",
    "unscheduledItemData"
})
public class MaintenanceUnscheduledItemObjectGroupType
    implements Connectable
{

    @XmlElement(name = "UnscheduledItemConfiguration", required = true)
    protected List<MaintenanceUnscheduledItemConfigurationObjectGroupType> unscheduledItemConfiguration;
    @XmlElement(name = "UnscheduledItemData", required = true)
    protected List<MaintenanceUnscheduledItemDataObjectGroupType> unscheduledItemData;
    public final static Schema CONNECT_SCHEMA;

    static MaintenanceUnscheduledItemObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MaintenanceUnscheduledItemObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("UnscheduledItemConfiguration", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("UnscheduledItemData", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the unscheduledItemConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unscheduledItemConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnscheduledItemConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceUnscheduledItemConfigurationObjectGroupType }
     * 
     * 
     */
    public List<MaintenanceUnscheduledItemConfigurationObjectGroupType> getUnscheduledItemConfiguration() {
        if (unscheduledItemConfiguration == null) {
            unscheduledItemConfiguration = new ArrayList<MaintenanceUnscheduledItemConfigurationObjectGroupType>();
        }
        return this.unscheduledItemConfiguration;
    }

    /**
     * Gets the value of the unscheduledItemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unscheduledItemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnscheduledItemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceUnscheduledItemDataObjectGroupType }
     * 
     * 
     */
    public List<MaintenanceUnscheduledItemDataObjectGroupType> getUnscheduledItemData() {
        if (unscheduledItemData == null) {
            unscheduledItemData = new ArrayList<MaintenanceUnscheduledItemDataObjectGroupType>();
        }
        return this.unscheduledItemData;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("unscheduledItemConfiguration", this.unscheduledItemConfiguration);
        struct.put("unscheduledItemData", this.unscheduledItemData);
        return struct;
    }

}
