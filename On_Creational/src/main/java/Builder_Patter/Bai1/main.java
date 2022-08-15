
package Builder_Patter.Bai1;

public class main {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                    .addHoaDonHeader(new HoaDonHeader("61133851", "02/07/2001", "Nguyen Thanh Lanh"))
                    .addCTHD(new CTHD("Tivi", 2, 3000000, 0.3f))
                    .addCTHD(new CTHD("Tu lanh", 1, 2000000, 0.3f))
                    .build();
        hd.Xuat();
    }
}
