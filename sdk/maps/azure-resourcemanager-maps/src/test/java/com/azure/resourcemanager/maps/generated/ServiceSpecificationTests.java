// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maps.models.MetricSpecification;
import com.azure.resourcemanager.maps.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceSpecification model =
            BinaryData
                .fromString(
                    "{\"metricSpecifications\":[{\"name\":\"gou\",\"displayName\":\"ndlik\",\"displayDescription\":\"qkgfgibma\",\"unit\":\"akeqs\",\"dimensions\":[],\"aggregationType\":\"zqqedq\",\"fillGapWithZero\":true,\"category\":\"iqfouflmmnkz\",\"resourceIdDimensionNameOverride\":\"odmgl\"},{\"name\":\"gpbkwtmut\",\"displayName\":\"qktapspwgcuert\",\"displayDescription\":\"kdosvqw\",\"unit\":\"mdgbbjfdd\",\"dimensions\":[],\"aggregationType\":\"bexppb\",\"fillGapWithZero\":false,\"category\":\"rolfpfp\",\"resourceIdDimensionNameOverride\":\"lgbquxig\"},{\"name\":\"jgzjaoyfhrtx\",\"displayName\":\"n\",\"displayDescription\":\"kujysvlejuvfq\",\"unit\":\"rlyxwjkcprbnw\",\"dimensions\":[],\"aggregationType\":\"vtb\",\"fillGapWithZero\":true,\"category\":\"szdnr\",\"resourceIdDimensionNameOverride\":\"qguhmuo\"}]}")
                .toObject(ServiceSpecification.class);
        Assertions.assertEquals("gou", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("ndlik", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("qkgfgibma", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("akeqs", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("zqqedq", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals(true, model.metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("iqfouflmmnkz", model.metricSpecifications().get(0).category());
        Assertions.assertEquals("odmgl", model.metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceSpecification model =
            new ServiceSpecification()
                .withMetricSpecifications(
                    Arrays
                        .asList(
                            new MetricSpecification()
                                .withName("gou")
                                .withDisplayName("ndlik")
                                .withDisplayDescription("qkgfgibma")
                                .withUnit("akeqs")
                                .withDimensions(Arrays.asList())
                                .withAggregationType("zqqedq")
                                .withFillGapWithZero(true)
                                .withCategory("iqfouflmmnkz")
                                .withResourceIdDimensionNameOverride("odmgl"),
                            new MetricSpecification()
                                .withName("gpbkwtmut")
                                .withDisplayName("qktapspwgcuert")
                                .withDisplayDescription("kdosvqw")
                                .withUnit("mdgbbjfdd")
                                .withDimensions(Arrays.asList())
                                .withAggregationType("bexppb")
                                .withFillGapWithZero(false)
                                .withCategory("rolfpfp")
                                .withResourceIdDimensionNameOverride("lgbquxig"),
                            new MetricSpecification()
                                .withName("jgzjaoyfhrtx")
                                .withDisplayName("n")
                                .withDisplayDescription("kujysvlejuvfq")
                                .withUnit("rlyxwjkcprbnw")
                                .withDimensions(Arrays.asList())
                                .withAggregationType("vtb")
                                .withFillGapWithZero(true)
                                .withCategory("szdnr")
                                .withResourceIdDimensionNameOverride("qguhmuo")));
        model = BinaryData.fromObject(model).toObject(ServiceSpecification.class);
        Assertions.assertEquals("gou", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("ndlik", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("qkgfgibma", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("akeqs", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("zqqedq", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals(true, model.metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("iqfouflmmnkz", model.metricSpecifications().get(0).category());
        Assertions.assertEquals("odmgl", model.metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }
}