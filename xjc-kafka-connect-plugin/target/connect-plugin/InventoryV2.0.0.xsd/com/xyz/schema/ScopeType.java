
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.github.jcustenborder.kafka.connect.xml.Connectable;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for ScopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InventoryLocation" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryLocationType"/&gt;
 *         &lt;element name="MerchandiseHierarchy"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MerchandiseHierarchyCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScopeType", propOrder = {
    "inventoryLocation",
    "merchandiseHierarchy"
})
public class ScopeType
    implements Connectable
{

    @XmlElement(name = "InventoryLocation", required = true)
    protected InventoryLocationType inventoryLocation;
    @XmlElement(name = "MerchandiseHierarchy", required = true)
    protected ScopeType.MerchandiseHierarchy merchandiseHierarchy;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.ScopeType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = InventoryLocationType.CONNECT_SCHEMA;
        builder.field("InventoryLocation", fieldBuilder.build());
        fieldBuilder = ScopeType.MerchandiseHierarchy.CONNECT_SCHEMA;
        builder.field("MerchandiseHierarchy", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocationType }
     *     
     */
    public InventoryLocationType getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Sets the value of the inventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocationType }
     *     
     */
    public void setInventoryLocation(InventoryLocationType value) {
        this.inventoryLocation = value;
    }

    /**
     * Gets the value of the merchandiseHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeType.MerchandiseHierarchy }
     *     
     */
    public ScopeType.MerchandiseHierarchy getMerchandiseHierarchy() {
        return merchandiseHierarchy;
    }

    /**
     * Sets the value of the merchandiseHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeType.MerchandiseHierarchy }
     *     
     */
    public void setMerchandiseHierarchy(ScopeType.MerchandiseHierarchy value) {
        this.merchandiseHierarchy = value;
    }

    @Override
    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getInventoryLocation()) {
            struct.put("InventoryLocation", this.getInventoryLocation().toConnectStruct());
        } else {
            struct.put("InventoryLocation", null);
        }
        if (null!= this.getMerchandiseHierarchy()) {
            struct.put("MerchandiseHierarchy", this.getMerchandiseHierarchy().toConnectStruct());
        } else {
            struct.put("MerchandiseHierarchy", null);
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;MerchandiseHierarchyCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MerchandiseHierarchy
        extends MerchandiseHierarchyCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.MerchandiseHierarchy");
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
