import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);
        int t = cs.nextInt();
        ArrayList<Student> v=new ArrayList<>();
        cs.nextLine();
        for (int i =0 ;i < t ;i++){
            String name = cs.nextLine();
            String ns = cs.nextLine();
            String dc = cs.nextLine();
            String lop = cs.nextLine();
            double gpa = cs.nextDouble();
            cs.nextLine();
            Student x = new Student(name,ns,dc,lop,gpa);
            x.ChuanHoa();
            v.add(x);

        }
        Collections.sort(v , new SortGpa());
        for (Student x:v){
            System.out.println(x);
        }
    }
}