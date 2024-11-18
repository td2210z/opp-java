import java.util.Comparator;

public class SortLoiNhuan implements Comparator<matHang> {

    @Override
    public int compare(matHang o1 , matHang o2) {

        if (o1.loiNhuan() != o2.loiNhuan()){
            return o2.loiNhuan()-o1.loiNhuan();
        }
        return o1.getMaBh().compareTo(o2.getMaBh());
    }
}
