/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiThi;

/**
 *
 * @author L_DELL
 */
public class StreamController<T> {
    private static StreamController instance;
    
    public static StreamController getStream() {
        if (instance == null) {
            instance = new StreamController();
        }
        return instance;
    }
    
    public void add(T t1){
        Stream t = new Stream();
        t.add((User) t1);
    }
}
