
package Creational_pattern.BT1;

public class CTHD {
    String sp;
    int soluong;
    double donGia;
    float chiecKhau;

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
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

    public CTHD(String sp, int soluong, double donGia, float chiecKhau) {
        this.sp = sp;
        this.soluong = soluong;
        this.donGia = donGia;
        this.chiecKhau = chiecKhau;
    }
    
    @Override
    public String toString() {
        return "CTHD{" +
                "sanPham='" + sp + '\'' +
                ", soLuong=" + soluong +
                ", donGia=" + donGia +
                ", chietKhau=" + chiecKhau +
                '}';
    }
}
