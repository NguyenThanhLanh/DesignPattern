
package Factory_Method.Bai3;

public class main {
    public static void main(String[] args) {
        ShapeFactory shapefactory = new ShapeFactory();
        Shape s1 = shapefactory.createShape(ShapeType.Rectangle);
        System.out.println(s1.draw());
        Shape s2 = shapefactory.createShape(ShapeType.Triangle);
        System.out.println(s2.draw());
        Shape s3 = shapefactory.createShape(ShapeType.Circle);
        System.out.println(s3.draw());
    }
}
