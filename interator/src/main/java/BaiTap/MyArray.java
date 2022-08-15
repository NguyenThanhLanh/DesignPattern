/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

import java.util.ArrayList;

/**
 *
 * @author L_DELL
 */
public class MyArray {
    private ArrayList<Integer> ds = new ArrayList<Integer>();
    
    public void add(int a){
        ds.add(a);
    }
    
    public void Xuat(){
        for(int i: ds){
            System.out.println(i);
        }
    }
    
    public ItemIterator interator(){
        return new MenuIterator();
    }
    
    class MenuIterator extends ItemIterator{

        @Override
        int getItem(int i) {
            return ds.get(i);
        }

        @Override
        int count() {
           int i=0;
           for(int j: ds){
               i++;
           }
            return i;
        }
        
    }
}
