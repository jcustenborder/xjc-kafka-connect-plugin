
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * Entry in acknowledgement table
 * 
 * <p>Java class for UtilityAcknowledgeObjectGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityAcknowledgeObjectGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.nrf-arts.org/IXRetail/namespace/}NAFEMAcknowledgementType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityAcknowledgeObjectGroupType")
public class UtilityAcknowledgeObjectGroupType
    extends NAFEMAcknowledgementType
    implements Connectable
{

    public final static Schema CONNECT_SCHEMA;

    static UtilityAcknowledgeObjectGroupType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.UtilityAcknowledgeObjectGroupType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        CONNECT_SCHEMA = builder.build();
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        return struct;
    }

}
