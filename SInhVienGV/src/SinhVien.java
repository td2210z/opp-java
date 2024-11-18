public class SinhVien extends Person {
    private String lop;
    private double gpa;

    SinhVien(String ma , String name , String ns , String dc , String lop , double gpa){
        super(ma, name, ns , dc);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return super.toString() + " " + lop + " " + gpa;
    }

}
