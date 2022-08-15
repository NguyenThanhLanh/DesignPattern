package On_Tap_Lap_trinh_huong_doi_tuong.BT1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
//        NhanVien nhanVien1 = new NhanVien("Nguyen Minh Tri",21, "Khanh Hoa", 9000000, 200);
//        NhanVien nhanVien2 = new NhanVien("Nguyen Phan Hao", 21, "Khanh Hoa", 7000000, 190);
//        System.out.println(nhanVien1.getThongTin()+"\n" +
//                nhanVien2.getThongTin());

        int n =2;
        QuanLyNhanVien[] quanLyNhanViens = new QuanLyNhanVien[n];
        List<NhanVien> nhanViens = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            quanLyNhanViens[i] = new QuanLyNhanVien();
            quanLyNhanViens[i].setThongTin();
        }

        for (int i = 0; i < n; i++) {
            quanLyNhanViens[i].inDS();
        }
    }
}
