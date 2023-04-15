public class LibraryItem {
    short id;
    boolean availability;
    String borrower;
    short dueDate;

    //ID
    void getId(){
        System.out.println(id);
    }
    void setId(id){
        this.id = id;
    }

    //AVAILABILITY
    void getAvailability(){
        System.out.println(availability);
    }
    void setAvailability(availability){
        if (availability) this.availability = true;
        else {
            this.availability = false;
        }
    }

    //BORROWER
    void getBorrower(){
        System.out.println(borrower);
    }
    void setBorrower(borrower){
        this.borrower = borrower;
    }

    //DUEDATE
    void getDueDate(){
        System.out.println(dueDate);
    }
    void setId(dueDate){
        this.dueDate = dueDate;
    }
}
