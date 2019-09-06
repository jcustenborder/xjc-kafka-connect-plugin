/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.xml;

import com.sun.codemodel.JExpression;

import java.util.List;

interface State {
  /**
   * Reference to a schema for this type. For example Schema.STRING
   *
   * @return
   */
  @Nullable
  JExpression schema();

  /**
   * Expression used to build an instance of the schema for this type.
   *
   * @return
   */
  JExpression schemaBuilder();

  /**
   * Method that is used to write data to the struct.
   *
   * @return
   */
  String readMethod();

  /**
   * Additional arguments that are passed to the read method.
   *
   * @return
   */
  List<JExpression> readMethodArgs();

  /**
   *
   * @return
   */
  String writeMethod();

  /**
   *
   * @return
   */
  List<JExpression> writeMethodArgs();
}
