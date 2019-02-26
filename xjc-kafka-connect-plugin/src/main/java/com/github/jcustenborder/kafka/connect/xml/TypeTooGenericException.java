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
import com.sun.tools.xjc.outline.ClassOutline;

class TypeTooGenericException extends UnsupportedTypeException {
  public TypeTooGenericException(ClassOutline classOutline,
                                 JFieldVar field,
                                 JType parentType,
                                 JType type) {
    super(classOutline, field, parentType, type);
  }

  @Override
  public String getMessage() {
    return String.format("The type %s is too generic to be supported by a Connect Schema. Please " +
        "look at customizing the JAXB bindings to map this type to a different java type such as " +
        "a string. https://docs.oracle.com/javase/tutorial/jaxb/intro/custom.html", this.type.fullName());
  }
}
