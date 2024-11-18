public class SinhVien {
    private String MaSv , Name , lop , ns;
    private  float gpa;


    SinhVien(){
        MaSv = "";
        Name = "";
        lop = "";
        ns = "";
        gpa = 0.0f;
    }

    SinhVien( String Name, String lop, String ns, float gpa){
        this.MaSv = "SV001";
        this.Name = Name;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public  void ChuanHoa(){
        if (ns.charAt(1) == '/'){
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/'){
            ns = ns.substring(0 ,3) + "0" + ns.substring(3);
        }

    }

    public String getMaSv() {
        return MaSv;
    }

    public void setMaSv(String maSv) {
        MaSv = maSv;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return MaSv + " " + Name + " " + lop + " " + ns + " " + gpa;
    }
}
