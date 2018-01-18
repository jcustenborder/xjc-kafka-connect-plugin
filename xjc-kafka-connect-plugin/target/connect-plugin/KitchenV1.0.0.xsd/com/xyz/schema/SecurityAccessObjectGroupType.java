
package com.xyz.schema;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Entry into table of logging parameters
 * 
 * <p>Java class for SecurityAccessObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityAccessObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="Area" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="State" type="{http://www.nrf-arts.org/IXRetail/namespace/}AccessStateType"/&gt;
 *         &lt;element name="Status" type="{http://www.nrf-arts.org/IXRetail/namespace/}AccessStatusType"/&gt;
 *         &lt;element name="StartTime" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMTime"/&gt;
 *         &lt;element name="TerminateTime" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMTime"/&gt;
 *         &lt;element name="EarlyStart" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMInterval"/&gt;
 *         &lt;element name="LateTerminate" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMInterval"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Force" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityAccessObjectGroupType", propOrder = {
    "index",
    "name",
    "area",
    "state",
    "status",
    "startTime",
    "terminateTime",
    "earlyStart",
    "lateTerminate"
})
public class SecurityAccessObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Area", required = true)
    protected String area;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "StartTime", required = true)
    protected BigDecimal startTime;
    @XmlElement(name = "TerminateTime", required = true)
    protected BigDecimal terminateTime;
    @XmlElement(name = "EarlyStart", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger earlyStart;
    @XmlElement(name = "LateTerminate", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lateTerminate;
    @XmlAttribute(name = "Force", required = true)
    protected boolean force;
    public final static Schema CONNECT_SCHEMA;

    static SecurityAccessObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.SecurityAccessObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Name", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Area", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("State", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Status", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("StartTime", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("TerminateTime", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("EarlyStart", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("LateTerminate", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Force", fieldBuilder.build());
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
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartTime(BigDecimal value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the terminateTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTerminateTime() {
        return terminateTime;
    }

    /**
     * Sets the value of the terminateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTerminateTime(BigDecimal value) {
        this.terminateTime = value;
    }

    /**
     * Gets the value of the earlyStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEarlyStart() {
        return earlyStart;
    }

    /**
     * Sets the value of the earlyStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEarlyStart(BigInteger value) {
        this.earlyStart = value;
    }

    /**
     * Gets the value of the lateTerminate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLateTerminate() {
        return lateTerminate;
    }

    /**
     * Sets the value of the lateTerminate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLateTerminate(BigInteger value) {
        this.lateTerminate = value;
    }

    /**
     * Gets the value of the force property.
     * 
     */
    public boolean isForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     */
    public void setForce(boolean value) {
        this.force = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("name", this.name);
        struct.put("area", this.area);
        struct.put("state", this.state);
        struct.put("status", this.status);
        struct.put("startTime", this.startTime);
        struct.put("terminateTime", this.terminateTime);
        struct.put("earlyStart", this.earlyStart);
        struct.put("lateTerminate", this.lateTerminate);
        struct.put("force", this.force);
        return struct;
    }

}
