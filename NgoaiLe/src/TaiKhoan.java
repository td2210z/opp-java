public class TaiKhoan {
    private  double soDu;

    TaiKhoan(double soDu) {
        this.soDu = soDu;
    }

    public void rutTien(double tien)
            throws SoDuException ,  Exception{
        if (tien > soDu){
            throw new  Exception ("So du khong du");
        }
        if (tien < 0){
            throw new  Exception ("So tien rut khong duoc la so am");
        }
        soDu = soDu - tien;

    }
    public double getSoDu() {
        return soDu;

    }
}
