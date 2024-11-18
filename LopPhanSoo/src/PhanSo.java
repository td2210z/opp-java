public class PhanSo {
    private int tu , mau;


    PhanSo(){

    }
    PhanSo(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public  void tg(){
        int a = tu , b =mau;
        while (b != 0){
            int t= a % b;
            a = b;
            b = t;

        }
        tu /= a;
        mau /= a;
    }


    @Override
    public String toString(){
        return tu + "/" + mau;
    }
}
