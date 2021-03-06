/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters supplied to the create test job operation.
 */
public class TestJobCreateParameters {
    /**
     * Gets or sets the parameters of the test job.
     */
    @JsonProperty(value = "parameters")
    private Map<String, String> parameters;

    /**
     * Gets or sets the runOn which specifies the group name where the job is
     * to be executed.
     */
    @JsonProperty(value = "runOn")
    private String runOn;

    /**
     * Get gets or sets the parameters of the test job.
     *
     * @return the parameters value
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set gets or sets the parameters of the test job.
     *
     * @param parameters the parameters value to set
     * @return the TestJobCreateParameters object itself.
     */
    public TestJobCreateParameters withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get gets or sets the runOn which specifies the group name where the job is to be executed.
     *
     * @return the runOn value
     */
    public String runOn() {
        return this.runOn;
    }

    /**
     * Set gets or sets the runOn which specifies the group name where the job is to be executed.
     *
     * @param runOn the runOn value to set
     * @return the TestJobCreateParameters object itself.
     */
    public TestJobCreateParameters withRunOn(String runOn) {
        this.runOn = runOn;
        return this;
    }

}
