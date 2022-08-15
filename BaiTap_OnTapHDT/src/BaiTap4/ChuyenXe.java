package BaiTap4;

public abstract class ChuyenXe {
    String msCX;
    String tenTaiXe;
    String soXe;
    double doanhThu;

    public ChuyenXe(String msCX, String tenTaiXe, String soXe, double doanhThu) {
        this.msCX = msCX;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
    public abstract void Xuat();
}
