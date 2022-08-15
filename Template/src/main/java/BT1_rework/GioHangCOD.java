/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_rework;

/**
 *
 * @author L_DELL
 */
public class GioHangCOD extends GioHang{
    final float ck = 0.03f;
    @Override
    protected double tinhCK() {
        if(this.TongTienGH()>1000000){
            return this.TongTienGH()*ck;
        }
        return this.TongTienGH();
    }
}
