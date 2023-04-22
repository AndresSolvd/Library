package entities.libraryitems;
import interfaces.Counter;

public abstract class LibraryItem implements Counter {
    protected short itemId;
    protected boolean availability;
    protected String borrower;
    protected String dueDate;
    public static int activityCounter;

    public LibraryItem(short itemId, boolean availability, String borrower, String dueDate) {
        this.itemId = itemId;
        this.availability = availability;
        this.borrower = borrower;
        this.dueDate = dueDate;
        activityCounter++;
    }

    // Print amount of Activity
    public static void activity(){
        System.out.println("Library activity count: " + LibraryItem.activityCounter);
    }

    //ID
    public final short getItemId(){
        return itemId;
    }
    public final void setItemId(short itemId){
        this.itemId = itemId;
    }

    //AVAILABILITY
    public final boolean getAvailability(){
        return availability;
    }
    public final void setAvailability(boolean availability){
        this.availability = availability;
    }

    //BORROWER
    public final String getBorrower(){
        return borrower;
    }
    public void setBorrower(String borrower){
        this.borrower = borrower;
    }

    //DUEDATE
    public final String getDueDate(){
        return dueDate;
    }
    public final void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }

}