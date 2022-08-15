
package BT_ATM;

public class main {
    public static void main(String[] args) {
        TaiKhoang TK1 = new TaiKhoang(3000000);
        ATM atm1 = new ATM();
        atm1.attach(TK1);
        atm1.KiemTraTien(TK1);
        atm1.RutTien(30000);
        atm1.detach(TK1);

        atm1.KiemTraTien(TK1);
    }
}
