import java.util.ArrayList;

public class SinhVien {
    private String MaSv , Ten , lop;

    private ArrayList<MonHoc> mh;


    public SinhVien(String MaSv, String Ten, String lop) {
        this.MaSv = MaSv;
        this.Ten = Ten;
        this.lop = lop;

        mh = new ArrayList<>();

    }



    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String maSv) {
        MaSv = maSv;
    }

    public void themMon(MonHoc monhoc){
        mh.add(monhoc);
    }

    public double tinhGpa(){
        double tong_diem =0;
        int tongTinchi = 0;
        for (MonHoc x : mh){
            tong_diem += x.getDiem() * x.getSoTin();
            tongTinchi += x.getSoTin();
        }
        return tong_diem / tongTinchi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void hienThiThongTin(){
        System.out.println("Ma Sinh Vien " + MaSv);
        System.out.println("Ho Ten " + Ten);
        System.out.println("Lop " +  lop);
        System.out.printf("Gpa %.2f\n" , tinhGpa());
    }
}
