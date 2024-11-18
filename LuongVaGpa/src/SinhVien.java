public class SinhVien extends Person{
    private double gpa;

    SinhVien (String ma , String name , String ns , String dc , String vt , double gpa){
        super(ma , name, ns , dc , vt);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString(){
        return super.toString() + " " + String.format("%.2f", gpa);
    }
}
