
package BaiTap;

public class Tru extends BieuThucDecorator{
    public Tru(float toanHang, BieuThuc bieuThuc) {
        super(toanHang, bieuThuc);
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc() + " - " + this.toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() - this.toanHang;
    }
}
