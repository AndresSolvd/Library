package entities.libraryitems;

import java.util.Objects;

public class CD extends LibraryItem{
    private int serialNumber;

    public CD(short itemId, boolean availability, String borrower, String dueDate, int serialNumber){
        super(itemId, availability, borrower, dueDate);
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "CD Serial Number: " + this.serialNumber + ", Availability: " + super.availability;
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

    public int getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
}