// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RoutingType. */
public final class RoutingType extends ExpandableStringEnum<RoutingType> {
    /** Static value Default for RoutingType. */
    public static final RoutingType DEFAULT = fromString("Default");

    /** Static value ProxyOnly for RoutingType. */
    public static final RoutingType PROXY_ONLY = fromString("ProxyOnly");

    /** Static value HostBased for RoutingType. */
    public static final RoutingType HOST_BASED = fromString("HostBased");

    /** Static value Extension for RoutingType. */
    public static final RoutingType EXTENSION = fromString("Extension");

    /** Static value Tenant for RoutingType. */
    public static final RoutingType TENANT = fromString("Tenant");

    /** Static value Fanout for RoutingType. */
    public static final RoutingType FANOUT = fromString("Fanout");

    /** Static value LocationBased for RoutingType. */
    public static final RoutingType LOCATION_BASED = fromString("LocationBased");

    /** Static value Failover for RoutingType. */
    public static final RoutingType FAILOVER = fromString("Failover");

    /** Static value CascadeExtension for RoutingType. */
    public static final RoutingType CASCADE_EXTENSION = fromString("CascadeExtension");

    /**
     * Creates a new instance of RoutingType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RoutingType() {
    }

    /**
     * Creates or finds a RoutingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoutingType.
     */
    @JsonCreator
    public static RoutingType fromString(String name) {
        return fromString(name, RoutingType.class);
    }

    /**
     * Gets known RoutingType values.
     *
     * @return known RoutingType values.
     */
    public static Collection<RoutingType> values() {
        return values(RoutingType.class);
    }
}