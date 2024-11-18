public class XeMay extends PhuongTien{
    private int tocDo;

    XeMay(String ma , String name , String hang , String mauSac , int tocDo , int giaBan){
        super(ma,name,hang,mauSac,giaBan);
        this.tocDo = tocDo;
    }

    @Override
    public String toString(){return super.toString() + " " + tocDo;}

}
