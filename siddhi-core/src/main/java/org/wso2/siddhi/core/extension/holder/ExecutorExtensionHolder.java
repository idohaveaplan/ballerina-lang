/*
 * Copyright (c) 2005 - 2014, WSO2 Inc. (http://www.wso2.org)
 * All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.siddhi.core.extension.holder;

import org.wso2.siddhi.core.config.ExecutionPlanContext;
import org.wso2.siddhi.core.executor.function.FunctionExecutor;

public class ExecutorExtensionHolder extends AbstractExtensionHolder {
    private static ExecutorExtensionHolder instance;

    private ExecutorExtensionHolder(ExecutionPlanContext executionPlanContext) {
        super(FunctionExecutor.class, executionPlanContext);
    }

    public static ExecutorExtensionHolder getInstance(ExecutionPlanContext executionPlanContext) {
        if (instance == null) {
            instance = new ExecutorExtensionHolder(executionPlanContext);
        }
        return instance;
    }
}
