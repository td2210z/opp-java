import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        String cusId = cs.nextLine().substring(14);
        String name = cs.nextLine().substring(12);
        char biT = cs.nextLine().charAt(9);
        String idAcc = cs.nextLine().substring(13);
        String bane = cs.nextLine();
        String ok = bane.substring(10 , bane.length() -2);


        Cus tmp = new Cus(Integer.parseInt(cusId) , name , biT);
        Acc res = new Acc(Integer.parseInt(idAcc), tmp , Double.parseDouble(ok));
        cs.nextLine();
        int t = cs.nextInt();
        cs.nextLine();
        while (t-- > 0){
            String boo = cs.nextLine();
            String[] arr = boo.split("\\s+");
            if(arr[0].equals("deposit")){
                res = res.desposit(Double.parseDouble(arr[1]));
            }
            if(arr[0].equals("withdraw")){
                res = res.withDraw(Double.parseDouble(arr[1]));
            }


        }

        System.out.println("--------------------");
        System.out.println(res.toString());



    }
}