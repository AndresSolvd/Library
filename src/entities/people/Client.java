package entities.people;

import entities.libraryitems.LibraryItem;

import java.util.ArrayList;

public class Client extends Person {
    private int memberNumber;
    private ArrayList<LibraryItem> loanedBooksList;

    public Client(short id, String name, String phone, String email, int memberNumber) {
        super(id, name, phone, email);
        this.loanedBooksList = new ArrayList<>();
        this.memberNumber = memberNumber;
    }

    @Override
    public String toString() {
        return "\nClient Name: " + super.getName() + "\nMembership Number: " + this.memberNumber + "\n";
    }

    public ArrayList<LibraryItem> getLoanedBookList() {
        return loanedBooksList;
    }

    public void loanBook(LibraryItem libraryItem) {
        if (libraryItem.getAvailability()) {
            loanedBooksList.add(libraryItem);
            libraryItem.setAvailability(false);
            System.out.println("Item has been loaned out.");
        } else {
            System.out.println("Item is not available for loan.");
        }
    }

    public void returnBook(LibraryItem libraryItem) {
        if (libraryItem.getAvailability()) {
            System.out.println("Item in already in the inventory");
        } else {
            loanedBooksList.remove(libraryItem);
            libraryItem.setAvailability(true);
            System.out.println("Item has been delivered.");
        }
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }
}
