package BT1;

public class Context {
    ITinh Tinh;

    public void setTinh(ITinh Tinh) {
        this.Tinh = Tinh;
    }
    
    public float tinh(float a, float b){
        return Tinh.tinh(a, b);
    }
    
}
