// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

/** Samples for SapCentralInstances StartInstance. */
public final class SapCentralInstancesStartInstanceSamples {
    /*
     * x-ms-original-file: specification/workloads/resource-manager/Microsoft.Workloads/preview/2022-11-01-preview/examples/sapvirtualinstances/SAPCentralInstances_StartInstance.json
     */
    /**
     * Sample code: Start the SAP Central Services Instance.
     *
     * @param manager Entry point to WorkloadsManager.
     */
    public static void startTheSAPCentralServicesInstance(
        com.azure.resourcemanager.workloads.WorkloadsManager manager) {
        manager
            .sapCentralInstances()
            .startInstance("test-rg", "X00", "centralServer", com.azure.core.util.Context.NONE);
    }
}