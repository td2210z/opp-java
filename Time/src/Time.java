import java.util.List;

public class Time  {
    private int h , p , s;


    Time(int h , int p , int s) {
        this.h = h;
        this.p = p;
        this.s = s;

    }

    public int toSeconds() {
        return h * 3600 + p * 60 + s;
    }

    @Override
    public String toString(){
        return  h + " " + p + " " + s;
    }
}
