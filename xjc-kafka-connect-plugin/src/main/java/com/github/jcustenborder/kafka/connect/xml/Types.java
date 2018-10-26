/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.xml;

import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JType;
import org.immutables.value.Value;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Value.Immutable
interface Types {
  static Types build(JCodeModel codeModel) {
    return ImmutableTypes.builder()
        .list(codeModel.ref(List.class))
        .arrayList(codeModel.ref(List.class))
        .struct(codeModel.ref("org.apache.kafka.connect.data.Struct"))
        .date(codeModel.ref("org.apache.kafka.connect.data.Date"))
        .time(codeModel.ref("org.apache.kafka.connect.data.Time"))
        .decimal(codeModel.ref("org.apache.kafka.connect.data.Decimal"))
        .timestamp(codeModel.ref("org.apache.kafka.connect.data.Timestamp"))
        .schemaBuilder(codeModel.ref("org.apache.kafka.connect.data.SchemaBuilder"))
        .schema(codeModel.ref("org.apache.kafka.connect.data.Schema"))
        .connectable(codeModel.ref("com.github.jcustenborder.kafka.connect.xml.Connectable"))
        .bigInteger(codeModel.ref(BigInteger.class))
        .bigDecimal(codeModel.ref(BigDecimal.class))
        .map(codeModel.ref(Map.class))
        .connectableHelper(codeModel.ref("com.github.jcustenborder.kafka.connect.xml.ConnectableHelper"))
        .xmlGregorianCalendar(codeModel.ref(XMLGregorianCalendar.class))
        .addBlackListTypes(codeModel.ref(Object.class))
        .addBlackListTypes(codeModel.ref(Serializable.class))
        .build();
  }

  JClass struct();

  JClass timestamp();

  JClass time();

  JClass date();

  JClass decimal();

  JClass schemaBuilder();

  JClass schema();

  JClass connectable();

  JClass connectableHelper();

  JClass list();

  JClass map();

  JClass arrayList();

  JClass bigDecimal();

  JClass bigInteger();

  JClass xmlGregorianCalendar();

  Set<JType> blackListTypes();
}
