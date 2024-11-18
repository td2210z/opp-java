public class GiaoVien {
    private String maGv , name;
    private int luong;


    GiaoVien(String maGv, String name, int luong) {
        this.maGv = maGv;
        this.name = name;
        this.luong = luong;

    }

    public String getMaGv() {
        return maGv;
    }

    public void setMaGv(String maGv) {
        this.maGv = maGv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int layHeSoLuong(){
        return Integer.parseInt(maGv.substring(2));
    }

    public int tinhLuong(){
        int heSo = layHeSoLuong();
        if (maGv.startsWith("HT")){
            return (luong * heSo) + 2000000;
        } else if (maGv.startsWith("HP")){
            return (luong * heSo) + 900000;
        } else{
            return (luong * heSo) + 500000;
        }
    }


    @Override
    public String toString(){
        return maGv + " " + name + " " + layHeSoLuong() + " " + tinhLuong();
    }
}
