import java.util.Comparator;

public class Sorttt implements Comparator<GiangVien> {
    @Override
    public int compare(GiangVien o1, GiangVien o2) {
        if (o1.getName() != o2.getName()){
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getMa().compareTo(o2.getMa());
    }
}
