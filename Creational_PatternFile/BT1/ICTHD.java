package Creational_PatternFile.BT1;

public interface ICTHD{
    CTHDBuilder addSanPham(String SanPham);
    CTHDBuilder addSoLuong(int SoLuong);
    CTHDBuilder addDonGia(double DonGia);
    CTHDBuilder addChiecKhau(float ChiecKhau);
    CTHD Build();
}
