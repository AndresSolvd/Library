package interfaces;

public interface ILibrary {
    void setLibraryName(String libraryName);

    String getLibraryName();

    void setAddress(String address);

    String getAddress();

    void setWeekDaysTimeOpen(String weekDaysTimeOpen);

    String getWeekDaysTimeOpen();


    void printInventory();

    void printDirectory();
}
