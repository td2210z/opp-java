import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        ArrayList<Book> res = new ArrayList<>();
        for (int i =1;i <= t;i++){
            cs.nextLine();
            String name = cs.nextLine();
            double price = cs.nextDouble();
            int qty = cs.nextInt();
            int luongTacgia = cs.nextInt();
            cs.nextLine();
            Author[] a= new Author[luongTacgia];
            for (int j =0 ; j < luongTacgia ; j++){
                String ten = cs.nextLine();
                String email = cs.nextLine();
                char gt = cs.next().charAt(0);
                cs.nextLine();
                Author m = new Author(ten,email,gt);
                a[j]=m;
            }

            Book tmp = new Book(name ,   price ,qty ,luongTacgia , a);
            res.add(tmp);

        }

        Collections.sort(res , new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNameBook().compareTo(o2.getNameBook());
            }
        });
        for (Book b : res){
            b.display(b.getTg());
        }

    }
}