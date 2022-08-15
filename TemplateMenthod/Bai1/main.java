package TemplateMenthod.Bai1;

public class main {
    public static void main(String[] args) {
        SinhVienDB db = new SinhVienDB();
        db.add(new SinhVien(1,"Hoan","NT",1999));
        db.add(new SinhVien(2,"Khanh","NT",1999));
        db.update(new SinhVien(1,"Hoan Dep Trai","NT",2000));
        db.inDS();
        db.inInfo();
    }
}
