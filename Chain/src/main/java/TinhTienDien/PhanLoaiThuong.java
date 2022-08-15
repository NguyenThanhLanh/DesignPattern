/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienDien;

/**
 *
 * @author L_DELL
 */
public class PhanLoaiThuong implements ITinhTienDien{
    int ki;
    double giaTien;
    ITinhTienDien phanLoaiLonHon;

    public PhanLoaiThuong(int ki, double giaTien) {
        this.ki = ki;
        this.giaTien = giaTien;
    }
    @Override
    public ITinhTienDien setSucessor(ITinhTienDien tinhTD) {
        this.phanLoaiLonHon=tinhTD;
        return tinhTD;
    }

    @Override
    public void tinhTienDien(float kii) {
        if(kii<=this.ki){
            System.out.println("So tien phai tra la: " + kii*this.giaTien);
        }
        else{
            this.phanLoaiLonHon.tinhTienDien(kii);
        }
    }
    
}
