package Bai_Tap_Mau_Strategy.BT2;

public class HangHoa {
    String tenHang;
    int gia;
    String moTa;

    //set get
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    //constructor

    public HangHoa(String tenHang, int gia, String moTa) {
        this.tenHang = tenHang;
        this.gia = gia;
        this.moTa = moTa;
    }


}
