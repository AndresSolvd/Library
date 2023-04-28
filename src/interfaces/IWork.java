package interfaces;

public interface IWork {

    default void cleanLibrary() {
        System.out.println("Employee clean the library");
    }

    default void makeInventory() {
        System.out.println("Employee checked the inventory");
    }

    default void loanItem() {
        System.out.println("Employee loaned a book");
    }

    default void receiveItem() {
        System.out.println("Employee received a book");
    }
}