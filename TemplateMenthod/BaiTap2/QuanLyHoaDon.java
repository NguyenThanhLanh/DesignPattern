package TemplateMenthod.BaiTap2;


import java.util.ArrayList;
import java.util.List;

public class QuanLyHoaDon {
    List<HoaDon> list = new ArrayList<>();

    public HoaDon createHoaDon(KhachHangStyle KhachHangStyle){
        switch (KhachHangStyle){
            case THANTHIET: return new KhachTT();
            case VANG: return new KhachVang();
            case KIMCUONG: return new KhachKC();
            default: return null;
        }
    }
    public void themHD(HoaDon hoaDon){
        list.add(hoaDon);
    }
    public void inDS(){
        System.out.println("Hoa Don");
        list.forEach(gioHang -> {
            System.out.println("Tien Phai Thanh Toan "+ gioHang.tienPhaiTT());
        });
    }
}
