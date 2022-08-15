package UDuck;

public class main {
    public static void main(String[] args) {
        Duck d = new SunDuck();
        d.setFlyBehavior(new FlyWithWings());
        d.setQuackBehavior(new Quack());
        System.out.println(d.display());

        Duck r = new RedHeadDuck();
        r.setFlyBehavior(new FlyWithWings());
        r.setQuackBehavior(new Squeak());
        r.setSwim(new Swimming());
        System.out.println(r.display());

        Duck h = new DuckSuper();
        h.setHensin(new HensinSuperSentai());
        System.out.println(h.display());
    }
}
