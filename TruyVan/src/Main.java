import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();

        ArrayList<Person> a= new ArrayList<>();
        ArrayList<Person> b= new ArrayList<>();
        for (int i =0 ; i < t ; i++){
            String ma = cs.nextLine();
            if(ma.startsWith("GV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String vaiTro = cs.nextLine();
                int luong = cs.nextInt();
                cs.nextLine();
                String lopCn = cs.nextLine();

                GiaoVien mp = new GiaoVien(ma , name , ns , dc , vaiTro , luong , lopCn);
                mp.ChuanHoa();
                a.add(mp);

            } else{
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String vaiTro = cs.nextLine();
                double gpa = cs.nextDouble();
                cs.nextLine();
                SinhVien vv = new SinhVien(ma , name , ns , dc , vaiTro , gpa);
                vv.ChuanHoa();
                b.add(vv);
            }

        }

        String res = cs.nextLine();
        System.out.println("danh sach giao vien co dia chi tai " + res + " la : ");
        for (Person p : a){
            if (p.getDc().equals(res)){
                System.out.println(p);
            }
        }
        System.out.println("danh sach sinh vien co dia chi tai " + res + " la : ");
        for (Person p : b){
            if (p.getDc().equals(res)){
                System.out.println(p);
            }
        }

    }
}