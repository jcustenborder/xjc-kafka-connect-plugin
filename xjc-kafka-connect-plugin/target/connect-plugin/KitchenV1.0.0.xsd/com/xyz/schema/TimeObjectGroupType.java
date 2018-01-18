
package com.xyz.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.kafka.connect.data.Date;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * An entry in the clock calendar table
 * 
 * <p>Java class for TimeObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TimeOfDay" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMTime"/&gt;
 *         &lt;element name="Date" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDate"/&gt;
 *         &lt;element name="TimeZone" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMTime"/&gt;
 *         &lt;element name="Daylight" type="{http://www.nrf-arts.org/IXRetail/namespace/}DaylightObjectGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Scheduler" type="{http://www.nrf-arts.org/IXRetail/namespace/}SchedulerObjectGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeObjectGroupType", propOrder = {
    "index",
    "timeOfDay",
    "date",
    "timeZone",
    "daylight",
    "scheduler"
})
public class TimeObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "TimeOfDay", required = true)
    protected BigDecimal timeOfDay;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "TimeZone", required = true)
    protected BigDecimal timeZone;
    @XmlElement(name = "Daylight")
    protected DaylightObjectGroupType daylight;
    @XmlElement(name = "Scheduler")
    protected SchedulerObjectGroupType scheduler;
    public final static Schema CONNECT_SCHEMA;

    static TimeObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.TimeObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("TimeOfDay", fieldBuilder.build());
        fieldBuilder = Date.builder();
        builder.field("Date", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("TimeZone", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Daylight", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Scheduler", fieldBuilder.build());
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
     * Gets the value of the timeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Sets the value of the timeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeOfDay(BigDecimal value) {
        this.timeOfDay = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTimeZone(BigDecimal value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the daylight property.
     * 
     * @return
     *     possible object is
     *     {@link DaylightObjectGroupType }
     *     
     */
    public DaylightObjectGroupType getDaylight() {
        return daylight;
    }

    /**
     * Sets the value of the daylight property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaylightObjectGroupType }
     *     
     */
    public void setDaylight(DaylightObjectGroupType value) {
        this.daylight = value;
    }

    /**
     * Gets the value of the scheduler property.
     * 
     * @return
     *     possible object is
     *     {@link SchedulerObjectGroupType }
     *     
     */
    public SchedulerObjectGroupType getScheduler() {
        return scheduler;
    }

    /**
     * Sets the value of the scheduler property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchedulerObjectGroupType }
     *     
     */
    public void setScheduler(SchedulerObjectGroupType value) {
        this.scheduler = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("timeOfDay", this.timeOfDay);
        struct.put("date", this.date);
        struct.put("timeZone", this.timeZone);
        struct.put("daylight", this.daylight);
        struct.put("scheduler", this.scheduler);
        return struct;
    }

}
