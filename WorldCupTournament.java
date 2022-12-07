
package worldcuptournament;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
        
public class WorldCupTournament {
    
    static ArrayList<Team> teams = new ArrayList<>();
    static ArrayList<Match> matches = new ArrayList<>();
    static ArrayList<PlayoffMatch> playoffMatches = new ArrayList<>();
    
    public static void main(String[] args) {
      
        Scanner keyboard = new Scanner(System.in);
        
        int input = 0;
        
      while (input!=7){
        System.out.println("============================================");
        System.out.println("  Official tracker for the FIFA world cup");
        System.out.println("============================================\n");
        System.out.println("(1) Add a team and their corresponding group");
        System.out.println("(2) View teams");
        System.out.println("(3) Add group stage matches");
        System.out.println("(4) View group stage Matches and their results");
        System.out.println("(5) Add Playoff matches");
        System.out.println("(6) View playoff Matches and their results");
        System.out.println("(7) Exit\n");
        System.out.println("Select an option from above: ");
        

        
        try{
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
            default: 
                System.out.println("Choose a valid option numbers 1-7");
            
        }  
        }  catch(InputMismatchException e){
            System.out.println("Enter Intagers only please try again");
            keyboard.next();
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
        
        System.out.println("============================================");
        System.out.println("   World Cup competing Countries");
        System.out.println("============================================");
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
       
        System.out.print("What is the First team name?: ");
         Scanner keyboard = new Scanner(System.in);
         
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
         
         Match matchResult = new Match (team1, team2, score1, score2);
         matches.add(matchResult);
         
      
}

     static public void viewMatchResults() {
        System.out.println("============================================");
        System.out.println("          Group stage results");
        System.out.println("============================================");
        for (int i = 0; i < matches.size(); i++) {
            
            System.out.println("Match Result: " +matches.get(i).getTeam1()+ ": " +(matches.get(i).getScore1() + "   vs    " +matches.get(i).getTeam2()+ ": " +matches.get(i).getScore2()));
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
        System.out.println("============================================");
        System.out.println("   These are the Playoff match results");
        System.out.println("============================================");
        System.out.println("-------------------------------------------");
         
        for (int i = 0; i < playoffMatches.size(); i++) {
            System.out.println("Round of (" +playoffMatches.get(i).getRound()+ ")");
            System.out.println("Results: " +playoffMatches.get(i).getTeam1()+ ": " +(playoffMatches.get(i).getScore1() + "   vs    " +playoffMatches.get(i).getTeam2()+ ": " +playoffMatches.get(i).getScore2()));
            System.out.println("-------------------------------------------");
         
     }
}
}




    


