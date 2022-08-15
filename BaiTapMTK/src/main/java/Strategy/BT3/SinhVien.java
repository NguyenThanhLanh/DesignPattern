
package Strategy.BT3;

import java.util.Date;

public class SinhVien {
    String hoTen;
    Date ngaySinh;
    float diemTb;

    public SinhVien(String hoTen, Date ngaySinh, float diemTb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTb = diemTb;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(float diemTb) {
        this.diemTb = diemTb;
    }
    
    public void Xuat(){
        System.out.println("Ten: "+hoTen+"\tNgay sinh: "+ngaySinh+"\tDiem: "+diemTb);
    }
}
