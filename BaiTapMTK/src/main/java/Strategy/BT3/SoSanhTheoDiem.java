package Strategy.BT3;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>
{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.diemTb > o2.diemTb) return 1;
        if (o1.diemTb == o2.diemTb) return 0;
        else
            return -1;
    }
    
}
