/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_rework;

/**
 *
 * @author L_DELL
 */
public class MatHang {
    String name;
    double donGia;
    int soluong;

    public MatHang(String name, double donGia, int soluong) {
        this.name = name;
        this.donGia = donGia;
        this.soluong = soluong;
    }
    
    public double TongTienSP(){
        return this.soluong*this.donGia;
    }
    
    public void Xuat(){
        System.out.println("Ten san pham: "+this.name);
        System.out.println("\tSo luong: "+this.soluong);
        System.out.println("\tDon gia: "+this.donGia);
    }
}
