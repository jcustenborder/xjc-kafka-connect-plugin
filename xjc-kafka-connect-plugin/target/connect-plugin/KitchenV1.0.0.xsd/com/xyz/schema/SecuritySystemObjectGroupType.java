
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for SecuritySystemObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecuritySystemObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Service" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="Tampered" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *       &lt;attribute name="Reset" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritySystemObjectGroupType")
public class SecuritySystemObjectGroupType
    implements Connectable
{

    @XmlAttribute(name = "Service")
    protected Boolean service;
    @XmlAttribute(name = "Tampered", required = true)
    protected boolean tampered;
    @XmlAttribute(name = "Reset")
    protected Boolean reset;
    public final static Schema CONNECT_SCHEMA;

    static SecuritySystemObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.SecuritySystemObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Service", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Tampered", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Reset", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setService(Boolean value) {
        this.service = value;
    }

    /**
     * Gets the value of the tampered property.
     * 
     */
    public boolean isTampered() {
        return tampered;
    }

    /**
     * Sets the value of the tampered property.
     * 
     */
    public void setTampered(boolean value) {
        this.tampered = value;
    }

    /**
     * Gets the value of the reset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReset() {
        return reset;
    }

    /**
     * Sets the value of the reset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReset(Boolean value) {
        this.reset = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("service", this.service);
        struct.put("tampered", this.tampered);
        struct.put("reset", this.reset);
        return struct;
    }

}
