/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.Cluster;
import rx.Observable;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.ClusterUpdateParameters;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.ClusterCreateParameters;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.AllocationState;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.BatchAIError;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.NodeSetup;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.NodeStateCounts;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.ProvisioningState;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.ScaleSettings;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.ResourceId;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.UserAccountSettings;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.VirtualMachineConfiguration;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.VmPriority;
import rx.functions.Func1;

class ClusterImpl extends GroupableResourceCoreImpl<Cluster, ClusterInner, ClusterImpl, BatchAIManager> implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterCreateParameters createParameter;
    private ClusterUpdateParameters updateParameter;
    ClusterImpl(String name, ClusterInner inner, BatchAIManager manager) {
        super(name, inner, manager);
        this.createParameter = new ClusterCreateParameters();
        this.updateParameter = new ClusterUpdateParameters();
    }

    @Override
    public Observable<Cluster> createResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Cluster> updateResourceAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<ClusterInner, ClusterInner>() {
               @Override
               public ClusterInner call(ClusterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ClusterInner> getInnerAsync() {
        ClustersInner client = this.manager().inner().clusters();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new ClusterCreateParameters();
        this.updateParameter = new ClusterUpdateParameters();
    }

    @Override
    public AllocationState allocationState() {
        return this.inner().allocationState();
    }

    @Override
    public DateTime allocationStateTransitionTime() {
        return this.inner().allocationStateTransitionTime();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public Integer currentNodeCount() {
        return this.inner().currentNodeCount();
    }

    @Override
    public List<BatchAIError> errors() {
        return this.inner().errors();
    }

    @Override
    public NodeSetup nodeSetup() {
        return this.inner().nodeSetup();
    }

    @Override
    public NodeStateCounts nodeStateCounts() {
        return this.inner().nodeStateCounts();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DateTime provisioningStateTransitionTime() {
        return this.inner().provisioningStateTransitionTime();
    }

    @Override
    public ScaleSettings scaleSettings() {
        return this.inner().scaleSettings();
    }

    @Override
    public ResourceId subnet() {
        return this.inner().subnet();
    }

    @Override
    public UserAccountSettings userAccountSettings() {
        return this.inner().userAccountSettings();
    }

    @Override
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.inner().virtualMachineConfiguration();
    }

    @Override
    public VmPriority vmPriority() {
        return this.inner().vmPriority();
    }

    @Override
    public String vmSize() {
        return this.inner().vmSize();
    }

    @Override
    public ClusterImpl withUserAccountSettings(UserAccountSettings userAccountSettings) {
        this.createParameter.withUserAccountSettings(userAccountSettings);
        return this;
    }

    @Override
    public ClusterImpl withVmSize(String vmSize) {
        this.createParameter.withVmSize(vmSize);
        return this;
    }

    @Override
    public ClusterImpl withNodeSetup(NodeSetup nodeSetup) {
        this.createParameter.withNodeSetup(nodeSetup);
        return this;
    }

    @Override
    public ClusterImpl withSubnet(ResourceId subnet) {
        this.createParameter.withSubnet(subnet);
        return this;
    }

    @Override
    public ClusterImpl withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.createParameter.withVirtualMachineConfiguration(virtualMachineConfiguration);
        return this;
    }

    @Override
    public ClusterImpl withVmPriority(VmPriority vmPriority) {
        this.createParameter.withVmPriority(vmPriority);
        return this;
    }

    @Override
    public ClusterImpl withScaleSettings(ScaleSettings scaleSettings) {
        if (isInCreateMode()) {
            this.createParameter.withScaleSettings(scaleSettings);
        } else {
            this.updateParameter.withScaleSettings(scaleSettings);
        }
        return this;
    }

}
