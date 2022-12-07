
package worldcuptournament;
public class PlayoffMatch extends Match {
    int round;

    public PlayoffMatch(String team1, String team2, int score1, int score2, int round) {
        super(team1, team2, score1, score2);
        this.round = round;
    }
    
    public int getRound() {
            return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
    
}
    
    
    

