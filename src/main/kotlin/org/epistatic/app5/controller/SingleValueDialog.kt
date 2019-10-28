/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
**/

package org.epistatic.app5.controller

import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.VBox
import javafx.stage.Stage

/**
 * Simple dialog for entering a single string value. Title, label and default parameters
 * are all constructor arguments
 */
class SingleValueDialog(ownerStage: Stage, label: String, title: String, defaultValue: String?) : CustomDialog<String>(ownerStage, title) {

   var controller: SingleValueDialogController

   init {
      val loader = FXMLLoader(javaClass.getResource("/app5/singleValueDialog.fxml"))
      controller = SingleValueDialogController(label, defaultValue)
      loader.setController(controller)
      val root = loader.load<VBox>()
      stage.scene = Scene(root)
   }

   override fun result(): DialogResult<String> {
      val v = controller.getValue()
      if (v != null)
         return DialogResult(true, v)
      return DialogResult(false, "")
   }
}