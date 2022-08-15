package UDuck;

public class SunDuck extends Duck{
    public String display(){
        return "I'm a Mallard\n"+
                performQuack() + "\n"+
                performFly();
    }
}
