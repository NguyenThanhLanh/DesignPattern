/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap_ReWork;

/**
 *
 * @author L_DELL
 */
public class MyListArray {
    private int[] arrayInt = {};

    public MyListArray(int[] array) {
        this.arrayInt=array;
    }
    
    public Iterator CreateIterator(){
        return new ConcreateIterator(this);
    }
    
    public int getItem(int index){
        return arrayInt[index];
    }
    
    public int count(){
        return arrayInt.length;
    }
    
    
}
