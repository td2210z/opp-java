import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);


        ArrayList<SinhVien> v = new ArrayList<>();
        for (int i =0 ;i < 4; i++){
            String ma =cs.nextLine().trim();
            String name = cs.nextLine().trim();
            String lop = cs.nextLine().trim();
            String email = cs.nextLine().trim();

            SinhVien a =new SinhVien(ma , name , lop , email);
            v.add(a);
        }
        Collections.sort(v, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (SinhVien vi : v){
            System.out.println(vi);
        }
    }

}