package com.solvd.entities.people;

import com.solvd.exceptions.IdRangeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class Person {
    private static final Logger LOGGER = LogManager.getLogger(Person.class);
    public static int activityCounter;
    protected short personId;
    protected String name;
    protected String phone;
    protected String email;

    public Person(short personId, String name, String phone, String email) {
        this.personId = personId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        activityCounter++;
    }

    // Print total attempts to create Persons
    public static void activity() {
        System.out.println("Total attempts to create Persons: " + Person.activityCounter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getPersonId() == person.getPersonId() && Objects.equals(getName(), person.getName())
                && Objects.equals(getPhone(), person.getPhone()) && Objects.equals(getEmail(), person.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getName(), getPhone(), getEmail());
    }

    public short getPersonId() {
        return personId;
    }

    public void setPersonId(short personId) {
        // Check valid id number
        try {
            if (personId < 0) {
                throw new IdRangeException("personId invalid value (values accepted: integers between 0 and 32,767)");
            } else {
                this.personId = personId;
            }
        } catch (IdRangeException e) {
            LOGGER.info(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}