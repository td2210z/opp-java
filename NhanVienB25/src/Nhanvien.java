public class Nhanvien {
    public static  int dem =1;
    private String Ma , name , gt , ns , dc , mst , nkhd;


    Nhanvien(String name , String gt , String ns , String dc , String mst , String nkhd){
        this.Ma = Check();
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;

    }
    public void ChuanHoa(){
        if (ns.charAt(1) == '/'){
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/'){
            ns = ns.substring(0 , 3) + "0" + ns.substring(3);
        }

        if (nkhd.charAt(1) == '/'){
            nkhd = "0" + nkhd;
        }
        if(nkhd.charAt(4) == '/'){
            nkhd = nkhd.substring(0 , 3) +  "0" + nkhd.substring(3);
        }
    }

    public String getMa() {
        return Ma;
    }

    public String getTuoi(){
        return ns;
    }
    public int getNS(){
        return Integer.parseInt(ns.substring(0 , 2));
    }
    public int getTS(){
        return Integer.parseInt(ns.substring(3 , 5));
    }

    public int getNamS(){
        return Integer.parseInt(ns.substring(6 , 10));
    }

    public String Check(){
        String tmp = String.format("%05d" , dem);
        dem++;
        return tmp;
    }

    @Override
    public String toString(){
        return Ma + " " + name + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd;
    }

}
