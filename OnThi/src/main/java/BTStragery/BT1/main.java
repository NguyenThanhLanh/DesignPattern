/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTStragery.BT1;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        HangHoa h1 = new HangHoa("Tivi", 4000, "Hang Viet Nam chat luong cao");
        HangHoa h2 = new HangHoa("Tu lanh", 3000, "Hang Viet Nam chat luong cao");
        HangHoa h3 = new HangHoa("May giac", 2000, "Hang Viet Nam chat luong cao");
        GioHang gh = new GioHang();
        gh.addSP(h1);
        gh.addSP(h2);
        gh.addSP(h3);
        gh.ThanhToan(HinhThucTT.ThanhToanOL);
    }
}
