package entities;

import Resources.MyLinkedList;
import entities.libraryitems.LibraryItem;
import entities.people.Person;
import interfaces.ILibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class Library implements ILibrary {
    private String libraryName;
    private String address;
    private String weekDaysTimeOpen;
    private final MyLinkedList<LibraryItem> inventory;
    private final HashSet<Person> directory;

    public Library(String libraryName, String address, String weekDaysTimeOpen) {
        this.libraryName = libraryName;
        this.address = address;
        this.weekDaysTimeOpen = weekDaysTimeOpen;
        this.inventory = new MyLinkedList<LibraryItem>();
        this.directory = new HashSet<Person>();
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

    public String getWeekDaysTimeOpen() {
        return weekDaysTimeOpen;
    }

    public void setWeekDaysTimeOpen(String weekDaysTimeOpen) {
        this.weekDaysTimeOpen = weekDaysTimeOpen;
    }

    //Print Inventory
    public void printInventory() {
        inventory.showAll();
    }

    //Print Directory
    public void printDirectory() {
        for (Person person : directory) {
            System.out.println(person);
        }
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

    // Dictionary of current loan items with related client
    public static class BorrowersAndLoanedItems {
        static Map<Short, String> map = new HashMap<>();

        // Print all the Dictionary
        public static void borrowersAndLoanedItemsList() {
            if (map.isEmpty()) {
                System.out.println("There are not loaned Items");
            } else {
                for (Map.Entry<Short, String> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        }

        public static void addPair(Short itemId, String personName) {
            map.put(itemId, personName);
        }

        public static void removePair(Short itemId) {
            map.remove(itemId);
        }
    }
}
