public class Person {
    private String name , ns , dc;

    Person(){
        name = "";
        ns = "";
        dc = "";
    }
    Person(String name , String ns , String dc){
        this.name = name;
        this.ns = ns;
        this.dc = dc;

    }
    public void ChuanHoa(){
        String[] arr = name.split("\\s+");
        for (int i =0 ;i < arr.length ; i++){
            String tmp = arr[i];
            String dau = tmp.substring(0 , 1).toUpperCase();
            String cuoi = tmp.substring(1).toLowerCase();
            arr[i] = dau + cuoi;
        }
        String ok = String.join(" ", arr);
        name = ok;

        if (ns.charAt(1) == '/'){
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/'){
            ns = ns.substring(0 , 3) + "0" + ns.substring(3);
        }
    }

    public String getName() {
        String[] arr = name.split("\\s+");
        StringBuilder sb = new StringBuilder(arr[arr.length -1]);
        for (int i =0 ;i < arr.length - 1; i++){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    @Override
    public String toString(){
        return name + " " + ns + " " + dc;
    }

}
