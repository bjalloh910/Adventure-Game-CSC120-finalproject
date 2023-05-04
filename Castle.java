import java.util.Scanner;
import java.util.ArrayList;

public class Castle extends Location {
    private Monster monster;
    private boolean hasKey;
    
   public Castle(Player player){
    super("Castle", "A huge castle with large gates", new ArrayList<Items>());
    this.monster = new Monster("Dragon", 80, 10);
   }

    public void start(Player player){
     System.out.println("You are walking towards the castle. \nThe closer you get you start to see a huge shadow. \n OMG!! It's a huge dragon sleeping while guarding the gates");
     Scanner Castle_location = new Scanner(System.in);

     System.out.println("What would you like to do? Pick a number \n1.Defeat your final enemy and win the golden crown? \n2.Give up now and not win the golden crown?");

        while (true) {
            String userInput = Castle_location.nextLine();
    
        //If player picks choice 1 they have to fight the monster in order to use the keys and unlock the crown
        if (userInput.equalsIgnoreCase("1")){
            System.out.println("The" + monster.getName() + "is really angry you woke it out of it's sleep and starts blowing fireballs at you");

        // Initializes fight instance between the player and monster
        Fight fight = new Fight(player, monster);
        fight.start();

        // If the player loses the fight, it prompts game over
        if (player.getEnergy() >= 0){
            System.out.println("Game over");
            break;
        }
        // Otherwise, if the player wins the fight they obtain 3/3 Keys needed to get the Golden Crown at the Castle
        else {
            System.out.println("");
        }
        }
        }

    }
    
    //when t
    


    



    
    
    
        
    





























    public static void main(String[] args) {



    
    }

}
