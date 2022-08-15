package TemplateMenthod.BaiTap2;


public class main {
    public static void main(String[] args) {
        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon();
        //khoi tao hoa don thong qua factory
        HoaDon KHACHTT1= quanLyHoaDon.createHoaDon(KhachHangStyle.THANTHIET);
        HoaDon KhachV1= quanLyHoaDon.createHoaDon(KhachHangStyle.VANG);
        HoaDon KhachKC= quanLyHoaDon.createHoaDon(KhachHangStyle.KIMCUONG);
        //mat hang
        MatHang matHang = new MatHang("Tivi",2,200);
        MatHang matHang1 = new MatHang("TuLanh",4,300);
        MatHang matHang2 = new MatHang("May vi tinh",5,500);
        MatHang matHang3 = new MatHang("Dieu Hoa",1,800);
        //them mat hang
        KHACHTT1.themMH(matHang);
        KHACHTT1.themMH(matHang1);
        KHACHTT1.themMH(matHang2);
        //
        KhachKC.themMH(matHang3);
        KhachKC.themMH(matHang2);
        //IN THONG TIN
        KhachKC.hienThiGioHang();
        System.out.println("------------------------");
        KHACHTT1.hienThiGioHang();
        //IN hoa don
        quanLyHoaDon.themHD(KhachKC);
        quanLyHoaDon.themHD(KHACHTT1);
        quanLyHoaDon.inDS();
    }
}
