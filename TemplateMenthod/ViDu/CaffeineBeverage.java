package TemplateMenthod.ViDu;

public abstract class CaffeineBeverage {
    public void boilWater(){
        System.out.println("Nau nuoc xoi 100 do C");
    }
    public void pourlnCup(){
        System.out.println("Do vo coc");
    }
    public void prepareRecipe(){
        boilWater();
        brew();
        pourlnCup();
        addCondiments();
    }
    abstract public void brew();
    abstract public void addCondiments();
}
