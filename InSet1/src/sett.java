import java.util.TreeSet;

public class sett {

    private TreeSet<Integer> v= new TreeSet<Integer>();

    sett(){

    }
    sett(int[] a){
        for (int x : a){
            v.add(x);
        }

    }

    public sett(TreeSet<Integer> v){
        this.v = v;
    }

    public sett intersection(sett newSet){
        TreeSet<Integer> res = new TreeSet<>();
        for (int x : v){
            if(newSet.v.contains(x)){
                res.add(x);
            }
        }
        sett inSet = new sett(res);
        return inSet;
    }


    @Override
    public String toString(){
        String res = "";
        for (int x : v){
            res += x + " ";
        }
        return res;
    }
}
