
package BT1;

public class main {
    public static void main(String[] args) {
        var bt1 = new Cong(5, new Nhan(8, new Cong(9, new BieuThucDonGian(6))));
        System.out.println(bt1.bieuThuc());
        System.out.println("Gia tri bieu thuc: "+bt1.giaTri());
        var bt2 = new Tru((4), new Cong(8, new Nhan(5, new Chia(2, new Cong(6, new BieuThucDonGian(8))))));
        System.out.println(bt2.bieuThuc());  
        System.out.println("Gia tri bieu thuc: "+bt2.giaTri());
        
        var btt= new TriTuyetDoi(new Tru(100, new Cong(1, new Tru(3, new BieuThucDonGian(5)))));
        System.out.println(btt.bieuThuc());
        System.out.println("Gia tri: "+ btt.giaTri());
    }
}
