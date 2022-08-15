package UDuck;

public abstract class Duck {
    // Vit co cac hanh vi bay va keu
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    Swim swim;
    Hensin hensin;

    //set
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setSwim(Swim swim) {
        this.swim = swim;
    }

    public void setHensin(Hensin hensin) {
        this.hensin = hensin;
    }

    //Perform
    String performQuack(){
        return quackBehavior.Quack();
    }

    String performFly(){
        return flyBehavior.Fly();
    }

    String swimming(){
        return swim.Swin();
    }

    String hensin(){return hensin.Hensin();}

    //Display
    public abstract String display();

}
