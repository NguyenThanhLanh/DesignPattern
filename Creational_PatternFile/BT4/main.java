package Creational_PatternFile.BT4;

public class main {
    public static void main(String[] args) {
        User u1 = new User("An");
        User u2 = new User("Binh");
        u1.vote(eliction.Candicadete.Donal_Trum);
        u2.vote(eliction.Candicadete.Joe);
        System.out.println("Donal Trump: "+Elitrion.CreateInstance().getDonal());
        System.out.println("\nJoe Biden: "+Elitrion.CreateInstance().getJoe());
    }
}
