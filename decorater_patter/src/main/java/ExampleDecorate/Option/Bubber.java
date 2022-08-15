package ExampleDecorate.Option;
import ExampleDecorate.IMilkTea;
import ExampleDecorate.MilkTeaDecorate;

public class Bubber extends MilkTeaDecorate{

    public Bubber(IMilkTea inner) {
        super(inner);
    }
    
    @Override
    public double Cost() {
        return 5+ super.Cost();
    }
    
}
