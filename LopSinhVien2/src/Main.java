import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String ma = "00001";
        String name = cs.nextLine();
        String gt = cs.nextLine();
        String ns = cs.nextLine();
        String dc = cs.nextLine();
        String mst =  cs.nextLine();
        String nkhd = cs.nextLine();
        SinhVien a= new SinhVien(ma , name , gt , ns , dc , mst , nkhd);

        a.ChuanHoa();
        System.out.println(a);

    }
}