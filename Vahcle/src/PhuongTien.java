public class PhuongTien {

    private String ma , name , hang , mauSac;
    private int giaBan;


    PhuongTien(String ma , String name , String hang ,String mauSac , int giaBan){
        this.ma = ma;
        this.name = name;
        this.hang = hang;
        this.mauSac = mauSac;
        this.giaBan = giaBan;

    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMa() {
        return ma;
    }

    public String getHang() {
        return hang;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + hang + " " + mauSac + " " + giaBan;
    }
}
