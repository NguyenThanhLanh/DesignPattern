package thucHanh2503;

public class Singleton {
    private static Singleton instance;
    private int count = 0;
    private Singleton(){}
    public static Singleton createInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    public void display(){
        System.out.println(++count);
    }
}
