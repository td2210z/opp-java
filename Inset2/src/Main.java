import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt(); int m = cs.nextInt();
        int[] a= new int[n]; int[] b = new int[m];
        for (int  i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        for (int i =0 ; i < m ;i++){
            b[i] = cs.nextInt();
        }

        Inset aa= new Inset(a);
        Inset bb = new Inset(b);

        Inset c= aa.Union(bb);
        System.out.println(c);
    }
}