
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Timestamp;


/**
 * An entry in the daylight savings table.
 * 
 * <p>Java class for DaylightObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaylightObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StartDateForDaylightSavings" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDateTime"/&gt;
 *         &lt;element name="EndDateForDaylightSavings" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMDateTime"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Enable" use="required" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaylightObjectGroupType", propOrder = {
    "index",
    "startDateForDaylightSavings",
    "endDateForDaylightSavings",
    "latitude",
    "longitude"
})
public class DaylightObjectGroupType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "StartDateForDaylightSavings", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateForDaylightSavings;
    @XmlElement(name = "EndDateForDaylightSavings", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateForDaylightSavings;
    @XmlElement(name = "Latitude")
    protected int latitude;
    @XmlElement(name = "Longitude")
    protected int longitude;
    @XmlAttribute(name = "Enable", required = true)
    protected boolean enable;
    public final static Schema CONNECT_SCHEMA;

    static DaylightObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.DaylightObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        builder.field("StartDateForDaylightSavings", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        builder.field("EndDateForDaylightSavings", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Latitude", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Longitude", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Enable", fieldBuilder.build());
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
     * Gets the value of the startDateForDaylightSavings property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateForDaylightSavings() {
        return startDateForDaylightSavings;
    }

    /**
     * Sets the value of the startDateForDaylightSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateForDaylightSavings(XMLGregorianCalendar value) {
        this.startDateForDaylightSavings = value;
    }

    /**
     * Gets the value of the endDateForDaylightSavings property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateForDaylightSavings() {
        return endDateForDaylightSavings;
    }

    /**
     * Sets the value of the endDateForDaylightSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateForDaylightSavings(XMLGregorianCalendar value) {
        this.endDateForDaylightSavings = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public int getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(int value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(int value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the enable property.
     * 
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("startDateForDaylightSavings", this.startDateForDaylightSavings);
        struct.put("endDateForDaylightSavings", this.endDateForDaylightSavings);
        struct.put("latitude", this.latitude);
        struct.put("longitude", this.longitude);
        struct.put("enable", this.enable);
        return struct;
    }

}
