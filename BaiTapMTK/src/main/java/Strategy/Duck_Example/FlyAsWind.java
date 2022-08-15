package Strategy.Duck_Example;


public class FlyAsWind implements IFlyBehavior{

    @Override
    public String fly() {
        return "Bay nhu gio!";
    }
}
