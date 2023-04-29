import entities.libraryitems.LibraryItem;
import entities.people.Person;
import interfaces.ILibrary;

import java.util.HashSet;

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
}
