public class matHang {
    private String MaBh , matHang , dvt;
    private  int giaBan , giaMua;
    public static  int dem =1;

    matHang(){}
    matHang(String matHang , String dvt , int giaBan , int giaMua){
        this.MaBh = check();
        this.matHang = matHang;
        this.dvt = dvt;
        this.giaBan = giaBan;
        this.giaMua = giaMua;
    }
    public int loiNhuan(){
        return giaMua - giaBan;
    }

    public String getMaBh() {
        return MaBh;
    }

    public void setMaBh(String maBh) {
        MaBh = maBh;
    }

    public String getMatHang() {
        return matHang;
    }

    public void setMatHang(String matHang) {
        this.matHang = matHang;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }



    public String check(){
        String res = String.format("%04d" , dem);
        dem++;
        return "MH" + res;
    }

    @Override
    public String toString(){
        return MaBh + " " + matHang + " " + dvt + " " + giaBan + " " + giaMua + " " + loiNhuan();
    }

}
