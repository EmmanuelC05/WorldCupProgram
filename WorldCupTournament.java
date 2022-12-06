
package worldcuptournament;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

        
public class WorldCupTournament {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat ("MM/dd/YY");
    static ArrayList<Team> teams = new ArrayList<>();
    static ArrayList<Match> matches = new ArrayList<>();
    static ArrayList<PlayoffMatch> playoffMatches = new ArrayList<>();
    
    public static void main(String[] args) {
      
        Scanner keyboard = new Scanner(System.in);
        
        int input = 0;
        
      while (input!=7){
        System.out.println("Official tracker for the FIFA world cup\n");
        System.out.println("(1) Add a team and their corresponding group");
        System.out.println("(2) View teams");
        System.out.println("(3) Add group stage matches");
        System.out.println("(4) View group stage Matches and their results");
        System.out.println("(5) Add Playoff matches");
        System.out.println("(6) View playoff Matches and their results");
        System.out.println("(7) Exit\n");
        System.out.print("Select an option from above: ");
        input = keyboard.nextInt();
        
       
        switch (input)
        {
            case 1:
                addTeam();
                break;
            case 2:
                viewTeams();
                break;
            case 3:
                addMatches();
                break;
            case 4:
                viewMatchResults();
                break;   
            case 5:
                addPlayoffMatches();
                break;
            case 6:
                viewPlayoffMatchResults();  
                break;
                
                
           
        }
    }
    }
    
    static public void addTeam() {
         System.out.print("What is the team name?: ");
         Scanner keyboard = new Scanner(System.in);
         
         String name;
         name = keyboard.nextLine();
         
         System.out.print("What group are they in?: ");
         
         String group;
         group = keyboard .nextLine();
         
         Team nationalTeam = new Team(name, group);
         teams.add(nationalTeam);
    }
    
    static public void viewTeams() {
        System.out.println("-------------------------");
        
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("Country: " + teams.get(i).getName());
            System.out.println("Group: " + teams.get(i).getGroup());
            System.out.println("-------------------------");
            
//                String group;
//                group = teams.get(i).getGroup();
//           
//           new BubbleSort<>().sort();
//           System.out.println(teams.get(i).getGroup());
        }
         
    }
    static public void addMatches(){ 
        
//       private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/YY");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter date (mm-dd-yyyy): ");
        String line = keyboard.nextLine();
        Date date;
        try {
            date = new SimpleDateFormat("mm-dd-yyyy").parse(line);
        } catch (ParseException ex) {
            System.out.println("You have to enter date in format mm-dd-yyyy");
            return;
        }
        System.out.print("What is the First team name?: ");
        
         
         String team1;
         team1 = keyboard.nextLine();
         
         System.out.print("What is the Second team name?: ");
         
         String team2;
         team2 = keyboard.nextLine();
         
         System.out.print("What is the score for the first team?: ");
         
         int score1;
         score1 = keyboard.nextInt();
         
         System.out.println("What is the score for the second teaam?: ");
         
         int score2;
         score2 = keyboard.nextInt();
         
         Match matchResult = new Match (team1, team2, score1, score2, date);
         matches.add(matchResult);
         
      
}

     static public void viewMatchResults() {
        System.out.println("---------------------------------------------");
        
        for (int i = 0; i < matches.size(); i++) {
    
            System.out.println("Match Result: " +matches.get(i).getTeam1()+ ": " +(matches.get(i).getScore1() + "   vs    " +matches.get(i).getTeam2()+ ": " +matches.get(i).getScore2()));
            System.out.println("Played on:" +matches.get(i).getDate());
            System.out.println("-------------------------------------------");
            
}
}
     static public void addPlayoffMatches(){
          
         
        
         
         System.out.println("What is the First playoff team name?: ");
         Scanner keyboard = new Scanner(System.in);
         
         String playoffTeam1;
         playoffTeam1 = keyboard.nextLine();
         
         System.out.println("What is the Second playoff team name?: ");
         
         String playoffTeam2;
         playoffTeam2 = keyboard.nextLine();
         
         System.out.println("What is the score for the first teaam?");
         
         int playoffScore1;
         playoffScore1 = keyboard.nextInt();
         
         System.out.println("What is the score for the second teaam?");
         
         int playoffScore2;
         playoffScore2 = keyboard.nextInt();  
         
          System.out.print("What Round of playoffs is the game?");
         
         
         int round;
         round = keyboard.nextInt();
         PlayoffMatch playoffMatchResult = new PlayoffMatch (playoffTeam1, playoffTeam2, playoffScore1, playoffScore2, round);
         playoffMatches.add(playoffMatchResult);
        
         
}
     static public void viewPlayoffMatchResults(){
        System.out.println("---------------------------------------------");
        System.out.println("These are the group stage match results");
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < playoffMatches.size(); i++) {
            System.out.println("Round of (" +playoffMatches.get(i).getRound()+ ")");
            System.out.println("Results: " +playoffMatches.get(i).getPlayoffTeam1()+ ": " +(playoffMatches.get(i).getPlayoffScore1() + "   vs    " +playoffMatches.get(i).getPlayoffTeam2()+ ": " +playoffMatches.get(i).getPlayoffScore2()));
            System.out.println("-------------------------------------------");
         
     }
}
}




    


