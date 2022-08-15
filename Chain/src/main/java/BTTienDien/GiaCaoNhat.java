/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTienDien;

/**
 *
 * @author L_DELL
 */
public class GiaCaoNhat implements ITinhTienDien{
    double giatien;
    int kiMin;

    public GiaCaoNhat(double giatien, int ki) {
        this.giatien = giatien;
        this.kiMin = ki;
    }
    
    @Override
    public ITinhTienDien setSuccessor(ITinhTienDien giaCaoHon) {
        return null;
    }
    
    @Override
    public double tinhTien(float ki) {
        return GiaThuong.tongtien+ki*giatien;
    }
    
}
