public class GiaoVien extends Person{
    private String khoa;
    private int luong;


    GiaoVien(String ma , String name , String ns , String dc , String khoa , int luong){
        super(ma , name , ns , dc);
        this.khoa = khoa;
        this.luong = luong;
    }

    @Override
    public String toString(){
        return super.toString() + " " + khoa + " " + luong;
    }

}
