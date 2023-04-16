public class Person {
    private short idPerson;
    private String name;
    private String phone;
    private String email;

    public Person(short idPerson, String name, String phone, String email){
        this.idPerson = idPerson;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public short getIdPerson(){
        return idPerson;
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

    public void setIdPerson(short idPerson){
        this.idPerson = idPerson;
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
