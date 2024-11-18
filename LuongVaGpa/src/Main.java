import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        ArrayList<GiaoVien> a= new ArrayList<>();
        ArrayList<SinhVien> b= new ArrayList<>();

        int t = cs.nextInt();
        cs.nextLine();
        while (t-- > 0){
            String ma = cs.nextLine();
            if (ma.startsWith("GV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String vt = cs.nextLine();
                int luong = cs.nextInt();
                cs.nextLine();

                GiaoVien mp = new GiaoVien(ma , name , ns , dc , vt , luong);
                mp.ChuanHoa();
                a.add(mp);
            } else{
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String vt = cs.nextLine();
                double gpa = cs.nextDouble();
                cs.nextLine();
                SinhVien res = new SinhVien(ma , name , ns , dc , vt , gpa);
                res.ChuanHoa();
                b.add(res);
            }
        }

        Collections.sort(a , new SortGV());
        System.out.println("danh sach giao vien : ");
        for (Person p : a){
            System.out.println(p);
        }
        Collections.sort(b , new SortSV());
        System.out.println("danh sach sinh vien : ");
        for (Person p : b){
            System.out.println(p);
        }
    }
}