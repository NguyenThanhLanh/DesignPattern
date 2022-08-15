/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTSV;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        var db = new SinhVienDB();
        SinhVien sv01 = new SinhVien(1, "Nguyen Thanh Lanh", "Binh Dinh", 2001);
        SinhVien sv02 = new SinhVien(2, "Nguyen Thanh Long", "Binh Dinh", 2001);
        db.add(sv01);
        db.add(sv02);
        db.Xuat();
    }
}
