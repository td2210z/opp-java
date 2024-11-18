import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();

            String maSinhVien = scanner.nextLine().trim();
            String hoTen = scanner.nextLine().trim();
            String lop = scanner.nextLine().trim();

            SinhVien sinhVien = new SinhVien(maSinhVien, hoTen, lop);

            int soLuongMonHoc = Integer.parseInt(scanner.nextLine().trim());

            for (int j = 0; j < soLuongMonHoc; j++) {
                String tenMonHoc = scanner.nextLine().trim();

                String[] tinChiVaDiem = scanner.nextLine().trim().split(" ");
                int soTinChi = Integer.parseInt(tinChiVaDiem[0]);
                double diemSo = Double.parseDouble(tinChiVaDiem[1]);

                MonHoc monHoc = new MonHoc(tenMonHoc, soTinChi, diemSo);
                sinhVien.themMon(monHoc);
            }

            danhSachSinhVien.add(sinhVien);
        }

        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.tinhGpa() != o2.tinhGpa()){
                    return (int) o2.tinhGpa() - (int) o1.tinhGpa();
                }
                return o1.getMaSv().compareTo(o2.getMaSv());
            }
        });
        System.out.println("\nThong tin va GPA cua tung sinh vien:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            sinhVien.hienThiThongTin();
            System.out.println();
        }

        scanner.close();
    }
}