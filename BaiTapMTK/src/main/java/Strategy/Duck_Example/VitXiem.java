package Strategy.Duck_Example;

public class VitXiem extends Duck{

    @Override
    public void Dislay() {
        System.out.println("Toi la vit xiem, toi co the bay va keu");
        performFly();
        performQuack();
    }
    
}
