
package Creational_pattern.BT1;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        HoaDonHeader hhhd = new HoaDonHeader("HD001",(new Date(2021,4,1)), "Nguyen Thanh Lanh");
        
        HoaDon hd = new HoaDonBuilder().AddHoaDonHeader(hhhd)
                                       .AddListCTHD(new CTHD("Dao", 3, 3200, (float) 0.2))
                                       .build();
        hd.toString();
        
    }
}
