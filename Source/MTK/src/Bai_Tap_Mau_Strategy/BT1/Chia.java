package Bai_Tap_Mau_Strategy.BT1;

public class Chia implements Tinh{
    @Override
    public float Tinh(float a, float b) {
        if(b==0)
            return 0;
        return a/b;
    }
}
