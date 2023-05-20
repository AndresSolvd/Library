package com.solvd.entities.libraryitems;

import com.solvd.enums.Genre;
import com.solvd.enums.ItemType;
import com.solvd.enums.Language;
import com.solvd.exceptions.YearRangeException;
import com.solvd.interfaces.IRead;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Book extends LibraryItem implements IRead {
    private static final Logger LOGGER = LogManager.getLogger(LibraryItem.class);
    private final Language language;
    public ItemType itemType;
    public String title;
    public String author;
    public int year;
    public String publisher;
    public Genre genre;

    public Book(short itemId, String name, boolean availability, String borrower, String dueDate, ItemType itemType, String title, String author, int year, String publisher, Genre genre, Language language) {
        super(itemId, name, availability, borrower, dueDate);
        this.itemType = itemType;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.language = language;
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

    public void setYear(int year) {
        try {
            if (year <= 0 | year > 2023) {
                throw new YearRangeException("Invalid input (value accepted: between 1 and 2023)");
            } else {
                this.year = year;
            }
        } catch (YearRangeException e) {
            LOGGER.info(e.getMessage());
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public Genre getGenre() {
        return genre;
    }

    public Language getLanguage() {
        return language;
    }
}