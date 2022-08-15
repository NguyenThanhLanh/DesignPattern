/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

/**
 *
 * @author L_DELL
 */
public class TaiKhoang implements ATM.ITaiKhoanATM{
    String tenTaiKhoan;
    int SoDu;
    ATM atm;

    public TaiKhoang(String tenTaiKhoan, int SoDu, ATM atm) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.SoDu = SoDu;
        this.atm = atm;
    }
    
    public void duaTheVao(){
        atm.attach(this);
    }
    public void rutThe(){
        atm.detach();
    }

    @Override
    public int KiemTraSodu() {
        return SoDu;
    }
    
//    @Override
//    public boolean KiemTraSodu(int soTienRut) {
//        if((SoDu - soTienRut) <= 50){
//            return false;
//        }
//        else 
//            return true;
//    }

    @Override
    public void thongBao(int soTienRut, boolean thanhCong) {
        System.out.println("tai khoang: " + tenTaiKhoan);
        if(thanhCong){
            System.out.println("so tien rut: "+soTienRut);
        }else{
            System.out.println("rut tien khong thanh cong!!");
        }
    }
    @Override
    public void capNhatTK(int soTienRut) {
        this.SoDu -= soTienRut;
    }
}
