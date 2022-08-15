package On_Tap_Lap_trinh_huong_doi_tuong.BT4;

public class XeNoiThanh extends ChuyenXe{
    byte SoTuyen;
    double SoKMDiDuoc;
    public double DoanhThu;

    public XeNoiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, byte soTuyen, double soKMDiDuoc, double doanhThu) {
        super(maSoChuyenXe, hoTenTaiXe, soXe);
        SoTuyen = soTuyen;
        SoKMDiDuoc = soKMDiDuoc;
        DoanhThu = doanhThu;
    }

    @Override
    public String inDS() {
        return "XeNoiThanh{" +
                "MaSoChuyenXe='" + MaSoChuyenXe + '\'' +
                ", HoTenTaiXe='" + HoTenTaiXe + '\'' +
                ", SoXe='" + SoXe + '\'' +
                ", SoTuyen=" + SoTuyen +
                ", SoKMDiDuoc=" + SoKMDiDuoc +
                ", DoanhThu=" + DoanhThu +
                '}';
    }
}
