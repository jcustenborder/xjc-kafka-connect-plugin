
package com.xyz.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * <p>Java class for TransactionNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionNumberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnit"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.nrf-arts.org/IXRetail/namespace/&gt;BusinessUnitCommonData"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WorkstationID" type="{http://www.nrf-arts.org/IXRetail/namespace/}WorkstationIDType" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.nrf-arts.org/IXRetail/namespace/}SequenceNumberType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionNumberType", propOrder = {
    "businessUnit",
    "workstationID",
    "sequenceNumber"
})
public class TransactionNumberType {

    @XmlElement(name = "BusinessUnit", required = true)
    protected TransactionNumberType.BusinessUnit businessUnit;
    @XmlElement(name = "WorkstationID")
    protected String workstationID;
    @XmlElement(name = "SequenceNumber", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequenceNumber;
    public final static Schema CONNECT_SCHEMA;

    static {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.TransactionNumberType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        fieldBuilder = TransactionNumberType.BusinessUnit.CONNECT_SCHEMA;
        builder.field("BusinessUnit", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.string();
        fieldBuilder.optional();
        builder.field("WorkstationID", fieldBuilder.build());
        fieldBuilder = SchemaBuilder.int64();
        builder.field("SequenceNumber", fieldBuilder.build());
        CONNECT_SCHEMA = builder.build();
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionNumberType.BusinessUnit }
     *     
     */
    public TransactionNumberType.BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionNumberType.BusinessUnit }
     *     
     */
    public void setBusinessUnit(TransactionNumberType.BusinessUnit value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the workstationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstationID() {
        return workstationID;
    }

    /**
     * Sets the value of the workstationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstationID(String value) {
        this.workstationID = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    public Struct toConnectStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        if (null!= this.getBusinessUnit()) {
            struct.put("BusinessUnit", this.getBusinessUnit().toConnectStruct());
        } else {
            struct.put("BusinessUnit", null);
        }
        struct.put("WorkstationID", this.getWorkstationID());
        struct.put("SequenceNumber", this.getSequenceNumber());
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
    {

        public final static Schema CONNECT_SCHEMA;

        static {
            SchemaBuilder builder = SchemaBuilder.struct();
            builder.name("com.xyz.schema.BusinessUnit");
            builder.optional();
            SchemaBuilder fieldBuilder;
            CONNECT_SCHEMA = builder.build();
        }

        public Struct toConnectStruct() {
            Struct struct = new Struct(CONNECT_SCHEMA);
            return struct;
        }

    }

}
