package On_Tap_Lap_trinh_huong_doi_tuong.BT3;

public class SinhVienIT extends SinhVienPoLy{

    double diemJava;
    double diemCSS;
    double diemHtml;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCSS, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2*diemJava+diemHtml+diemCSS)/4;
    }

    @Override
    public void xuat(){
        System.out.println("Ten: "+hoTen+"\n" +
                "Nganh hoc: "+nganh+"\n" +
                "Diem: "+getDiem()+"\n" +
                "Hoc luc: "+getHocLuc());
    }
}
