import java.util.Comparator;

public class SortSV implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if(o1.getGpa() != o2.getGpa()){
            return -Double.compare(o1.getGpa(), o2.getGpa());
        }
        return o1.getMa().compareTo(o2.getMa());
    }

}
