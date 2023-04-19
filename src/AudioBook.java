public class AudioBook extends Book {
    private int serialNumber;

    public AudioBook(short itemId, boolean availability, String borrower, String dueDate, String title, String author, int year, String publisher, String genre, int serialNumber) {
        super(itemId, availability, borrower, dueDate, title, author, year, publisher, genre);
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "AudioBook Title: " + super.title + ", Author: " + super.author + ", Genre: " + super.genre;
    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
}