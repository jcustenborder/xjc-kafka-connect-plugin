
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for UpdateStatisticsCommonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStatisticsCommonData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Statistic" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStatisticsCommonData", propOrder = {
    "statistic"
})
public class UpdateStatisticsCommonData
    implements Connectable
{

    @XmlElement(name = "Statistic", required = true)
    protected List<Object> statistic;
    public final static Schema CONNECT_SCHEMA;

    static UpdateStatisticsCommonData() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.UpdateStatisticsCommonData");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("Statistic", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the statistic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statistic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatistic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getStatistic() {
        if (statistic == null) {
            statistic = new ArrayList<Object>();
        }
        return this.statistic;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("statistic", this.statistic);
        return struct;
    }

}
