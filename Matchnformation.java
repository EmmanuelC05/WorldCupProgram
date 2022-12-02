package worldcuptournament;


/**
 *
 * @author manny
 */
public class Matchnformation extends Team{
    
    private int winCount;
    private int drawCount;
    private int lossCount;
    private int scoredGoals;
    private int recievedGoals;
    private int point;

    public Matchnformation(String name, String group) {
        super(name, group);
    }

    public int getWinCount() {
        return winCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public int getLossCount() {
        return lossCount;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public int getRecievedGoals() {
        return recievedGoals;
    }

    public int getPoint() {
        return point;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public void setLossCount(int lossCount) {
        this.lossCount = lossCount;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public void setRecievedGoals(int recievedGoals) {
        this.recievedGoals = recievedGoals;
    }

    public void setPoint(int point) {
        this.point = point;
    }
 
    
            
            
    
}
