package Creational_patterns.Bai_3;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.createShape(ShapeType.Rectangle);

        //Shape shape2 = shapeFactory.createShape(ShapeType.Rectangle);
        System.out.println(shape1.draw("xanh", "a3", "nhựa"));
        shape1 = shapeFactory.createShape(ShapeType.Circle);
        System.out.println(shape1.draw("fwjfl", "a4", "fqjofqo"));
        /*Shape shape2 = shapeFactory.createShape(ShapeType.Circle);
        System.out.println(shape2.draw());*/
    }
}
