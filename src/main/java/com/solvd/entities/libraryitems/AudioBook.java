package com.solvd.entities.libraryitems;

import com.solvd.enums.Genre;
import com.solvd.enums.Language;
import com.solvd.interfaces.IAudio;
import com.solvd.interfaces.ISerialNumber;

import java.util.Objects;

public class AudioBook extends Book implements ISerialNumber, IAudio {
    private int serialNumber;

    public AudioBook(short itemId, String name, boolean availability, String borrower, String dueDate, String title, String author, int year, String publisher, Genre genre, Language language, int serialNumber) {
        super(itemId, name, availability, borrower, dueDate, title, author, year, publisher, genre, language);
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