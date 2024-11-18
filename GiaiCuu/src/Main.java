import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);

        int power = Integer.parseInt(cs.nextLine().substring(8));
        int blood = Integer.parseInt(cs.nextLine().substring(8));
        String tmp = cs.nextLine();
        boolean alive = false;

        if (tmp.equals("ALIVE")) alive = true;

        Chacter a = new Chacter(power , blood ,alive);

        int t = cs.nextInt();
        cs.nextLine();
        for (int i =0 ;i < t ; i++){
            String nv = cs.nextLine();
            if(nv.charAt(0) == 's'){
                int sm = Integer.parseInt(nv.substring(8));
                a.witch(sm);
            } else if(nv.startsWith("pea")){
                a.Pea();
            } else if(nv.startsWith("mushroom")){
                a.mushRoom();
            } else{
                int sm = Integer.parseInt(nv.substring(6));
                a.soldier(sm);
            }
            System.out.println(a);
        }
    }
}