public class SinhVien {
    private String maSv , name;
    private float toan , li , hoa;

    public SinhVien(String maSv , String name, float toan , float li , float hoa) {
        this.maSv = maSv;
        this.name = name;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }


    public int layKhuVuc(){
        return Integer.parseInt(maSv.substring(2 , 3));
    }
    public String tongDiem(){
        return String.format("%.2f" , (toan + li  + hoa));
    }

    public void kq(){
        System.out.print(maSv + " " + name + " " + layKhuVuc() + " ");
        float res = toan + li + hoa;
        int p= layKhuVuc();
        if (p == 1){
            res += 0.5;
        } else if (p == 2){
            res += 1;
        } else res += 1.5;

        if (res == (int) res){
            System.out.print((int) res + " ");
        } else{
            System.out.print(String.format("%.1f" , res) + " ");
        }

        if (res >= 24) System.out.print("do");
        else System.out.print("truot");
    }


}
