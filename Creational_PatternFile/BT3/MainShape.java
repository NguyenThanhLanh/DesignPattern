package Creational_PatternFile.BT3;

public class MainShape {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.createShape(ShapeType.Rectangle);
        Shape shape2 = shapeFactory.createShape(ShapeType.Rectangle);

        System.out.println(shape1.draw("Màu Xanh", "A4", "Nhựa"));
        shape1 = shapeFactory.createShape(ShapeType.Circle);
        System.out.println(shape1.draw("Màu Đỏ", "A4", "Nhựa"));
        shape1 = shapeFactory.createShape(ShapeType.Triangle);
        System.out.println(shape1.draw("Màu Vàng","A3","Giấy"));
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(shape1.draw("Màu Tím", "A4", "Nhựa"));
        shape2 = shapeFactory.createShape(ShapeType.Circle);
        System.out.println(shape1.draw("Màu Chàm", "A4", "Nhựa"));
        shape2 = shapeFactory.createShape(ShapeType.Triangle);
        System.out.println(shape1.draw("Màu Tím","A3","Giấy"));
    }
    
}
