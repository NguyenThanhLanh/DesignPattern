package On_Tap_Lap_trinh_huong_doi_tuong.BT4;

public class ChuyenXe {
    String MaSoChuyenXe;
    String HoTenTaiXe;
    String SoXe;

    public ChuyenXe(String maSoChuyenXe, String hoTenTaiXe, String soXe) {
        MaSoChuyenXe = maSoChuyenXe;
        HoTenTaiXe = hoTenTaiXe;
        SoXe = soXe;
    }

    public String inDS(){
        return "ChuyenXe{" +
                "MaSoChuyenXe='" + MaSoChuyenXe + '\'' +
                ", HoTenTaiXe='" + HoTenTaiXe + '\'' +
                ", SoXe='" + SoXe + '\'' +
                '}';
    }


}
