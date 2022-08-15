/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

/**
 *
 * @author L_DELL
 */
public class ATM {
    private ITaiKhoanATM taiKhoan;
    
    //phuong thuc attach(dua the vao)
    public void attach(ITaiKhoanATM taiKhoan){
        this.taiKhoan = taiKhoan;
    }
    //phuong thuc detach(rut the ra)
    public void detach(){
        this.taiKhoan = null;
    }
    
    //kiem tra so du tai khoan
    private boolean KiemTraTienRut(int soTienRut){
        if(taiKhoan != null){
            if(taiKhoan.KiemTraSodu() >= soTienRut && soTienRut>0){
                return true;
            }else
                return false;
        }
        else
            return false;
//        return taiKhoan.KiemTraSodu(soTienRut);
    }
    
    public void rutTien(int soTienRut){
        if(taiKhoan!=null){
            if(KiemTraTienRut(soTienRut)){
                taiKhoan.capNhatTK(soTienRut);
                taiKhoan.thongBao(soTienRut, true);
            }else
                taiKhoan.thongBao(soTienRut, false);
        }else
            System.out.println("khong co the trong ATM!!!");
    }
    
    public static interface ITaiKhoanATM{
//        int KiemTraSodu(int soTienRut);
        int KiemTraSodu();
        void thongBao(int soTienRut, boolean thanhCong);
        void capNhatTK(int soTienRut);
    }
}
