public class MonHoc {
    private String name;
    private int soTin;
    private double diem;

    public MonHoc(String name, int soTin, double diem) {
        this.name = name;
        this.soTin = soTin;
        this.diem = diem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoTin() {
        return soTin;
    }

    public void setSoTin(int soTin) {
        this.soTin = soTin;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

   /* @Override
    public String toString() {
        return name + " " + soTin + " " + diem;
    }*/
}
