/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Advance configuration for AKS networking.
 */
public class AksNetworkingConfiguration {
    /**
     * Virtual network subnet resource ID the compute nodes belong to.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /**
     * A CIDR notation IP range from which to assign service cluster IPs. It
     * must not overlap with any Subnet IP ranges.
     */
    @JsonProperty(value = "serviceCidr")
    private String serviceCidr;

    /**
     * An IP address assigned to the Kubernetes DNS service. It must be within
     * the Kubernetes service address range specified in serviceCidr.
     */
    @JsonProperty(value = "dnsServiceIP")
    private String dnsServiceIP;

    /**
     * A CIDR notation IP range assigned to the Docker bridge network. It must
     * not overlap with any Subnet IP ranges or the Kubernetes service address
     * range.
     */
    @JsonProperty(value = "dockerBridgeCidr")
    private String dockerBridgeCidr;

    /**
     * Get virtual network subnet resource ID the compute nodes belong to.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set virtual network subnet resource ID the compute nodes belong to.
     *
     * @param subnetId the subnetId value to set
     * @return the AksNetworkingConfiguration object itself.
     */
    public AksNetworkingConfiguration withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get a CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP ranges.
     *
     * @return the serviceCidr value
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }

    /**
     * Set a CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP ranges.
     *
     * @param serviceCidr the serviceCidr value to set
     * @return the AksNetworkingConfiguration object itself.
     */
    public AksNetworkingConfiguration withServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }

    /**
     * Get an IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range specified in serviceCidr.
     *
     * @return the dnsServiceIP value
     */
    public String dnsServiceIP() {
        return this.dnsServiceIP;
    }

    /**
     * Set an IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range specified in serviceCidr.
     *
     * @param dnsServiceIP the dnsServiceIP value to set
     * @return the AksNetworkingConfiguration object itself.
     */
    public AksNetworkingConfiguration withDnsServiceIP(String dnsServiceIP) {
        this.dnsServiceIP = dnsServiceIP;
        return this;
    }

    /**
     * Get a CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @return the dockerBridgeCidr value
     */
    public String dockerBridgeCidr() {
        return this.dockerBridgeCidr;
    }

    /**
     * Set a CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @param dockerBridgeCidr the dockerBridgeCidr value to set
     * @return the AksNetworkingConfiguration object itself.
     */
    public AksNetworkingConfiguration withDockerBridgeCidr(String dockerBridgeCidr) {
        this.dockerBridgeCidr = dockerBridgeCidr;
        return this;
    }

}
