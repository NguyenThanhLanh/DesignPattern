/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational_PatternFile.BT3;

public class Triangle extends Shape {
    
    private static Triangle instance;

    protected Triangle() {
    }

    public static Triangle createInstance(){
        if(instance == null)
            instance = new Triangle();
        return instance;
    }

    @Override
    String draw(String brush, String paper, String frame) {
        return "Hinh tam giac " + brush + " " + paper + " " + frame;
    }
    
}
