public class AudioBook extends Book {
    private short sn;

    public AudioBook(short id, short sn, boolean availability, String borrower, String dueDate, String title, String author, int year, String publisher, String genre) {
        super(id, availability, borrower, dueDate, title, author, year, publisher, genre);
        this.sn = sn;
    }

    public short getSn(){
        return sn;
    }

    public void setSn(short sn){
        this.sn = sn;
    }

}