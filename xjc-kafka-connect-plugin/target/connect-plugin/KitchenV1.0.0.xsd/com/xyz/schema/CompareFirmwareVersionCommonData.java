
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for CompareFirmwareVersionCommonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompareFirmwareVersionCommonData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="FirmwareFileName" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="Result" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}UnifiedPOSCompareFirmwareVersionTypeCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareFirmwareVersionCommonData")
public class CompareFirmwareVersionCommonData
    implements Connectable
{

    @XmlAttribute(name = "FirmwareFileName", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String firmwareFileName;
    @XmlAttribute(name = "Result", required = true)
    protected String result;
    public final static Schema CONNECT_SCHEMA;

    static CompareFirmwareVersionCommonData() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.CompareFirmwareVersionCommonData");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("FirmwareFileName", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Result", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the firmwareFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareFileName() {
        return firmwareFileName;
    }

    /**
     * Sets the value of the firmwareFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareFileName(String value) {
        this.firmwareFileName = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("firmwareFileName", this.firmwareFileName);
        struct.put("result", this.result);
        return struct;
    }

}
