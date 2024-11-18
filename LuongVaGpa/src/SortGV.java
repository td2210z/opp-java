import java.util.Comparator;

public class SortGV implements Comparator<GiaoVien> {
    @Override
    public int compare(GiaoVien o1, GiaoVien o2) {
        if (o1.getLuong() != o2.getLuong()){
            return o2.getLuong()-o1.getLuong();
        }
        return o1.getMa().compareTo(o2.getMa());

    }
}
