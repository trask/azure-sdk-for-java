// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.fluent.models.AvailableContactsInner;
import com.azure.resourcemanager.orbital.models.AvailableContactsSpacecraft;
import org.junit.jupiter.api.Assertions;

public final class AvailableContactsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableContactsInner model =
            BinaryData
                .fromString(
                    "{\"spacecraft\":{\"id\":\"x\"},\"groundStationName\":\"jpgd\",\"properties\":{\"maximumElevationDegrees\":6.1451674,\"txStartTime\":\"2021-06-27T10:08:15Z\",\"txEndTime\":\"2021-04-14T06:41:07Z\",\"rxStartTime\":\"2021-01-16T20:17:07Z\",\"rxEndTime\":\"2021-02-07T18:02:36Z\",\"startAzimuthDegrees\":18.75108,\"endAzimuthDegrees\":6.7996445,\"startElevationDegrees\":49.9817,\"endElevationDegrees\":5.346817}}")
                .toObject(AvailableContactsInner.class);
        Assertions.assertEquals("x", model.spacecraft().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableContactsInner model =
            new AvailableContactsInner().withSpacecraft(new AvailableContactsSpacecraft().withId("x"));
        model = BinaryData.fromObject(model).toObject(AvailableContactsInner.class);
        Assertions.assertEquals("x", model.spacecraft().id());
    }
}