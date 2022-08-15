/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTChoLam;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        IXepLLoaiTien T1 = new MenhGiaThuong(500);
        IXepLLoaiTien T2 = new MenhGiaThuong(200);
        IXepLLoaiTien T3 = new MenhGiaThuong(100);
        IXepLLoaiTien T4 = new MenhGiaThuong(50);
        IXepLLoaiTien T5 = new MenhGiaThuong(20);
        IXepLLoaiTien T6 = new MenhGiaThuong(10);
        IXepLLoaiTien T7 = new MenhGiaThuong(5);
        IXepLLoaiTien T8 = new MenhGiaThuong(2);
        IXepLLoaiTien T9 = new MenhGiaThapNhat(1);
        T1.ThapHon(T2).ThapHon(T3).ThapHon(T4).ThapHon(T5).ThapHon(T6).ThapHon(T7).ThapHon(T8).ThapHon(T9);
        T1.TienThua(2575);
    }
}
