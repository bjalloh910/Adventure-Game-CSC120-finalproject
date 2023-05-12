import java.util.Scanner;
import java.util.ArrayList;

public class Castle extends Location {
    private Monster monster;
    private boolean hasKey;
    
   public Castle(Player player){
    super("Castle", "A huge castle with large gates", new ArrayList<Items>());
    this.monster = new Monster("Dragon", 80, 10);
   }

    /*
     * Start the Castle location to encounter Dragon and get the golden crown
     * @ param player the player 
     */

    public void start(Player player){
     System.out.println("You are walking towards the castle. \nThe closer you get you start to see a huge shadow. \nOMG!! It's a huge dragon sleeping while guarding the gates");
     Scanner Castle_location = new Scanner(System.in);

     System.out.println("What would you like to do? Pick a number \n1. Defeat your final enemy and win the golden crown? \n2. Give up now and not win the golden crown?");

        while (true) {
            String userInput = Castle_location.nextLine();
    
        //If player picks choice 1 they have to fight the monster in order to use the keys and unlock the crown
        if (userInput.equalsIgnoreCase("1")){
            System.out.println("The " + monster.getName() + " is really angry you woke it out of it's sleep and starts blowing fireballs at you!");

        // Initializes fight instance between the player and monster
        Fight fight = new Fight(player, monster);
        fight.start();

        // If the player loses the fight, it prompts game over
        if (player.getEnergy() <= 0){
            System.out.println("Game over");
            
        }
        // Otherwise, if the player wins the fight they obtain 3/3 Keys needed to get the Golden Crown at the Castle
        else {
            System.out.println("You have slayed the dragon. \nYou see the key inside his slimey mouth and grab it.");
            player.addItem(new Items("Item: Key", "Description: 3/3 Ancient Key, what could it possibly be used for?", false, 0));
            player.addItem(new Items("Item: Golden Crown", "Description: A popular legend, said to only be obtained by the bravest of heroes..", false, 0));
            System.out.println("You see a chest with 3 locks and use the 3 keys to unlock it. \nBOOM!");
            System.out.println("You've got it, the GOLDEN CROWN!! YOU WON!!");

           // Displays inventory now showing that they have the Key
           System.out.println("Your inventory now contains:");

           for (Items item : player.getInventory()) {
           System.out.println(item.getItem_name() + " - " + item.getItem_description());
           }
           break;
        }
        } // Add an else if statement to handle other user inputs
        else if (userInput.equalsIgnoreCase("2")){
            System.out.println("You chose to run away from the" + monster.getName()+ "Game over! :/");
            break;
            }
        }
        }

}
