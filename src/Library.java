import java.util.ArrayList;

public class Library {
    private String name;
    private String address;
    private String weekDaysTimeOpen;
    private ArrayList<LibraryItem> itemsList;
    private ArrayList<Person> directory;

    public Library(String name, String address, String weekDaysTimeOpen){
        this.name = name;
        this.address = address;
        this.weekDaysTimeOpen = weekDaysTimeOpen;
        this.itemsList = new ArrayList<LibraryItem>();
        this.directory = new ArrayList<Person>();
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getWeekDaysTimeOpen(){
        return weekDaysTimeOpen;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setWeekDaysTimeOpen(String weekDaysTimeOpen) {
        this.weekDaysTimeOpen = weekDaysTimeOpen;
    }

    //Print Inventory
    public void printInventory(){
        for (LibraryItem item : itemsList) {
            System.out.println(item);
        }
    }

    //Print Directory
    public void printDirectory(){
        for (Person person : directory) {
            System.out.println(person);
        }
    }

    //Add Item
    public void add(LibraryItem newItem){
        for (LibraryItem item : itemsList) {
            if (item.equals(newItem)) {
                System.out.println("This item already exists on the list");
                return;
            }
        }
            itemsList.add(newItem);
        }

    //Add Person
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
