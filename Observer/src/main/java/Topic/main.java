/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        Topic t = new Topic();
        ThanhVienA Ti = new ThanhVienA();
        Ti.DangKyTopic(t);
        ThanhVienB Teo = new ThanhVienB();
        Teo.DangKyTopcic(t);
        t.taoThongTinMoi("Thong tin moi 1");
        t.taoThongTinMoi("thong tin moi 2");
        t.taoThongTinMoi("thong tin moi 3");
        Ti.HuyDangKyTopic();
    }
}
