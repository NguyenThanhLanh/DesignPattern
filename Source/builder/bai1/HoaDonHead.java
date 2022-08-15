package builder.bai1;

import java.util.Date;

public class HoaDonHead {
    private String maHoaDon,tenKhachHang;
    private Date ngayBan;

    public HoaDonHead(String maHoaDon, String tenKhachHang, Date ngayBan) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", ngayBan=" + ngayBan +
                '}';
    }
}
