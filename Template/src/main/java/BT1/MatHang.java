/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

public class MatHang {
    String tenMH;
    double giaSP;
    int soluong;

    public MatHang(String tenMH, double giaSP, int soluong) {
        this.tenMH = tenMH;
        this.giaSP = giaSP;
        this.soluong = soluong;
        
    }
    
    public double tinhTien(){
        return this.giaSP*this.soluong;         
    }
    
    public void Xuat(){
        System.out.println("\tTen mat hang: "+this.tenMH);
        System.out.println("\t\tSo luong: "+this.soluong);
        System.out.println("\t\tDon gia: "+this.giaSP);
        System.out.println("\t\tTong tien: "+this.tinhTien());  
    }

    
}
