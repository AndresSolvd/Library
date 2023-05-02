package entities;

import resources.MyLinkedList;
import entities.libraryitems.LibraryItem;
import entities.people.Person;
import interfaces.ILibrary;

import java.util.*;

public final class Library implements ILibrary {

    private String libraryName;
    private String address;
    private String weekDaysTimeOpen;
    private final MyLinkedList<LibraryItem> inventory;
    private final HashSet<Person> directory;
    static Map<Person, List<LibraryItem>> map = new HashMap<>();

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

    //Print all borrowed items
    public static void printBorrowedItems() {
        if (map.isEmpty()) {
            System.out.println("There are not loaned Items");
        } else {
            System.out.println("\nList of borrowers and loan items");
            for (Map.Entry<Person, List<LibraryItem>> entry : map.entrySet()) {
                // get the key and value of the current entry
                Person person = entry.getKey();
                List<LibraryItem> libraryItems = entry.getValue();
                // print the key-value pair
                System.out.println("Person: " + person.getPersonId() + " " + person.getName()+ ", Library Items: ");
                for (LibraryItem item : libraryItems) {
                    System.out.println("                  " + item.getItemId() + " " + item.getName());
                }
                System.out.println("\n End of List\n");
            }
        }
    }

    /*

            for (Map.Entry<Person, List<LibraryItem>> entry : map.entrySet()) {
                System.out.println("List of Borrowed Items\n" + " Borrower : Item" + entry.getKey().getPersonId() + " " + entry.getKey().getName()
                        + " : " + entry.getValue().getItemId() + " " + entry.getKey().getName());
            }
        }

            public List<LibraryItem> getBorrowedItems(Person person) {
        // Get the list of borrowed items for the given person, or return an empty list if none exists
        return borrowedItems.getOrDefault(person, new ArrayList<>());
    }
         */

    // Add item and person to borrowed items
    public static void addPair(Person person, LibraryItem item) {
        List<LibraryItem> borrowed = map.getOrDefault(person, new ArrayList<>()); // Create or Get list of borrow items
        borrowed.add(item); // Add item to the list
        map.put(person, borrowed); // Update map
    }

    // Remove item and person from borrowedItems
    public static void removePair(Person person, LibraryItem libraryItem) {
        List<LibraryItem> borrowed = map.get(person); // Get list
        if (borrowed != null) {
            borrowed.remove(libraryItem); // remove from list
            map.put(person, borrowed); // Update map
        }
    }
}
