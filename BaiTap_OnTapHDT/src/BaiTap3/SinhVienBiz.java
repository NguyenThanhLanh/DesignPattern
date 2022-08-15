
package BaiTap3;
import java.util.Scanner;
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing;
    double diemSales;
    public SinhVienBiz(String c, String d, double a, double b){
        super(c,d);
        this.diemMarketing=a;
        this.diemSales=b;
    }
    @Override
    public double getDiem(){
        return (2*this.diemMarketing+this.diemSales)/3;
    }
    
    @Override
    public void Xuat(){
        System.out.println("Sinh vien: \n"+
                            "Ten: "+this.hoTen+"\n"+
                            "Nganh: "+this.nganh+"\n");
    }
}
