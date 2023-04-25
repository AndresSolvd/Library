import entities.libraryitems.LibraryItem;
import entities.people.Person;

import java.util.ArrayList;

public final class Library {
    private final String LIBRARY_NAME = "Royal Library";
    private final String ADDRESS = "Stormwind Keep, Stormwind city, Azeroth";
    private String weekDaysTimeOpen;
    private ArrayList<LibraryItem> inventory;
    private ArrayList<Person> directory;

    public Library(String weekDaysTimeOpen) {
        this.weekDaysTimeOpen = weekDaysTimeOpen;
        this.inventory = new ArrayList<LibraryItem>();
        this.directory = new ArrayList<Person>();
    }

    public String getLIBRARY_NAME() {
        return LIBRARY_NAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public String getWeekDaysTimeOpen() {
        return weekDaysTimeOpen;
    }

    public void setWeekDaysTimeOpen(String weekDaysTimeOpen) {
        this.weekDaysTimeOpen = weekDaysTimeOpen;
    }

    //Print Inventory
    public void printInventory() {
        for (LibraryItem item : inventory) {
            System.out.println(item);
        }
    }

    //Print Directory
    public void printDirectory() {
        for (Person person : directory) {
            System.out.println(person);
        }
    }

    //Add Item
    public void add(LibraryItem newItem) {
        for (LibraryItem item : inventory) {
            if (item.equals(newItem)) {
                System.out.println("This item already exists on the list");
                return;
            }
        }
        inventory.add(newItem);
    }

    //Add entities.people.Person
    public void add(Person newperson) {
        for (Person person : directory) {
            if (person.equals(newperson)) {
                System.out.println("This person already exists on the directory.");
                return;
            }
        }
        directory.add(newperson);
    }
}
