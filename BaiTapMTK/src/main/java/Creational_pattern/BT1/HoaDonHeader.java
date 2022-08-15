
package Creational_pattern.BT1;

import java.util.Date;

public class HoaDonHeader {
    String maHD;
    Date ngayBan;
    String tenKH;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public HoaDonHeader(String maHD, Date ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }
    
    @Override
    public String toString() {
        return "{" +
                "maHoaDon='" + maHD + '\'' +
                ", tenKhachHang='" + tenKH + '\'' +
                ", ngayBan=" + ngayBan +
                '}';
    }
}
