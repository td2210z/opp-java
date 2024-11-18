public class SinhVien {
    private static  int dem =1;
    private String masv , name , ns , lop;
    private double gpa;

    SinhVien( String name , String lop , String ns , double gpa){
        this.masv = check();
        this.name = name;
        this.lop = lop;
        this.ns = ns;

        this.gpa = gpa;

    }

    public String check(){
        String tmp = String.format("%02d", dem);
        dem++;
        return "SV" + tmp;
    }

    public void ChuanHoa(){
        String[] arr =name.trim().split("\\s+");
        String res = "";
        for (String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for (int i = 1 ; i < x.length() ; i++){
                res += Character.toLowerCase(x.charAt(i));
            }
            res += " ";
        }
        name = res.trim();


        if (ns.charAt(1) == '/'){
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/'){
            ns = ns.substring(0 , 3) + "0" + ns.substring(3);
        }
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return masv + " " + name + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}
