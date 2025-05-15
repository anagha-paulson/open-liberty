package io.openliberty.jpa.data.tests.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;

/**
 * Embeddable class representing a street address,
 * including a house number and street name.
 */
@Embeddable
public class StreetAddress {
    @ElementCollection
    public List<String> recipientInfo = new ArrayList<>();

    public int houseNumber;

    public String streetName;

    public StreetAddress() {}

    public StreetAddress(int houseNumber, String streetName) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }
}
