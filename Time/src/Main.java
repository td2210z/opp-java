import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();




            ArrayList<Time> v= new ArrayList<>();
            for (int i = 0 ; i < t ; i++){
                int h = sc.nextInt();
                int p = sc.nextInt();
                int s = sc.nextInt();
                Time a= new Time(h , p , s);
                v.add(a);
            }
            Collections.sort(v , new Comparator<Time>(){
                @Override
                public int compare(Time o1, Time o2) {
                    return o1.toSeconds() -  o2.toSeconds();
                }
            });

            v.forEach((x) -> System.out.println(x));

    }
}