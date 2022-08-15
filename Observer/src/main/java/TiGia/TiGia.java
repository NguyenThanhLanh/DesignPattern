/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiGia;

import java.util.ArrayList;

/**
 *
 * @author L_DELL
 */
public class TiGia {
    ArrayList<I_TheoDoiTyGia> observers = new ArrayList<>();

    public void attach(I_TheoDoiTyGia o){
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    public void detatach(I_TheoDoiTyGia o){
        if(observers.contains(o)){
            observers.remove(o);

        }
    }

    public void notifyTyGia(float detal){
        for(I_TheoDoiTyGia o: observers){
            o.capNhatTiGia(detal);
        }
    }

    // IObserver
    public interface I_TheoDoiTyGia{
        void capNhatTiGia(float delta);
    }
}
