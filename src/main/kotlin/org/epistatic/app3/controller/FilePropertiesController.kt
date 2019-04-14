package org.epistatic.app3.controller

import com.google.common.eventbus.EventBus
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.control.Label
import javafx.scene.layout.GridPane
import javafx.scene.layout.Pane

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

/**
 * Controller for app3/fileProperties.fxml
 */
class FilePropertiesController(eventBus: EventBus) : EventAwareController(eventBus) {

	@FXML lateinit var nameLabel: Label
	@FXML lateinit var pathLabel: Label
	@FXML lateinit var sizeLabel: Label

	fun load(): Pane {
		val loader = FXMLLoader(javaClass.getResource("/app3/fileProperties.fxml"))
		loader.setController(this)
		return loader.load<GridPane>()
	}


	@FXML
	fun initialize(){
	}

}