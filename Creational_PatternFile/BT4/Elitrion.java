package Creational_PatternFile.BT4;

import java.util.ArrayList;
import java.util.List;

public class Elitrion {
    private static Elitrion instance;
    int joe = 0, donal = 0;
    private Elitrion(){}
    private List<String> list = new ArrayList();



    public static Elitrion CreateInstance(){
        if(instance == null)
            instance = new Elitrion();
        return instance;
    }

    public void vote(eliction.Candicadete candicadete, User u){
        if(list.contains(u.name))
            return;

        if(candicadete == null)
            return;
        if (candicadete == eliction.Candicadete.Donal_Trum)
            donal++;
        else
            joe++;
        list .add(u.name);
    }

    public int getJoe() {
        return joe;
    }

    public void setJoe(int joe) {
        this.joe = joe;
    }

    public int getDonal() {
        return donal;
    }

    public void setDonal(int donal) {
        this.donal = donal;
    }
}
