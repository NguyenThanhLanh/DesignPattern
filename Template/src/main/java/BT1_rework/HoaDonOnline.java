/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_rework;

/**
 *
 * @author L_DELL
 */
public class HoaDonOnline extends HoaDon{

    public HoaDonOnline(String TenKt, String ngay, GioHang giohang) {
        super(TenKt, ngay, giohang);
    }

    @Override
    public void Xuat() {
        System.out.println("Hoa don ONLINE");
        System.out.println("Nhan vien thanh toan: "+this.TenKt);
        System.out.println("Ngay in hoa don: "+this.ngay);
        this.giohang.Xuat();  
    }
    
}
