

package BT1;

public class main {
    public static void main(String[] args) {
        Sach s1 = new Sach.Builder()
            .addTuaDe("Mau thiet ke")
            .addSoTrang(1000)
            .addTacGia("Thanh Lanh")
            .addChuong("Strategy pattern")
       
            .build();
        
        Sach s2 = new Sach.Builder()
            .addTuaDe("ggggg")
            .addSoTrang(1000)
            .addTacGia("Thanh Lanh")
            .addChuong("Strategy pattern")
       
            .build();

        s1.Xuat();
        s2.Xuat();
    }
        
}
