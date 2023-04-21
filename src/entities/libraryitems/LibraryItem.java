package entities.libraryitems;

public abstract class LibraryItem {
    protected short itemId;
    protected boolean availability;
    protected String borrower;
    protected String dueDate;

    public LibraryItem(short itemId, boolean availability, String borrower, String dueDate) {
        this.itemId = itemId;
        this.availability = availability;
        this.borrower = borrower;
        this.dueDate = dueDate;
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