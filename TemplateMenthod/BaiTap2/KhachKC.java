package TemplateMenthod.BaiTap2;

public class KhachKC extends HoaDon {
    public KhachKC() {
    }

    @Override
    public double tinhChietKhau() {
        if(tinhTien() >=1500)
            return 0.06;
        else {
            if (tinhTien() >= 1000)
                return 0.05;
            if (tinhTien() >= 500)
                return 0.03;
            else return 0;
        }
    }
}