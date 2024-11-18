import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        Inset a = new Inset(cs.nextLine());
        Inset b = new Inset(cs.nextLine());
        System.out.println(a.Inject(b));
        System.out.println("");
        System.out.println(a.Union(b));
    }
}