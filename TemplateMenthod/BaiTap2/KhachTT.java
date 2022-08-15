package TemplateMenthod.BaiTap2;

public class KhachTT extends HoaDon {
    public KhachTT() {
    }

    @Override
    public double tinhChietKhau() {
        if(tinhTien() >500 )
            return 0.02;
        else return 0;
    }
}
