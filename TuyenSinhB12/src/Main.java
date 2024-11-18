import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String name = sc.nextLine();
        float toan = sc.nextFloat();
        float li = sc.nextFloat();
        float hoa = sc.nextFloat();

        SinhVien a = new SinhVien(ma , name , toan , li , hoa);
        a.kq();
    }
}