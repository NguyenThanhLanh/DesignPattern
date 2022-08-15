/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_rework;

/**
 *
 * @author L_DELL
 */
public abstract class HoaDon {
    String TenKt;
    String ngay;
    GioHang giohang;

    public HoaDon(String TenKt, String ngay, GioHang giohang) {
        this.TenKt = TenKt;
        this.ngay = ngay;
        this.giohang = giohang;
    }
    
    public abstract void Xuat();
}
