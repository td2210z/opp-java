import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);

        ArrayList<Team> v = new ArrayList<>();
        int testCase = cs.nextInt();
        cs.nextLine();
        for  (int i =0 ;i < testCase; i++){
            String vt = cs.nextLine();
            String ma = cs.nextLine();
            String name = cs.nextLine();

            int a1 = cs.nextInt() , a2 = cs.nextInt() , a3 = cs.nextInt();
            cs.nextLine();
            String gach = cs.nextLine();
            Team tmp = new Team(vt, ma, name, a1, a2, a3);
            v.add(tmp);


        }
        int t = cs.nextInt();
        cs.nextLine();
        while (t-- > 0){

            String name1 = cs.nextLine();
            String ts = cs.nextLine();
            String name2 = cs.nextLine();

            int ts1 = Integer.parseInt(ts.substring(0 , 1));
            int ts2 = Integer.parseInt(ts.substring(4).trim());
            int pos1 = Team.findDoiBong(v , name1);
            int pos2 = Team.findDoiBong(v , name2);


            System.out.println("vi tri của team1 " + name1 + " "+pos1 );
            if (pos1 == -1 || pos2 == -1) {
                System.out.println("Không tìm thấy đội bóng " + (pos1 == -1 ? name1 : name2));
                continue; // Bỏ qua vòng lặp hiện tại nếu không tìm thấy tên đội
            }


            if(ts1 > ts2){
                // doi 1 thang doi 2
                v.get(pos1).getSoTran();
                v.get(pos1).getDiemThang(ts1);
                v.get(pos1).hieuSoThang();

                v.get(pos2).getSoTran();
                v.get(pos2).getDiemThua(ts2);
                v.get(pos2).hieuSoThua();
            } else if (ts1 == ts2){
                v.get(pos1).getSoTran();
                v.get(pos1).getDiemHoa();
                v.get(pos1).hieuSoHoa();
                v.get(pos2).getSoTran();
                v.get(pos2).getDiemHoa();
                v.get(pos2).hieuSoHoa();
            } else{
                v.get(pos1).getSoTran();
                v.get(pos1).getDiemThua(ts1);
                v.get(pos1).hieuSoThua();

                v.get(pos2).getSoTran();
                v.get(pos2).getDiemThang(ts2);
                v.get(pos2).hieuSoThang();
            }

        }
        Collections.sort(v , new Sortt());
        for (Team x : v){
            System.out.println(x);
        }

    }
}