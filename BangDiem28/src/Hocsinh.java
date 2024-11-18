import java.util.ArrayList;

public class Hocsinh {
    private String Ma , name;
    private ArrayList<Double> v;
    public  static int dem =1;

    public Hocsinh(String name, ArrayList<Double> v) {
        this.Ma = check();
        this.name = name;
        this.v = v;
    }
    public String check(){
        String res  = String.format("%02d" , dem);
        dem++;
        return "HS" + res;
    }

    public String getMa() {
        return Ma;
    }

    public double getDiem(){
        double res =0;
        for (double x : v){
            res += x;
        }
        return res / v.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double diem = getDiem();
        if (diem >= 9){
            sb.append("XUAT SAC");
        } else if(diem >= 8){
            sb.append("Gioi");
        } else if(diem >= 7 ){
            sb.append("Kha");
        } else if (diem >= 5){
            sb.append("Trung Binh");
        } else {
            sb.append("yeu");
        }

        return Ma + " " + name + " " + String.format("%.1f" , diem) + " "+ sb.toString();
    }
}
