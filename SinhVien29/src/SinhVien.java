public class SinhVien {
    private String Ma , name ,lop , email;

    SinhVien(String ma , String name , String lop , String email){
        this.Ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;

    }

    public String getMa() {
        return Ma;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString(){
        return Ma + " " + name + " " + lop + " " + email ;
    }
}
