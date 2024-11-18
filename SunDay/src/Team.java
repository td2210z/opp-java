import java.util.ArrayList;

public class Team {
    private String vt,  maDB , nameDB;
    private int soTran , diemSo , hieuSo;

    public Team(String vt,String maDB , String nameDB , int soTran , int diemSo , int hieuSo) {
        this.vt = vt;
        this.maDB  = maDB;
        this.nameDB = nameDB;
        this.soTran  = soTran;
        this.diemSo  = diemSo;
        this.hieuSo  = hieuSo;

    }

    public int getHieuSo(){
        return hieuSo;
    }
    public String getNameDB() {
        return nameDB;
    }

    public void getSoTran(){
         soTran += 1;
    }

    public void getDiemThang(int diem){
        diemSo += diem;
    }
    public void getDiemThua(int diem){
        diemSo -= diem;
    }
    public void getDiemHoa(){
        diemSo += 0;
    }


    public void hieuSoThang(){
        hieuSo += 3;
    }

    public void hieuSoThua(){
        hieuSo += 0;
    }

    public void hieuSoHoa(){
        hieuSo += 1;
    }

    public static int findDoiBong(ArrayList<Team> v , String name){
        for (int i =0 ; i < v.size() ; i++){
            if(v.get(i).nameDB.trim().equals(name.trim())){
                return i;
            }
        }
        return -1;

    }

    @Override
    public String toString(){
        return vt + " " + maDB + " " + nameDB + " " + soTran + " " + diemSo + " " + hieuSo
                + "\n" + "-".repeat(20) + "\n";
    }



}
