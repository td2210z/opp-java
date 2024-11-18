public class sinhVien {
    private String name , ns;
    private double  a1;

    sinhVien(){
        System.out.println("day la ham koi tao");


    }
    public sinhVien(String name , String ns , double a1 ){
        this.name = name;
        this.ns = ns;
        this.a1 = a1;


    }

    public double getA1(){
        return a1;
    }


    @Override
    public String toString(){

        return name + " " + ns + " " + String.format("%.2f", a1);
    }
}
