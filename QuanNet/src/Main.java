import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<Game> v= new ArrayList<>();
        while (t-- > 0){
            String user = cs.nextLine();
            String pass = cs.nextLine();
            String name = cs.nextLine();
            String gioVao = cs.nextLine();
            String gioRa = cs.nextLine();
            Game a = new Game(user,pass,name,gioVao,gioRa);
            v.add(a);

        }
        Collections.sort(v , new SortGame());
        for (Game x : v){
            System.out.println(x);
        }
    }
}