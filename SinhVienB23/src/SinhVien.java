public class SinhVien {

    private String maSv , name , lop , ns;
    private double gpa;
    public static int dem = 1;
    SinhVien(){
        maSv = "";
        name = "";
        lop = "";
        ns= "";
        gpa = 0.0;
    }

    SinhVien( String name, String lop, String ns, double gpa){
        this.maSv = check();
        this.name = name;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void ChuanHoa(){
        String[] arr = name.split("\\s+");
        for (int i =0 ;i < arr.length ; i++){
            String tmp = arr[i];
            String dau = tmp.substring(0 , 1);
            String cuoi = tmp.substring(1);
            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }
        String d = String.join(" ", arr);
        this.name = d;


        if (ns.charAt(1) == '/'){
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/'){
            ns = ns.substring(0 ,3 ) + "0" + ns.substring(3);
        }
    }

    public String check(){
        String res = String.format("%03d" , dem);
        dem++;
        return "SV" + res;
    }


    @Override
    public String toString(){
        return maSv +  " " + name + " " + lop+ " " + ns + " " + String.format("%.2f", gpa);
    }
}
