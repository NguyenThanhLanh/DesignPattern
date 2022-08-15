package BaiTap1_2;
import java.util.Scanner;

public class BaiTap_OnTapHDT {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        System.out.println(nv.getThongTin());
        System.out.println(nv.tinhThuong());
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        qlnv.ThemNV();
        qlnv.ThemNV();
        qlnv.inDS();
    }
    
   
}
