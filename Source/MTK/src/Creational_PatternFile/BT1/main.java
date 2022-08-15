package Creational_PatternFile.BT1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {

        HoaDonHeader hd = new HoaDonHeaderBuilder()
                .addTenKhachHang("Nguyen Minh Tri")
                .addNgayBan(new Date(27,12,2021))
                .addMaHoaDon("1234")
                .Build();

        hd.cthds.add(new CTHDBuilder()
                .addSanPham("Kem")
                .addDonGia(10000)
                .addSoLuong(10)
                .addChiecKhau(10)
                .Build());
        hd.cthds.add(new CTHDBuilder()
                .addSanPham("Tra sua")
                .addDonGia(14000)
                .addSoLuong(20)
                .addChiecKhau(5)
                .Build());

        hd.inDS();
    }
}
