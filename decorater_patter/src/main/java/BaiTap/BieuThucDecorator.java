
package BaiTap;

public abstract class BieuThucDecorator extends BieuThucDonGian{
    BieuThuc bieuThuc;

    public BieuThucDecorator(float toanHang, BieuThuc bieuThuc) {
        super(toanHang);
        this.bieuThuc = bieuThuc;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc();
    }

    @Override
    public float giaTri() {
        return super.giaTri();
    }
}

