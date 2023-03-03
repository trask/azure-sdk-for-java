// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

/** Samples for AccessPolicies ListByEnvironment. */
public final class AccessPoliciesListByEnvironmentSamples {
    /*
     * x-ms-original-file: specification/timeseriesinsights/resource-manager/Microsoft.TimeSeriesInsights/stable/2020-05-15/examples/AccessPoliciesListByEnvironment.json
     */
    /**
     * Sample code: AccessPoliciesByEnvironment.
     *
     * @param manager Entry point to TimeSeriesInsightsManager.
     */
    public static void accessPoliciesByEnvironment(
        com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager manager) {
        manager.accessPolicies().listByEnvironmentWithResponse("rg1", "env1", com.azure.core.util.Context.NONE);
    }
}