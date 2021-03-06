/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_06_01.implementation.P2sVpnServerConfigurationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing P2sVpnServerConfigurations.
 */
public interface P2sVpnServerConfigurations extends SupportsCreating<P2SVpnServerConfiguration.DefinitionStages.Blank>, HasInner<P2sVpnServerConfigurationsInner> {
    /**
     * Retrieves the details of a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<P2SVpnServerConfiguration> getAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

    /**
     * Retrieves all P2SVpnServerConfigurations for a particular VirtualWan.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<P2SVpnServerConfiguration> listByVirtualWanAsync(final String resourceGroupName, final String virtualWanName);

    /**
     * Deletes a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

}
