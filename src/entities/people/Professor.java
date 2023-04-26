package entities.people;

import exceptions.YearRangeException;

public class Professor extends Client {
    private int professorCredentialNumber;

    public Professor(short id, String name, String phone, String email, int memberNumber, int professorCredentialNumber) {
        super(id, name, phone, email, memberNumber);
        //validate memberNumber
        try {
            if (professorCredentialNumber <= 0 | professorCredentialNumber > 2147483647) {
                throw new YearRangeException("professorCredentialNumber invalid value(values accepted: integers between 1 and 2147483647)");
            } else {
                this.professorCredentialNumber = professorCredentialNumber;
            }
        } catch (YearRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "\nProfessor Name: " + super.getName() + "\nProfessor Credential: " + this.professorCredentialNumber + "\nMembership Number: " + super.getMemberNumber() + "\nContact Number: " + super.getPhone() + "\n";
    }

    public int getProfessorCredentialNumber() {
        return professorCredentialNumber;
    }

    public void setProfessorCredentialNumber(int professorCredentialNumber) {
        this.professorCredentialNumber = professorCredentialNumber;
    }
}