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

import generated.ObjectFactory;
import generated.Shiporder;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class ShipOrderTest extends AbstractRoundTripTest<Shiporder> {
  private static final Logger log = LoggerFactory.getLogger(ShipOrderTest.class);

  @Override
  protected Class<?> objectFactoryClass() {
    return ObjectFactory.class;
  }

  @Override
  protected Class<Shiporder> dataClass() {
    return Shiporder.class;
  }

  @Override
  protected String dataFileName() {
    return "shiporder.xml";
  }


  @Test
  public void foo() throws DatatypeConfigurationException {
    Duration duration = DatatypeFactory.newInstance().newDuration(1000);
    log.info("{}", duration);
  }
}
