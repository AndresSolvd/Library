package entities.people;

public class Student extends Client {
    private int studentCredentialNumber;

    public Student(short personId, String name, String phone, String email, int memberNumber, int studentCredentialNumber) {
        super(personId, name, phone, email, memberNumber);
        this.studentCredentialNumber = studentCredentialNumber;
    }

    @Override
    public String toString(){
        return "\nentities.people.Student Name: " + super.getName() + "\nentities.people.Student Credential: " + this.studentCredentialNumber + "\nMember Number: " + super.getMemberNumber() + "\nContact number: " + super. getPhone() + "\n";
    }

    public int getStudentCredentialNumber() {
        return studentCredentialNumber;
    }

    public void setStudentCredentialNumber(int studentCredentialNumber) {
        this.studentCredentialNumber = studentCredentialNumber;
    }
}