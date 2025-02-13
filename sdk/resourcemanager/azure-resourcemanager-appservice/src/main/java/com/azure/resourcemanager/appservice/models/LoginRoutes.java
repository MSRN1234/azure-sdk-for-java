// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The routes that specify the endpoints used for login and logout requests. */
@Fluent
public final class LoginRoutes {
    /*
     * The endpoint at which a logout request should be made.
     */
    @JsonProperty(value = "logoutEndpoint")
    private String logoutEndpoint;

    /**
     * Get the logoutEndpoint property: The endpoint at which a logout request should be made.
     *
     * @return the logoutEndpoint value.
     */
    public String logoutEndpoint() {
        return this.logoutEndpoint;
    }

    /**
     * Set the logoutEndpoint property: The endpoint at which a logout request should be made.
     *
     * @param logoutEndpoint the logoutEndpoint value to set.
     * @return the LoginRoutes object itself.
     */
    public LoginRoutes withLogoutEndpoint(String logoutEndpoint) {
        this.logoutEndpoint = logoutEndpoint;
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
