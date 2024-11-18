import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        while (t-- > 0){
            int tu = cs.nextInt();
            int mau = cs.nextInt();
            int tu1 = cs.nextInt();
            int mau2 = cs.nextInt();

            ps a = new ps(tu,mau);
            ps b = new ps(tu1,mau2);

            ps res = a.congPhanSo(b);
            ps c = new ps((int) Math.pow( res.getTu() , 2)  , (int) Math.pow( res.getMau() , 2));
            c.rg();


            ps d = a.nhanPhanSo(b , c);
            d.rg();
            System.out.println(c + " " + d);
        }
        System.out.println("");
    }
}