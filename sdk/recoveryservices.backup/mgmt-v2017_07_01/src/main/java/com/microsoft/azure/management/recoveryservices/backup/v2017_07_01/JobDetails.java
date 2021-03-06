/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.JobDetailsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing JobDetails.
 */
public interface JobDetails extends HasInner<JobDetailsInner> {
    /**
     * Gets exteded information associated with the job.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param jobName Name of the job whose details are to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VaultJobResourceModel> getAsync(String vaultName, String resourceGroupName, String jobName);

}
