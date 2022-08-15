/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

/**
 *
 * @author L_DELL
 */
public class HoaDonCOD extends HoaDon{

    @Override
    public double tinhCK() {
        if(this.listsp.tinhTien()>1000){
            return this.listsp.tinhTien()*0.05;
        }
        return this.listsp.tinhTien();
    }
}
