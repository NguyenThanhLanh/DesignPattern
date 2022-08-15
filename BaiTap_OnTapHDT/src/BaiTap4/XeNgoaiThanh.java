package BaiTap4;

public class XeNgoaiThanh extends ChuyenXe{
    public XeNgoaiThanh(String msCX, String tenTaiXe, String soXe, double doanhThu, String noiDen, String dayWent) {
        super(msCX, tenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.dayWent = dayWent;
    }
    String noiDen;
    String dayWent;
    
    @Override
    public void Xuat(){
        System.out.println("Ma: "+this.msCX+"\tTen tai xe: "+this.tenTaiXe+"\tSo xe: "+this.soXe+
                           "\tDoanh thu: "+this.doanhThu+"\tNoi den: "+this.noiDen+
                           "\tSo ngay da di: "+this.dayWent);
    } 
}
