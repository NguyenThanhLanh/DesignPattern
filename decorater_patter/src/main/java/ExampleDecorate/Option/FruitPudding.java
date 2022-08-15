package ExampleDecorate.Option;
import ExampleDecorate.MilkTeaDecorate;
import ExampleDecorate.IMilkTea;
public class FruitPudding extends MilkTeaDecorate{
    public FruitPudding(IMilkTea inner){
        super(inner);
    }
    @Override
    public double Cost(){
     return 3d + super.Cost();
    }
}
