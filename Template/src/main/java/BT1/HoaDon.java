/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

/**
 *
 * @author L_DELL
 */
public abstract class HoaDon extends GioHang{
    String ngay;
    String tenThuNgan;
    GioHang listsp;

    public void Xuat(){
        listsp.XuatDS();
        System.out.println("================================================");
        System.out.println("Tong so tien: "+listsp.tinhTien());
        System.out.println("Chiec khau: "+this.tinhCK());
        System.out.println("So tien thanh toan: ");
    }
    @Override
    public abstract double tinhCK();
    public double ThanhToan(){
        return listsp.tinhTien()-this.tinhCK();
    }
    
}
