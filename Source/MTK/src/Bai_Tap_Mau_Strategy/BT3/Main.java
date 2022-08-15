package Bai_Tap_Mau_Strategy.BT3;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.getSvs().add(new SinhVien("Ngoc An",new Date(2021,1,1),9));
        qlsv.getSvs().add(new SinhVien("Ngoc Tram",new Date(2021,1,1),8));
        qlsv.setSoSanh((new SoSanhTheoTen()));
        qlsv.sapXep();
        qlsv.inDS();
    }
}
