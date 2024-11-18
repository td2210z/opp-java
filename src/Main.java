import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);

        int n = cs.nextInt();
        sinhVien[] a= new sinhVien[n];
        for (int i = 0 ;i < n ;i++){
            cs.nextLine();
            String name = cs.nextLine();
            String ns = cs.nextLine();
            double gpa = cs.nextDouble();
            a[i] = new sinhVien(name,ns,gpa);

        }
        Arrays.sort(a , new Comparator<sinhVien>(){
            public int compare(sinhVien o1, sinhVien o2){
                if (o1.getA1() < o2.getA1()){
                    return -1;
                } else{
                    return 1;
                }

            }
        });

        for (sinhVien x : a){
            System.out.println(x);
        }
    }
}