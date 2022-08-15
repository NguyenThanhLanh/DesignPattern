package UDuck;

public class MuteQuack implements QuackBehavior{
    @Override
    public String Quack() {
        return "Duck can't quack";
    }
}
