/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienDien;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        ITinhTienDien T1 = new PhanLoaiThuong(50, 1.678);
        ITinhTienDien T2 = new PhanLoaiThuong(100, 1.734);
        ITinhTienDien T3 = new PhanLoaiThuong(200, 2.014);
        ITinhTienDien T4 = new PhanLoaiThuong(300, 2.536);
        ITinhTienDien T5 = new PhanLoaiThuong(400, 2.536);
        T1.setSucessor(T2).setSucessor(T3).setSucessor(T4).setSucessor(T5);
        T1.tinhTienDien(80);
    }
}
