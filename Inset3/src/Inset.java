import java.util.TreeSet;

public class Inset {
    TreeSet<String> v= new TreeSet<String>();

    Inset(){}

    Inset(String s){
        String[] arr = s.split("\\s+");
        for (String x : arr){
            v.add(x);
        }

    }
    Inset(TreeSet<String> v){
        this.v=v;
    }
    public Inset Inject(Inset b){
        TreeSet<String> res = new TreeSet<>();
        for (String x: v){
            if (b.v.contains(x)){
                res.add(x);
            }
        }
        Inset m = new Inset(res);
        return m;
    }

    public Inset Union(Inset b){
        TreeSet<String> res = new TreeSet<>();
        for (String x : v){
            res.add(x);
        }
        for (String x : b.v){
            res.add(x);
        }
        Inset m = new Inset(res);
        return m;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String x : v){
            sb.append(x).append(" ");
        }
        return sb.toString().trim();
    }
}
