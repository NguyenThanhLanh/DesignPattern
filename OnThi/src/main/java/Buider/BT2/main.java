/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buider.BT2;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        MyString m = new MyString.MyStringBuilder()
                .addString("Nguyen Thanh Lãnh")
                .addString("\nDiem:").addFloat(7.8f)
                .addString("\nGioi tinh: ").addBoolean(true)
                .build();
        System.out.println(m.getStr());
                
    }
}
