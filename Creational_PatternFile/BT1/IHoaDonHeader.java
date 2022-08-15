package Creational_PatternFile.BT1;

import java.util.Date;


public interface IHoaDonHeader {
    HoaDonHeaderBuilder addMaHoaDon(String maHoaDon);
    HoaDonHeaderBuilder addNgayBan(Date ngayBan);
    HoaDonHeaderBuilder addTenKhachHang(String tenKhachHang);

    HoaDonHeader Build();
}
