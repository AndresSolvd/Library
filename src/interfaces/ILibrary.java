package interfaces;

public interface ILibrary {
    void setLibraryName(String libraryName);

    String getLibraryName();

    void setAddress(String address);

    void setWeekDaysTimeOpen(String weekDaysTimeOpen);

    String getWeekDaysTimeOpen();

    String getAddress();

    void printInventory();

    void printDirectory();
}
