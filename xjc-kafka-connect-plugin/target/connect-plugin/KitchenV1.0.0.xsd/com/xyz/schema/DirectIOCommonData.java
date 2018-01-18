
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
 * <p>Java class for DirectIOCommonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectIOCommonData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" form="qualified"/&gt;
 *         &lt;element name="Object" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectIOCommonData", propOrder = {
    "command",
    "data",
    "object"
})
public class DirectIOCommonData
    implements Connectable
{

    @XmlElement(name = "Command")
    protected int command;
    @XmlElement(name = "Data", type = Integer.class)
    protected List<Integer> data;
    @XmlElement(name = "Object", required = true)
    protected List<String> object;
    public final static Schema CONNECT_SCHEMA;

    static DirectIOCommonData() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.DirectIOCommonData");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Command", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("Data", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        builder.field("Object", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the command property.
     * 
     */
    public int getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     */
    public void setCommand(int value) {
        this.command = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getData() {
        if (data == null) {
            data = new ArrayList<Integer>();
        }
        return this.data;
    }

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObject() {
        if (object == null) {
            object = new ArrayList<String>();
        }
        return this.object;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("command", this.command);
        struct.put("data", this.data);
        struct.put("object", this.object);
        return struct;
    }

}
