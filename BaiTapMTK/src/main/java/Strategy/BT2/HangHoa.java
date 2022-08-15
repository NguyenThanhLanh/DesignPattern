
package Strategy.BT2;

public class HangHoa {
    String tenHH;
    int gia;
    String mota;

    public HangHoa(String tenHH, int gia, String mota) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.mota = mota;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    public void Xuat(){
        System.out.println("Ten: "+this.tenHH+"\tGia: "+this.gia+"\tMo ta: "+this.mota);
    }
}
