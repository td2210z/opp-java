import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.nextLine();
        ArrayList<taiKhoan> a = new ArrayList<>();
        for (int i =0 ;i < n ; i++){
            String id = cs.nextLine();
            String cus = cs.nextLine();
            String user = cs.nextLine();
            String pass = cs.nextLine();
            a.add(new taiKhoan(id,cus,user,pass));
        }
        int q = cs.nextInt();
        cs.nextLine();
        while (q-- > 0) {
            String name1 = cs.nextLine();
            String name2 = cs.nextLine();

            boolean ok = false;
            for (taiKhoan x : a){
                if (x.getUser().equals(name1) && x.getPass().equals(name2)){
                    ok = true;
                }
            }
            if (!ok) System.out.println("fail");
            else{
                System.out.println("success");
            }
        }
    }
}