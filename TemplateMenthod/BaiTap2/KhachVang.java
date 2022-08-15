package TemplateMenthod.BaiTap2;

public class KhachVang extends HoaDon {
    public KhachVang() {
    }

    @Override
    public double tinhChietKhau() {
        if(tinhTien() >=1000)
            return 0.05;
        else {
            if (tinhTien() >= 500)
                return 0.03;
            else return 0;
        }
    }
}