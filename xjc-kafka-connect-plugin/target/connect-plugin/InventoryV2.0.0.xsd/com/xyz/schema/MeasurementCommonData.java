
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.github.jcustenborder.kafka.connect.xml.Connectable;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for MeasurementCommonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementCommonData"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
 *       &lt;attribute name="UnitOfMeasure" type="{http://www.nrf-arts.org/IXRetail/namespace/}UnitOfMeasureCodeCommonData" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementCommonData", propOrder = {
    "value"
})
@XmlSeeAlso({
    com.xyz.schema.CycleCountType.BeginningUnitCount.class,
    com.xyz.schema.CycleCountType.GrossSalesUnitCount.class,
    com.xyz.schema.CycleCountType.ReturnUnitCount.class,
    com.xyz.schema.CycleCountType.ReceivedUnitCount.class,
    com.xyz.schema.CycleCountType.ReturnToVendorUnitCount.class,
    com.xyz.schema.CycleCountType.TransferInUnitCount.class,
    com.xyz.schema.CycleCountType.TransferOutUnitCount.class,
    com.xyz.schema.CycleCountType.AdjustmentUnitCount.class,
    com.xyz.schema.CycleCountType.CurrentUnitCount.class,
    com.xyz.schema.CycleCountType.EndingUnitCount.class,
    com.xyz.schema.CycleCountType.Temperature.class
})
public class MeasurementCommonData
    implements Connectable
{

    @XmlValue
    protected float value;
    @XmlAttribute(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.MeasurementCommonData");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.float32();
        fieldBuilder.optional();
        builder.field("value", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UnitOfMeasure", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    @Override
    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("value", this.getValue());
        struct.put("UnitOfMeasure", this.getUnitOfMeasure());
        return struct;
    }

}
