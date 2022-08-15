
package BaiTap;

public class Cong extends BieuThucDecorator{
    public Cong(float toanHang, BieuThuc bieuThuc) {
        super(toanHang, bieuThuc);
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc() + " + " + this.toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() + this.toanHang;
    }
}
