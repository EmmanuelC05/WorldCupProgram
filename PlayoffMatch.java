/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worldcuptournament;

/**
 *
 * @author manny
 */
public class PlayoffMatch {
    private String playoffTeam1;
    private String playoffTeam2;
    private int playoffScore1;
    private int playoffScore2;
    private int round;   
   //int [] results
    public PlayoffMatch(String playoffTeam1, String playoffTeam2, int playoffScore1, int playoffScore2, int round) {
        this.playoffTeam1 = playoffTeam1;
        this.playoffTeam2 = playoffTeam2;
        this.playoffScore1 = playoffScore1;
        this.playoffScore2 = playoffScore2;
        this.round = round;
    }

    public String getPlayoffTeam1() {
        return playoffTeam1;
    }

    public void setPlayoffTeam1(String playoffTeam1) {
        this.playoffTeam1 = playoffTeam1;
    }

    public String getPlayoffTeam2() {
        return playoffTeam2;
    }

    public void setPlayoffTeam2(String playoffTeam2) {
        this.playoffTeam2 = playoffTeam2;
    }

    public int getPlayoffScore1() {
        return playoffScore1;
    }

    public void setPlayoffScore1(int playoffScore1) {
        this.playoffScore1 = playoffScore1;
    }

    public int getPlayoffScore2() {
        return playoffScore2;
    }

    public void setPlayoffScore2(int playoffScore2) {
        this.playoffScore2 = playoffScore2;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
    
    
}
