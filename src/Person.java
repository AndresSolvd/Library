public class Person {
    private short personId;
    private String name;
    private String phone;
    private String email;

    public Person(short personId, String name, String phone, String email){
        this.personId = personId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public short getPersonId(){
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPersonId(short personId){
        this.personId = personId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
