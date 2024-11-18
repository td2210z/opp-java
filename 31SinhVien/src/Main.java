import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<SinhVien> v = new ArrayList<>();
        for (int i =0 ;i < t ; i++){
            String ma = cs.nextLine();
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String email = cs.nextLine();

            SinhVien a =new SinhVien(ma , name , lop , email);
            a.ChuanHoa();
            v.add(a);

        }

        int m = cs.nextInt();
        cs.nextLine();


        while (m-- > 0){
            String nm = cs.nextLine();
            System.out.println("DANH SACH SINH VIEN Khoa cntt la :  " + nm + ":");
            for (SinhVien x : v ){
                if (nm.equals(x.getLOP())){
                    System.out.println(x);
                }
            }


        }

    }
}