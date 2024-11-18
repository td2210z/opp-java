public class NhanVien {
    public static  int dem =1;
    private String maNv,name;
    private  int luong;
    private int soNgayCong;
    private String chucVu;


    public NhanVien(String name , int luong , int soNgayCong , String chucVu) {
        this.maNv = check();
        this.name = name;
        this.luong = luong;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;

    }

    public String check(){
        String res = String.format("%02d" , dem);
        dem++;
        return "NV" + res;
    }


    public int tinhLuong(){
        return luong * soNgayCong;
    }

    public int tinhThuong(){
        int res = tinhLuong();
        if (soNgayCong >= 25){
            return (int) (res * 0.2);
        } else if (soNgayCong >= 22){
            return (int) (res * 0.1);
        } else{
            return 0;
        }
    }


    public int phuCap(){
        if (chucVu.equals("GD")){
            return 250000;
        } else if (chucVu.equals("PGD")){
            return 200000;
        } else if(chucVu.equals("TP")){
            return 180000;
        } else{
            return 150000;
        }
    }

    @Override
    public String toString(){
        int tong = tinhLuong() + phuCap() + tinhThuong();
        return maNv + " " + name + " " + tinhLuong() + " " + tinhThuong() + " " + phuCap() + " " + tong;
    }

}
