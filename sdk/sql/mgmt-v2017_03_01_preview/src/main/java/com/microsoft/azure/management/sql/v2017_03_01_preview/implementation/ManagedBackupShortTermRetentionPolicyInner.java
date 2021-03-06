/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A short term retention policy.
 */
@JsonFlatten
public class ManagedBackupShortTermRetentionPolicyInner extends ProxyResource {
    /**
     * The backup retention period in days. This is how many days Point-in-Time
     * Restore will be supported.
     */
    @JsonProperty(value = "properties.retentionDays")
    private Integer retentionDays;

    /**
     * Get the backup retention period in days. This is how many days Point-in-Time Restore will be supported.
     *
     * @return the retentionDays value
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the backup retention period in days. This is how many days Point-in-Time Restore will be supported.
     *
     * @param retentionDays the retentionDays value to set
     * @return the ManagedBackupShortTermRetentionPolicyInner object itself.
     */
    public ManagedBackupShortTermRetentionPolicyInner withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

}
