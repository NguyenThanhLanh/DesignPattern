package UDuck;

public class RedHeadDuck extends Duck{
    @Override
    public String display() {
        return "I am Red Head Duck\n"+
                performQuack() + "\n"+
                performFly() + "\n" +
                swimming();

    }
}
