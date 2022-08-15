
package Creational_pattern.Factory_method_example;

import java.util.Random;

public class BasicAnimal_Factory implements IAnimal_Factory {

    @Override
    public IAnimal createAnimal() {
        int value = 0;
        if(value == 0){
            value++;
            return new Dog();
        }
        if(value ==1 ){
            value++;
            return new Cat();
        }
        if (value == 2)
        {
            value=0;
            return new Duck();
        }
        else
            {
                return null;
            }
    }
    
}
