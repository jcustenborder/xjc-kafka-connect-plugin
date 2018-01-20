
package com.xyz.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.github.jcustenborder.kafka.connect.xml.Connectable;
import org.apache.kafka.connect.data.Decimal;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for QuantityCommonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityCommonData"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *       &lt;attribute name="Units" type="{http://www.w3.org/2001/XMLSchema}decimal" default="1" /&gt;
 *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.nrf-arts.org/IXRetail/namespace/}UnitOfMeasureCodeCommonData" default="EA" /&gt;
 *       &lt;attribute name="EntryMethod" type="{http://www.nrf-arts.org/IXRetail/namespace/}EntryMethodTypeCode" default="Scanned" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityCommonData", propOrder = {
    "value"
})
@XmlSeeAlso({
    com.xyz.schema.InventoryType.Quantity.class,
    com.xyz.schema.InventoryType.QuantityDispatched.class,
    com.xyz.schema.CancellationType.Quantity.class,
    com.xyz.schema.FulfillmentType.Quantity.class,
    com.xyz.schema.InventoryItemType.Quantity.class,
    com.xyz.schema.ItemLocationType.Quantity.class
})
public class QuantityCommonData
    implements Connectable
{

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "Units")
    protected BigDecimal units;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "EntryMethod")
    protected String entryMethod;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.QuantityCommonData");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = Decimal.builder(12);
        fieldBuilder.optional();
        builder.field("value", fieldBuilder.build());
        fieldBuilder = Decimal.builder(12);
        fieldBuilder.optional();
        builder.field("Units", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UnitOfMeasureCode", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("EntryMethod", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnits() {
        if (units == null) {
            return new BigDecimal("1");
        } else {
            return units;
        }
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnits(BigDecimal value) {
        this.units = value;
    }

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        if (unitOfMeasureCode == null) {
            return "EA";
        } else {
            return unitOfMeasureCode;
        }
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * Gets the value of the entryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryMethod() {
        if (entryMethod == null) {
            return "Scanned";
        } else {
            return entryMethod;
        }
    }

    /**
     * Sets the value of the entryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryMethod(String value) {
        this.entryMethod = value;
    }

    @Override
    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("value", this.getValue());
        struct.put("Units", this.getUnits());
        struct.put("UnitOfMeasureCode", this.getUnitOfMeasureCode());
        struct.put("EntryMethod", this.getEntryMethod());
        return struct;
    }

}
