import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<SinhVien> v= new ArrayList<>();
        for (int i =0 ;i < t; i++){
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String ns = cs.nextLine();
            double gpa = cs.nextDouble();
            cs.nextLine();

            SinhVien a= new SinhVien(name , lop , ns , gpa);
            a.ChuanHoa();
            v.add(a);
        }

        for (SinhVien x : v){
            System.out.println(x);
        }
    }
}