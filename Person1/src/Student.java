public class Student extends Person {
    private String ma , lop;
    private double gpa;
    private static  int dem =1;
    public Student(String name , String ns , String dc, String lop , double gpa){
        super(name , ns , dc);
        this.ma = check();
        this.lop = lop;
        this.gpa = gpa;
    }
    public String check(){
        String res = String.format("%05d" , dem);
        dem++;
        return res;
    }
    @Override
    public String toString(){
        return ma + " " + super.toString() + " " + lop + " " + String.format("%.2f" , gpa);
    }




}
