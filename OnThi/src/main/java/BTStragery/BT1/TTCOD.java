/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTStragery.BT1;

/**
 *
 * @author L_DELL
 */
public class TTCOD implements IThanhToan{

    @Override
    public double ThanhToan(double tienHang) {
        if(tienHang>2000)
            return tienHang*0.98;
        else
            return tienHang;
    }
    
}
