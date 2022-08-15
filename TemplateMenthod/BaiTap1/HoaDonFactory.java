package TemplateMenthod.BaiTap1;

import java.util.ArrayList;
import java.util.List;

public class HoaDonFactory{
    List<GioHang> list = new ArrayList<>();

    public GioHang createHoaDon(HoaDon hoaDon,double giaTienCk, double chietKhau){
        switch (hoaDon){
            case COD -> {
                return new COD(giaTienCk,chietKhau);
            }
            case ONLINE -> {
                return new Online(giaTienCk, chietKhau);
            }
            default -> {
                return null;
            }
        }
    }
    public void themHD(GioHang gioHang){
        list.add(gioHang);
    }
    public void inDS(){
        System.out.println("Hoa Don");
        list.forEach(gioHang -> {
            System.out.println("Tien Phai Thanh Toan "+ gioHang.tienPhaiTT());
        });
    }
}
