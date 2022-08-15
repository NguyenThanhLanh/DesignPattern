/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_rework;

/**
 *
 * @author L_DELL
 */
public class HoaDonFactory {
    public HoaDon CreateHD(String ten, String ngay,GioHang gh){
        HoaDon hd= null;
        if(gh instanceof GioHangCOD){
            hd = new HoaDonCOD(ten,ngay, gh);
        }
        else{
            hd = new HoaDonOnline(ten, ngay, gh);
        }
        return hd;
    }
}
