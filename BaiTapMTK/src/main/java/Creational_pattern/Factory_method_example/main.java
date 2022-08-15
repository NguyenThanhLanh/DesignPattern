
package Creational_pattern.Factory_method_example;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        IAnimal_Factory factory;
        Random rd = new Random();
        int value = rd.nextInt(2)+1;
        if(value==1)
            factory = new RadomAnimal_Factory();
        else
            factory = new BasicAnimal_Factory();
        IAnimal animal = factory.createAnimal();
        System.out.println("Lan 1: "+animal.Dislay());
        System.out.println("Lan 2: "+animal.Dislay());
        System.out.println("Lan 3: "+animal.Dislay());
        System.out.println("Lan 4: "+animal.Dislay());
        System.out.println("Lan 5: "+animal.Dislay());
        
        
    }
}
