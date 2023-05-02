package entities.people;

import entities.Library;
import entities.libraryitems.LibraryItem;
import exceptions.MemberAndCredentialRangeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Client extends Person {
    private static final Logger LOGGER = LogManager.getLogger(Person.class);
    private int memberNumber;
    private final ArrayList<LibraryItem> loanedBooksList;

    public Client(short id, String name, String phone, String email, int memberNumber) {
        super(id, name, phone, email);
        this.memberNumber = memberNumber;
        this.loanedBooksList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nClient Name: " + super.getName() + "\nMembership Number: " + this.memberNumber + "\n";
    }

    // Print all Loaned Items
    public ArrayList<LibraryItem> getLoanedBookList() {
        return loanedBooksList;
    }

    public void loanBook(Person person, LibraryItem libraryItem) {
        if (libraryItem.getAvailability()) {
            loanedBooksList.add(libraryItem);
            libraryItem.setAvailability(false);
            libraryItem.setBorrower(name + " id: " + personId);
            Library.addPair(person, libraryItem);
            System.out.println("Item has been loaned out.");
        } else {
            System.out.println("Item is not available for loan.");
        }
    }

    public void returnBook(Person person, LibraryItem libraryItem) {
        if (libraryItem.getAvailability()) {
            System.out.println("Item is already in the inventory");
        } else {
            loanedBooksList.remove(libraryItem);
            libraryItem.setAvailability(true);
            libraryItem.setBorrower("na");
            Library.removePair(person,libraryItem);
            System.out.println("Item has been delivered.");
        }
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        //validate memberNumber
        try {
            if (memberNumber <= 0) {
                throw new MemberAndCredentialRangeException("memberNumber invalid value(values accepted: integers between 1 and 2147483647)");
            } else {
                this.memberNumber = memberNumber;
            }
        } catch (MemberAndCredentialRangeException e) {
            LOGGER.info(e.getMessage());
        }
    }
}