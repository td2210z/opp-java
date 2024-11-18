public class SinhVien {
    private String ma , name , ns , lop;
    private double gpa;
    public static int dem =1;
    SinhVien(){
        ma = "";
        name = "";
        ns = "";
        lop = "";
        gpa = 0.0;
    }

    SinhVien( String name, String lop, String ns, double gpa){
        this.ma = check();
        this.name = name;
        this.lop = lop;

        this.ns = ns;
        this.gpa = gpa;

    }

    public void ChuanHoa(){
        if (ns.charAt(1) == '/'){
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/'){
            ns = ns.substring(0 , 3) + "0" + ns.substring(3);
        }
    }
    public String check(){
        String res = String.format("%03d" , dem);
        dem++;
        return "SV" + res;
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + lop + " " + ns + " " + String.format("%.2f" , gpa);
    }
}
