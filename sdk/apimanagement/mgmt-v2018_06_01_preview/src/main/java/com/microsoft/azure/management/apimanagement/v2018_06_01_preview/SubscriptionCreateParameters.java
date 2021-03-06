/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Subscription create details.
 */
@JsonFlatten
public class SubscriptionCreateParameters {
    /**
     * User (user id path) for whom subscription is being created in form
     * /users/{userId}.
     */
    @JsonProperty(value = "properties.ownerId")
    private String ownerId;

    /**
     * Scope like /products/{productId} or /apis or /apis/{apiId}.
     */
    @JsonProperty(value = "properties.scope", required = true)
    private String scope;

    /**
     * Subscription name.
     */
    @JsonProperty(value = "properties.displayName", required = true)
    private String displayName;

    /**
     * Primary subscription key. If not specified during request key will be
     * generated automatically.
     */
    @JsonProperty(value = "properties.primaryKey")
    private String primaryKey;

    /**
     * Secondary subscription key. If not specified during request key will be
     * generated automatically.
     */
    @JsonProperty(value = "properties.secondaryKey")
    private String secondaryKey;

    /**
     * Initial subscription state. If no value is specified, subscription is
     * created with Submitted state. Possible states are * active – the
     * subscription is active, * suspended – the subscription is blocked, and
     * the subscriber cannot call any APIs of the product, * submitted – the
     * subscription request has been made by the developer, but has not yet
     * been approved or rejected, * rejected – the subscription request has
     * been denied by an administrator, * cancelled – the subscription has been
     * cancelled by the developer or administrator, * expired – the
     * subscription reached its expiration date and was deactivated. Possible
     * values include: 'suspended', 'active', 'expired', 'submitted',
     * 'rejected', 'cancelled'.
     */
    @JsonProperty(value = "properties.state")
    private SubscriptionState state;

    /**
     * Determines whether tracing can be enabled.
     */
    @JsonProperty(value = "properties.allowTracing")
    private Boolean allowTracing;

    /**
     * Get user (user id path) for whom subscription is being created in form /users/{userId}.
     *
     * @return the ownerId value
     */
    public String ownerId() {
        return this.ownerId;
    }

    /**
     * Set user (user id path) for whom subscription is being created in form /users/{userId}.
     *
     * @param ownerId the ownerId value to set
     * @return the SubscriptionCreateParameters object itself.
     */
    public SubscriptionCreateParameters withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Get scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @param scope the scope value to set
     * @return the SubscriptionCreateParameters object itself.
     */
    public SubscriptionCreateParameters withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get subscription name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set subscription name.
     *
     * @param displayName the displayName value to set
     * @return the SubscriptionCreateParameters object itself.
     */
    public SubscriptionCreateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get primary subscription key. If not specified during request key will be generated automatically.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set primary subscription key. If not specified during request key will be generated automatically.
     *
     * @param primaryKey the primaryKey value to set
     * @return the SubscriptionCreateParameters object itself.
     */
    public SubscriptionCreateParameters withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get secondary subscription key. If not specified during request key will be generated automatically.
     *
     * @return the secondaryKey value
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set secondary subscription key. If not specified during request key will be generated automatically.
     *
     * @param secondaryKey the secondaryKey value to set
     * @return the SubscriptionCreateParameters object itself.
     */
    public SubscriptionCreateParameters withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get initial subscription state. If no value is specified, subscription is created with Submitted state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated. Possible values include: 'suspended', 'active', 'expired', 'submitted', 'rejected', 'cancelled'.
     *
     * @return the state value
     */
    public SubscriptionState state() {
        return this.state;
    }

    /**
     * Set initial subscription state. If no value is specified, subscription is created with Submitted state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated. Possible values include: 'suspended', 'active', 'expired', 'submitted', 'rejected', 'cancelled'.
     *
     * @param state the state value to set
     * @return the SubscriptionCreateParameters object itself.
     */
    public SubscriptionCreateParameters withState(SubscriptionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get determines whether tracing can be enabled.
     *
     * @return the allowTracing value
     */
    public Boolean allowTracing() {
        return this.allowTracing;
    }

    /**
     * Set determines whether tracing can be enabled.
     *
     * @param allowTracing the allowTracing value to set
     * @return the SubscriptionCreateParameters object itself.
     */
    public SubscriptionCreateParameters withAllowTracing(Boolean allowTracing) {
        this.allowTracing = allowTracing;
        return this;
    }

}
