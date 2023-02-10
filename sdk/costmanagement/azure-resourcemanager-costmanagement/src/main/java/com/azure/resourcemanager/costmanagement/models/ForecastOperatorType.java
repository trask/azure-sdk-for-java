// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The operator to use for comparison. */
public final class ForecastOperatorType extends ExpandableStringEnum<ForecastOperatorType> {
    /** Static value In for ForecastOperatorType. */
    public static final ForecastOperatorType IN = fromString("In");

    /**
     * Creates a new instance of ForecastOperatorType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ForecastOperatorType() {
    }

    /**
     * Creates or finds a ForecastOperatorType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ForecastOperatorType.
     */
    @JsonCreator
    public static ForecastOperatorType fromString(String name) {
        return fromString(name, ForecastOperatorType.class);
    }

    /**
     * Gets known ForecastOperatorType values.
     *
     * @return known ForecastOperatorType values.
     */
    public static Collection<ForecastOperatorType> values() {
        return values(ForecastOperatorType.class);
    }
}