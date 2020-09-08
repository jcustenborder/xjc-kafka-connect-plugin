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
import com.sun.codemodel.JFieldVar;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@SuppressFBWarnings
interface FieldState extends State {
  /**
   * Name of the field in the xml document.
   * @return
   */
  String name();

  /**
   * The field in the generated code.
   * @return
   */
  JFieldVar fieldVar();

  /**
   * Flag to determine if the field is required.
   * @return
   */
  boolean required();

  /**
   * Additional arguments that are passed to the read method.
   * @return
   */
  List<JExpression> readMethodArgs();
}
