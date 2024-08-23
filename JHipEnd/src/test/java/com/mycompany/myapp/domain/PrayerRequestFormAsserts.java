package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class PrayerRequestFormAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPrayerRequestFormAllPropertiesEquals(PrayerRequestForm expected, PrayerRequestForm actual) {
        assertPrayerRequestFormAutoGeneratedPropertiesEquals(expected, actual);
        assertPrayerRequestFormAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPrayerRequestFormAllUpdatablePropertiesEquals(PrayerRequestForm expected, PrayerRequestForm actual) {
        assertPrayerRequestFormUpdatableFieldsEquals(expected, actual);
        assertPrayerRequestFormUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPrayerRequestFormAutoGeneratedPropertiesEquals(PrayerRequestForm expected, PrayerRequestForm actual) {
        assertThat(expected)
            .as("Verify PrayerRequestForm auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPrayerRequestFormUpdatableFieldsEquals(PrayerRequestForm expected, PrayerRequestForm actual) {
        assertThat(expected)
            .as("Verify PrayerRequestForm relevant properties")
            .satisfies(e -> assertThat(e.getDescription()).as("check description").isEqualTo(actual.getDescription()))
            .satisfies(e -> assertThat(e.getTimeFrame()).as("check timeFrame").isEqualTo(actual.getTimeFrame()))
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
    public static void assertPrayerRequestFormUpdatableRelationshipsEquals(PrayerRequestForm expected, PrayerRequestForm actual) {}
}
