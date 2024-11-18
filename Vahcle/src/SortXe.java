import java.util.Comparator;

public class SortXe implements Comparator<PhuongTien> {
    @Override
    public int compare(PhuongTien o1 , PhuongTien o2){
        if (o1.getGiaBan() != o2.getGiaBan()){
            return o2.getGiaBan() - o1.getGiaBan();
        }
        return o1.getMa().compareTo(o2.getMa());
    }
}
