import java.util.Objects;

public class Book extends LibraryItem {
    public String title;
    public String author;
    public int year;
    public String publisher;
    public String genre;

    @Override
    public String toString() {
        return "Book Title: " + this.title + ", Author: " + this.author + ", Genre: " + this.genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYear() == book.getYear() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublisher(), book.getPublisher()) && Objects.equals(getGenre(), book.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getYear(), getPublisher(), getGenre());
    }

    public Book(short itemId, boolean availability, String borrower, String dueDate, String title, String author, int year, String publisher, String genre) {
        super(itemId, availability, borrower, dueDate);
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