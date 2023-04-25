package entities.libraryitems;

import interfaces.ISerialNumber;

import java.util.Objects;

public class AudioBook extends Book implements ISerialNumber {
    private int serialNumber;

    public AudioBook(short itemId, boolean availability, String borrower, String dueDate, String title, String author, int year, String publisher, String genre, int serialNumber) {
        super(itemId, availability, borrower, dueDate, title, author, year, publisher, genre);
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "AudioBook Title: " + super.title + ", Author: " + super.author + ", Genre: " + super.genre + ", Availability: " + super.availability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AudioBook)) return false;
        AudioBook audioBook = (AudioBook) o;
        return getSerialNumber() == audioBook.getSerialNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSerialNumber());
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}