
package BT1;

public class TriTuyetDoi extends BieuThucDecorator{



    public TriTuyetDoi( IBieuThuc inner) {
        super(inner);
    }
    @Override
    public float giaTri() {
        return Math.abs(_bieuThuc.giaTri());
    }

    @Override
    public String bieuThuc() {
        return "|" + _bieuThuc.bieuThuc()+ "|";
    }
    
}
