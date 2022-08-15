
package Strategy.Duck_Example;

public class Quack implements IQuackBehavior{

    @Override
    public String quack() {
        return "Keu len mot tieng Quack!";
    }
    
}
