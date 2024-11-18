import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        ArrayList<SinhVien> a= new ArrayList<>();
        for (int i =0 ; i < 1 ; i++){
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String ns = cs.nextLine();
            float gpa = cs.nextFloat();
            SinhVien z = new SinhVien(name , lop , ns , gpa);
            a.add(z);
        }
        for (SinhVien x : a){
            System.out.println(x);
        }
    }
}