
package Strategy.BT3;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.hoTen.length() > o2.hoTen.length()) 
            return 1 ;
        if(o1.hoTen.length() == o2.hoTen.length()) 
            return 0;
        else
            return -1;
    }
}
    

