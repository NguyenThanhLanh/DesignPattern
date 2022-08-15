/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap_ReWork;

/**
 *
 * @author L_DELL
 */
public class main {
     public static void main(String[] args) {
        MyListArray myarr = new MyListArray(new int[]{1,2,3,4,5,6,7,8,9,10,11,12});
        Iterator array = myarr.CreateIterator();
         System.out.println("Phan tu dau tien: "+array.First());
         System.out.println("Phan tu tiep theo: "+array.Next());
         while (array.isDone()) {             
             System.out.println("Phan tu tiep theo: "+array.Next());
         }
    }
}
