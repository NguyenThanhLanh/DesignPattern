
package ExampleDecorate.Option;
import ExampleDecorate.MilkTeaDecorate;
import ExampleDecorate.IMilkTea;
public class BlackSugar extends MilkTeaDecorate{
    public BlackSugar(IMilkTea inner){
        super(inner);
    }
    @Override
    public double Cost()
    {
        return 2d + super.Cost();
    }
}
