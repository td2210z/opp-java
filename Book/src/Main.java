import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<NewBook> v = new ArrayList<>();
        while (t-- > 0){
            String nameSach = cs.nextLine();
            double giaBan = cs.nextDouble();
            int giaMua = cs.nextInt();
            cs.nextLine();
            String tacGia = cs.nextLine();
            String Email = cs.nextLine();
            Character m = cs.next().charAt(0);
            cs.nextLine();

            Auther exp = new Auther(tacGia , Email , m);
            NewBook tmp = new NewBook(nameSach , exp , giaBan , giaMua);
            v.add(tmp);

        }



        for (NewBook x : v){
            System.out.println(x);
        }
    }
}