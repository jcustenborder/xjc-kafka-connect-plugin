
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Information required by the system to connect to the
 *             network
 * 
 * <p>Java class for AdministrationNetworkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrationNetworkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgentIPAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="DefaultGatewayIPAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="SubnetMaskValue" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrationNetworkType", propOrder = {
    "agentIPAddress",
    "defaultGatewayIPAddress",
    "subnetMaskValue"
})
public class AdministrationNetworkType
    implements Connectable
{

    @XmlElement(name = "AgentIPAddress", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String agentIPAddress;
    @XmlElement(name = "DefaultGatewayIPAddress", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String defaultGatewayIPAddress;
    @XmlElement(name = "SubnetMaskValue", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String subnetMaskValue;
    public final static Schema CONNECT_SCHEMA;

    static AdministrationNetworkType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.AdministrationNetworkType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("AgentIPAddress", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("DefaultGatewayIPAddress", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("SubnetMaskValue", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the agentIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentIPAddress() {
        return agentIPAddress;
    }

    /**
     * Sets the value of the agentIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentIPAddress(String value) {
        this.agentIPAddress = value;
    }

    /**
     * Gets the value of the defaultGatewayIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultGatewayIPAddress() {
        return defaultGatewayIPAddress;
    }

    /**
     * Sets the value of the defaultGatewayIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultGatewayIPAddress(String value) {
        this.defaultGatewayIPAddress = value;
    }

    /**
     * Gets the value of the subnetMaskValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnetMaskValue() {
        return subnetMaskValue;
    }

    /**
     * Sets the value of the subnetMaskValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnetMaskValue(String value) {
        this.subnetMaskValue = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("agentIPAddress", this.agentIPAddress);
        struct.put("defaultGatewayIPAddress", this.defaultGatewayIPAddress);
        struct.put("subnetMaskValue", this.subnetMaskValue);
        return struct;
    }

}
