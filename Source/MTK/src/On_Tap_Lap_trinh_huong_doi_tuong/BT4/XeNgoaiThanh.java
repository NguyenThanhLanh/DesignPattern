package On_Tap_Lap_trinh_huong_doi_tuong.BT4;

public class XeNgoaiThanh extends ChuyenXe{
    String NoiDen;
    byte SoNgayDiDuoc;
    double DoanhThu;

    public XeNgoaiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, String noiDen, byte soNgayDiDuoc, double doanhThu) {
        super(maSoChuyenXe, hoTenTaiXe, soXe);
        NoiDen = noiDen;
        SoNgayDiDuoc = soNgayDiDuoc;
        DoanhThu = doanhThu;
    }

    @Override
    public String inDS() {
        return "XeNgoaiThanh{" +
                "MaSoChuyenXe='" + MaSoChuyenXe + '\'' +
                ", HoTenTaiXe='" + HoTenTaiXe + '\'' +
                ", SoXe='" + SoXe + '\'' +
                ", NoiDen='" + NoiDen + '\'' +
                ", SoNgayDiDuoc=" + SoNgayDiDuoc +
                ", DoanhThu=" + DoanhThu +
                '}';
    }
}
