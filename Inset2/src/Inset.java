import java.util.TreeSet;

public class Inset {
    private TreeSet<Integer> v= new TreeSet<>();

    Inset(){

    }
    public Inset(int[] a){
        for (int x : a) {
            v.add(x);
        }
    }

    public Inset(TreeSet<Integer> v){
        this.v=v;
    }

    public Inset Union(Inset b){
        TreeSet<Integer> t= new TreeSet<>();
        for (int x : v){
            t.add(x);

        }
        for (int x : b.v){
            t.add(x);
        }
        Inset res = new Inset(t);
        return res;

    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int x : v){
            sb.append(x).append(" ");
        }
        return sb.toString().trim();
    }

}
