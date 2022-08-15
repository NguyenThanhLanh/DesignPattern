package TemplateMenthod.BaiTap1;

public class COD extends GioHang{
    double giaTienCk;
    double chietKhau;

    public COD(double giaTienCk, double chietKhau) {
        this.giaTienCk = giaTienCk;
        this.chietKhau = chietKhau;
    }

    @Override
    public double tinhChietKhau() {
        if(tinhTien() > giaTienCk)
        return chietKhau;
        else return 0;
    }
}
