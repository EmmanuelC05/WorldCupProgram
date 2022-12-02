
package worldcuptournament;

import java.util.ArrayList;
import java.util.Scanner;
        
public class WorldCupTournament {
    
    static ArrayList<Team> teams = new ArrayList<>();
    static ArrayList<Match> matches = new ArrayList<>();
    
    public static void main(String[] args) {
      
        Scanner keyboard = new Scanner(System.in);
        
        int input = 0;
        
      while (input!=4){
        System.out.println("Official tracker for the FIFA world cup\n");
        System.out.println("(1) Add a team and their corresponding group");
        System.out.println("(2) View teams");
        System.out.println("(3) Add matches");
        System.out.println("(4) Exit\n");
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
            
        }
         
    }
    static public void addMatches(){ 
        
}
}


    


