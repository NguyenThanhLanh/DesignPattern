package On_Tap_Lap_trinh_huong_doi_tuong.BT3;

public class main {
    public static void main(String[] args) {
        SinhVienPoLy sinhVienPoLy = new SinhVienBiz("Nguyen Minh Tri","Markerting",10,9);
        SinhVienPoLy sinhVienPoLy1 = new SinhVienIT("Nguyen Minh Tri","Cong nghe thong tin",10,9,8);
        sinhVienPoLy.xuat();
        sinhVienPoLy1.xuat();
        }
    }
