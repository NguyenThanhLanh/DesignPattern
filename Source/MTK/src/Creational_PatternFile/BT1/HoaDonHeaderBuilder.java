package Creational_PatternFile.BT1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoaDonHeaderBuilder implements IHoaDonHeader{

    public String MaHoaDon;
    public Date NgayBan;
    public String TenKhachHang;

    //set && get
    public String getMaHoaDon() {
        return MaHoaDon;
    }
    public void setMaHoaDon(String maHoaDon) {
        MaHoaDon = MaHoaDon;
    }
    public Date getNgayBan() {
        return NgayBan;
    }
    public void setNgayBan(Date ngayBan) {
        this.NgayBan = NgayBan;
    }
    public String getTenKhachHang() {
        return TenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    @Override
    public HoaDonHeaderBuilder addMaHoaDon(String maHoaDon) {
        MaHoaDon = maHoaDon;
        return this;
    }

    @Override
    public HoaDonHeaderBuilder addNgayBan(Date ngayBan) {
        NgayBan = ngayBan;
        return this;
    }

    @Override
    public HoaDonHeaderBuilder addTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
        return this;
    }


    @Override
    public HoaDonHeader Build() {
        return new HoaDonHeader(MaHoaDon,NgayBan,TenKhachHang);
    }


}
