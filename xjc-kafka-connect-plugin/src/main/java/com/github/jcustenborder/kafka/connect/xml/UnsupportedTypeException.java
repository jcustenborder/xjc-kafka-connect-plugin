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

import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JType;

class UnsupportedTypeException extends RuntimeException {
  final JType definedClass;
  final JFieldVar field;
  final JType parentType;
  final JType type;

  public UnsupportedTypeException(JType definedClass, JFieldVar field, JType parentType, JType type) {
    this.definedClass = definedClass;
    this.field = field;
    this.parentType = parentType;
    this.type = type;
  }

  @Override
  public String getMessage() {
    return String.format(
        "The type %s is not supported. parentType = %s class = %s, field = %s",
        this.type.name(),
        null != this.parentType ? this.parentType.name() : null,
        this.definedClass.name(),
        this.field.name()
    );
  }
}