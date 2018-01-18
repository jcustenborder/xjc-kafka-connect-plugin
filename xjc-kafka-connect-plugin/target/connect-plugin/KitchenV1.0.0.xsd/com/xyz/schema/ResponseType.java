
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseCommonData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponderID" type="{http://www.w3.org/2001/XMLSchema}anyType" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "responderID"
})
public class ResponseType
    extends ResponseCommonData
    implements Connectable
{

    @XmlElement(name = "ResponderID", required = true)
    protected Object responderID;
    public final static Schema CONNECT_SCHEMA;

    static ResponseType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.ResponseType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("ResponderID", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the responderID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResponderID() {
        return responderID;
    }

    /**
     * Sets the value of the responderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResponderID(Object value) {
        this.responderID = value;
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("responderID", this.responderID);
        return struct;
    }

}
