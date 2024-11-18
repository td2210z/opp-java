import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        ArrayList<Person> a= new ArrayList<>();
        ArrayList<Person> b= new ArrayList<>();
        cs.nextLine();
        while (t-- > 0){
            String ma = cs.nextLine();
            if (ma.startsWith("GV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();
                int luong = cs.nextInt();
                cs.nextLine();
                GiaoVien aa= new GiaoVien(ma ,name , ns , dc , khoa , luong);
                aa.ChuanHoa();
                a.add(aa);
            } else{
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();
                double gpa = cs.nextDouble();
                cs.nextLine();

                SinhVien bb = new SinhVien(ma , name , ns , dc , khoa , gpa);
                bb.ChuanHoa();
                b.add(bb);

            }
        }
        System.out.println("DANH SACH GIAO VIEN : ");
        for (Person p : a){
            System.out.println(p);
        }
        System.out.println("SACH SINH VIEN : ");
        for (Person p : b){
            System.out.println(p);
        }
    }
}