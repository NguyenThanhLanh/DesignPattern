package Bai_Tap_Mau_Strategy.BT3;

import java.util.Date;

public class SinhVien {
    private String ten;
    private Date ngaySinh;
    private float dtb;

    public SinhVien(String ten, Date ngaySinh, float dtb) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return "Ten: "+ten+ "\n" +
                "Ngay sinh:" + ngaySinh + "\n"+
                "Diem trung binh: "+dtb +"\n";
    }


}
