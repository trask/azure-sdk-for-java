// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.AS2MdnSettings;
import com.azure.resourcemanager.logic.models.HashingAlgorithm;
import org.junit.jupiter.api.Assertions;

public final class AS2MdnSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AS2MdnSettings model =
            BinaryData
                .fromString(
                    "{\"needMDN\":false,\"signMDN\":false,\"sendMDNAsynchronously\":true,\"receiptDeliveryUrl\":\"qujizdvo\",\"dispositionNotificationTo\":\"tiby\",\"signOutboundMDNIfOptional\":false,\"mdnText\":\"blgyavutpthj\",\"sendInboundMDNToMessageBox\":false,\"micHashingAlgorithm\":\"SHA2256\"}")
                .toObject(AS2MdnSettings.class);
        Assertions.assertEquals(false, model.needMdn());
        Assertions.assertEquals(false, model.signMdn());
        Assertions.assertEquals(true, model.sendMdnAsynchronously());
        Assertions.assertEquals("qujizdvo", model.receiptDeliveryUrl());
        Assertions.assertEquals("tiby", model.dispositionNotificationTo());
        Assertions.assertEquals(false, model.signOutboundMdnIfOptional());
        Assertions.assertEquals("blgyavutpthj", model.mdnText());
        Assertions.assertEquals(false, model.sendInboundMdnToMessageBox());
        Assertions.assertEquals(HashingAlgorithm.SHA2256, model.micHashingAlgorithm());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AS2MdnSettings model =
            new AS2MdnSettings()
                .withNeedMdn(false)
                .withSignMdn(false)
                .withSendMdnAsynchronously(true)
                .withReceiptDeliveryUrl("qujizdvo")
                .withDispositionNotificationTo("tiby")
                .withSignOutboundMdnIfOptional(false)
                .withMdnText("blgyavutpthj")
                .withSendInboundMdnToMessageBox(false)
                .withMicHashingAlgorithm(HashingAlgorithm.SHA2256);
        model = BinaryData.fromObject(model).toObject(AS2MdnSettings.class);
        Assertions.assertEquals(false, model.needMdn());
        Assertions.assertEquals(false, model.signMdn());
        Assertions.assertEquals(true, model.sendMdnAsynchronously());
        Assertions.assertEquals("qujizdvo", model.receiptDeliveryUrl());
        Assertions.assertEquals("tiby", model.dispositionNotificationTo());
        Assertions.assertEquals(false, model.signOutboundMdnIfOptional());
        Assertions.assertEquals("blgyavutpthj", model.mdnText());
        Assertions.assertEquals(false, model.sendInboundMdnToMessageBox());
        Assertions.assertEquals(HashingAlgorithm.SHA2256, model.micHashingAlgorithm());
    }
}