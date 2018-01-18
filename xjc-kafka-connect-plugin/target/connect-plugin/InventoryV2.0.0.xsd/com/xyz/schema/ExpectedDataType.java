
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
 * <p>Java class for ExpectedDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InventoryItem" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedDataType", propOrder = {
    "inventoryItem"
})
public class ExpectedDataType {

    @XmlElement(name = "InventoryItem", required = true)
    protected List<InventoryItemType> inventoryItem;
    public final static Schema CONNECT_SCHEMA;

    static ExpectedDataType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.ExpectedDataType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.array(InventoryItemType.CONNECT_SCHEMA);
        builder.field("InventoryItem", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the inventoryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryItemType }
     * 
     * 
     */
    public List<InventoryItemType> getInventoryItem() {
        if (inventoryItem == null) {
            inventoryItem = new ArrayList<InventoryItemType>();
        }
        return this.inventoryItem;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getInventoryItem()) {
            List<Struct> structs = new ArrayList();
            for (InventoryItemType o: this.getInventoryItem()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("InventoryItem", structs);
        }
        return struct;
    }

}
