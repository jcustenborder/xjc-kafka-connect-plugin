
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.github.jcustenborder.kafka.connect.xml.Connectable;
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
 *         &lt;element ref="{http://myrecipes.org/}meta"/&gt;
 *         &lt;element ref="{http://myrecipes.org/}recipe_author" minOccurs="0"/&gt;
 *         &lt;element ref="{http://myrecipes.org/}recipe_name"/&gt;
 *         &lt;element ref="{http://myrecipes.org/}meal"/&gt;
 *         &lt;element ref="{http://myrecipes.org/}ingredients"/&gt;
 *         &lt;element ref="{http://myrecipes.org/}directions"/&gt;
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
    "meta",
    "recipeAuthor",
    "recipeName",
    "meal",
    "ingredients",
    "directions"
})
@XmlRootElement(name = "recipe")
public class Recipe
    implements Connectable
{

    @XmlElement(required = true)
    protected Meta meta;
    @XmlElement(name = "recipe_author")
    protected String recipeAuthor;
    @XmlElement(name = "recipe_name", required = true)
    protected String recipeName;
    @XmlElement(required = true)
    protected String meal;
    @XmlElement(required = true)
    protected Ingredients ingredients;
    @XmlElement(required = true)
    protected Directions directions;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.Recipe");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = Meta.CONNECT_SCHEMA;
        builder.field("meta", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("recipe_author", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("recipe_name", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("meal", fieldBuilder.build());
        fieldBuilder = Ingredients.CONNECT_SCHEMA;
        builder.field("ingredients", fieldBuilder.build());
        fieldBuilder = Directions.CONNECT_SCHEMA;
        builder.field("directions", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMeta(Meta value) {
        this.meta = value;
    }

    /**
     * Gets the value of the recipeAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipeAuthor() {
        return recipeAuthor;
    }

    /**
     * Sets the value of the recipeAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipeAuthor(String value) {
        this.recipeAuthor = value;
    }

    /**
     * Gets the value of the recipeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * Sets the value of the recipeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipeName(String value) {
        this.recipeName = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeal(String value) {
        this.meal = value;
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * @return
     *     possible object is
     *     {@link Ingredients }
     *     
     */
    public Ingredients getIngredients() {
        return ingredients;
    }

    /**
     * Sets the value of the ingredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ingredients }
     *     
     */
    public void setIngredients(Ingredients value) {
        this.ingredients = value;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link Directions }
     *     
     */
    public Directions getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Directions }
     *     
     */
    public void setDirections(Directions value) {
        this.directions = value;
    }

    @Override
    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getMeta()) {
            struct.put("meta", this.getMeta().toConnectStruct());
        } else {
            struct.put("meta", null);
        }
        struct.put("recipe_author", this.getRecipeAuthor());
        struct.put("recipe_name", this.getRecipeName());
        struct.put("meal", this.getMeal());
        if (null!= this.getIngredients()) {
            struct.put("ingredients", this.getIngredients().toConnectStruct());
        } else {
            struct.put("ingredients", null);
        }
        if (null!= this.getDirections()) {
            struct.put("directions", this.getDirections().toConnectStruct());
        } else {
            struct.put("directions", null);
        }
        return struct;
    }

}
