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

import com.google.common.base.Preconditions;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JType;

import java.util.List;

class NarrowedTypeInfo {
  static final Class<?> CLASS_JNARROWED;
  private static final java.lang.reflect.Field BASIS_FIELD;
  private static final java.lang.reflect.Field ARGS_FIELD;

  public final JClass basis;
  public final List<JClass> argClasses;

  static {
    try {
      CLASS_JNARROWED = Class.forName("com.sun.codemodel.JNarrowedClass");
      BASIS_FIELD = CLASS_JNARROWED.getDeclaredField("basis");
      BASIS_FIELD.setAccessible(true);
      ARGS_FIELD = CLASS_JNARROWED.getDeclaredField("args");
      ARGS_FIELD.setAccessible(true);
    } catch (ClassNotFoundException | NoSuchFieldException e) {
      throw new IllegalStateException(e);
    }
  }

  NarrowedTypeInfo(JClass basis, List<JClass> argClasses) {
    this.basis = basis;
    this.argClasses = argClasses;
  }

  public static boolean isNarrow(JType type) {
    return CLASS_JNARROWED.equals(type.getClass());
  }

  public static NarrowedTypeInfo of(JType type) {
    Preconditions.checkState(isNarrow(type), "type is not com.sun.codemodel.JNarrowedClass");
    final JClass basis;
    final List<JClass> argClasses;
    try {
      argClasses = (List<JClass>) ARGS_FIELD.get(type);
      basis = (JClass) BASIS_FIELD.get(type);
    } catch (IllegalAccessException e) {
      throw new IllegalStateException(e);
    }
    return new NarrowedTypeInfo(basis, argClasses);
  }

}
