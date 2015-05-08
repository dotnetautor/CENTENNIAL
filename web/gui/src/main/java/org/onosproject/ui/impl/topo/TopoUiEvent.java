/*
 * Copyright 2015 Open Networking Laboratory
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
 *
 */

package org.onosproject.ui.impl.topo;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.onosproject.event.AbstractEvent;

/**
 * Describes Topology UI Model events.
 */
public class TopoUiEvent extends AbstractEvent<TopoUiEvent.Type, ObjectNode> {

    /**
     * Type of Topology UI Model events.
     */
    public enum Type {
        INSTANCE_ADDED,
        INSTANCE_REMOVED,
        DEVICE_ADDED,
        DEVICE_UPDATED,
        DEVICE_REMOVED,
        LINK_ADDED,
        LINK_UPDATED,
        LINK_REMOVED,
        HOST_ADDED,
        HOST_UPDATED,
        HOST_REMOVED
    }


    protected TopoUiEvent(Type type, ObjectNode subject) {
        super(type, subject);
    }

    protected TopoUiEvent(Type type, ObjectNode subject, long time) {
        super(type, subject, time);
    }

}