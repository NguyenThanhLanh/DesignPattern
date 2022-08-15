package creational_pattern.bai3;

import Creational_patterns.Bai_3.Shape;
import creational_pattern.Singleton.Singleton_demo;

public class Rectangle extends Shape{
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
