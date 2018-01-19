
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}title"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://edutechwiki.unige.ch/en/XML/}cd" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "description",
    "cd"
})
@XmlRootElement(name = "cd-list")
public class CdList {

    @XmlElement(required = true)
    protected String title;
    protected Description description;
    protected List<Cd> cd;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.CdList");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("title", fieldBuilder.build());
        fieldBuilder = Description.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("description", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(Cd.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("cd", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the cd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cd }
     * 
     * 
     */
    public List<Cd> getCd() {
        if (cd == null) {
            cd = new ArrayList<Cd>();
        }
        return this.cd;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("title", this.getTitle());
        if (null!= this.getDescription()) {
            struct.put("description", this.getDescription().toConnectStruct());
        } else {
            struct.put("description", null);
        }
        if (null!= this.getCd()) {
            List<Struct> structs = new ArrayList();
            for (Cd o: this.getCd()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("cd", structs);
        }
        return struct;
    }

}
