/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleTon;

import java.util.ArrayList;

/**
 *
 * @author L_DELL
 */
public class Elitrion {

    private static Elitrion instance;
    int vote_Joe = 0, vote_Donal = 0;
    ArrayList<String> dsVote = new ArrayList<>();

    public Elitrion() {
    }

    public static Elitrion createInstance() {
        if (instance == null) {
            instance = new Elitrion();
        }
        return instance;
    }

    public void vote(Candidate.Cadidates cadidate, User user) {
        if (dsVote.contains(user.name)) {
            return;
        }
        if (cadidate == null) {
            return;
        }
        if (cadidate == Candidate.Cadidates.Donal_Trum) {
            vote_Donal++;
        } else {
            vote_Joe++;
        }
    }

    public int getVote_Joe() {
        return vote_Joe;
    }

    public int getVote_Donal() {
        return vote_Donal;
    }

}
