
package Creational_pattern.Factory_method_example;

import java.util.Random;

public class RadomAnimal_Factory implements IAnimal_Factory{

    @Override
    public IAnimal createAnimal() {
        Random rd =new Random();
        int value =  rd.nextInt(3);
        if(value==0) return new Dog();
        if(value==1) return new Cat();
        else
            return new Duck();
    }
}
