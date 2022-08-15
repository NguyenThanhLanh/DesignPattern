
package SingleTon;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        User n1 = new User("Lanh");
        n1.vote(Candidate.Cadidates.Donal_Trum);
        n1.vote(Candidate.Cadidates.Joe_Biden);
        System.out.println("Donal Trum: " + Elitrion.createInstance().getVote_Donal());
        System.out.println("Joe Biden: "+ Elitrion.createInstance().getVote_Joe());
    }
    
}
