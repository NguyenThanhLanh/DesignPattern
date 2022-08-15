

package com.mycompany.decorater_patter;

public class Decorater_patter {

    public static void main(String[] args) {
        Beverage b = new DarkRoad("LAnh");
        b = new Milk(b,"Vinamilk");
        System.out.println("Mo ta; "+b.getDecription());
        System.out.println("Gia: "+b.cost());
    }
}
