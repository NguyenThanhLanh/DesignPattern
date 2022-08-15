/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

/**
 *
 * @author L_DELL
 */
public class HoaDonFactory {
    public HoaDon createHD(ThanhToanType type){
        HoaDon hd=null;
        System.out.println("");
        switch (type) {
            case ThanhToanCOD:
                hd = new HoaDonCOD();
                break;
            case ThanhToanOnline:
                hd = new HoaDonOnline();
                break;
        }
        return hd;
    }
}
