package Strategy.Duck_Example;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    void performQuack(){
        System.out.println("Vit keu: "+ quackBehavior.quack());
    }
    
    void performFly(){
        System.out.println("Vit bay: "+ flyBehavior.fly());
    }
    
    public abstract void Dislay();
    
}
