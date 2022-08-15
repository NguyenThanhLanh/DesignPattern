/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author L_DELL
 */
public abstract class GioHang {
    ArrayList<MatHang> gioHang = new ArrayList<MatHang>();

    public GioHang() {
    }
    
    public void add(MatHang mh){
        gioHang.add(mh);
    }
    
//    public void delete(String tenMH){
//        gioHang.forEach((t) -> {
//            if(t.tenMH==tenMH){
//                gioHang.remove(t);
//            }
//        });
//    }
    
    public void XuatDS(){
        for(MatHang i:gioHang){
            i.Xuat();
        }
    }
    public double tinhTien(){
        double tongTien=0;
        for(MatHang i: gioHang){
            tongTien+=i.tinhTien();
        }
        return tongTien;
    }
    
    public abstract double tinhCK();
}
