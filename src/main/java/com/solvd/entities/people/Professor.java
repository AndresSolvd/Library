package com.solvd.entities.people;

import com.solvd.exceptions.MemberAndCredentialRangeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Professor extends Client {
    private static final Logger LOGGER = LogManager.getLogger(Professor.class);
    private int professorCredentialNumber;

    public Professor(short id, String name, String phone, String email, int memberNumber,
                     int professorCredentialNumber) {
        super(id, name, phone, email, memberNumber);
        this.professorCredentialNumber = professorCredentialNumber;
    }

    @Override
    public String toString() {
        return "\nProfessor Name: " + super.getName() + "\nProfessor Credential: " + this.professorCredentialNumber +
                "\nMembership Number: " + super.getMemberNumber() + "\nContact Number: " + super.getPhone() + "\n";
    }

    public int getProfessorCredentialNumber() {
        return professorCredentialNumber;
    }

    public void setProfessorCredentialNumber(int professorCredentialNumber) {
        //validate professorCredentialNumber
        try {
            if (professorCredentialNumber <= 0) {
                throw new MemberAndCredentialRangeException("professorCredentialNumber invalid " +
                        "value(values accepted: integers between 1 and 2147483647)");
            } else {
                this.professorCredentialNumber = professorCredentialNumber;
            }
        } catch (MemberAndCredentialRangeException e) {
            LOGGER.info(e.getMessage());
        }
    }
}