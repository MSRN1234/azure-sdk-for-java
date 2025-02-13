// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** contactFolder. */
@Fluent
public final class MicrosoftGraphContactFolder extends MicrosoftGraphEntity {
    /*
     * The folder's display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The ID of the folder's parent folder.
     */
    @JsonProperty(value = "parentFolderId")
    private String parentFolderId;

    /*
     * The collection of child folders in the folder. Navigation property.
     * Read-only. Nullable.
     */
    @JsonProperty(value = "childFolders")
    private List<MicrosoftGraphContactFolder> childFolders;

    /*
     * The contacts in the folder. Navigation property. Read-only. Nullable.
     */
    @JsonProperty(value = "contacts")
    private List<MicrosoftGraphContact> contacts;

    /*
     * The collection of multi-value extended properties defined for the
     * contactFolder. Read-only. Nullable.
     */
    @JsonProperty(value = "multiValueExtendedProperties")
    private List<MicrosoftGraphMultiValueLegacyExtendedProperty> multiValueExtendedProperties;

    /*
     * The collection of single-value extended properties defined for the
     * contactFolder. Read-only. Nullable.
     */
    @JsonProperty(value = "singleValueExtendedProperties")
    private List<MicrosoftGraphSingleValueLegacyExtendedProperty> singleValueExtendedProperties;

    /*
     * contactFolder
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: The folder's display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The folder's display name.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphContactFolder object itself.
     */
    public MicrosoftGraphContactFolder withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the parentFolderId property: The ID of the folder's parent folder.
     *
     * @return the parentFolderId value.
     */
    public String parentFolderId() {
        return this.parentFolderId;
    }

    /**
     * Set the parentFolderId property: The ID of the folder's parent folder.
     *
     * @param parentFolderId the parentFolderId value to set.
     * @return the MicrosoftGraphContactFolder object itself.
     */
    public MicrosoftGraphContactFolder withParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }

    /**
     * Get the childFolders property: The collection of child folders in the folder. Navigation property. Read-only.
     * Nullable.
     *
     * @return the childFolders value.
     */
    public List<MicrosoftGraphContactFolder> childFolders() {
        return this.childFolders;
    }

    /**
     * Set the childFolders property: The collection of child folders in the folder. Navigation property. Read-only.
     * Nullable.
     *
     * @param childFolders the childFolders value to set.
     * @return the MicrosoftGraphContactFolder object itself.
     */
    public MicrosoftGraphContactFolder withChildFolders(List<MicrosoftGraphContactFolder> childFolders) {
        this.childFolders = childFolders;
        return this;
    }

    /**
     * Get the contacts property: The contacts in the folder. Navigation property. Read-only. Nullable.
     *
     * @return the contacts value.
     */
    public List<MicrosoftGraphContact> contacts() {
        return this.contacts;
    }

    /**
     * Set the contacts property: The contacts in the folder. Navigation property. Read-only. Nullable.
     *
     * @param contacts the contacts value to set.
     * @return the MicrosoftGraphContactFolder object itself.
     */
    public MicrosoftGraphContactFolder withContacts(List<MicrosoftGraphContact> contacts) {
        this.contacts = contacts;
        return this;
    }

    /**
     * Get the multiValueExtendedProperties property: The collection of multi-value extended properties defined for the
     * contactFolder. Read-only. Nullable.
     *
     * @return the multiValueExtendedProperties value.
     */
    public List<MicrosoftGraphMultiValueLegacyExtendedProperty> multiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }

    /**
     * Set the multiValueExtendedProperties property: The collection of multi-value extended properties defined for the
     * contactFolder. Read-only. Nullable.
     *
     * @param multiValueExtendedProperties the multiValueExtendedProperties value to set.
     * @return the MicrosoftGraphContactFolder object itself.
     */
    public MicrosoftGraphContactFolder withMultiValueExtendedProperties(
        List<MicrosoftGraphMultiValueLegacyExtendedProperty> multiValueExtendedProperties) {
        this.multiValueExtendedProperties = multiValueExtendedProperties;
        return this;
    }

    /**
     * Get the singleValueExtendedProperties property: The collection of single-value extended properties defined for
     * the contactFolder. Read-only. Nullable.
     *
     * @return the singleValueExtendedProperties value.
     */
    public List<MicrosoftGraphSingleValueLegacyExtendedProperty> singleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }

    /**
     * Set the singleValueExtendedProperties property: The collection of single-value extended properties defined for
     * the contactFolder. Read-only. Nullable.
     *
     * @param singleValueExtendedProperties the singleValueExtendedProperties value to set.
     * @return the MicrosoftGraphContactFolder object itself.
     */
    public MicrosoftGraphContactFolder withSingleValueExtendedProperties(
        List<MicrosoftGraphSingleValueLegacyExtendedProperty> singleValueExtendedProperties) {
        this.singleValueExtendedProperties = singleValueExtendedProperties;
        return this;
    }

    /**
     * Get the additionalProperties property: contactFolder.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: contactFolder.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphContactFolder object itself.
     */
    public MicrosoftGraphContactFolder withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphContactFolder withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (childFolders() != null) {
            childFolders().forEach(e -> e.validate());
        }
        if (contacts() != null) {
            contacts().forEach(e -> e.validate());
        }
        if (multiValueExtendedProperties() != null) {
            multiValueExtendedProperties().forEach(e -> e.validate());
        }
        if (singleValueExtendedProperties() != null) {
            singleValueExtendedProperties().forEach(e -> e.validate());
        }
    }
}
