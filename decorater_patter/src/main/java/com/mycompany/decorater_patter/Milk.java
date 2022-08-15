/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorater_patter;

/**
 *
 * @author L_DELL
 */
public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage, String descrip){
        super(beverage, descrip);
    }
    
    @Override
    public  int cost(){
        return beverage.cost()+2;
    }
}
