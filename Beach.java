import java.util.Scanner;
import java.util.ArrayList;

//Extending it allows the grove class and location class to connect 
public class Beach extends Location {
    private Monster monster;

    public Beach(Player player) {
      super("Beach","A beach with beautiful waves and seashells", new ArrayList<Items>());
      this.monster = new Monster("Giant Crab", 40, 2);
    }

      public void start(Player player) {
      System.out.println("You are on the beach \nYou see a giant crab walking out the sea towards you");

      Scanner Beach_location = new Scanner(System.in);

      System.out.println("What would you like to do? Pick a number: \n1. Run away \n2. Fight the monster and get the key");

      while (true) {
      String userInput = Beach_location.nextLine();
  
    // If a player picks choice 1 they won't be able to actually get away so they have to try to fight back
    if (userInput.equalsIgnoreCase("1")) {
        System.out.print("OH NO!! \nYou attempt to run away but the " + monster.getName() + " is too fast and manages to grab you. :(");
        
        // Initializes fight instance between the player and monster
        Fight fight = new Fight(player, monster);
        fight.start();

        // If the player loses the fight, it prompts game over
        if (player.getEnergy() <= 0) {
            System.out.println("Game over!");
            break;
        } 
        // Otherwise, if the player wins the fight they obtain 1/3 Keys needed to get the Golden Crown at the Castle
        else {
            System.out.println("You obtained a key from around its neck.");
            player.addItem(new Items("Item: Key", "Description: 2/3 Ancient Key, what could it possibly be used for?", false, 0));
            
            // Displays inventory now showing that they have the Key
            System.out.println("Your inventory now contains:");
            for (Items item : player.getInventory()) {
                System.out.println(item.getItem_name() + " - " + item.getItem_description());
            }
            break;
        } 
    } 
    // Add an else if statement to handle other user inputs
    else if (userInput.equalsIgnoreCase("2")) {
        System.out.println("You decided to fight the " + monster.getName() + "!");
        
        Fight fight = new Fight(player, monster);
        fight.start();

        if (player.getEnergy() <= 0) {
            System.out.println("Game over!");
            
        // Otherwise, if the player wins the fight they obtain 1/3 Keys needed to get the Golden Crown at the Castle
        } else {
            System.out.println("You obtained a key from around it's neck.");
            player.addItem(new Items("Item: Key", "Description: 2/3 Ancient Key, what could it possibly be used for?", false, 0));
            
            // Displays inventory now showing that they have the Key
            System.out.println("Your inventory now contains:");

            for (Items item : player.getInventory()) {
            System.out.println(item.getItem_name() + " - " + item.getItem_description());
             
                }
            break;
         } 
            }    else {
        System.out.println("Invalid choice, please try again.");
    }
}

    
    }
}















    



















