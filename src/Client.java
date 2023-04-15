import java.util.ArrayList;
import java.util.ArrayList;

public class Client extends Person {
    private ArrayList<Book> loanedBooksList;

    public Client(short id, String name, String phone, String email) {
        super(id, name, phone, email);
        this.loanedBooksList = new ArrayList<Book>();
    }

    public ArrayList<Book> getLoanedBookList() {
        return loanedBooksList;
    }

    public void loanBook(Book book) {
        loanedBooksList.add(book);
    }

    public void returnBook(Book book) {
        loanedBooksList.remove(book);
    }
}
