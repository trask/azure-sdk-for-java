// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.UserInner;
import com.azure.resourcemanager.devtestlabs.models.UserList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UserListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"createdDate\":\"2021-07-31T19:11:24Z\",\"provisioningState\":\"nmwcpmgu\",\"uniqueIdentifier\":\"draufactkah\"},\"location\":\"ovajjziuxxps\",\"tags\":{\"ulfgslqu\":\"e\",\"pjuohminyfl\":\"kwdlenrdsutujba\",\"w\":\"orwmduvwpklv\",\"epn\":\"ygdxpgpqchis\"},\"id\":\"bjcrxgibbdaxco\",\"name\":\"fozauorsuk\",\"type\":\"kwbqplhlvnuu\"},{\"properties\":{\"createdDate\":\"2021-03-16T20:13:21Z\",\"provisioningState\":\"wzsoldweyuqdunv\",\"uniqueIdentifier\":\"nrwrbiork\"},\"location\":\"alywjhhgdn\",\"tags\":{\"ggdufiqndieu\":\"sivfomilo\"},\"id\":\"ao\",\"name\":\"jchvcyy\",\"type\":\"s\"}],\"nextLink\":\"dotcubiipuip\"}")
                .toObject(UserList.class);
        Assertions.assertEquals("ovajjziuxxps", model.value().get(0).location());
        Assertions.assertEquals("e", model.value().get(0).tags().get("ulfgslqu"));
        Assertions.assertEquals("dotcubiipuip", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserList model =
            new UserList()
                .withValue(
                    Arrays
                        .asList(
                            new UserInner()
                                .withLocation("ovajjziuxxps")
                                .withTags(
                                    mapOf(
                                        "ulfgslqu",
                                        "e",
                                        "pjuohminyfl",
                                        "kwdlenrdsutujba",
                                        "w",
                                        "orwmduvwpklv",
                                        "epn",
                                        "ygdxpgpqchis")),
                            new UserInner().withLocation("alywjhhgdn").withTags(mapOf("ggdufiqndieu", "sivfomilo"))))
                .withNextLink("dotcubiipuip");
        model = BinaryData.fromObject(model).toObject(UserList.class);
        Assertions.assertEquals("ovajjziuxxps", model.value().get(0).location());
        Assertions.assertEquals("e", model.value().get(0).tags().get("ulfgslqu"));
        Assertions.assertEquals("dotcubiipuip", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}