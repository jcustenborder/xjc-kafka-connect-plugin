
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://myrecipes.org/}para"/&gt;
 *         &lt;element ref="{http://myrecipes.org/}bullet"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paraOrBullet"
})
@XmlRootElement(name = "directions")
public class Directions {

    @XmlElements({
        @XmlElement(name = "para", type = Para.class),
        @XmlElement(name = "bullet", type = Bullet.class)
    })
    protected List<Object> paraOrBullet;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.Directions");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.array(Object.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("paraOrBullet", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the paraOrBullet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paraOrBullet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParaOrBullet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Para }
     * {@link Bullet }
     * 
     * 
     */
    public List<Object> getParaOrBullet() {
        if (paraOrBullet == null) {
            paraOrBullet = new ArrayList<Object>();
        }
        return this.paraOrBullet;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getParaOrBullet()) {
            List<Struct> structs = new ArrayList();
            for (Object o: this.getParaOrBullet()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("paraOrBullet", structs);
        }
        return struct;
    }

}
