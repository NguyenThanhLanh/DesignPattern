/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTienDien;

public class GiaThuong implements ITinhTienDien{
    double gia;
    int kiMax;
    ITinhTienDien mucGiaTT;
    
    public static double tongtien=0;

    public GiaThuong(double gia, int kiMax) {
        this.gia = gia;
        this.kiMax = kiMax;
    }

    @Override
    public ITinhTienDien setSuccessor(ITinhTienDien giaCaoHon) {
        this.mucGiaTT=giaCaoHon;
        return giaCaoHon;
    }

    @Override
    public double tinhTien(float ki) {
        
        if(ki>=kiMax){
            ki-=this.kiMax;
            tongtien+=this.gia*kiMax;
            return this.mucGiaTT.tinhTien(ki);
            
        }
        else
            {
                return tongtien+=ki*gia;
            }
    }
}
