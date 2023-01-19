// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.FirewallRuleInner;
import org.junit.jupiter.api.Assertions;

public final class FirewallRuleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FirewallRuleInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"startIpAddress\":\"rsoodqxhcrmnoh\",\"endIpAddress\":\"t\"},\"id\":\"kwh\",\"name\":\"soifiyipjxsqw\",\"type\":\"gr\"}")
                .toObject(FirewallRuleInner.class);
        Assertions.assertEquals("rsoodqxhcrmnoh", model.startIpAddress());
        Assertions.assertEquals("t", model.endIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FirewallRuleInner model = new FirewallRuleInner().withStartIpAddress("rsoodqxhcrmnoh").withEndIpAddress("t");
        model = BinaryData.fromObject(model).toObject(FirewallRuleInner.class);
        Assertions.assertEquals("rsoodqxhcrmnoh", model.startIpAddress());
        Assertions.assertEquals("t", model.endIpAddress());
    }
}