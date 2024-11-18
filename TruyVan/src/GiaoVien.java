public class GiaoVien extends Person{
    private String lopCN;
    private int luong;

    GiaoVien(String ma , String name , String ns , String dc , String vt , int luong,String lopCN){
        super(ma , name , ns , dc , vt);
        this.luong = luong;
        this.lopCN = lopCN;

    }

    @Override
    public String toString(){
        return super.toString() + " " + luong + " " + lopCN;
    }

}
