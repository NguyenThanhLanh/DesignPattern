package TemplateMenthod.BaiTap1;

public class MatHang {
    String tenMH;
    int soLuong;
    double donGia;

    public MatHang(String tenMH, int soLuong, double donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return
                "tenMH=" + tenMH +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", Thanh Tien=" + donGia*soLuong
                ;
    }
}
