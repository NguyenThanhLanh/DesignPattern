package Bai_Tap_Mau_Strategy.BT3;
import java.util.ArrayList;
import java.util.List;

public class QLSV {
    List<SinhVien> svs = new ArrayList(); //mang
    ISoSanh<SinhVien> soSanh; // bien

    public QLSV() {
        this.soSanh = soSanh; // pt khoi tao
    }

    public QLSV(List<SinhVien> svs, ISoSanh<SinhVien> soSanh) {
        this.svs = svs;
        this.soSanh = soSanh; // pt kt
    }

    public void sapXep(){
        svs.sort((o1, o2) -> {
            return soSanh.soSanh(o1,o2);
        });
    }

    public void inDS(){
        svs.forEach(sinhVien -> {
            System.out.println(sinhVien.toString());
        });
    }

    public List<SinhVien> getSvs() {
        return svs;
    }

    public void setSvs(List<SinhVien> svs) {
        this.svs = svs;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }


}
