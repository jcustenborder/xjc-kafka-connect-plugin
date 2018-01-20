
package com.xyz.schema;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.github.jcustenborder.kafka.connect.xml.Connectable;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Timestamp;


/**
 * <p>Java class for ResponseCommonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseCommonData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/&gt;
 *         &lt;element name="ResponderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ResponseTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ResponseDescription" minOccurs="0" form="qualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;DescriptionCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BusinessError" maxOccurs="unbounded" minOccurs="0" form="qualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.nrf-arts.org/IXRetail/namespace/}BusinessErrorCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ResponseCode" type="{http://www.nrf-arts.org/IXRetail/namespace/}ResponseTypeCode" default="OK" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseCommonData", propOrder = {
    "requestID",
    "responderID",
    "responseTimestamp",
    "responseDescription",
    "businessError"
})
@XmlSeeAlso({
    com.xyz.schema.InventoryType.Response.class
})
public class ResponseCommonData
    implements Connectable
{

    @XmlElement(name = "RequestID", required = true)
    protected String requestID;
    @XmlElement(name = "ResponderID")
    protected String responderID;
    @XmlElement(name = "ResponseTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseTimestamp;
    @XmlElement(name = "ResponseDescription")
    protected ResponseCommonData.ResponseDescription responseDescription;
    @XmlElement(name = "BusinessError")
    protected List<ResponseCommonData.BusinessError> businessError;
    @XmlAttribute(name = "ResponseCode")
    protected String responseCode;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.ResponseCommonData");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = SchemaBuilder.string();
        builder.field("RequestID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ResponderID", fieldBuilder.build());
        fieldBuilder = Timestamp.builder();
        fieldBuilder.optional();
        builder.field("ResponseTimestamp", fieldBuilder.build());
        fieldBuilder = ResponseCommonData.ResponseDescription.CONNECT_SCHEMA;
        fieldBuilder.optional();
        builder.field("ResponseDescription", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.array(ResponseCommonData.BusinessError.CONNECT_SCHEMA);
        fieldBuilder.optional();
        builder.field("BusinessError", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("ResponseCode", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the responderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponderID() {
        return responderID;
    }

    /**
     * Sets the value of the responderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponderID(String value) {
        this.responderID = value;
    }

    /**
     * Gets the value of the responseTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseTimestamp() {
        return responseTimestamp;
    }

    /**
     * Sets the value of the responseTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseTimestamp(XMLGregorianCalendar value) {
        this.responseTimestamp = value;
    }

    /**
     * Gets the value of the responseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCommonData.ResponseDescription }
     *     
     */
    public ResponseCommonData.ResponseDescription getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the value of the responseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCommonData.ResponseDescription }
     *     
     */
    public void setResponseDescription(ResponseCommonData.ResponseDescription value) {
        this.responseDescription = value;
    }

    /**
     * Gets the value of the businessError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseCommonData.BusinessError }
     * 
     * 
     */
    public List<ResponseCommonData.BusinessError> getBusinessError() {
        if (businessError == null) {
            businessError = new ArrayList<ResponseCommonData.BusinessError>();
        }
        return this.businessError;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        if (responseCode == null) {
            return "OK";
        } else {
            return responseCode;
        }
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    @Override
    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        struct.put("RequestID", this.getRequestID());
        struct.put("ResponderID", this.getResponderID());
        if (null!= this.getResponseTimestamp()) {
            struct.put("ResponseTimestamp", this.getResponseTimestamp().toGregorianCalendar(TimeZone.getTimeZone("UTC"), null, null).getTime());
        } else {
            struct.put("ResponseTimestamp", null);
        }
        if (null!= this.getResponseDescription()) {
            struct.put("ResponseDescription", this.getResponseDescription().toConnectStruct());
        } else {
            struct.put("ResponseDescription", null);
        }
        if (null!= this.getBusinessError()) {
            List<Struct> structs = new ArrayList();
            for (ResponseCommonData.BusinessError o: this.getBusinessError()) {
                structs.add(o.toConnectStruct());
            }
            struct.put("BusinessError", structs);
        }
        struct.put("ResponseCode", this.getResponseCode());
        return struct;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.nrf-arts.org/IXRetail/namespace/}BusinessErrorCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BusinessError
        extends BusinessErrorCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.BusinessError");
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
     *     &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;DescriptionCommonData"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ResponseDescription
        extends DescriptionCommonData
        implements Connectable
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.ResponseDescription");
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

}
