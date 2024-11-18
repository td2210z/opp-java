public class GiangVien {
    private String ma , name , nghe;
    public static  int dem =1;

    GiangVien(String name , String nghe){
        this.ma = check();
        this.name = name;
        this.nghe = nghe;

    }

    public String getMa() {
        return ma;
    }

    public String check(){
        String res = String.format("%02d" , dem);
        dem++;
        return "GV" + res;
    }
    public String getName(){
        String[] arr = name.split("\\s+");
        return arr[arr.length-1];

    }
    @Override
    public String toString(){
        return ma + " " + name + " " + nghe;
    }
}
