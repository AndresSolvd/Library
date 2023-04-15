public class LibraryItem {
    private short id;
    private boolean availability;
    private String borrower;
    private String dueDate;

    public LibraryItem(short id, boolean availability, String borrower, String dueDate) {
        this.id = id;
        this.availability = availability;
        this.borrower = borrower;
        this.dueDate = dueDate;
    }
    //ID
    public short getId(){
        return id;
    }
    public void setId(short id){
        this.id = id;
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
