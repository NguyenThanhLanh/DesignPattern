
package com.mycompany.decorater_patter;

public abstract class Beverage {

    public Beverage(String str) {
        this.decription=str;
    }

    public String getDecription() {
        return this.decription;
    }
    
    String decription;
    String desk;
    
    public abstract int cost();
    
}
