package entities.libraryitems;

import exceptions.BooleanException;
import exceptions.IdRangeException;

public abstract class LibraryItem {
    protected short itemId;
    protected boolean availability;
    protected String borrower;
    protected String dueDate;
    public static int activityCounter;

    public LibraryItem(short itemId, boolean availability, String borrower, String dueDate) {
        // Check valid id number
        try {
            if (itemId < 0 | itemId > 32767) {
                throw new IdRangeException("itemId invalid value (values accepted: integers between 0 and 32,767)");
            } else {
                this.itemId = itemId;
            }
        } catch (IdRangeException e) {
            System.out.println(e.getMessage());
        }
        this.availability = availability;
        this.borrower = borrower;
        this.dueDate = dueDate;
        activityCounter++;
    }

    // Print total attempts to create LibraryItems
    public static void activity() {
        System.out.println("Total attempts to create Library Items: " + LibraryItem.activityCounter);
    }

    //ID
    public final short getItemId() {
        return itemId;
    }

    public final void setItemId(short itemId) {
        this.itemId = itemId;
    }

    //AVAILABILITY
    public final boolean getAvailability() {
        return availability;
    }

    public final void setAvailability(boolean availability) {
        this.availability = availability;
    }

    //BORROWER
    public final String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    //DUEDATE
    public final String getDueDate() {
        return dueDate;
    }

    public final void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

}