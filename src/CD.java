public class CD extends LibraryItem{
    private short sn;

    public CD(short id, boolean availability, String borrower, String dueDate, short sn){
        super(id, availability, borrower, dueDate);
        this.sn = sn;
    }

    public short getSn(){
        return sn;
    }

    public void setSn(short sn){
        this.sn = sn;
    }
}
