import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<Nhanvien> a = new ArrayList<>();
        while (t-- > 0){
            String name = cs.nextLine();
            String gt = cs.nextLine();
            String ns = cs.nextLine();
            String dc = cs.nextLine();
            String  mst = cs.nextLine();
            String nkhd = cs.nextLine();

            Nhanvien b = new Nhanvien(name, gt, ns, dc, mst, nkhd);
            b.ChuanHoa();
            a.add(b);
        }

        Collections.sort(a , new SortNS());
        for (Nhanvien x : a){
            System.out.println(x);
        }
    }
}