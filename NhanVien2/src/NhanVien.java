public class NhanVien {
    private String ma , name , gt , ns , dc , mst , nkhd;


    NhanVien(String ma , String name , String gt , String ns , String dc , String mst , String nkhd ) {
        this.ma = ma;
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;


    }

    public void ChuanHoa(){
        String[] arr = name.split("\\s+");
        for (int i=0 ;i < arr.length ; i++){
            String tmp = arr[i];
            String dau = tmp.substring(0 , 1);
            String cuoi = tmp.substring(1);
            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }
        String res = String.join(" ", arr);
        this.name = res;

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
