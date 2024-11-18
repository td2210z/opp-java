public class CheckTest {
    public static void main(String[] args) {
        String[] s = "Amount : 4524.00 $".split("\\s+");
        for (String x : s){
            System.out.println(x);
        }
        System.out.println(s[s.length-1]);
    }
}
