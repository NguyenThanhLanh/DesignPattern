package Strategy.BT2;

public class ThanhToanOnline implements IThanhToan{

    @Override
    public float thanhToan(int tienHang) {
        if(tienHang<1000000){
            return (float) (tienHang*0.95);
        }
        else
        {
            return (float)(tienHang*0.93);
        }
    }
    
}
