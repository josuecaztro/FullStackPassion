package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactRequestAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertContactRequestAllPropertiesEquals(ContactRequest expected, ContactRequest actual) {
        assertContactRequestAutoGeneratedPropertiesEquals(expected, actual);
        assertContactRequestAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertContactRequestAllUpdatablePropertiesEquals(ContactRequest expected, ContactRequest actual) {
        assertContactRequestUpdatableFieldsEquals(expected, actual);
        assertContactRequestUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertContactRequestAutoGeneratedPropertiesEquals(ContactRequest expected, ContactRequest actual) {
        assertThat(expected)
            .as("Verify ContactRequest auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertContactRequestUpdatableFieldsEquals(ContactRequest expected, ContactRequest actual) {
        assertThat(expected)
            .as("Verify ContactRequest relevant properties")
            .satisfies(e -> assertThat(e.getMessageBody()).as("check messageBody").isEqualTo(actual.getMessageBody()))
            .satisfies(e -> assertThat(e.getFirstName()).as("check firstName").isEqualTo(actual.getFirstName()))
            .satisfies(e -> assertThat(e.getLastName()).as("check lastName").isEqualTo(actual.getLastName()))
            .satisfies(e -> assertThat(e.getPhoneNumber()).as("check phoneNumber").isEqualTo(actual.getPhoneNumber()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertContactRequestUpdatableRelationshipsEquals(ContactRequest expected, ContactRequest actual) {}
}
