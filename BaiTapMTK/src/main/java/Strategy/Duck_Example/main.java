package Strategy.Duck_Example;

public class main {
    public static void main(String[] args) {
        Duck duck = new VitXiem();
        IFlyBehavior flyBehavior = new FlyAsWind();
        IQuackBehavior quackBehavior = new Quack();
        duck.flyBehavior = flyBehavior;
        duck.quackBehavior = quackBehavior;
        duck.Dislay();
    }
}
