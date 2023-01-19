// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Gets or sets the PV Restore Mode property. This property sets whether volumes needs to be restored. */
public final class PersistentVolumeRestoreMode extends ExpandableStringEnum<PersistentVolumeRestoreMode> {
    /** Static value RestoreWithVolumeData for PersistentVolumeRestoreMode. */
    public static final PersistentVolumeRestoreMode RESTORE_WITH_VOLUME_DATA = fromString("RestoreWithVolumeData");

    /** Static value RestoreWithoutVolumeData for PersistentVolumeRestoreMode. */
    public static final PersistentVolumeRestoreMode RESTORE_WITHOUT_VOLUME_DATA =
        fromString("RestoreWithoutVolumeData");

    /**
     * Creates a new instance of PersistentVolumeRestoreMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PersistentVolumeRestoreMode() {
    }

    /**
     * Creates or finds a PersistentVolumeRestoreMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PersistentVolumeRestoreMode.
     */
    @JsonCreator
    public static PersistentVolumeRestoreMode fromString(String name) {
        return fromString(name, PersistentVolumeRestoreMode.class);
    }

    /**
     * Gets known PersistentVolumeRestoreMode values.
     *
     * @return known PersistentVolumeRestoreMode values.
     */
    public static Collection<PersistentVolumeRestoreMode> values() {
        return values(PersistentVolumeRestoreMode.class);
    }
}