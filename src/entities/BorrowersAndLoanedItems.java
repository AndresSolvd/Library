package entities;

import java.util.HashMap;
import java.util.Map;

// Dictionary of current loan items with related client
public class BorrowersAndLoanedItems {
    static Map<String, Short> map = new HashMap<>();

    // Print all the Dictionary
    public static void borrowersAndLoanedItemsList() {
        if (map.isEmpty()) {
            System.out.println("There are not loaned Items");
        } else {
            for (Map.Entry<String, Short> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void addPair(String personName, Short itemId) {
        map.put(personName, itemId);
    }

    public static void removePair(String personName) {
        map.remove(personName);
    }
}