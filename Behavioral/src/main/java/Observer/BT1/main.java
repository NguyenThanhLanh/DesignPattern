/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.BT1;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        Topic tp = new Topic();
        ThanhVienA TVA = new ThanhVienA();
        TVA.DangKiTopic(tp);
        ThanhVienB TVB = new ThanhVienB();
        TVB.DangKiTopic(tp);
        tp.TaoThongTinMoi("Thong tin 1");
//        TVA.CapNhatThongTin();
//        TVB.CapNhatThongTin();
        System.out.println("==================================================");
        tp.TaoThongTinMoi("Thong tin 2");
//        TVA.CapNhatThongTin();
//        TVB.CapNhatThongTin();

        System.out.println("===================================================");
        TVB.HuyDangKiTopic();
        tp.TaoThongTinMoi("Thong tin 3");
        
    }
}
