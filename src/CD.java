public class CD extends LibraryItem{
    private int sn;

    public CD(short id, boolean availability, String borrower, String dueDate, int sn){
        super(id, availability, borrower, dueDate);
        this.sn = sn;
    }

    public int getSn(){
        return sn;
    }

    public void setSn(int sn){
        this.sn = sn;
    }
}