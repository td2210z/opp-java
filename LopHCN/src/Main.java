import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        double chieuDai = cs.nextDouble();
        double chieuRong = cs.nextDouble();
        cs.nextLine();
        String color= cs.next();
        hcn a= new hcn(chieuDai,chieuRong,color);
        System.out.println(a);
    }
}