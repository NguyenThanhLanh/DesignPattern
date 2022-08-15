package Bai_Tap_Mau_Strategy.BT3;

public class SoSanhTheoTen implements ISoSanh <SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return o1.getTen().compareToIgnoreCase(o2.getTen());
    }
}

