package BaiTap3;

public abstract class SinhVienPoly {
    String hoTen;
    String nganh;
    public SinhVienPoly(String a, String b){
        hoTen=a; nganh=b;
    }
    public abstract double getDiem();
    public String getHocLuc(){
        if(this.getDiem()<5) return "Yeu";
        if(this.getDiem()>=5 && this.getDiem()<6.5) return "Trung Binh";
        if(this.getDiem()>=6.5 && this.getDiem()<7.5) return "Kha";
        if(this.getDiem()>=7.5 && this.getDiem()<9) return "Gioi";
        else return "Xuat sac";
    }
    
    public abstract void Xuat();
}
