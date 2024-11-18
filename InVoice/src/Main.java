import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<ivoke> v= new ArrayList<>();
        for (int i = 1 ; i <=t ; i++){
            cs.nextLine();
            String[] cusID = cs.nextLine().split("\\s+");
            String[] name = cs.nextLine().split("\\s+");
            String[] dis = cs.nextLine().split("\\s+");
            String[] ivoker = cs.nextLine().split("\\s+");
            String[] amount = cs.nextLine().trim().split("\\s+");

            String fullname = "";
            for (int j = 3; j < name.length; j++){
                fullname += name[j] + " ";
            }
            fullname = fullname.substring(0,fullname.length()-1);

            Customer res = new Customer(Integer.parseInt(cusID[cusID.length-1]) , fullname ,Integer.parseInt(dis[dis.length-1]));
            ivoke res2 = new ivoke(res , Integer.parseInt(ivoker[ivoker.length -1]) , Double.parseDouble(amount[amount.length-2]));
            res2.setAmount();
            v.add(res2);


        }

        Collections.sort(v , new Comparator<ivoke>(){
            @Override
            public int compare(ivoke o1, ivoke o2) {
                if(o1.getAmount() != o2.getAmount()){
                    return (int) o2.getAmount() - (int) o1.getAmount();
                }
                return o1.getCustomer().getId() - o2.getCustomer().getId();
            }
        });

        v.forEach((x) -> System.out.println(x));

    }
}