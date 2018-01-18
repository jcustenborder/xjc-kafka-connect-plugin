
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
 * <p>Java class for InventoryPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryPositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnit" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;BusinessUnitCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Item" type="{http://www.nrf-arts.org/IXRetail/namespace/}ItemLocationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryPositionType", propOrder = {
    "businessUnit",
    "item"
})
public class InventoryPositionType {

    @XmlElement(name = "BusinessUnit", required = true)
    protected List<InventoryPositionType.BusinessUnit> businessUnit;
    @XmlElement(name = "Item", required = true)
    protected List<ItemLocationType> item;
    public final static Schema CONNECT_SCHEMA;

    static InventoryPositionType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryPositionType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.array(InventoryPositionType.BusinessUnit.CONNECT_SCHEMA);
        builder.field("BusinessUnit", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(ItemLocationType.CONNECT_SCHEMA);
        builder.field("Item", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryPositionType.BusinessUnit }
     * 
     * 
     */
    public List<InventoryPositionType.BusinessUnit> getBusinessUnit() {
        if (businessUnit == null) {
            businessUnit = new ArrayList<InventoryPositionType.BusinessUnit>();
        }
        return this.businessUnit;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLocationType }
     * 
     * 
     */
    public List<ItemLocationType> getItem() {
        if (item == null) {
            item = new ArrayList<ItemLocationType>();
        }
        return this.item;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getBusinessUnit()) {
            List<Struct> structs = new ArrayList();
            for (InventoryPositionType.BusinessUnit o: this.getBusinessUnit()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("BusinessUnit", structs);
        }
        if (null!= this.getItem()) {
            List<Struct> structs = new ArrayList();
            for (ItemLocationType o: this.getItem()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("Item", structs);
        }
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;BusinessUnitCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BusinessUnit
        extends BusinessUnitCommonData
    {

        public final static Schema CONNECT_SCHEMA;

        static BusinessUnit() {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.BusinessUnit");
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
