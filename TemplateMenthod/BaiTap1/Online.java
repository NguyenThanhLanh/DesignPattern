package TemplateMenthod.BaiTap1;

public class Online extends GioHang{
    double giaTienCk;
    double chietKhau;

    public Online(double giaTienCk, double chietKhau) {
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
