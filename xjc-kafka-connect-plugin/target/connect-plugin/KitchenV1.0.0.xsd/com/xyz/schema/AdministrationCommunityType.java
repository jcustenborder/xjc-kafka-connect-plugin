
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Contains the community names that are supported by an SNMP agent and
 *                 thier associated access levels
 * 
 * <p>Java class for AdministrationCommunityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrationCommunityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntryIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CommunityName" type="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMString32"/&gt;
 *         &lt;element name="AccessLevel" type="{http://www.nrf-arts.org/IXRetail/namespace/}AdminAccessTypeCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrationCommunityType", propOrder = {
    "entryIndex",
    "communityName",
    "accessLevel"
})
public class AdministrationCommunityType {

    @XmlElement(name = "EntryIndex")
    protected int entryIndex;
    @XmlElement(name = "CommunityName", required = true)
    protected String communityName;
    @XmlElement(name = "AccessLevel", required = true)
    protected String accessLevel;
    public final static Schema CONNECT_SCHEMA;

    static AdministrationCommunityType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.AdministrationCommunityType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.int32();
        fieldBuilder.optional();
        builder.field("EntryIndex", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("CommunityName", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("AccessLevel", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the entryIndex property.
     * 
     */
    public int getEntryIndex() {
        return entryIndex;
    }

    /**
     * Sets the value of the entryIndex property.
     * 
     */
    public void setEntryIndex(int value) {
        this.entryIndex = value;
    }

    /**
     * Gets the value of the communityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityName() {
        return communityName;
    }

    /**
     * Sets the value of the communityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityName(String value) {
        this.communityName = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("entryIndex", this.entryIndex);
        struct.put("communityName", this.communityName);
        struct.put("accessLevel", this.accessLevel);
        return struct;
    }

}
