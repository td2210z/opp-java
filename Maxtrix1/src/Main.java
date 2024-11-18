import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt(); int m = cs.nextInt(); int p = cs.nextInt();

        matrix a= new matrix(n,m);
        a.nextMatrix(cs);
        matrix b = new matrix(m,p);
        b.nextMatrix(cs);

        System.out.println(a.mul(b));

    }
}