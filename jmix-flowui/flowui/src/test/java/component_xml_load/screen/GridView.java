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

package component_xml_load.screen;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.grid.TreeDataGrid;
import io.jmix.flowui.view.ComponentId;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.UiController;
import io.jmix.flowui.view.UiDescriptor;

@Route(value = "grid-view")
@UiController("GridView")
@UiDescriptor("grid-view.xml")
public class GridView extends StandardView {

    @ComponentId
    public DataGrid<?> dataGrid;

    @ComponentId
    public DataGrid<?> anotherDataGrid;

    @ComponentId
    public DataGrid<?> metaClassDataGrid;

    @ComponentId
    public TreeDataGrid<?> treeDataGrid;

    @ComponentId
    public TreeDataGrid<?> anotherTreeDataGrid;

    @ComponentId
    public TreeDataGrid<?> metaClassTreeDataGrid;

    public void loadData() {
        getViewData().loadAll();
    }
}
