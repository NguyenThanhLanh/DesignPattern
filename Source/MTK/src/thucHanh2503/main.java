package thucHanh2503;

public class main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.createInstance();
        Singleton s2 = Singleton.createInstance();
        s1.display();
        s1.display();
        s2.display();
    }
}
