
package Factory_Method.Bai3;

public class ShapeFactory {
    public Shape createShape(ShapeType shapetype){
        Shape shape = null;
        switch (shapetype) {
            case Circle:
                 shape =new Cicle();
                break;
            case Rectangle:
                 shape =new Retangle();
                break;
            case Triangle:
                 shape =new Triangle();
                break;
        }
        return shape;
    }
}
