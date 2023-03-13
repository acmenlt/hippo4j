/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.hippo4j.common.extension.reducer;

import cn.hippo4j.common.extension.IExtension;
import cn.hippo4j.common.extension.IExtensionRequest;
import cn.hippo4j.common.extension.support.ExtensionCallback;
import cn.hippo4j.common.extension.support.ReduceType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public abstract class Reducer<Element, Result> {

    @Getter
    private boolean hasBreak = false;

    @Getter
    private Result result;

    @Setter
    protected IExtensionRequest request;

    @Setter
    protected List<IExtension> extensionImplementations;

    @Setter
    @Getter
    private ExtensionCallback<IExtension, Element> callback;

    public abstract Result reduce();

    public boolean willBreak() {
        return false;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public abstract ReduceType reducerType();

    public String reduceName() {
        return this.getClass().getSimpleName();
    }

}
