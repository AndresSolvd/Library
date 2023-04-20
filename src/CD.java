public class CD extends LibraryItem{
    private int serialNumber;

    public CD(short itemId, boolean availability, String borrower, String dueDate, int serialNumber){
        super(itemId, availability, borrower, dueDate);
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "CD Serial Number: " + this.serialNumber;
    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
}