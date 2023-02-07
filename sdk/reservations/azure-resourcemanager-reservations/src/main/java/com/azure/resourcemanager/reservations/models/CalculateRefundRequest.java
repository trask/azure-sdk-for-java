// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request containing information needed for calculating refund. */
@Fluent
public final class CalculateRefundRequest {
    /*
     * Fully qualified identifier of the reservation order being returned
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Properties needed for calculate refund including the scope and the reservation to be returned.
     */
    @JsonProperty(value = "properties")
    private CalculateRefundRequestProperties properties;

    /** Creates an instance of CalculateRefundRequest class. */
    public CalculateRefundRequest() {
    }

    /**
     * Get the id property: Fully qualified identifier of the reservation order being returned.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified identifier of the reservation order being returned.
     *
     * @param id the id value to set.
     * @return the CalculateRefundRequest object itself.
     */
    public CalculateRefundRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the properties property: Properties needed for calculate refund including the scope and the reservation to be
     * returned.
     *
     * @return the properties value.
     */
    public CalculateRefundRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties needed for calculate refund including the scope and the reservation to be
     * returned.
     *
     * @param properties the properties value to set.
     * @return the CalculateRefundRequest object itself.
     */
    public CalculateRefundRequest withProperties(CalculateRefundRequestProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}