public class LibraryItem {
    private short itemId;
    private boolean availability;
    private String borrower;
    private String dueDate;

    public LibraryItem(short itemId, boolean availability, String borrower, String dueDate) {
        this.itemId = itemId;
        this.availability = availability;
        this.borrower = borrower;
        this.dueDate = dueDate;
    }
    //ID
    public short getItemId(){
        return itemId;
    }
    public void setItemId(short itemId){
        this.itemId = itemId;
    }

    //AVAILABILITY
    public boolean getAvailability(){
        return availability;
    }
    public void setAvailability(boolean availability){
        this.availability = availability;
    }

    //BORROWER
    public String getBorrower(){
        return borrower;
    }
    public void setBorrower(String borrower){
        this.borrower = borrower;
    }

    //DUEDATE
    public String getDueDate(){
        return dueDate;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
}