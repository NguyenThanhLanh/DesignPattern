
package BaiTap3;
import java.util.Scanner;
public class SinhvienIT extends SinhVienPoly{

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public SinhvienIT(String a, String b,double diemJava, double diemHtml, double diemCss) {
        super(a, b);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }
    double diemJava;
    double diemHtml;
    double diemCss;
    
    @Override
    public double getDiem(){
        return (2*this.diemJava+this.diemHtml+this.diemCss)/4;
    }
    
    @Override
    public void Xuat(){
        System.out.println("Sinh vien: \n"+
                            "Ten: "+this.hoTen+"\n"+
                            "Nganh: "+this.nganh+"\n");
    }
}
