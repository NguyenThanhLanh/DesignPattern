package Creational_patterns.Bai_3;

public class Circle extends Shape{
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
        return "Hinh tròn " + brush + paper + frame;
    }
}
