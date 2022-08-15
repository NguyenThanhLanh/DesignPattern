package com.mycompany.decorater_patter;

public class DarkRoad extends Beverage{
    public DarkRoad( String descrip){
        super(descrip);
    } 
    @Override
    public int cost(){
        return 10;
    }
}
