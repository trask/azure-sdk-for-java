// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpoint;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpoint model = BinaryData.fromString("{\"id\":\"fwnfnb\"}").toObject(PrivateEndpoint.class);
        Assertions.assertEquals("fwnfnb", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpoint model = new PrivateEndpoint().withId("fwnfnb");
        model = BinaryData.fromObject(model).toObject(PrivateEndpoint.class);
        Assertions.assertEquals("fwnfnb", model.id());
    }
}