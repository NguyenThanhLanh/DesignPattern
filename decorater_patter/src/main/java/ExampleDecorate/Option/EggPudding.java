package ExampleDecorate.Option;
import ExampleDecorate.MilkTeaDecorate;
import ExampleDecorate.IMilkTea;
public class EggPudding extends MilkTeaDecorate{
    public EggPudding(IMilkTea inner){
        super(inner);
    }
    @Override
    public double Cost(){
     return 3d + super.Cost();
    }
}
