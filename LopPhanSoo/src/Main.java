import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int tu = cs.nextInt();
        int mau = cs.nextInt();

        PhanSo a = new PhanSo(tu , mau);
        a.tg();
        System.out.println(a);

    }
}