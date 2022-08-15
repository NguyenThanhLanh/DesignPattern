package Bai_Tap_Mau_Strategy.BT1;

public class main {
    public static void main(String[] args) {
        Context c = new Context();
        c.setTinhToan(new Cong());
        System.out.println(c.tinh(75,12));

        Context d = new Context();
        d.setTinhToan(new Tru());
        System.out.println(d.tinh(57,78));;
    }
}
