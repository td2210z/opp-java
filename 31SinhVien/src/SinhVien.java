public class SinhVien {
    private String ma , name , lop, email;


    public SinhVien(String ma , String name , String lop , String email){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;

    }

    public String getLOP(){
        String mp = lop.substring(0 ,4 );
        return mp;
    }

    public String getOk(){
        String mp = ma.substring(0 , 4);
        return mp;
    }

    public void ChuanHoa(){
        String[] arr = name.split("\\s+");
        for (int i =0 ;i < arr.length ; i++){
            String tmp = arr[i];
            String dau = tmp.substring(0 , 1).toUpperCase();
            String cuoi = tmp.substring(1).toLowerCase();
            arr[i] = dau + cuoi;
        }
        String res = String.join(" ", arr);
        name = res;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + lop + " " + email;
    }
}
