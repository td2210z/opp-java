public class taiKhoan {
    private String id , custimomerID , user , pass;

    taiKhoan(String id , String custimomerID , String user , String pass){
        this.id = id;
        this.custimomerID = custimomerID;
        this.user = user;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCustimomerID() {
        return custimomerID;
    }

    public void setCustimomerID(String custimomerID) {
        this.custimomerID = custimomerID;
    }
}
