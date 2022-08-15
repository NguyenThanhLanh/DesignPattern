/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_rework;

/**
 *
 * @author L_DELL
 */
public class GioHangOnline extends GioHang{
    final float ck1=0.03f;
    final float ck2=0.05f;
    @Override
    protected double tinhCK() {
        if(this.TongTienGH()>=1000000){
            return this.TongTienGH()*ck2;
        }
        return this.TongTienGH()*ck1;
    }   
}
