
package com.xyz.schema;

import java.util.ArrayList;
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
 *         &lt;element ref="{http://myrecipes.org/}recipe" maxOccurs="unbounded"/&gt;
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
    "recipe"
})
@XmlRootElement(name = "list")
public class List {

    @XmlElement(required = true)
    protected java.util.List<Recipe> recipe;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.List");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.array(Recipe.CONNECT_SCHEMA);
        builder.field("recipe", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the recipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recipe }
     * 
     * 
     */
    public java.util.List<Recipe> getRecipe() {
        if (recipe == null) {
            recipe = new ArrayList<Recipe>();
        }
        return this.recipe;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getRecipe()) {
            java.util.List<Struct> structs = new ArrayList();
            for (Recipe o: this.getRecipe()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("recipe", structs);
        }
        return struct;
    }

}
