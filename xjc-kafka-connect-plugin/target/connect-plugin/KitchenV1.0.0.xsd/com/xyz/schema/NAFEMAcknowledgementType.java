
package com.xyz.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * defines the parameters by which the manager must acknowledge recept of
 *                 a notify message indicating an alarm behavior
 * 
 * <p>Java class for NAFEMAcknowledgementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAFEMAcknowledgementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Interval" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMInterval"/&gt;
 *         &lt;element name="Retries" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Acknowledge" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMChoice" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAFEMAcknowledgementType", propOrder = {
    "index",
    "interval",
    "retries",
    "response"
})
@XmlSeeAlso({
    AdministrationAcknowledgementType.class,
    BulkTransferAcknowledgementObjectGroupType.class,
    InventoryAcknowledgementObjectGroupType.class,
    MaintenanceAcknowledgeObjectGroupType.class,
    MonitorAcknowledgeObjectGroupType.class,
    SecurityAcknowledgeObjectGroupType.class,
    UtilityAcknowledgeObjectGroupType.class
})
public class NAFEMAcknowledgementType
    implements Connectable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Interval", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger interval;
    @XmlElement(name = "Retries")
    protected int retries;
    @XmlElement(name = "Response", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String response;
    @XmlAttribute(name = "Acknowledge")
    protected Boolean acknowledge;
    public final static Schema CONNECT_SCHEMA;

    static NAFEMAcknowledgementType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.NAFEMAcknowledgementType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Index", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("Interval", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Retries", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Response", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Acknowledge", fieldBuilder.build());
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
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInterval(BigInteger value) {
        this.interval = value;
    }

    /**
     * Gets the value of the retries property.
     * 
     */
    public int getRetries() {
        return retries;
    }

    /**
     * Sets the value of the retries property.
     * 
     */
    public void setRetries(int value) {
        this.retries = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

    /**
     * Gets the value of the acknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcknowledge() {
        return acknowledge;
    }

    /**
     * Sets the value of the acknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcknowledge(Boolean value) {
        this.acknowledge = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("index", this.index);
        struct.put("interval", this.interval);
        struct.put("retries", this.retries);
        struct.put("response", this.response);
        struct.put("acknowledge", this.acknowledge);
        return struct;
    }

}
