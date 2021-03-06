/**
 * Copyright 2016-present Open Networking Laboratory
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.kafkaintegration.api.dto;

import org.onosproject.event.AbstractEvent;

import com.google.protobuf.GeneratedMessage;

/**
 * Represents the converted Onos Event data into protobuf format.
 *
 */
public class OnosEvent extends AbstractEvent<OnosEvent.Type, GeneratedMessage> {

    /**
     * Creates a new Onos Event.
     *
     * @param type The Type of Onos Event
     * @param subject Protobuf message corresponding to the Onos Event
     */
    public OnosEvent(Type type, GeneratedMessage subject) {
        super(type, subject);
    }

    /**
     * List of Event Types supported.
     */
    public enum Type {
        /**
         * Signifies Device events.
         */
        DEVICE("DEVICE"),

        /**
         * Signifies Link events.
         */
        LINK("LINK");
        public String typeName;

        Type(String name) {
            typeName = name;
        }
    }
}
