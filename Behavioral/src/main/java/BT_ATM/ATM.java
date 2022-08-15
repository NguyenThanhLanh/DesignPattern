
package BT_ATM;

import java.util.ArrayList;

public class ATM {
    private I_TaiKhoang Tk;
    public void attach(TaiKhoang a){
        this.Tk=a;
    }
    
    public void detach(TaiKhoang a){
        this.Tk=null;
    }
    
    public void KiemTraTien(TaiKhoang a){
        System.out.println("So tien: "+Tk.KiemTraSoDu());
    }
    
    public void RutTien(double x){
        if(Tk.KiemTraSoDu()>x&&x>0){
            Tk.RutTien(x);
        }
        else
            {
                System.out.println("Tai khoang khong du tien! ");
            }
    }
    
    static public interface I_TaiKhoang{
        double KiemTraSoDu();
        void RutTien(double x);
    }
}
