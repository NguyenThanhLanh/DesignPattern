
package ExampleDecorate;

public abstract class MilkTeaDecorate implements IMilkTea{

    public MilkTeaDecorate(IMilkTea inner) {
        this._milkTea = inner;
    }
    private IMilkTea _milkTea; 

    @Override
    public double Cost(){
     return _milkTea.Cost();
    }
     
}
