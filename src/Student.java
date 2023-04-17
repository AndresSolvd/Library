public class Student extends Client {
    private int studentNumber;

    public Student(short personId, String name, String phone, String email, int memberNumber, int studentNumber) {
        super(personId, name, phone, email, memberNumber);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}