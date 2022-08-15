package Creational_patterns.Bai_3;

public class Triangle extends Shape{
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
        return "Hinh tam giac" + brush + paper + frame;
    }
}
