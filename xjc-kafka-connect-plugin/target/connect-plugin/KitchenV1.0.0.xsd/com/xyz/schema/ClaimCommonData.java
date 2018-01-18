
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Requests exclusive access to the device
 * 
 * <p>Java class for ClaimCommonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimCommonData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Timeout" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimCommonData")
public class ClaimCommonData
    implements Connectable
{

    @XmlAttribute(name = "Timeout", required = true)
    protected int timeout;
    public final static Schema CONNECT_SCHEMA;

    static ClaimCommonData() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.ClaimCommonData");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("Timeout", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the timeout property.
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("timeout", this.timeout);
        return struct;
    }

}
