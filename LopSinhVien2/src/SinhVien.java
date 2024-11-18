public class SinhVien {
    private String ma , name , gt , ns ,dc ,mst , nkhd;

    SinhVien(){}

    SinhVien(String ma , String name , String gt , String ns , String dc , String mst , String nkhd ){
        this.ma = ma;
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
        if (nkhd.charAt(4) == '/'){
            nkhd = nkhd.substring(0 , 3) + "0" + nkhd.substring(3);
        }
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd;
    }
}
