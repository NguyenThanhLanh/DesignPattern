/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational_PatternFile.BT3;


public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        Shape shape = null;
        switch(shapeType){
            case Rectangle:
                shape = new Rectangle();
                break;
            case Triangle:
                shape = new Triangle();
                break;
            case Circle:
                shape = new Circle();
                break;
        }
        return shape;
    }

}
