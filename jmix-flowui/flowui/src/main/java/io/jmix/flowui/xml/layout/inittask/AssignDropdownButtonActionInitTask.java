/*
 * Copyright 2022 Haulmont.
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

package io.jmix.flowui.xml.layout.inittask;

import io.jmix.flowui.kit.action.Action;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.view.View;
import io.jmix.flowui.xml.layout.ComponentLoader;

public class AssignDropdownButtonActionInitTask extends AbstractAssignActionInitTask<DropdownButton> {

    protected String id;
    protected int index;

    public AssignDropdownButtonActionInitTask(DropdownButton component,
                                              String actionId,
                                              String actionItemId,
                                              int index,
                                              View<?> view) {
        super(component, actionId, view);
        this.index = index;
        this.id = actionItemId;
    }

    @Override
    protected boolean hasOwnAction(String id) {
        return false;
    }

    @Override
    protected void addAction(ComponentLoader.ComponentContext context, Action action) {
        component.addItem(id, action, index);
    }
}
