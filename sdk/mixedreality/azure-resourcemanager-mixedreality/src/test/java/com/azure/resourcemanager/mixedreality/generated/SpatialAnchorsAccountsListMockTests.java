// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mixedreality.MixedRealityManager;
import com.azure.resourcemanager.mixedreality.models.ResourceIdentityType;
import com.azure.resourcemanager.mixedreality.models.SkuTier;
import com.azure.resourcemanager.mixedreality.models.SpatialAnchorsAccount;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SpatialAnchorsAccountsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"storageAccountName\":\"eopzfqrhhuaopp\",\"accountId\":\"qeqxo\",\"accountDomain\":\"dahzxctobg\"},\"identity\":{\"principalId\":\"moizpos\",\"tenantId\":\"grcfb\",\"type\":\"SystemAssigned\"},\"plan\":{\"principalId\":\"qjhhkxbpv\",\"tenantId\":\"mjh\",\"type\":\"SystemAssigned\"},\"sku\":{\"name\":\"n\",\"tier\":\"Basic\",\"size\":\"vkr\",\"family\":\"wbxqzvszjfau\",\"capacity\":2022160914},\"kind\":{\"name\":\"xxivetv\",\"tier\":\"Premium\",\"size\":\"qtdo\",\"family\":\"cbxvwvxyslqbh\",\"capacity\":263048903},\"location\":\"blytk\",\"tags\":{\"wwfbkrvrnsvshq\":\"pe\"},\"id\":\"ohxcrsbfova\",\"name\":\"rruvwbhsq\",\"type\":\"sub\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MixedRealityManager manager =
            MixedRealityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SpatialAnchorsAccount> response =
            manager.spatialAnchorsAccounts().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("blytk", response.iterator().next().location());
        Assertions.assertEquals("pe", response.iterator().next().tags().get("wwfbkrvrnsvshq"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.iterator().next().plan().type());
        Assertions.assertEquals("n", response.iterator().next().sku().name());
        Assertions.assertEquals(SkuTier.BASIC, response.iterator().next().sku().tier());
        Assertions.assertEquals("vkr", response.iterator().next().sku().size());
        Assertions.assertEquals("wbxqzvszjfau", response.iterator().next().sku().family());
        Assertions.assertEquals(2022160914, response.iterator().next().sku().capacity());
        Assertions.assertEquals("xxivetv", response.iterator().next().kind().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.iterator().next().kind().tier());
        Assertions.assertEquals("qtdo", response.iterator().next().kind().size());
        Assertions.assertEquals("cbxvwvxyslqbh", response.iterator().next().kind().family());
        Assertions.assertEquals(263048903, response.iterator().next().kind().capacity());
        Assertions.assertEquals("eopzfqrhhuaopp", response.iterator().next().storageAccountName());
    }
}