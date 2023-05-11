package com.solvd.entities.people;

import com.solvd.exceptions.MemberAndCredentialRangeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Student extends Client {
    private static final Logger LOGGER = LogManager.getLogger(Student.class);
    private int studentCredentialNumber;

    public Student(short personId, String name, String phone, String email, int memberNumber,
                   int studentCredentialNumber) {
        super(personId, name, phone, email, memberNumber);
        this.studentCredentialNumber = studentCredentialNumber;
    }

    @Override
    public String toString() {
        return "\nStudent Name: " + super.getName() + "\nStudent Credential: " + this.studentCredentialNumber +
                "\nMembership Number: " + super.getMemberNumber() + "\nContact number: " + super.getPhone() + "\n";
    }

    public int getStudentCredentialNumber() {
        return studentCredentialNumber;
    }

    public void setStudentCredentialNumber(int studentCredentialNumber) {
        //validate studentCredentialNumber
        try {
            if (studentCredentialNumber <= 0 | studentCredentialNumber > 2147483647) {
                throw new MemberAndCredentialRangeException("studentCredentialNumber invalid value(values accepted: integers between 1 and 2147483647)");
            } else {
                this.studentCredentialNumber = studentCredentialNumber;
            }
        } catch (MemberAndCredentialRangeException e) {
            LOGGER.info(e.getMessage());
        }
    }
}