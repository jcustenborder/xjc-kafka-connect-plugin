
package com.xyz.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * An entry in the startup and shutdown table
 * 
 * <p>Java class for SchedulerObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchedulerObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StartupTime" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMTime"/&gt;
 *         &lt;element name="SetbackTime" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMTime"/&gt;
 *         &lt;element name="ShutdownTime" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchedulerObjectGroupType", propOrder = {
    "index",
    "startupTime",
    "setbackTime",
    "shutdownTime"
})
public class SchedulerObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "StartupTime", required = true)
    protected BigDecimal startupTime;
    @XmlElement(name = "SetbackTime", required = true)
    protected BigDecimal setbackTime;
    @XmlElement(name = "ShutdownTime", required = true)
    protected BigDecimal shutdownTime;
    public final static Schema CONNECT_SCHEMA;

    static SchedulerObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.SchedulerObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("StartupTime", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("SetbackTime", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("ShutdownTime", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the startupTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartupTime() {
        return startupTime;
    }

    /**
     * Sets the value of the startupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartupTime(BigDecimal value) {
        this.startupTime = value;
    }

    /**
     * Gets the value of the setbackTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSetbackTime() {
        return setbackTime;
    }

    /**
     * Sets the value of the setbackTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSetbackTime(BigDecimal value) {
        this.setbackTime = value;
    }

    /**
     * Gets the value of the shutdownTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShutdownTime() {
        return shutdownTime;
    }

    /**
     * Sets the value of the shutdownTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShutdownTime(BigDecimal value) {
        this.shutdownTime = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("startupTime", this.startupTime);
        struct.put("setbackTime", this.setbackTime);
        struct.put("shutdownTime", this.shutdownTime);
        return struct;
    }

}
