/*******************************************************************************
 * Copyright (c) 2024 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package io.openliberty.jpa.data.tests.models;

import java.util.ArrayList;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Entity for testing DiscriminatorColumn/Value.
 */
@Entity
public class ShippingAddress {

    @Id
    public Long id;

    public String city;

    public String state;

    @Embedded
    public StreetAddress streetAddress;

    public int zipCode;

    // Constructors
    public ShippingAddress() {}

    public ShippingAddress(Long id, String city, String state, StreetAddress streetAddress, int zipCode) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }
}