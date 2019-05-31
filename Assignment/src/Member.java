public class Member {

    public String userName;
    public Double fee;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Member(String userName, Double fee) {
        this.userName = userName;
        this.fee = fee;
    }
}
