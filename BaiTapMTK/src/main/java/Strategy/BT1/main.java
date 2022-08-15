package Strategy.BT1;

public class main {
    public static void main(String[] args) {
        Context pt = new Context() ;
        pt.setTinhToan(new Cong());
        System.out.println(pt.tinh(75, 12));
        
        Context pt1 = new Context();
        pt1.setTinhToan(new Tru());
        System.out.println(pt1.tinh(54, 78));
        
    }
}
