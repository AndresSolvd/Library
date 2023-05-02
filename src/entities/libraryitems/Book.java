package entities.libraryitems;

import exceptions.YearRangeException;
import interfaces.IRead;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Book extends LibraryItem implements IRead {
    private static final Logger LOGGER = LogManager.getLogger(LibraryItem.class);
    public String title;
    public String author;
    public int year;
    public String publisher;
    public String genre;

    public Book(short itemId, boolean availability, String borrower, String dueDate, String title, String author, int year, String publisher, String genre) {
        super(itemId, availability, borrower, dueDate);
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book Title: " + this.title + ", Author: " + this.author + ", Genre: " + this.genre + ", Availability: " + super.availability;
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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws YearRangeException {
        try {
            if (year <= 0 | year > 2023) {
                throw new YearRangeException("Invalid input (value accepted: between 1 and 2023)");
            } else {
                this.year = year;
            }
        } catch (YearRangeException e) {
            LOGGER.info("Invalid input (value accepted: between 1 and 2023)");
            System.out.println(e.getMessage());
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }
}