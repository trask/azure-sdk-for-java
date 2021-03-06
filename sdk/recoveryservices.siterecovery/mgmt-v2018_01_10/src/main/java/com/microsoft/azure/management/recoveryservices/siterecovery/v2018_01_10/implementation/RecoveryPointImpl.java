/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.RecoveryPoint;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.RecoveryPointProperties;

class RecoveryPointImpl extends IndexableRefreshableWrapperImpl<RecoveryPoint, RecoveryPointInner> implements RecoveryPoint {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private String protectionContainerName;
    private String replicatedProtectedItemName;
    private String recoveryPointName;

    RecoveryPointImpl(RecoveryPointInner inner,  RecoveryServicesManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        this.protectionContainerName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationProtectionContainers");
        this.replicatedProtectedItemName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationProtectedItems");
        this.recoveryPointName = IdParsingUtils.getValueFromIdByName(inner.id(), "recoveryPoints");
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<RecoveryPointInner> getInnerAsync() {
        RecoveryPointsInner client = this.manager().inner().recoveryPoints();
        return client.getAsync(this.fabricName, this.protectionContainerName, this.replicatedProtectedItemName, this.recoveryPointName);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public RecoveryPointProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
