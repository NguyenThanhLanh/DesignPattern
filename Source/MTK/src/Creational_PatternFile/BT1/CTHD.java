package Creational_PatternFile.BT1;

public class CTHD {
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

    //contructor
    public CTHD(String sanPham, int soLuong, double donGia, float chiecKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chiecKhau = chiecKhau;
    }


}
