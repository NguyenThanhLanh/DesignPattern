
package BT1;

public class Tru extends BieuThucDecorator{
    private float toanHang;
    
    public Tru(float toanHang, IBieuThuc inner) {
        super(inner);
        this.toanHang=toanHang;
    }
    
    @Override
    public float giaTri() {
        return _bieuThuc.giaTri() - this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return _bieuThuc.bieuThuc() + "-" + this.toanHang + ")";
    }
    
}
