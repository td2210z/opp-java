public class GiaoVien extends Person{
    private int luong;
    private String lopPhutrach;

    public String getLopPhutrach() {
        return lopPhutrach;
    }

    GiaoVien(String ma , String name , String ns , String dc , String vt , int luong , String lopPhutrach){
        super(ma , name , ns ,dc , vt);
        this.luong = luong;
        this.lopPhutrach = lopPhutrach;
    }
    @Override
    public String toString(){
        return super.toString() + " " + luong + " " + lopPhutrach;
    }
}
