package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieCrew {
    private String firstName;
    private String lastName;

    public MovieCrew(@JsonProperty("firstName") String firstName,
                     @JsonProperty("lastName") String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public MovieCrew() {
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}