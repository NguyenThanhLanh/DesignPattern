
import ExampleDecorate.MilkTea;
import ExampleDecorate.Option.BlackSugar;
import ExampleDecorate.Option.Bubber;
import ExampleDecorate.Option.EggPudding;
import ExampleDecorate.Option.FruitPudding;
import ExampleDecorate.Option.WhiteBubble;
import ExampleDecorate.IMilkTea;
import ExampleDecorate.MilkTea;
import ExampleDecorate.MilkTeaDecorate;


public class main {
    public static void main(String[] args) {
        var firstMilkTea = new EggPudding(
                                new FruitPudding(
                                    new BlackSugar(
                                        new Bubber(
                                            new MilkTea()))));
        System.out.println("Gia tien: "+ firstMilkTea.Cost());
    }
}
