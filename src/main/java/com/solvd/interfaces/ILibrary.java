package com.solvd.interfaces;

public interface ILibrary {
    String getLibraryName();

    void setLibraryName(String libraryName);

    String getAddress();

    void setAddress(String address);

    String getWeekDaysTimeOpen();

    void setWeekDaysTimeOpen(String weekDaysTimeOpen);

    void printInventory();

    void printDirectory();
}