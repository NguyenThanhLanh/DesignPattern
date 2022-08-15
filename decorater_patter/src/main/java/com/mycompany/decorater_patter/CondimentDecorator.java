/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorater_patter;

/**
 *
 * @author L_DELL
 */
public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;
    public CondimentDecorator(Beverage beverage ,String str) {
        super(str);
        this.beverage=beverage;
    }
    @Override
    public String getDecription(){
        return beverage.getDecription() +" " + this.decription;
    }
}
