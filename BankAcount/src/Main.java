import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        cs.nextLine();
        ArrayList<Banking> v = new ArrayList<>();
        for (int i =0 ;i < n;i++){
            String id = cs.nextLine();
            String cus = cs.nextLine();
            String stk = cs.nextLine();
            String pin = cs.nextLine();
            int soDu = cs.nextInt();
            cs.nextLine();

            Banking a= new Banking(id,cus,stk,pin,soDu);
            v.add(a);

        }

        int q = cs.nextInt();

        while (q-->0){
            cs.nextLine();
            String name = cs.nextLine();
            if (name.equals("withdraw")){
                String tk1 = cs.next();
                int tien = cs.nextInt();
                int p = Banking.findAcc(v , tk1);
                v.get(p).truTien(tien);

            } else if (name.equals("deposit")){
                String tk1 = cs.next();
                int tien = cs.nextInt();
                int m = Banking.findAcc(v , tk1);
                v.get(m).congTien(tien);
            } else{
                String tk1 = cs.next();
                String tk2 = cs.next();
                int tien = cs.nextInt();
                int v1 = Banking.findAcc(v , tk1);
                int v2 = Banking.findAcc(v , tk2);
                if (v.get(v1).getSoDu() - 50000 >= tien){
                    v.get(v1).truTien(tien);
                    v.get(v2).congTien(tien);
                }
            }
        }





        for (Banking x : v){
            System.out.println(x);
        }
    }
}