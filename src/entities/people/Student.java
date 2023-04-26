package entities.people;

import exceptions.YearRangeException;

public class Student extends Client {
    private int studentCredentialNumber;

    public Student(short personId, String name, String phone, String email, int memberNumber, int studentCredentialNumber) {
        super(personId, name, phone, email, memberNumber);
        try {
            if (studentCredentialNumber <= 0 | studentCredentialNumber > 2147483647) {
                throw new YearRangeException("studentCredentialNumber invalid value(values accepted: integers between 1 and 2147483647)");
            } else {
                this.studentCredentialNumber = studentCredentialNumber;
            }
        } catch (YearRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "\nStudent Name: " + super.getName() + "\nStudent Credential: " + this.studentCredentialNumber + "\nMembership Number: " + super.getMemberNumber() + "\nContact number: " + super.getPhone() + "\n";
    }

    public int getStudentCredentialNumber() {
        return studentCredentialNumber;
    }

    public void setStudentCredentialNumber(int studentCredentialNumber) {
        this.studentCredentialNumber = studentCredentialNumber;
    }
}