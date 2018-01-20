
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.github.jcustenborder.kafka.connect.xml.Connectable;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * A physical place the retailer stores merchandise. It may be co-located
 *                 at a Site with RetailStore, DistributionCenter, or AdministrativeCenter. It does not
 *                 include containers, ships and trucks that are in transit.
 * 
 * <p>Java class for InventoryLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnit" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;BusinessUnitCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellingLocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExactLocation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="Level" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Location" type="{http://www.nrf-arts.org/IXRetail/namespace/}InventoryLocationCodes" default="Shelf" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryLocationType", propOrder = {
    "businessUnit",
    "sellingLocation",
    "exactLocation"
})
public class InventoryLocationType
    implements Connectable
{

    @XmlElement(name = "BusinessUnit")
    protected List<InventoryLocationType.BusinessUnit> businessUnit;
    @XmlElement(name = "SellingLocation")
    protected List<String> sellingLocation;
    @XmlElement(name = "ExactLocation")
    protected List<InventoryLocationType.ExactLocation> exactLocation;
    @XmlAttribute(name = "Location")
    protected String location;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.InventoryLocationType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.array(InventoryLocationType.BusinessUnit.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("BusinessUnit", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(String.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("SellingLocation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(InventoryLocationType.ExactLocation.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("ExactLocation", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Location", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryLocationType.BusinessUnit }
     * 
     * 
     */
    public List<InventoryLocationType.BusinessUnit> getBusinessUnit() {
        if (businessUnit == null) {
            businessUnit = new ArrayList<InventoryLocationType.BusinessUnit>();
        }
        return this.businessUnit;
    }

    /**
     * Gets the value of the sellingLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellingLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellingLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSellingLocation() {
        if (sellingLocation == null) {
            sellingLocation = new ArrayList<String>();
        }
        return this.sellingLocation;
    }

    /**
     * Gets the value of the exactLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exactLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExactLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryLocationType.ExactLocation }
     * 
     * 
     */
    public List<InventoryLocationType.ExactLocation> getExactLocation() {
        if (exactLocation == null) {
            exactLocation = new ArrayList<InventoryLocationType.ExactLocation>();
        }
        return this.exactLocation;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        if (location == null) {
            return "Shelf";
        } else {
            return location;
        }
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    @Override
    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getBusinessUnit()) {
            List<Struct> structs = new ArrayList();
            for (InventoryLocationType.BusinessUnit o: this.getBusinessUnit()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("BusinessUnit", structs);
        }
        if (null!= this.getSellingLocation()) {
            List<Struct> structs = new ArrayList();
            for (String o: this.getSellingLocation()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("SellingLocation", structs);
        }
        if (null!= this.getExactLocation()) {
            List<Struct> structs = new ArrayList();
            for (InventoryLocationType.ExactLocation o: this.getExactLocation()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("ExactLocation", structs);
        }
        struct.put("Location", this.getLocation());
        return struct;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;BusinessUnitCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BusinessUnit
        extends BusinessUnitCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.BusinessUnit");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        @Override
        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="Level" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ExactLocation
        implements Connectable
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Level")
        protected String level;
        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.ExactLocation");
            builder.optional();
            SchemaBuilder fieldBuilder;
            fieldBuilder = SchemaBuilder.string();
            fieldBuilder.optional();
            builder.field("value", fieldBuilder.build());
            fieldBuilder = SchemaBuilder.string();
            fieldBuilder.optional();
            builder.field("Level", fieldBuilder.build());
            CONNECT_SCHEMA = builder.build();
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLevel(String value) {
            this.level = value;
        }

        @Override
        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            struct.put("value", this.getValue());
            struct.put("Level", this.getLevel());
            return struct;
        }

    }

}
