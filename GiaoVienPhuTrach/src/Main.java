import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t= cs.nextInt();
        cs.nextLine();
        ArrayList<GiaoVien> a= new ArrayList<>();
        ArrayList<SinhVien> b= new ArrayList<>();
        for (int i =0 ;i < t; i++){
            String ma = cs.nextLine();
            if (ma.startsWith("GV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String vt = cs.nextLine();
                int luong = cs.nextInt();
                cs.nextLine();
                String Lopcn = cs.nextLine();

                GiaoVien mp =new GiaoVien(ma , name , ns , dc , vt , luong , Lopcn);
                mp.ChuanHoa();
                a.add(mp);
            } else{
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String vt = cs.nextLine();
                double gpa = cs.nextDouble();
                cs.nextLine();

                SinhVien m = new SinhVien(ma , name , ns , dc , vt , gpa);
                m.ChuanHoa();
                b.add(m);

            }
        }

        String ok = cs.nextLine();

        System.out.println("danh sach giao vien chu nhiem lop " + ok + " la  : ");
        for (GiaoVien p : a){
            if (p.getLopPhutrach().equals(ok)){
                System.out.println(p);
            }
        }
        System.out.println("danh sach hoc sinhh lop " + ok + " la : ");
        for (SinhVien p : b){
            if (p.getVaiTro().equals(ok)){
                System.out.println(p);
            }
        }
    }
}