import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String name = cs.nextLine();
        int luong = cs.nextInt();
        int soNgayCong = cs.nextInt();
        cs.nextLine();
        String cv = cs.nextLine();

        NhanVien a= new NhanVien(name , luong , soNgayCong , cv);

        System.out.println(a);
    }
}