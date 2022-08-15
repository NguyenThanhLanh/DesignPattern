
package BT_ATM;

public class TaiKhoang implements ATM.I_TaiKhoang{

    public TaiKhoang(double soDu) {
        this.soDu = soDu;
    }
    double soDu;

    @Override
    public double KiemTraSoDu() {
        return this.soDu;
    }

    @Override
    public void RutTien(double x) {
        this.soDu-=x;
    }
}
