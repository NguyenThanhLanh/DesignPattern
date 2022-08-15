package TemplateMenthod.BaiTap1;

public class main {
    public static void main(String[] args) {
        MatHang matHang = new MatHang("Tivi",2,200);
        MatHang matHang1 = new MatHang("TuLanh",4,300);
        MatHang matHang2 = new MatHang("May vi tinh",5,500);
        MatHang matHang3 = new MatHang("Dieu Hoa",1,800);
        HoaDonFactory hoaDonFactory =new HoaDonFactory();
        GioHang cod =  hoaDonFactory.createHoaDon(HoaDon.COD,1000,0.05);
        GioHang ONL =  hoaDonFactory.createHoaDon(HoaDon.ONLINE,1000,0.03);
        cod.themMH(matHang);
        cod.themMH(matHang1);
        cod.themMH(matHang2);
        cod.hienThiGioHang();
        //----------------------
        System.out.println("-----------------");
        System.out.println("Online");
        ONL.themMH(matHang3);
        ONL.hienThiGioHang();
        hoaDonFactory.themHD(cod);
        hoaDonFactory.themHD(ONL);
        //In Hoa Don
        System.out.println("-----------------");
        hoaDonFactory.inDS();
    }
}
