/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational_PatternFile.BT3;

/**
 *
 * @author Admin
 */
public class Circle extends Shape {

    private static Circle instance;

    protected Circle() {
    }

    public static Circle createInstance(){
        if(instance == null)
            instance = new Circle();
        return instance;
    }
    
    
    @Override
    String draw(String brush, String paper, String frame) {
        return "Hinh tròn " + brush + " " + paper + " " + frame;
    }
    
}
