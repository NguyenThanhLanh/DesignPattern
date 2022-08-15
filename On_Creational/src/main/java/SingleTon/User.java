
package SingleTon;

/**
 *
 * @author L_DELL
 */
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }
    
    public void vote(Candidate.Cadidates cadidate){
        Elitrion elitrion = Elitrion.createInstance();
        elitrion.vote(cadidate, this);
    }
}
