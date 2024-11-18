public class GiaoVien extends Person{
    private int luong;

    public int getLuong() {
        return luong;
    }

    GiaoVien(String ma , String name , String ns , String dc , String vt , int luong){
        super(ma , name , ns , dc , vt);
        this.luong = luong;
    }

    @Override
    public String toString(){
        return super.toString() + " " + luong;
    }
}
