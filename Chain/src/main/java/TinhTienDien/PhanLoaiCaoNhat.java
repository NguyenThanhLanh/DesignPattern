/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienDien;

/**
 *
 * @author L_DELL
 */
public class PhanLoaiCaoNhat implements ITinhTienDien{
    int ki;
    double giatien;

    public PhanLoaiCaoNhat(int ki, double gt ) {
        this.ki = ki;
        this.giatien=gt;
    }

    @Override
    public ITinhTienDien setSucessor(ITinhTienDien tinhTD) {
        return null;
    }

    @Override
    public void tinhTienDien(float kii) {
        System.out.println("So tien phai tra :" + (this.ki*giatien) );
    }
    
    
}
