package builder.bai1;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .addHoaDonHead(new HoaDonHead("HD01","Hoàn", new Date(2021,4,1)))
                .addCTHD(new CTHD("tivi",2,2,2))
                .addCTHD(new CTHD("tủ lạnh",3,2,2))
                .build();
        System.out.println(hoaDon.toString());
    }
}
