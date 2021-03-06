/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01.implementation;

import com.microsoft.azure.management.resources.v2018_02_01.ResourceGroupProperties;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource group information.
 */
public class ResourceGroupInner {
    /**
     * The ID of the resource group.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The name of the resource group.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private ResourceGroupProperties properties;

    /**
     * The location of the resource group. It cannot be changed after the
     * resource group has been created. It must be one of the supported Azure
     * locations.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The ID of the resource that manages this resource group.
     */
    @JsonProperty(value = "managedBy")
    private String managedBy;

    /**
     * The tags attached to the resource group.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the ID of the resource group.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name of the resource group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource group.
     *
     * @param name the name value to set
     * @return the ResourceGroupInner object itself.
     */
    public ResourceGroupInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public ResourceGroupProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the ResourceGroupInner object itself.
     */
    public ResourceGroupInner withProperties(ResourceGroupProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location of the resource group. It cannot be changed after the resource group has been created. It must be one of the supported Azure locations.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the resource group. It cannot be changed after the resource group has been created. It must be one of the supported Azure locations.
     *
     * @param location the location value to set
     * @return the ResourceGroupInner object itself.
     */
    public ResourceGroupInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the ID of the resource that manages this resource group.
     *
     * @return the managedBy value
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Set the ID of the resource that manages this resource group.
     *
     * @param managedBy the managedBy value to set
     * @return the ResourceGroupInner object itself.
     */
    public ResourceGroupInner withManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

    /**
     * Get the tags attached to the resource group.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags attached to the resource group.
     *
     * @param tags the tags value to set
     * @return the ResourceGroupInner object itself.
     */
    public ResourceGroupInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
