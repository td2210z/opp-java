public class Person

{
    private String ma , name , ns , dc , vaiTro;

    Person(String ma , String name , String ns , String dc , String vaiTro){
        this.ma = ma;
        this.name = name;
        this.ns = ns;
        this.dc = dc;
        this.vaiTro = vaiTro;

    }

    public String getMa() {
        return ma;
    }

    public void ChuanHoa(){
        String[] arr = name.split("\\s+");
        for (int i =0 ;i < arr.length;i++){
            String tmp = arr[i];
            String d = tmp.substring(0 , 1).toUpperCase();
            String c = tmp.substring(1).toLowerCase();
            arr[i] = d + c;
        }
        String res = String.join(" " , arr);
        name = res;


        if (ns.charAt(1) == '/'){
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/'){
            ns = ns.substring(0 , 3) + "0" + ns.substring(3);
        }

    }

    @Override
    public String toString(){
        return ma + " " + name + " " + ns + " " + dc + " " + vaiTro;
    }
}
