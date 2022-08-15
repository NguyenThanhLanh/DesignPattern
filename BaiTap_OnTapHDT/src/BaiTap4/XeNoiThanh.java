package BaiTap4;

public class XeNoiThanh extends ChuyenXe{
    public XeNoiThanh(String msCX, String tenTaiXe, String soXe, double doanhThu,int soTuyen, double soKmWent) {
        super(msCX, tenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmWent = soKmWent;
    }
    int soTuyen;
    double soKmWent;
    
    @Override
    public void Xuat(){
        System.out.println("Ma: "+this.msCX+"\tTen tai xe: "+this.tenTaiXe+"\tSo xe: "+this.soXe+
                           "\tDoanh thu: "+this.doanhThu+"\tSo tuyen: "+this.soTuyen+
                           "\tSo Km di duoc: "+this.soKmWent);
    }
}
