package entities.people;

import entities.BorrowersAndLoanedItems;
import entities.libraryitems.LibraryItem;
import exceptions.MemberAndCredentialRangeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Client extends Person {
    private static final Logger LOGGER = LogManager.getLogger(Person.class);
    private int memberNumber;
    private final ArrayList<LibraryItem> loanedBooksList;
    public Map<String, Short> map = new HashMap<>();

    public Client(short id, String name, String phone, String email, int memberNumber) {
        super(id, name, phone, email);
        this.memberNumber = memberNumber;
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
            libraryItem.setBorrower(name + " id: " + personId);
            BorrowersAndLoanedItems.addPair(getName(), libraryItem.getItemId());
            System.out.println("Item has been loaned out.");
        } else {
            System.out.println("Item is not available for loan.");
        }
    }

    public void returnBook(LibraryItem libraryItem) {
        if (libraryItem.getAvailability()) {
            System.out.println("Item is already in the inventory");
        } else {
            loanedBooksList.remove(libraryItem);
            libraryItem.setAvailability(true);
            libraryItem.setBorrower("na");
            BorrowersAndLoanedItems.removePair(getName());
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
                throw new MemberAndCredentialRangeException();
            } else {
                this.memberNumber = memberNumber;
            }
        } catch (MemberAndCredentialRangeException e) {
            LOGGER.info("memberNumber invalid value(values accepted: integers between 1 and 2147483647)");
        }
    }
}