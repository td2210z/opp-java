public class Main {
    public static void main(String[] args) {

        TaiKhoan a= new TaiKhoan(1000);
        try {

            a.rutTien(1600);
            System.out.println("so tien dc rut thang cong ");
        } catch (SoDuException ex) {
            System.out.println(ex.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a.getSoDu());
    }
}