// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;

/** The ResourceTypeIdentityManagement model. */
@Fluent
public final class ResourceTypeIdentityManagement extends IdentityManagement {
    /** Creates an instance of ResourceTypeIdentityManagement class. */
    public ResourceTypeIdentityManagement() {
    }

    /** {@inheritDoc} */
    @Override
    public ResourceTypeIdentityManagement withType(IdentityManagementTypes type) {
        super.withType(type);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}