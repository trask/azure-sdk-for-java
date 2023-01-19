// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.subscription.models.Operation;
import com.azure.resourcemanager.subscription.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Operation model =
            BinaryData
                .fromString(
                    "{\"name\":\"p\",\"display\":{\"provider\":\"algbquxigjyjg\",\"resource\":\"aoyfhrtxilnerkuj\",\"operation\":\"vlejuvfqa\"}}")
                .toObject(Operation.class);
        Assertions.assertEquals("p", model.name());
        Assertions.assertEquals("algbquxigjyjg", model.display().provider());
        Assertions.assertEquals("aoyfhrtxilnerkuj", model.display().resource());
        Assertions.assertEquals("vlejuvfqa", model.display().operation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Operation model =
            new Operation()
                .withName("p")
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("algbquxigjyjg")
                        .withResource("aoyfhrtxilnerkuj")
                        .withOperation("vlejuvfqa"));
        model = BinaryData.fromObject(model).toObject(Operation.class);
        Assertions.assertEquals("p", model.name());
        Assertions.assertEquals("algbquxigjyjg", model.display().provider());
        Assertions.assertEquals("aoyfhrtxilnerkuj", model.display().resource());
        Assertions.assertEquals("vlejuvfqa", model.display().operation());
    }
}