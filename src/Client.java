import java.util.ArrayList;

public class Client extends Person {
    private ArrayList<LibraryItem> loanedBooksList;
    private int memberNumber;

    public Client(short id, String name, String phone, String email, int memberNumber) {
        super(id, name, phone, email);
        this.loanedBooksList = new ArrayList<LibraryItem>();
        this.memberNumber = memberNumber;
    }

    public ArrayList<LibraryItem> getLoanedBookList() {
        return loanedBooksList;
    }

    public void loanBook(LibraryItem LibraryItem) {
        loanedBooksList.add(LibraryItem);
    }

    public void returnBook(LibraryItem LibraryItem) {
        loanedBooksList.remove(LibraryItem);
    }

    public int getProfessorNumber() {
        return memberNumber;
    }

    public void setProfessorNumber(int professorNumber) {
        this.memberNumber = professorNumber;
    }
}
