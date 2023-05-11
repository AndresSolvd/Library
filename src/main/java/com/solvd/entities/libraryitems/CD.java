package com.solvd.entities.libraryitems;

import com.solvd.enums.CdType;
import com.solvd.interfaces.IAudio;
import com.solvd.interfaces.IRead;
import com.solvd.interfaces.ISerialNumber;

import java.util.Objects;

public class CD extends LibraryItem implements ISerialNumber, IAudio, IRead {
    private int serialNumber;
    private CdType cdtype;

    public CD(short itemId, String name, CdType cdtype, boolean availability, String borrower, String dueDate, int serialNumber) {
        super(itemId, name, availability, borrower, dueDate);
        this.cdtype = cdtype;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "CD Serial Number: " + this.serialNumber + ", CD Name: " + name + ", Type: " + cdtype + ", Availability: " + super.availability;
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

    public CdType getCdtype() {
        return cdtype;
    }

    public void setCdtype(CdType cdtype) {
        this.cdtype = cdtype;
    }
}