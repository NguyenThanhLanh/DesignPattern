/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

/**
 *
 * @author L_DELL
 */
public class Client {
    public static void main(String[] args) {
        MyArray dsd = new MyArray();
        dsd.add(1);
        dsd.add(2);
        dsd.add(3);
        dsd.add(4);
        dsd.Xuat();
        ItemIterator t = dsd.interator();
        System.out.println("Phan tu ở vi tri thứ 2:  "+ t.getItem(2));
        System.out.println("So luong: "+ t.count());
        
    }
}
