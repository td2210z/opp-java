import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        Matrix a= new Matrix(n , m);
        a.nextMatrix(cs);
        Matrix b = a.trans();
        System.out.println(a.mul(b));


    }
}