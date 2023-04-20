package entities.people;

public class Professor extends Client {
    private int professorCredentialNumber;

    public Professor(short id, String name, String phone, String email, int memberNumber, int professorCredentialNumber) {
        super(id, name, phone, email, memberNumber);
        this.professorCredentialNumber = professorCredentialNumber;
    }

    @Override
    public String toString(){
        return "\nentities.people.Professor Name: " + super.getName() + "\nentities.people.Professor Credential: " + this.professorCredentialNumber + "\nMember Code: " + super.getMemberNumber() + "\nContact Number: " + super.getPhone() + "\n";
    }

    public int getProfessorCredentialNumber() {
        return professorCredentialNumber;
    }

    public void setProfessorCredentialNumber(int professorCredentialNumber) {
        this.professorCredentialNumber = professorCredentialNumber;
    }
}