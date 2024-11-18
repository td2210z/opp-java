import java.util.Comparator;

public class SortOne implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if(o1.getLop() != o2.getLop()){
            return o1.getLop().compareTo(o2.getLop());
        }
        return o1.getMa().compareTo(o2.getMa());
    }
}
