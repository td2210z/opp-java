public class SinhVien extends Person{

    private double gpa;
    SinhVien(String ma , String name , String ns , String dc , String vaiTro , double gpa ){
        super(ma , name , ns , dc , vaiTro);
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return super.toString() + " " + String.format("%.2f", gpa);
    }
}
