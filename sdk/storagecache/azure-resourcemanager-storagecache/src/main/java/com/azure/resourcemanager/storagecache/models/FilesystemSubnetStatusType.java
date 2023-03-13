// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The status of the AML file system subnet check. */
public final class FilesystemSubnetStatusType extends ExpandableStringEnum<FilesystemSubnetStatusType> {
    /** Static value Ok for FilesystemSubnetStatusType. */
    public static final FilesystemSubnetStatusType OK = fromString("Ok");

    /** Static value Invalid for FilesystemSubnetStatusType. */
    public static final FilesystemSubnetStatusType INVALID = fromString("Invalid");

    /**
     * Creates a new instance of FilesystemSubnetStatusType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FilesystemSubnetStatusType() {
    }

    /**
     * Creates or finds a FilesystemSubnetStatusType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FilesystemSubnetStatusType.
     */
    @JsonCreator
    public static FilesystemSubnetStatusType fromString(String name) {
        return fromString(name, FilesystemSubnetStatusType.class);
    }

    /**
     * Gets known FilesystemSubnetStatusType values.
     *
     * @return known FilesystemSubnetStatusType values.
     */
    public static Collection<FilesystemSubnetStatusType> values() {
        return values(FilesystemSubnetStatusType.class);
    }
}