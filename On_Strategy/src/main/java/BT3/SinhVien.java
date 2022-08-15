
package BT3;

import java.util.Date;

public class SinhVien {
   String hoTen;
   String ngaySinh;
   float Diem;

    public SinhVien(String hoTen, String ngaySinh, float Diem) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.Diem = Diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }
    
    public void Xuat(){
        System.out.println("Ten: " + hoTen + "\tNgay sinh: "+ ngaySinh + "\t" + "Diem: " + Diem);
    }
   
}
