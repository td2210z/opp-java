import java.util.Comparator;

public class Sortt implements Comparator<Team> {
    @Override
    public int compare(Team o1, Team o2) {
        return o2.getHieuSo() - o1.getHieuSo();
    }
}
