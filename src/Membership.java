public class Membership extends Client {
    private int memberNumber;

    public Membership(short id, String name, String phone, String email, int memberNumber) {
        super(id, name, phone, email);
        this.memberNumber = memberNumber;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }
}