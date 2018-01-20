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

import com.google.common.io.PatternFilenameFilter;
import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.api.S2JJAXBModel;
import com.sun.tools.xjc.api.SchemaCompiler;
import com.sun.tools.xjc.api.XJC;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class KafkaConnectPluginTest {
  private static final Logger log = LoggerFactory.getLogger(KafkaConnectPluginTest.class);

  @TestFactory
  public Stream<DynamicTest> build() throws IOException {


    final File inputDirectory = new File("src/test/resources/com/github/jcustenborder/kafka/connect/xml");
    final File outputDirectoryRoot = new File("target/connect-plugin");

    return Arrays.stream(inputDirectory.listFiles(new PatternFilenameFilter("^.+\\.xsd$")))
        .filter(f-> !f.getName().equals("KitchenV1.0.0.xsd"))
        .map(schemaFile -> dynamicTest(schemaFile.getName(), () -> {
          File outputDirectory = new File(outputDirectoryRoot, schemaFile.getName());
          outputDirectory.mkdirs();

          // Setup schema compiler
          SchemaCompiler sc = XJC.createSchemaCompiler();
          Options options = sc.getOptions();

          options.activePlugins.add(new KafkaConnectPlugin());


          sc.forcePackageName("com.xyz.schema");
          InputSource is = new InputSource(schemaFile.toURI().toString());

          sc.parseSchema(is);
          S2JJAXBModel model = sc.bind();
          JCodeModel jCodeModel = model.generateCode(null, null);
          jCodeModel.build(outputDirectory);
        }));


  }
}
