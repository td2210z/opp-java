import java.util.Comparator;

public class SortGame implements Comparator<Game> {
    @Override
    public int compare(Game o1, Game o2) {
        if (o1.layGio() != o2.layGio()){
            return  o2.layGio() - o1.layGio();
        } else{
            return o1.getUser().compareTo(o2.getUser());
        }
    }
}
