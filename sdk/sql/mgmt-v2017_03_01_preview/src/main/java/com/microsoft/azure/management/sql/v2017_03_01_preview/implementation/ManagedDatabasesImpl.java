/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabases;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabase;
import com.microsoft.azure.Page;
import rx.Completable;
import java.util.UUID;

class ManagedDatabasesImpl extends WrapperImpl<ManagedDatabasesInner> implements ManagedDatabases {
    private final SqlManager manager;

    ManagedDatabasesImpl(SqlManager manager) {
        super(manager.inner().managedDatabases());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ManagedDatabaseImpl defineDatabasis(String name) {
        return wrapDatabasisModel(name);
    }

    private ManagedDatabaseImpl wrapDatabasisModel(String name) {
        return new ManagedDatabaseImpl(name, this.manager());
    }

    private ManagedDatabaseImpl wrapManagedDatabaseModel(ManagedDatabaseInner inner) {
        return  new ManagedDatabaseImpl(inner, manager());
    }

    private Observable<ManagedDatabaseInner> getManagedDatabaseInnerUsingManagedDatabasesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String managedInstanceName = IdParsingUtils.getValueFromIdByName(id, "managedInstances");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "databases");
        ManagedDatabasesInner client = this.inner();
        return client.getAsync(resourceGroupName, managedInstanceName, databaseName);
    }

    @Override
    public Observable<ManagedDatabase> getAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        ManagedDatabasesInner client = this.inner();
        return client.getAsync(resourceGroupName, managedInstanceName, databaseName)
        .flatMap(new Func1<ManagedDatabaseInner, Observable<ManagedDatabase>>() {
            @Override
            public Observable<ManagedDatabase> call(ManagedDatabaseInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ManagedDatabase)wrapManagedDatabaseModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<ManagedDatabase> listByInstanceAsync(final String resourceGroupName, final String managedInstanceName) {
        ManagedDatabasesInner client = this.inner();
        return client.listByInstanceAsync(resourceGroupName, managedInstanceName)
        .flatMapIterable(new Func1<Page<ManagedDatabaseInner>, Iterable<ManagedDatabaseInner>>() {
            @Override
            public Iterable<ManagedDatabaseInner> call(Page<ManagedDatabaseInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedDatabaseInner, ManagedDatabase>() {
            @Override
            public ManagedDatabase call(ManagedDatabaseInner inner) {
                return wrapManagedDatabaseModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        ManagedDatabasesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, managedInstanceName, databaseName).toCompletable();
    }

    @Override
    public Completable completeRestoreAsync(String locationName, UUID operationId, String lastBackupName) {
        ManagedDatabasesInner client = this.inner();
        return client.completeRestoreAsync(locationName, operationId, lastBackupName).toCompletable();
    }

}
