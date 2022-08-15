package Strategy.BT2;

public class ThanhToanCOD implements IThanhToan{

    @Override
    public float thanhToan(int tienHang) {
        if(tienHang>2000000){
            return (float)(tienHang*0.98);
        }
        else{
            return tienHang;
        }
    }
    
    
}
