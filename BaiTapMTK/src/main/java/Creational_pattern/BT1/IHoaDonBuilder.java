
package Creational_pattern.BT1;

public interface IHoaDonBuilder {
    HoaDonBuilder AddHoaDonHeader(HoaDonHeader hoadonHeader);
    HoaDonBuilder AddListCTHD(CTHD cthd);
    HoaDon build();
}
