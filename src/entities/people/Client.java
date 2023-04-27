package entities.people;

import entities.libraryitems.LibraryItem;
import exceptions.MemberAndCredentialRangeException;
import exceptions.YearRangeException;

import java.util.ArrayList;

public class Client extends Person {
    private int memberNumber;
    private final ArrayList<LibraryItem> loanedBooksList;

    public Client(short id, String name, String phone, String email, int memberNumber) {
        super(id, name, phone, email);
        //validate memberNumber
        try {
            if (memberNumber <= 0 | memberNumber > 2147483647) {
                throw new MemberAndCredentialRangeException("memberNumber invalid value(values accepted: integers between 1 and 2147483647)");
            } else {
                this.memberNumber = memberNumber;
            }
        } catch (MemberAndCredentialRangeException e) {
            System.out.println(e.getMessage());
        }
        this.loanedBooksList = new ArrayList<>();
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
        //validate memberNumber
        try {
            if (memberNumber <= 0 | memberNumber > 2147483647) {
                throw new MemberAndCredentialRangeException("memberNumber invalid value(values accepted: integers between 1 and 2147483647)");
            } else {
                this.memberNumber = memberNumber;
            }
        } catch (MemberAndCredentialRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
