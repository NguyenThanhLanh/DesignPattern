
package BT_TiGia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    
    List<I_TheDoiTiGia> observers = new ArrayList<I_TheDoiTiGia>();
    
    public void attach(I_TheDoiTiGia a){
        if(!observers.contains(a)){
            observers.add(a);
        }
    }
    
    public void detach(I_TheDoiTiGia a){
        if(observers.contains(a)){
            observers.remove(a);
        }
    }
    
    public void notifyTiGia(float delta){
        for(I_TheDoiTiGia a: observers){
            a.capNhatTiGia(delta);
        }
    }
    
    static public interface I_TheDoiTiGia{
        void capNhatTiGia(float delta);
    }
    
}
