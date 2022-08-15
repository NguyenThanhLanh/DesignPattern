
package Creational_pattern.BT1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<CTHD> dshh = new ArrayList<>();

    public HoaDon(HoaDonBuilder hoaDonBuilder) {
        this.hoaDonHeader = hoaDonHeader;
        dshh = hoaDonBuilder.dshh;
    }

    public HoaDonHeader getHoaDonHeader() {
        return hoaDonHeader;
    }

    public void setHoaDonHeader(HoaDonHeader hoaDonHeader) {
        this.hoaDonHeader = hoaDonHeader;
    }

    public List<CTHD> getDshh() {
        return dshh;
    }

    public void setDshh(List<CTHD> dshh) {
        this.dshh = dshh;
    }
    
    @Override
    public String toString() {
        String s;
        String k = "";
        s = "HoaDon" + hoaDonHeader.toString() +
                "\nlist=";
        for (CTHD cthd : dshh) {
            k = k + "\n" + cthd.toString();
        }
        return s + k;
    }
    
    
}
