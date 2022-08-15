package TemplateMenthod.ViDu;

public class main {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffe();
        coffee.prepareRecipe();
        System.out.println("");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
