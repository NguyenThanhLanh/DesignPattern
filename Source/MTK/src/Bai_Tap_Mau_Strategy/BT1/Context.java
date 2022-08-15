package Bai_Tap_Mau_Strategy.BT1;

public class Context {
    Tinh tinhToan;

    //set
    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    //thuc hien
     float tinh(float a, float b){
         return tinhToan.Tinh(a,b);
     };


}
