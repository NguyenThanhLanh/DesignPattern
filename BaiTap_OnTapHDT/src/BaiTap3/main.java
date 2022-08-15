package BaiTap3;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
    SinhVienPoly s1 = new SinhvienIT("Thanh Lanh", "Cong Nghe Thong Tin", 8.5,7.3, 6.6);
    SinhVienPoly s2 = new SinhVienBiz("Le Phuong Dung", "Quan tri khach san", 8.5,7.3);
    s1.Xuat();
    s2.Xuat();
    }
}
