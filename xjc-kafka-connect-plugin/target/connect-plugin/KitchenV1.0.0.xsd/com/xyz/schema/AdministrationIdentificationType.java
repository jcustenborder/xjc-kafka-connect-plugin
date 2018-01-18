
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Information required by teh system to identify the
 *             agent
 * 
 * <p>Java class for AdministrationIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrationIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgentName" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="HostManufacturerName" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="AgentSoftwareVersion" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString8"/&gt;
 *         &lt;element name="SNMPVersion" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString8"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrationIdentificationType", propOrder = {
    "agentName",
    "hostManufacturerName",
    "agentSoftwareVersion",
    "snmpVersion"
})
public class AdministrationIdentificationType
    implements Connectable
{

    @XmlElement(name = "AgentName", required = true)
    protected String agentName;
    @XmlElement(name = "HostManufacturerName", required = true)
    protected String hostManufacturerName;
    @XmlElement(name = "AgentSoftwareVersion", required = true)
    protected String agentSoftwareVersion;
    @XmlElement(name = "SNMPVersion", required = true)
    protected String snmpVersion;
    public final static Schema CONNECT_SCHEMA;

    static AdministrationIdentificationType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.AdministrationIdentificationType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("AgentName", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("HostManufacturerName", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("AgentSoftwareVersion", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("SNMPVersion", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * Gets the value of the hostManufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostManufacturerName() {
        return hostManufacturerName;
    }

    /**
     * Sets the value of the hostManufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostManufacturerName(String value) {
        this.hostManufacturerName = value;
    }

    /**
     * Gets the value of the agentSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSoftwareVersion() {
        return agentSoftwareVersion;
    }

    /**
     * Sets the value of the agentSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSoftwareVersion(String value) {
        this.agentSoftwareVersion = value;
    }

    /**
     * Gets the value of the snmpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNMPVersion() {
        return snmpVersion;
    }

    /**
     * Sets the value of the snmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNMPVersion(String value) {
        this.snmpVersion = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("agentName", this.agentName);
        struct.put("hostManufacturerName", this.hostManufacturerName);
        struct.put("agentSoftwareVersion", this.agentSoftwareVersion);
        struct.put("snmpVersion", this.snmpVersion);
        return struct;
    }

}
