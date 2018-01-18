
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Timestamp;


/**
 * <p>Java class for DateTimeCommonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeCommonData"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
 *       &lt;attribute name="TypeCode" type="{http://www.nrf-arts.org/IXRetail/namespace/}DateTimeType" default="Message" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeCommonData", propOrder = {
    "value"
})
@XmlSeeAlso({
    com.xyz.schema.InventoryType.DateTime.class,
    com.xyz.schema.CancellationType.DateTime.class,
    com.xyz.schema.ItemLocationType.DateTime.class
})
public class DateTimeCommonData {

    @XmlValue
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "TypeCode")
    protected String typeCode;
    public final static Schema CONNECT_SCHEMA;

    static DateTimeCommonData() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.DateTimeCommonData");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = Timestamp.builder();
        fieldBuilder.optional();
        builder.field("value", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("TypeCode", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        if (typeCode == null) {
            return "Message";
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("TypeCode", this.getTypeCode());
        return struct;
    }

}
