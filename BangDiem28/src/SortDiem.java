import java.util.Comparator;

public class SortDiem implements Comparator<Hocsinh>{
    @Override
    public int compare(Hocsinh o1, Hocsinh o2) {
        if (o1.getDiem() != o2.getDiem()){
            return -Double.compare(o1.getDiem(), o2.getDiem());
        } else{
            return o1.getMa().compareTo(o2.getMa());
        }
    }

}
