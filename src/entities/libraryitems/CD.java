package entities.libraryitems;

import interfaces.IAudio;
import interfaces.IRead;
import interfaces.ISerialNumber;

import java.util.Objects;

public class CD extends LibraryItem implements ISerialNumber, IAudio, IRead {
    private int serialNumber;
    private String type;
    private String name;

    public CD(short itemId, String name, String type, boolean availability, String borrower, String dueDate, int serialNumber) {
        super(itemId, availability, borrower, dueDate);
        this.name = name;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "CD Serial Number: " + this.serialNumber + ", CD Name: " + name + ", Type: " + type + ", Availability: " + super.availability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return serialNumber == cd.serialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}