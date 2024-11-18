import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.nextLine();
        ArrayList<Circle> a =new ArrayList<>();
        ArrayList<retange> b =new ArrayList<>();
        ArrayList<Square> c =new ArrayList<>();

        for (int i =0 ; i < n ;i++){
            String name = cs.nextLine();
            if (name.equals("C")){
                double radius = cs.nextDouble();
                String color = cs.next();
                Boolean ok = cs.hasNextBoolean();
                cs.nextLine();
                Circle mp = new Circle(color , ok , radius);
                a.add(mp);
            } else if (name.equals("R")){

                double w = cs.nextDouble();
                double h = cs.nextDouble();
                cs.nextLine();
                String color = cs.nextLine();
                Boolean ok = cs.hasNextBoolean();
                cs.nextLine();
                Square mp = new Square(color , ok , w, h);

                retange mp1 = new retange(color , ok , w , h );
                b.add(mp1);

            } else{

                double w = cs.nextDouble();
                double h = w;
                cs.nextLine();
                String color = cs.nextLine();
                Boolean ok = cs.hasNextBoolean();
                cs.nextLine();
                Square mp2 = new Square(color , ok , w, h);
                c.add(mp2);
            }
        }
        System.out.println("ci co");
        for (Circle x : a){
            System.out.println(x);
        }
        System.out.println("renata class");
        for (retange x : b){
            System.out.println(x);
        }
        System.out.println("sqle");
        for (Square x : c){
            System.out.println(x);
        }
    }
}