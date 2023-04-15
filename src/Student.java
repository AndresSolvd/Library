public class Student extends Client {
    private int studentNumber;

    public Student(short id, String name, String phone, String email, int studentNumber) {
        super(id, name, phone, email);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}