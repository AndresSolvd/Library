package com.solvd.interfaces;

import com.solvd.entities.libraryitems.LibraryItem;
import com.solvd.entities.people.Person;
import com.solvd.util.MyLinkedList;

import java.util.HashSet;

public interface ILibrary {
    String getLibraryName();

    void setLibraryName(String libraryName);

    String getAddress();

    void setAddress(String address);

    void schedule();

    MyLinkedList<LibraryItem> printInventory();

    HashSet<Person> printDirectory();
}