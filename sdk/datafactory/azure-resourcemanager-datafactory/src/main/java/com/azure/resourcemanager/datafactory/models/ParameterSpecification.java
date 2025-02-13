// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of a single parameter for an entity. */
@Fluent
public final class ParameterSpecification {
    /*
     * Parameter type.
     */
    @JsonProperty(value = "type", required = true)
    private ParameterType type;

    /*
     * Default value of parameter.
     */
    @JsonProperty(value = "defaultValue")
    private Object defaultValue;

    /**
     * Get the type property: Parameter type.
     *
     * @return the type value.
     */
    public ParameterType type() {
        return this.type;
    }

    /**
     * Set the type property: Parameter type.
     *
     * @param type the type value to set.
     * @return the ParameterSpecification object itself.
     */
    public ParameterSpecification withType(ParameterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the defaultValue property: Default value of parameter.
     *
     * @return the defaultValue value.
     */
    public Object defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the defaultValue property: Default value of parameter.
     *
     * @param defaultValue the defaultValue value to set.
     * @return the ParameterSpecification object itself.
     */
    public ParameterSpecification withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ParameterSpecification"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ParameterSpecification.class);
}
