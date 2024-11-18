import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        ArrayList<SinhVien> a= new ArrayList<>();
        int t = cs.nextInt();
        cs.nextLine();
        for (int i =0 ;i < t ; i++){
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String ns = cs.nextLine();
            Double gpa = cs.nextDouble();
            cs.nextLine();
            SinhVien m= new SinhVien( name ,lop , ns , gpa);
            m.ChuanHoa();
            a.add(m);
        }

        Collections.sort(a , new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGpa() != o2.getGpa()){
                    if(o1.getGpa() > o2.getGpa()){
                        return -1;
                    }else
                        return 1;
                }
                return o1.getMasv().compareTo(o2.getMasv());
            }
        });
        for (SinhVien sv : a){
            System.out.println(sv);
        }
    }
}