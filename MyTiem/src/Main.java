import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String ss = cs.nextLine();
        int h = Integer.parseInt(ss.substring(0 ,2));
        int m = Integer.parseInt(ss.substring(3 ,5));
        int s = Integer.parseInt(ss.substring(6 ,8));

        time a =new time(h,m,s);

        System.out.println(a.nextSecond());
        System.out.println(a.nextMinute());
        System.out.println(a.nextHour());


        System.out.println(a.previosSeconds());

        System.out.println(a.previosMinutes());
        System.out.println(a.previosHours());


    }
}