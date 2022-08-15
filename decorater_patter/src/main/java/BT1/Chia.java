
package BT1;

public class Chia extends BieuThucDecorator{
    private float toanHang;
    
    public Chia(float toanHang, IBieuThuc inner) {
        super(inner);
        this.toanHang=toanHang;
    }
    
    @Override
    public float giaTri() {
        if(toanHang!=0)
            return getBieuThuc().giaTri() / this.toanHang;
        else
            return 0;
    }

    @Override
    public String bieuThuc() {
        return getBieuThuc().bieuThuc() + "/" + this.toanHang + ")";
    }
    
}
