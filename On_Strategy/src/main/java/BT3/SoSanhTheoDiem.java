
package BT3;

public class SoSanhTheoDiem implements ISoSanh{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
       if (o1.getDiem() > o2.getDiem())
           return 1;
       if (o1.getDiem() == o2.getDiem())
           return 0;
       if (o1.getDiem() < o2.getDiem())
           return -1;
       return 0;
    }
    
}
