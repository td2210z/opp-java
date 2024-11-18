import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<Hocsinh> v= new ArrayList<>();
        while (t-- > 0){
            String name = cs.nextLine();
            ArrayList<Double> mp =new ArrayList<>();
            for (String x : cs.nextLine().split(" ")){
                mp.add(Double.parseDouble(x));
            }
            Hocsinh h = new Hocsinh(name, mp);
            v.add(h);
        }
        Collections.sort(v , new SortDiem());
        for (Hocsinh x : v){
            System.out.println(x);
        }

    }
}