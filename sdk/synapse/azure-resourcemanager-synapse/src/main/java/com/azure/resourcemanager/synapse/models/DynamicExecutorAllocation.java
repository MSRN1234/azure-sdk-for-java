// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Dynamic Executor Allocation Properties. */
@Fluent
public final class DynamicExecutorAllocation {
    /*
     * Indicates whether Dynamic Executor Allocation is enabled or not.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The minimum number of executors alloted
     */
    @JsonProperty(value = "minExecutors")
    private Integer minExecutors;

    /*
     * The maximum number of executors alloted
     */
    @JsonProperty(value = "maxExecutors")
    private Integer maxExecutors;

    /**
     * Get the enabled property: Indicates whether Dynamic Executor Allocation is enabled or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether Dynamic Executor Allocation is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the DynamicExecutorAllocation object itself.
     */
    public DynamicExecutorAllocation withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the minExecutors property: The minimum number of executors alloted.
     *
     * @return the minExecutors value.
     */
    public Integer minExecutors() {
        return this.minExecutors;
    }

    /**
     * Set the minExecutors property: The minimum number of executors alloted.
     *
     * @param minExecutors the minExecutors value to set.
     * @return the DynamicExecutorAllocation object itself.
     */
    public DynamicExecutorAllocation withMinExecutors(Integer minExecutors) {
        this.minExecutors = minExecutors;
        return this;
    }

    /**
     * Get the maxExecutors property: The maximum number of executors alloted.
     *
     * @return the maxExecutors value.
     */
    public Integer maxExecutors() {
        return this.maxExecutors;
    }

    /**
     * Set the maxExecutors property: The maximum number of executors alloted.
     *
     * @param maxExecutors the maxExecutors value to set.
     * @return the DynamicExecutorAllocation object itself.
     */
    public DynamicExecutorAllocation withMaxExecutors(Integer maxExecutors) {
        this.maxExecutors = maxExecutors;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
