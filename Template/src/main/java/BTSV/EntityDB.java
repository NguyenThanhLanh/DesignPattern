/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTSV;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author L_DELL
 */
public abstract class EntityDB <T>{
    List<T> entities = new ArrayList();
    protected abstract int getKey(T t);
    
    private boolean find(T t){
        for(T i:entities){
            if(getKey(i)==getKey(t))
                return true;
        }
        return false;
    }
    
    public boolean add(T t){
        if(!find(t)){
            entities.add(t);
            return true;
        }
        return false;
    }
    
    public int update(T t){
        for(int i=0; i < entities.size()-1; i++){
            if(getKey(t)==getKey(entities.get(i))){
                entities.set(i, t);
                return 1;
            }
        }
        return 0;
    }
    
    public int delete(T t){
        for(int i=0; i < entities.size()-1; i++){
            if(getKey(t)==getKey(entities.get(i))){
                entities.remove(i);
                return 1;
            }
        }
        return 0;
    }
}
