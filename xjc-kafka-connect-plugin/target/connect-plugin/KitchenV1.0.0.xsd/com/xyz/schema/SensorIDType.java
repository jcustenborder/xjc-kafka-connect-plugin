
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for SensorIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensorIDType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="REM" type="{http://www.nrf-arts.org/IXRetail/namespace/}REMTypeCode" /&gt;
 *       &lt;attribute name="UnifiedPOS" type="{http://www.nrf-arts.org/IXRetail/namespace/}UnifiedPOSTypeCodeEnumeration" /&gt;
 *       &lt;attribute name="IFSF" type="{http://www.nrf-arts.org/IXRetail/namespace/}IFSFTypeCode" /&gt;
 *       &lt;attribute name="IETF" type="{http://www.nrf-arts.org/IXRetail/namespace/}IETFTypeCode" /&gt;
 *       &lt;attribute name="NAFEM" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMTypeCode" /&gt;
 *       &lt;attribute name="LonMark" type="{http://www.nrf-arts.org/IXRetail/namespace/}LonMarkTypeCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensorIDType", propOrder = {
    "value"
})
public class SensorIDType
    implements Connectable
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "REM")
    protected String rem;
    @XmlAttribute(name = "UnifiedPOS")
    protected UnifiedPOSTypeCodeEnumeration unifiedPOS;
    @XmlAttribute(name = "IFSF")
    protected String ifsf;
    @XmlAttribute(name = "IETF")
    protected String ietf;
    @XmlAttribute(name = "NAFEM")
    protected String nafem;
    @XmlAttribute(name = "LonMark")
    protected String lonMark;
    public final static Schema CONNECT_SCHEMA;

    static SensorIDType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.SensorIDType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("value", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Name", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("REM", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("UnifiedPOS", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("IFSF", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("IETF", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("NAFEM", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("LonMark", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREM() {
        return rem;
    }

    /**
     * Sets the value of the rem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREM(String value) {
        this.rem = value;
    }

    /**
     * Gets the value of the unifiedPOS property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPOSTypeCodeEnumeration }
     *     
     */
    public UnifiedPOSTypeCodeEnumeration getUnifiedPOS() {
        return unifiedPOS;
    }

    /**
     * Sets the value of the unifiedPOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPOSTypeCodeEnumeration }
     *     
     */
    public void setUnifiedPOS(UnifiedPOSTypeCodeEnumeration value) {
        this.unifiedPOS = value;
    }

    /**
     * Gets the value of the ifsf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFSF() {
        return ifsf;
    }

    /**
     * Sets the value of the ifsf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFSF(String value) {
        this.ifsf = value;
    }

    /**
     * Gets the value of the ietf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIETF() {
        return ietf;
    }

    /**
     * Sets the value of the ietf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIETF(String value) {
        this.ietf = value;
    }

    /**
     * Gets the value of the nafem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAFEM() {
        return nafem;
    }

    /**
     * Sets the value of the nafem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAFEM(String value) {
        this.nafem = value;
    }

    /**
     * Gets the value of the lonMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLonMark() {
        return lonMark;
    }

    /**
     * Sets the value of the lonMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLonMark(String value) {
        this.lonMark = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("value", this.value);
        struct.put("name", this.name);
        struct.put("rem", this.rem);
        struct.put("unifiedPOS", this.unifiedPOS);
        struct.put("ifsf", this.ifsf);
        struct.put("ietf", this.ietf);
        struct.put("nafem", this.nafem);
        struct.put("lonMark", this.lonMark);
        return struct;
    }

}
