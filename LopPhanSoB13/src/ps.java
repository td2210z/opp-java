public class ps {
    private int tu ,mau;

    ps(int tu , int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public void rg(){
        int a = tu , b = mau;
        while (b != 0){
            int res = a % b;
            a = b;
            b = res;
        }
        tu /= a; mau /= a;
    }

    public ps nhanPhanSo(ps a , ps b){
        int newTu = this.tu * a.getTu() * b.getTu();
        int newMau = this.mau * a.getMau() * b.getMau();
        return new ps(newTu, newMau);
    }
    

    public ps congPhanSo(ps other){
        int mauChung = this.mau * other.mau;
        int newTu = this.tu * other.mau + other.tu * this.mau;
        return new ps(newTu, mauChung);
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }

}
