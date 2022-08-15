
package BaiTap;

public abstract class BieuThuc {
    float toanHang;

    public BieuThuc(float toanHang) {
        this.toanHang = toanHang;
    }

    abstract public String bieuThuc();
    abstract public float giaTri();
}

