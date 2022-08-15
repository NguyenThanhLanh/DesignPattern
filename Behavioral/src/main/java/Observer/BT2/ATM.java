
package Observer.BT2;

public class ATM {
    private ITaiKhoang tk;
    
    public void attach(ITaiKhoang taikhoang){
        this.tk=taikhoang;
    }
    
    public void detach(){
        this.tk= null;         
    }
    
    public boolean kiemtraTienRut(double soTienRut){
        if(tk==null){
            return false;
        }
        else{
            if( tk.kiemTraSoDu() >= soTienRut && soTienRut > 0){
            return true;
            }       
            return false; 
        }
    }
    
    public void RutTien(double soTienRut, boolean kiemtraTk_tienrut){
        if(tk!=null){
            if(kiemtraTk_tienrut){
            tk.capNhatTK(soTienRut);
            tk.nhanThongBao(soTienRut,kiemtraTk_tienrut);
            }
            else{
                System.out.println("Khong du tien de rut!");
            }
        }
        else{
            System.out.println("Khong co the trong may! ");
        }
    }
    
    public static interface ITaiKhoang{
        double kiemTraSoDu();
        void nhanThongBao(double soTienRut,boolean TF);
        void capNhatTK(double soTienRut);
    }
}
