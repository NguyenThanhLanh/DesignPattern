
package BT1;

public class Nhan extends BieuThucDecorator{
    private float toanHang;
    
    public Nhan(float toanHang, IBieuThuc inner) {
        super(inner);
        this.toanHang=toanHang;
    }
    
    @Override
    public float giaTri() {
        return getBieuThuc().giaTri() + this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return getBieuThuc().bieuThuc() + "*" + this.toanHang + ")";
    }
    
}

