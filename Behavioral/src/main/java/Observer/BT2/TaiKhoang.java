/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.BT2;

/**
 *
 * @author L_DELL
 */
public class TaiKhoang implements ATM.ITaiKhoang {

    String TenTK;
    double soDu;
    ATM atm;

    public TaiKhoang(String TenTK, double soDu, ATM atm) {
        this.TenTK = TenTK;
        this.soDu = soDu;
        this.atm = atm;
    }
    
    public void DuaTheVao(){
        atm.attach(this);
    }
    
    public void RutThe(){
        atm.detach();
    }
    
    @Override
    public double kiemTraSoDu() {
        return soDu;
    }

    @Override
    public void nhanThongBao(double soTienRut,boolean TF) {
        if(TF){
            System.out.println("Rut tien thanh cong! Tai da bi tru " + soTienRut + " vao tai khoang. So tien con lai: " + soDu );
        }
        else{
            System.out.println("Khong the rut tien");
        }
    }

    @Override
    public void capNhatTK(double soTienRut) {
        this.soDu-=soTienRut;
    }
    
}
