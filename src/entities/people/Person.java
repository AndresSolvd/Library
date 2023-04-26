package entities.people;

import java.util.Objects;

public abstract class Person {
    protected short personId;
    protected String name;
    protected String phone;
    protected String email;
    public static int activityCounter;

    public Person(short personId, String name, String phone, String email) {
        this.personId = personId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        activityCounter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getPersonId() == person.getPersonId() && Objects.equals(getName(), person.getName()) && Objects.equals(getPhone(), person.getPhone()) && Objects.equals(getEmail(), person.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getName(), getPhone(), getEmail());
    }

    // Print total attempts to create Persons
    public static void activity() {
        System.out.println("Total attempts to create Persons: " + Person.activityCounter);
    }

    public short getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPersonId(short personId) {
        this.personId = personId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
