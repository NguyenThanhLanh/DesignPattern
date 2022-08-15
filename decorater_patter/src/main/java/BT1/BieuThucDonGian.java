
package BT1;

public class BieuThucDonGian implements IBieuThuc{
float ToanHang;
    public BieuThucDonGian(float ToanHang) {
        this.ToanHang = ToanHang;
    }
    
    @Override
    public float giaTri() {
        return this.ToanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + String.valueOf(ToanHang) + ")";
    }

   
}
