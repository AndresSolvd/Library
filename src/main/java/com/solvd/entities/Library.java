package com.solvd.entities;

import com.solvd.entities.libraryitems.LibraryItem;
import com.solvd.entities.people.Person;
import com.solvd.enums.LibraryEvents;
import com.solvd.enums.LibrarySection;
import com.solvd.enums.Schedule;
import com.solvd.interfaces.ILibrary;
import com.solvd.util.MyLinkedList;

import java.util.*;

public final class Library implements ILibrary {

    static Map<Person, List<LibraryItem>> borrowers = new HashMap<>();
    private final MyLinkedList<LibraryItem> inventory;
    private final HashSet<Person> directory;
    private String libraryName;
    private String address;

    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
        this.inventory = new MyLinkedList<LibraryItem>();
        this.directory = new HashSet<Person>();
    }

    //Print all borrowed items
    public static void printBorrowedItems() {
        if (borrowers.isEmpty()) {
            System.out.println("There are not loaned Items");
        } else {
            System.out.println("\n*********** List of borrowers **********");
            for (Map.Entry<Person, List<LibraryItem>> entry : borrowers.entrySet()) {
                System.out.println("-----------------------------------------------");
                // get the key and value of the current entry
                Person person = entry.getKey();
                List<LibraryItem> libraryItems = entry.getValue();
                // print the key-value pair
                System.out.println("BORROWER: " + person.getPersonId() + " " + person.getName() + "\n LIBRARY ITEMS: ");
                for (LibraryItem item : libraryItems) {
                    System.out.println("  " + "itemId: " + item.getItemId() + "   -   Name: " + item.getName());
                }
            }
            System.out.println("-----------------------------------------------");
            System.out.println("*********** End of borrowers list ***********\n");
        }
    }

    // Add item and person to borrowed items
    public static void addPair(Person person, LibraryItem item) {
        List<LibraryItem> borrowed = borrowers.getOrDefault(person, new ArrayList<>()); // Create or Get list of borrow items
        borrowed.add(item); // Add item to the list
        borrowers.put(person, borrowed); // Update map
    }

    // Remove item and person from borrowedItems
    public static void removePair(Person person, LibraryItem libraryItem) {
        List<LibraryItem> borrowed = borrowers.get(person); // Get list
        if (borrowed != null) {
            borrowed.remove(libraryItem); // remove from list
            borrowers.put(person, borrowed); // Update map
        }
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void schedule() {
        for (Schedule day : Schedule.values()) {
            System.out.println(day);
        }
    }

    public void sections() {
        for (LibrarySection section : LibrarySection.values()) {
            System.out.println(section);
        }
    }

    public void events() {
        for (LibraryEvents events : LibraryEvents.values()) {
            System.out.println(events);
        }
    }

    //Print Inventory
    public MyLinkedList<LibraryItem> printInventory() {
        System.out.println("\n    --- INVENTORY ---\n");
        inventory.showAll();
        System.out.println("\n--- END OF INVENTORY ---\n");
        return inventory;
    }

    //Print Directory
    public HashSet<Person> printDirectory() {
        System.out.println("\n    --- DIRECTORY ---\n");
        for (Person person : directory) {
            System.out.println(person);
        }
        System.out.println("\n--- END OF DIRECTORY ---\n");
        return directory;
    }

    //Add Item to Inventory
    public void add(LibraryItem newItem) {
        if (!inventory.search(newItem)) {
            inventory.add(newItem);
        } else {
            System.out.println("This item already exists on the list");
        }
    }

    //Add Person to directory
    public void add(Person newperson) {
        if (!directory.contains(newperson)) {
            directory.add(newperson);
        } else {
            System.out.println("This person already exists on the directory.");
        }
    }
}
