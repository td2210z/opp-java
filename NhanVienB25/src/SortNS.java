import java.util.Comparator;

public class SortNS implements Comparator<Nhanvien> {
    @Override
    public int compare(Nhanvien o1 , Nhanvien o2){
        /*int res = o2.getTuoi().compareTo(o1.getTuoi());
        if (res == 0){
            return o1.getMa().compareTo(o2.getMa());
        }
        return res;*/

        String s1 = o1.getTuoi();
        String s2 =o2.getTuoi();

        String[] arr = s1.split("/");
        String[] arr2 = s2.split("/");

        for (int i =2; i >= 0 ; i--){
            int a1 = Integer.parseInt(arr[i]);
            int a2 = Integer.parseInt(arr2[i]);
            if (a1 != a2){
                return a1 -a2;
            }

        }

        return o1.getTuoi().compareTo(o2.getTuoi());
    }

}
