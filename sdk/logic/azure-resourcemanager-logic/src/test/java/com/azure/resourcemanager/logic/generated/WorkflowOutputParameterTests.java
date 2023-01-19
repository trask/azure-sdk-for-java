// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.ParameterType;
import com.azure.resourcemanager.logic.models.WorkflowOutputParameter;
import org.junit.jupiter.api.Assertions;

public final class WorkflowOutputParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkflowOutputParameter model =
            BinaryData
                .fromString(
                    "{\"error\":\"dataofmxagkvtmelmqkr\",\"type\":\"Array\",\"value\":\"dataljuahaquhcdh\",\"metadata\":\"dataualaexqpvfadmw\",\"description\":\"crgvxpvgom\"}")
                .toObject(WorkflowOutputParameter.class);
        Assertions.assertEquals(ParameterType.ARRAY, model.type());
        Assertions.assertEquals("crgvxpvgom", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkflowOutputParameter model =
            new WorkflowOutputParameter()
                .withType(ParameterType.ARRAY)
                .withValue("dataljuahaquhcdh")
                .withMetadata("dataualaexqpvfadmw")
                .withDescription("crgvxpvgom");
        model = BinaryData.fromObject(model).toObject(WorkflowOutputParameter.class);
        Assertions.assertEquals(ParameterType.ARRAY, model.type());
        Assertions.assertEquals("crgvxpvgom", model.description());
    }
}