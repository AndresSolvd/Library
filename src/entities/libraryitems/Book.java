package entities.libraryitems;

import exceptions.YearRangeException;
import interfaces.IRead;

import java.util.Objects;

public class Book extends LibraryItem implements IRead {
    public String title;
    public String author;
    public int year;
    public String publisher;
    public String genre;

    public Book(short itemId, boolean availability, String borrower, String dueDate, String title, String author, int year, String publisher, String genre) {
        super(itemId, availability, borrower, dueDate);
        this.title = title;
        this.author = author;
        // Check valid year
        try {
            if (year <= 0 | year > 2023) {
                throw new YearRangeException("year invalid value(values accepted: integers between 1 and 2023)");
            } else {
                this.year = year;
            }
        } catch (YearRangeException e){
            System.out.println(e.getMessage());
        }
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

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }
}