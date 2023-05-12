package com.solvd.interfaces;

public interface ILibrary {
    String getLibraryName();

    void setLibraryName(String libraryName);

    String getAddress();

    void setAddress(String address);

    void printSchedule();

    void printInventory();

    void printDirectory();
}