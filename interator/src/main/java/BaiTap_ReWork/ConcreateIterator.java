/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap_ReWork;

/**
 *
 * @author L_DELL
 */
public class ConcreateIterator extends Iterator{
    MyListArray mylistArray;

    public ConcreateIterator(MyListArray mylistArray) {
        this.mylistArray = mylistArray;
    }
    
    int i = 0;
    
    @Override
    Object First() {
        return mylistArray.getItem(i);
    }
    

    @Override
    Object Next() {
        if(isDone()){
            return mylistArray.getItem(++i);
        }
        return null;
    }

    @Override
    boolean isDone() {
        return i<(mylistArray.count()-1);
    }

    @Override
    Object CurrentItem() {
        return mylistArray.getItem(i);
    }
    
}
