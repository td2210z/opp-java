public class Person {
    private String Ma , name , ns , dc;

    Person(String Ma , String name , String ns , String dc){
        this.Ma = Ma;
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
        String res = String.join(" ", arr);
        name = res;


        if(ns.charAt(1) == '/' ){
            ns = "0" + ns;
        }
        if (ns.charAt(4) == '/'){
            ns = ns.substring(0 , 3) + "0" + ns.substring(3);
        }
    }


    @Override
    public String toString(){
        return Ma + " " + name + " " + ns + " " + dc;
    }
}
