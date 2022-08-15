
package BT1;

public class main {
    public static void main(String[] args) {
        Context pt = new Context();
        pt.setTinh(new Cong());
        System.out.println("Thuc hien cong: "+ pt.tinh(75, 12));
    }
}
