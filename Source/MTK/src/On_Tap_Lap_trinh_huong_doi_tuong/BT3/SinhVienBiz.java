package On_Tap_Lap_trinh_huong_doi_tuong.BT3;

public class SinhVienBiz extends SinhVienPoLy{
    double diemMarketing;
    double diemSale;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSale) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    @Override
    public double getDiem() {
        return (2*diemMarketing+diemSale)/3;
    }

    @Override
    public void xuat(){
        System.out.println("Ten: "+hoTen+"\n" +
                "Nganh hoc: "+nganh+"\n" +
                "Diem: "+getDiem()+"\n" +
                "Hoc luc: "+getHocLuc());
    }

}
