import java.awt.print.Book;
import java.util.Comparator;

public class Sort implements Comparator<book> {
    @Override
    public int compare(book o1, book o2) {
        if(o1.getPrice() != o2.getPrice()){
            return (int) o1.getPrice() - (int) o2.getPrice();
        }
        return o1.getNameSach().compareTo(o2.getNameSach());
    }
}
