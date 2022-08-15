package Creational_PatternFile.BT1;

public class CTHDBuilder implements ICTHD{
    public String sanPham;
    int soLuong;
    double donGia;
    float chiecKhau;

    //set && get
    public String getSanPham() {
        return sanPham;
    }
    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public float getChiecKhau() {
        return chiecKhau;
    }
    public void setChiecKhau(float chiecKhau) {
        this.chiecKhau = chiecKhau;
    }


    @Override
    public CTHDBuilder addSanPham(String SanPham) {
        sanPham = SanPham;
        return this;
    }

    @Override
    public CTHDBuilder addSoLuong(int SoLuong) {
        soLuong = SoLuong;
        return this;
    }

    @Override
    public CTHDBuilder addDonGia(double DonGia) {
        donGia = DonGia;
        return this;
    }

    @Override
    public CTHDBuilder addChiecKhau(float ChiecKhau) {
        chiecKhau = ChiecKhau;
        return this;
    }

    @Override
    public CTHD Build() {
        return new CTHD(sanPham,soLuong,donGia,chiecKhau);
    }
}
