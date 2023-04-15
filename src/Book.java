public class Book extends LibraryItem {
    public String title;
    public String author;
    public int year;
    public String publisher;
    public String genre;

    public Book(short id, boolean availability, String borrower, String dueDate, String title, String author, int year, String publisher, String genre) {
        super(id, availability, borrower, dueDate);
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }
}

