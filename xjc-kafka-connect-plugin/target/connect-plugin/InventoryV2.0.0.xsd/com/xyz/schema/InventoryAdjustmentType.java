
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.github.jcustenborder.kafka.connect.xml.Connectable;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for InventoryAdjustmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryAdjustmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InventoryPosition" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryPositionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdjustmentQuantity" type="{http://www.nrf-arts.org/IXRetail/namespace/}QuantityCommonData"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Action" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryAdjustmentAction" default="Subtract" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryAdjustmentType", propOrder = {
    "inventoryPosition",
    "adjustmentQuantity"
})
public class InventoryAdjustmentType
    implements Connectable
{

    @XmlElement(name = "InventoryPosition")
    protected List<InventoryPositionType> inventoryPosition;
    @XmlElement(name = "AdjustmentQuantity", required = true)
    protected QuantityCommonData adjustmentQuantity;
    @XmlAttribute(name = "Action")
    protected String action;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryAdjustmentType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.array(InventoryPositionType.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("InventoryPosition", fieldBuilder.build());
        fieldBuilder = QuantityCommonData.CONNECT_SCHEMA;
        builder.field("AdjustmentQuantity", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Action", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the inventoryPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryPositionType }
     * 
     * 
     */
    public List<InventoryPositionType> getInventoryPosition() {
        if (inventoryPosition == null) {
            inventoryPosition = new ArrayList<InventoryPositionType>();
        }
        return this.inventoryPosition;
    }

    /**
     * Gets the value of the adjustmentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityCommonData }
     *     
     */
    public QuantityCommonData getAdjustmentQuantity() {
        return adjustmentQuantity;
    }

    /**
     * Sets the value of the adjustmentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityCommonData }
     *     
     */
    public void setAdjustmentQuantity(QuantityCommonData value) {
        this.adjustmentQuantity = value;
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
        if (action == null) {
            return "Subtract";
        } else {
            return action;
        }
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

    @Override
    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getInventoryPosition()) {
            List<Struct> structs = new ArrayList();
            for (InventoryPositionType o: this.getInventoryPosition()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("InventoryPosition", structs);
        }
        if (null!= this.getAdjustmentQuantity()) {
            struct.put("AdjustmentQuantity", this.getAdjustmentQuantity().toConnectStruct());
        } else {
            struct.put("AdjustmentQuantity", null);
        }
        struct.put("Action", this.getAction());
        return struct;
    }

}
