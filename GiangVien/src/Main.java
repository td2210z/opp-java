import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t =cs.nextInt();
        cs.nextLine();
        ArrayList<GiangVien> v = new ArrayList<>();
        while (t-- > 0){
            String name = cs.nextLine();
            String nghe = cs.nextLine();
            GiangVien a= new GiangVien(name,nghe);
            v.add(a);
        }
        Collections.sort(v , new Sorttt());
        for (GiangVien vi : v){
            System.out.println(vi);
        }
    }
}