public class Professor extends Client {
    private int professorNumber;

    public Professor(short id, String name, String phone, String email, int memberNumber, int professorNumber) {
        super(id, name, phone, email, memberNumber);
        this.professorNumber = professorNumber;
    }

    public int getProfessorNumber() {
        return professorNumber;
    }

    public void setProfessorNumber(int professorNumber) {
        this.professorNumber = professorNumber;
    }
}