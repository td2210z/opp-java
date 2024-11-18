import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<matHang> v= new ArrayList<>();
        for (int i = 0 ;i < t ; i++){
            String name = cs.nextLine();
            String dvt = cs.nextLine();
            int giaban = cs.nextInt();
            int giamua = cs.nextInt();
            cs.nextLine();
            matHang a= new matHang(name,dvt,giaban,giamua);
            v.add(a);
        }
        Collections.sort(v , new SortLoiNhuan());
        for (matHang x : v){
            System.out.println(x);
        }
    }
}