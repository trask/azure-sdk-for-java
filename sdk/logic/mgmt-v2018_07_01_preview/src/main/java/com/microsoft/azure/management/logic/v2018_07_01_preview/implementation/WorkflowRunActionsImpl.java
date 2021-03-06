/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import java.util.List;
import com.microsoft.azure.management.logic.v2018_07_01_preview.ExpressionRoot;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunAction;

class WorkflowRunActionsImpl extends WrapperImpl<WorkflowRunActionsInner> implements WorkflowRunActions {
    private final LogicManager manager;

    WorkflowRunActionsImpl(LogicManager manager) {
        super(manager.inner().workflowRunActions());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private WorkflowRunActionImpl wrapModel(WorkflowRunActionInner inner) {
        return  new WorkflowRunActionImpl(inner, manager());
    }

    @Override
    public Observable<ExpressionRoot> listExpressionTracesAsync(String resourceGroupName, String workflowName, String runName, String actionName) {
        WorkflowRunActionsInner client = this.inner();
        return client.listExpressionTracesAsync(resourceGroupName, workflowName, runName, actionName)
        .flatMap(new Func1<List<ExpressionRootInner>, Observable<ExpressionRootInner>>() {
            @Override
            public Observable<ExpressionRootInner> call(List<ExpressionRootInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ExpressionRootInner, ExpressionRoot>() {
            @Override
            public ExpressionRoot call(ExpressionRootInner inner) {
                return new ExpressionRootImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<WorkflowRunAction> listAsync(final String resourceGroupName, final String workflowName, final String runName) {
        WorkflowRunActionsInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName, runName)
        .flatMapIterable(new Func1<Page<WorkflowRunActionInner>, Iterable<WorkflowRunActionInner>>() {
            @Override
            public Iterable<WorkflowRunActionInner> call(Page<WorkflowRunActionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkflowRunActionInner, WorkflowRunAction>() {
            @Override
            public WorkflowRunAction call(WorkflowRunActionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<WorkflowRunAction> getAsync(String resourceGroupName, String workflowName, String runName, String actionName) {
        WorkflowRunActionsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, runName, actionName)
        .map(new Func1<WorkflowRunActionInner, WorkflowRunAction>() {
            @Override
            public WorkflowRunAction call(WorkflowRunActionInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
