
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for BusinessErrorCommonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessErrorCommonData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Description" type="{http://www.nrf-arts.org/IXRetail/namespace/}DescriptionCommonData" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="RelatedErrorID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Severity" type="{http://www.nrf-arts.org/IXRetail/namespace/}SeverityCodeType" default="Information" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessErrorCommonData", propOrder = {
    "errorID",
    "code",
    "description",
    "relatedErrorID"
})
@XmlSeeAlso({
    com.xyz.schema.ResponseCommonData.BusinessError.class
})
public class BusinessErrorCommonData {

    @XmlElement(name = "ErrorID")
    protected String errorID;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected DescriptionCommonData description;
    @XmlElement(name = "RelatedErrorID")
    protected List<String> relatedErrorID;
    @XmlAttribute(name = "Severity")
    protected String severity;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.BusinessErrorCommonData");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ErrorID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Code", fieldBuilder.build());
        fieldBuilder = DescriptionCommonData.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("Description", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(String.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("RelatedErrorID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Severity", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the errorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorID() {
        return errorID;
    }

    /**
     * Sets the value of the errorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorID(String value) {
        this.errorID = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionCommonData }
     *     
     */
    public DescriptionCommonData getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionCommonData }
     *     
     */
    public void setDescription(DescriptionCommonData value) {
        this.description = value;
    }

    /**
     * Gets the value of the relatedErrorID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedErrorID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedErrorID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelatedErrorID() {
        if (relatedErrorID == null) {
            relatedErrorID = new ArrayList<String>();
        }
        return this.relatedErrorID;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        if (severity == null) {
            return "Information";
        } else {
            return severity;
        }
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("ErrorID", this.getErrorID());
        struct.put("Code", this.getCode());
        if (null!= this.getDescription()) {
            struct.put("Description", this.getDescription().toConnectStruct());
        } else {
            struct.put("Description", null);
        }
        if (null!= this.getRelatedErrorID()) {
            List<Struct> structs = new ArrayList();
            for (String o: this.getRelatedErrorID()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("RelatedErrorID", structs);
        }
        struct.put("Severity", this.getSeverity());
        return struct;
    }

}
