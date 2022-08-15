
package Strategy.Duck_Example;

public class flyNoNo implements IFlyBehavior{

    @Override
    public String fly() {
        return "Khong biet bay!";
    }
    
}
