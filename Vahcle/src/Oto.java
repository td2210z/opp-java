public class Oto extends PhuongTien{

    private int maLuc;

    Oto(String ma , String name , String hang , String mauSac , int maLuc , int giaBan){
        super(ma,name,hang,mauSac,giaBan);
        this.maLuc = maLuc;
    }

    @Override
    public String toString(){
        return super.toString() + " " + maLuc;
    }
}
