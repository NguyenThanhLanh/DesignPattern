/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiGia;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        TiGia tiGia = new TiGia();
        NhaDauTuA nhaDauTuA = new NhaDauTuA(tiGia);
        NhaDauTuB nhaDauTuB = new NhaDauTuB(tiGia);
        System.out.println("lần 1");
        tiGia.notifyTyGia(6);
        nhaDauTuA.huyDangKy();
        System.out.println("lần 2");
        tiGia.notifyTyGia(-5);
    }
}
