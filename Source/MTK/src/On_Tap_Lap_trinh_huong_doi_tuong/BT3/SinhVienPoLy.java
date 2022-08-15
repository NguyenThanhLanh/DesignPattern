package On_Tap_Lap_trinh_huong_doi_tuong.BT3;

public abstract class SinhVienPoLy {
    String hoTen;
    String nganh;

    public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();
    public abstract void xuat();

    public String getHocLuc(){
        double diem = getDiem();
        if(diem < 5)
            return "Yeu";
        if(diem >= 5 && diem <= 6.5)
            return "Trung binh";
        if(diem >= 6.5 && diem < 7)
            return "Kha";
        if(diem >= 7.5 && diem < 9)
            return "Gioi";
        else
            return "Xuat sac";
    }
}
