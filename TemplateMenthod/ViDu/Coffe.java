package TemplateMenthod.ViDu;

public class Coffe extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Brew Coffe Grinds");
    }

    @Override
    public void addCondiments() {
        System.out.println("add Sugar and milk");
    }
}
