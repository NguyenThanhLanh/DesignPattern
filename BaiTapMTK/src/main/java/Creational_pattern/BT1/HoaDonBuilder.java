package Creational_pattern.BT1;

import java.util.ArrayList;
import java.util.List;

public class HoaDonBuilder implements IHoaDonBuilder{
    HoaDonHeader hoaDonHeader;
    List<CTHD> dshh = new ArrayList<>();

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
    public HoaDonBuilder AddHoaDonHeader(HoaDonHeader hoadonHeader) {
        this.hoaDonHeader=hoadonHeader;
        return this;
    }

    @Override
    public HoaDonBuilder AddListCTHD(CTHD cthd) {
        this.dshh.add(cthd);
        return this;
    }

    @Override
    public HoaDon build() {
        return new HoaDon(this);
    }
    
    
}
