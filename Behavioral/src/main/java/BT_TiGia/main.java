/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TiGia;


public class main {
    public static void main(String[] args) {
        TiGia t = new TiGia();
    
        NhaDauTuA DTA = new NhaDauTuA(t);
        NhaDauTuB DTB = new NhaDauTuB(t);
        System.out.println("Lan 1: ");
        t.notifyTiGia(-5);
        DTA.HuyDangKy();
        System.out.println("Lan 2: ");
        t.notifyTiGia(-5);
        
    }
}
