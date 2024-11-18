public class SinhVien extends Person{

    private double gpa;
    public SinhVien(String ma , String name , String ns , String dc , String vt , double gpa){
        super(ma , name , ns , dc , vt);
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return super.toString() + " " + String.format("%.2f", gpa);
    }
}
