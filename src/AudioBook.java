public class AudioBook extends Book {
    private int sn;

    public AudioBook(short id, boolean availability, String borrower, String dueDate, String title, String author, int year, String publisher, String genre, int sn) {
        super(id, availability, borrower, dueDate, title, author, year, publisher, genre);
        this.sn = sn;
    }

    public int getSn(){
        return sn;
    }

    public void setSn(int sn){
        this.sn = sn;
    }
}