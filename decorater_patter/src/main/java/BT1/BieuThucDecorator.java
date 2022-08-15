
package BT1;

public abstract class BieuThucDecorator implements IBieuThuc{

    protected IBieuThuc _bieuThuc;

    
    public IBieuThuc getBieuThuc() {
        return _bieuThuc;
    }

    public BieuThucDecorator(IBieuThuc _bieuThuc) {
        this._bieuThuc = _bieuThuc;
    }

    @Override
    public float giaTri() {
        return _bieuThuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return _bieuThuc.bieuThuc();
    }
}
