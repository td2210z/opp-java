import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<Oto> otos = new ArrayList<>();
        ArrayList<XeMay> xeMays = new ArrayList<>();
        while (t--> 0){
            String ma = cs.nextLine();
            if (ma.startsWith("OT")){
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mauSac = cs.nextLine();
                int maLuc = cs.nextInt();
                cs.nextLine();
                int giaBan = cs.nextInt();
                cs.nextLine();
                Oto a = new Oto(ma , name ,hang , mauSac , maLuc , giaBan );
                otos.add(a);
            } else{
                String name = cs.nextLine();
                String hang = cs.nextLine();
                String mauSac = cs.nextLine();
                int toDo = cs.nextInt();
                cs.nextLine();
                int giaBan = cs.nextInt();
                cs.nextLine();
                XeMay v = new XeMay(ma, name , hang , mauSac , toDo ,giaBan);
                xeMays.add(v);

            }
        }

        String tk = cs.nextLine();
        System.out.println("danh sach hang xe oto" + " la : ");

        for (Oto o : otos){
            if (o.getName().equals(tk)){
                System.out.println(o);
            }
        }
        System.out.println("danh sach hang xe may" + " la : ");

        for (XeMay x : xeMays){
            if(x.getName().equals(tk)){
                System.out.println(x);
            }
        }






        /*int n = cs.nextInt();
        int m = cs.nextInt();*/

        /*System.out.println("danh sach hang xe oto" + " la : ");
        //Collections.sort(otos , new SortOto());
        for (Oto o : otos){
            if (o.getGiaBan() >= n && o.getGiaBan() <= m){
                System.out.println(o);
            }
        }
        System.out.println("danh sach hang xe may" + " la : ");
        //Collections.sort(xeMays , new SortXe());
        for (XeMay x : xeMays){
            if (x.getGiaBan() >= n && x.getGiaBan() <= m){
                System.out.println(x);
            }
        }*/

        /*String tmp = cs.nextLine();
        System.out.println("danh sach hang xe " + tmp + " la : ");
        for (XeMay xeMay : xeMays){
            if(xeMay.getHang().equals(tmp)){
                System.out.println(xeMay);
            }
        }
        for (Oto oto : otos){
            if(oto.getHang().equals(tmp)){
                System.out.println(oto);
            }
        }*/
    }
}