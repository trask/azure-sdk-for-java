// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

/** Samples for Applications DeleteById. */
public final class ApplicationsDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Solutions/stable/2018-06-01/examples/deleteApplicationById.json
     */
    /**
     * Sample code: Delete application by id.
     *
     * @param manager Entry point to ApplicationManager.
     */
    public static void deleteApplicationById(com.azure.resourcemanager.managedapplications.ApplicationManager manager) {
        manager.applications().deleteById("myApplicationId", com.azure.core.util.Context.NONE);
    }
}