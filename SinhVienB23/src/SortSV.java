import java.util.Comparator;

public class SortSV implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if (o1.getGpa() != o2.getGpa()){
            if (o1.getGpa() > o2.getGpa()){
                return -1;
            } else return 1;
        }
        return o1.getMaSv().compareTo(o2.getMaSv());
    }
}
