package entities.people;

public class Professor extends Client {
    private int professorCredentialNumber;

    public Professor(short id, String name, String phone, String email, int memberNumber, int professorCredentialNumber) {
        super(id, name, phone, email, memberNumber);
        this.professorCredentialNumber = professorCredentialNumber;
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