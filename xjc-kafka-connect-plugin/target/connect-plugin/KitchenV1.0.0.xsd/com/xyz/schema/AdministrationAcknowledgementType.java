
package com.xyz.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;


/**
 * defines the parameters by which the manager must acknowledge recept of
 *                 a notify message indicating an alarm behavior
 * 
 * <p>Java class for AdministrationAcknowledgementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrationAcknowledgementType"&gt;
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
@XmlType(name = "AdministrationAcknowledgementType")
public class AdministrationAcknowledgementType
    extends NAFEMAcknowledgementType
{

    public final static Schema CONNECT_SCHEMA;

    static AdministrationAcknowledgementType() {
        SchemaBuilder builder = SchemaBuilder.struct();
        builder.name("com.xyz.schema.AdministrationAcknowledgementType");
        builder.optional();
        SchemaBuilder fieldBuilder;
        CONNECT_SCHEMA = builder.build();
    }

    public Struct toStruct() {
        Struct struct = new Struct(CONNECT_SCHEMA);
        return struct;
    }

}
