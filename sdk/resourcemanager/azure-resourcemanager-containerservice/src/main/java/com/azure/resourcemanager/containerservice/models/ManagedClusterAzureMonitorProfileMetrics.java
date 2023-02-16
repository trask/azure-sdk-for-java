// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metrics profile for the Azure Monitor managed service for Prometheus addon. Collect out-of-the-box Kubernetes
 * infrastructure metrics to send to an Azure Monitor Workspace and configure additional scraping for custom targets.
 * See aka.ms/AzureManagedPrometheus for an overview.
 */
@Fluent
public final class ManagedClusterAzureMonitorProfileMetrics {
    /*
     * Whether to enable or disable the Azure Managed Prometheus addon for Prometheus monitoring. See
     * aka.ms/AzureManagedPrometheus-aks-enable for details on enabling and disabling.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * Kube State Metrics profile for the Azure Managed Prometheus addon. These optional settings are for the
     * kube-state-metrics pod that is deployed with the addon. See aka.ms/AzureManagedPrometheus-optional-parameters
     * for details.
     */
    @JsonProperty(value = "kubeStateMetrics")
    private ManagedClusterAzureMonitorProfileKubeStateMetrics kubeStateMetrics;

    /** Creates an instance of ManagedClusterAzureMonitorProfileMetrics class. */
    public ManagedClusterAzureMonitorProfileMetrics() {
    }

    /**
     * Get the enabled property: Whether to enable or disable the Azure Managed Prometheus addon for Prometheus
     * monitoring. See aka.ms/AzureManagedPrometheus-aks-enable for details on enabling and disabling.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable or disable the Azure Managed Prometheus addon for Prometheus
     * monitoring. See aka.ms/AzureManagedPrometheus-aks-enable for details on enabling and disabling.
     *
     * @param enabled the enabled value to set.
     * @return the ManagedClusterAzureMonitorProfileMetrics object itself.
     */
    public ManagedClusterAzureMonitorProfileMetrics withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the kubeStateMetrics property: Kube State Metrics profile for the Azure Managed Prometheus addon. These
     * optional settings are for the kube-state-metrics pod that is deployed with the addon. See
     * aka.ms/AzureManagedPrometheus-optional-parameters for details.
     *
     * @return the kubeStateMetrics value.
     */
    public ManagedClusterAzureMonitorProfileKubeStateMetrics kubeStateMetrics() {
        return this.kubeStateMetrics;
    }

    /**
     * Set the kubeStateMetrics property: Kube State Metrics profile for the Azure Managed Prometheus addon. These
     * optional settings are for the kube-state-metrics pod that is deployed with the addon. See
     * aka.ms/AzureManagedPrometheus-optional-parameters for details.
     *
     * @param kubeStateMetrics the kubeStateMetrics value to set.
     * @return the ManagedClusterAzureMonitorProfileMetrics object itself.
     */
    public ManagedClusterAzureMonitorProfileMetrics withKubeStateMetrics(
        ManagedClusterAzureMonitorProfileKubeStateMetrics kubeStateMetrics) {
        this.kubeStateMetrics = kubeStateMetrics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kubeStateMetrics() != null) {
            kubeStateMetrics().validate();
        }
    }
}