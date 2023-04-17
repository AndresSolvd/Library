public class Library {
    private String name;
    private String address;
    private String weekDaysTimeOpen;

    public Library(String name, String address, String weekDaysTimeOpen){
        this.name = name;
        this.address = address;
        this.weekDaysTimeOpen = weekDaysTimeOpen;
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
}
