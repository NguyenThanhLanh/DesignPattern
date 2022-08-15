package ExampleDecorate.Option;
import ExampleDecorate.MilkTeaDecorate;
import ExampleDecorate.IMilkTea;
public class WhiteBubble extends MilkTeaDecorate{
    public WhiteBubble(IMilkTea inner){
        super(inner);
    }
    @Override
    public double Cost(){
     return 1.5 + super.Cost();
    }
}
