package Creational_PatternFile.BT1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoaDonHeader {
    List<CTHD> cthds = new ArrayList();

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

    public List<CTHD> getCthds() {
        return cthds;
    }
    public void setCthds(List<CTHD> cthds) {
        this.cthds = cthds;
    }

    //contructor
    public HoaDonHeader(String maHoaDon, Date ngayBan, String tenKhachHang) {
        MaHoaDon = maHoaDon;
        this.NgayBan = ngayBan;
        this.TenKhachHang = tenKhachHang;
    }

    //to String
    public void inDS(){
        System.out.println("Ma hoa don: "+MaHoaDon);
        System.out.println("Ngay Ban: "+NgayBan);
        System.out.println("Ten khach hang: "+TenKhachHang);
        cthds.forEach(cthd ->{
            System.out.println("San pham: "+cthd.sanPham);
            System.out.println("So luong: "+cthd.soLuong);
            System.out.println("Don Gia: "+cthd.donGia);
            System.out.println("Chiec khau: "+cthd.chiecKhau);
        });
    }
}
