package TemplateMenthod.ViDu;

public class Tea extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("steep Tea Bag");
    }

    @Override
    public void addCondiments() {
        System.out.println("add lemon");
    }
}
