/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.CassandraSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.ARMResourceProperties;

/**
 * An Azure Cosmos DB Cassandra table.
 */
@JsonFlatten
public class CassandraTableGetResultsInner extends ARMResourceProperties {
    /**
     * Name of the Cosmos DB Cassandra table.
     */
    @JsonProperty(value = "properties.id", required = true)
    private String cassandraTableGetResultsId;

    /**
     * Time to live of the Cosmos DB Cassandra table.
     */
    @JsonProperty(value = "properties.defaultTtl")
    private Integer defaultTtl;

    /**
     * Schema of the Cosmos DB Cassandra table.
     */
    @JsonProperty(value = "properties.schema")
    private CassandraSchema schema;

    /**
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "properties._rid", access = JsonProperty.Access.WRITE_ONLY)
    private String _rid;

    /**
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "properties._ts", access = JsonProperty.Access.WRITE_ONLY)
    private Object _ts;

    /**
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "properties._etag", access = JsonProperty.Access.WRITE_ONLY)
    private String _etag;

    /**
     * Get name of the Cosmos DB Cassandra table.
     *
     * @return the cassandraTableGetResultsId value
     */
    public String cassandraTableGetResultsId() {
        return this.cassandraTableGetResultsId;
    }

    /**
     * Set name of the Cosmos DB Cassandra table.
     *
     * @param cassandraTableGetResultsId the cassandraTableGetResultsId value to set
     * @return the CassandraTableGetResultsInner object itself.
     */
    public CassandraTableGetResultsInner withCassandraTableGetResultsId(String cassandraTableGetResultsId) {
        this.cassandraTableGetResultsId = cassandraTableGetResultsId;
        return this;
    }

    /**
     * Get time to live of the Cosmos DB Cassandra table.
     *
     * @return the defaultTtl value
     */
    public Integer defaultTtl() {
        return this.defaultTtl;
    }

    /**
     * Set time to live of the Cosmos DB Cassandra table.
     *
     * @param defaultTtl the defaultTtl value to set
     * @return the CassandraTableGetResultsInner object itself.
     */
    public CassandraTableGetResultsInner withDefaultTtl(Integer defaultTtl) {
        this.defaultTtl = defaultTtl;
        return this;
    }

    /**
     * Get schema of the Cosmos DB Cassandra table.
     *
     * @return the schema value
     */
    public CassandraSchema schema() {
        return this.schema;
    }

    /**
     * Set schema of the Cosmos DB Cassandra table.
     *
     * @param schema the schema value to set
     * @return the CassandraTableGetResultsInner object itself.
     */
    public CassandraTableGetResultsInner withSchema(CassandraSchema schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get a system generated property. A unique identifier.
     *
     * @return the _rid value
     */
    public String _rid() {
        return this._rid;
    }

    /**
     * Get a system generated property that denotes the last updated timestamp of the resource.
     *
     * @return the _ts value
     */
    public Object _ts() {
        return this._ts;
    }

    /**
     * Get a system generated property representing the resource etag required for optimistic concurrency control.
     *
     * @return the _etag value
     */
    public String _etag() {
        return this._etag;
    }

}
