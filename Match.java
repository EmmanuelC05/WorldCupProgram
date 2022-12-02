/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worldcuptournament;

/**
 *
 * @author manny
 */
public class Match {
    private String team1;
    private String team2;
    private int[] Results;

    public Match(String team1, String team2, int[] Results) {
        this.team1 = team1;
        this.team2 = team2;
        this.Results = Results;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int[] getResults() {
        return Results;
    }

    public void setResults(int[] Results) {
        this.Results = Results;
    }
    
    
    
    
}
