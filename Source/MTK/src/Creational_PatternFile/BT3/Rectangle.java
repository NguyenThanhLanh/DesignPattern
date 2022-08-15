/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational_PatternFile.BT3;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape {

    
    private static Rectangle instance;

    protected Rectangle() {
    }

    public static Rectangle createInstance(){
        if(instance == null)
            instance = new Rectangle();
        return instance;
    }
    
    
    @Override
    String draw(String brush, String paper, String frame) {
        return "Hình chữ nhật" + " " + brush + " " + paper + " " + frame;
    }
    
}
