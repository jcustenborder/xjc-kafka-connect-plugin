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

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.math.RoundingMode;


public class KafkaConnectPluginConfig {

  private final boolean forceDecimalScale;
  private final int decimalScale;
  private final RoundingMode roundingMode;


  protected KafkaConnectPluginConfig(final boolean forceDecimalScale, final int decimalScale, final RoundingMode roundingMode) {
    this.forceDecimalScale = forceDecimalScale;
    this.decimalScale = decimalScale;
    this.roundingMode = roundingMode;
  }


  /**
   * Apply decimal scaling to force any values to the scale specified in the schema
   */
  public boolean isForceDecimalScale() {
    return forceDecimalScale;
  }


  /**
   * The scale to force all xs:decimal numbers into.
   */
  public int getDecimalScale() {
    return decimalScale;
  }


  /**
   * The RoudingMode to use in forcing xs:decimal numbers into the defined decimal scale. Default is ROUND_HALF_UP.
   **/
  public RoundingMode getRoundingMode() {
    return roundingMode;
  }


  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("forceDecimalScale", forceDecimalScale)
        .add("decimalScale", decimalScale)
        .add("roundingMode", roundingMode)
        .toString();
  }


  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final KafkaConnectPluginConfig that = (KafkaConnectPluginConfig) o;
    return forceDecimalScale == that.forceDecimalScale &&
        decimalScale == that.decimalScale &&
        roundingMode == that.roundingMode;
  }


  @Override
  public int hashCode() {
    return Objects.hashCode(forceDecimalScale, decimalScale, roundingMode);
  }


  public static class Builder {
    private boolean forceDecimalScale = false;
    private int scale = 12;
    private RoundingMode roundingMode = RoundingMode.HALF_UP;


    public Builder withDecimalScale(int scale) {
      this.scale = scale;

      return this;
    }


    public Builder withForceDecimalScale(boolean forceDecimalScale) {
      this.forceDecimalScale = forceDecimalScale;

      return this;
    }


    public Builder withRoundingMode(RoundingMode roundingMode) {
      this.roundingMode = roundingMode;

      return this;
    }


    public KafkaConnectPluginConfig build() {
      return new KafkaConnectPluginConfig(forceDecimalScale, scale, roundingMode);
    }
  }
}
