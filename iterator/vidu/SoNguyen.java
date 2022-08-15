package iterator.vidu;

import createtional.singleton.bai3.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoNguyen {
    private int[] array = {};

    public SoNguyen(int[] array) {
        this.array = array;
    }
    public Iterator CreateIterator(){
        return new ConcreteIterator(this);
    }
    public int getItem(int soNguyen){
        return array[soNguyen];
    }
    public int count(){
        return  array.length;
    }
}
