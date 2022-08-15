
package BaiTap;

public class BieuThucDonGian extends BieuThuc{

    public BieuThucDonGian(float toanHang) {
        super(toanHang);
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(toanHang);
    }

    @Override
    public float giaTri() {
        return this.toanHang;
    }
}

