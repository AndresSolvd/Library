import javax.swing.*;
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

    public void loanBook(LibraryItem libraryItem) {
        if (libraryItem.getAvailability()){
            loanedBooksList.add(libraryItem);
            libraryItem.setAvailability(false);
            System.out.println("Item has been loaned out.");
        } else {
            System.out.println("Item is not available for loan.");
        }
    }

    public void returnBook(LibraryItem libraryItem) {
        if (libraryItem.getAvailability()){
            System.out.println("Item in already in the inventory");
        } else {
            loanedBooksList.remove(libraryItem);;
            libraryItem.setAvailability(true);
            System.out.println("Item has been delivered.");
        }
    }

    public int getProfessorNumber() {
        return memberNumber;
    }

    public void setProfessorNumber(int professorNumber) {
        this.memberNumber = professorNumber;
    }
}
