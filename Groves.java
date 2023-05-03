import java.util.Scanner;
import java.util.ArrayList;

//Extending it allows the grove class and location class to connect 
public class Groves extends Location {
    private Monster monster;

    public Groves(Player player) {
        super("Grove", "Groves with lots of trees and singing birds", new ArrayList<Items>());
        
        this.monster = new Monster("Bear", 20, 5);

        System.out.println("You are in a Grove \nYou look around and find a path with a fork in it. \nLeft or Right?");

        Scanner Groves_locations = new Scanner(System.in);

        System.out.println("What would you like to do? Pick a number: \n1. Left \n2. Explore/Look Around");

        while (true) {
            String userInput = Groves_locations.nextLine();

            if (userInput.equalsIgnoreCase("1")) {
                System.out.println("You go left and run into a " + monster.getName()+ "!");

                Fight fight = new Fight(player, monster);
                fight.start();

                if (player.getEnergy() <= 0) {
                    System.out.println("You were defeated by the " + monster.getName() + "!");
                    System.out.println("Game over!");
                    break;
                } else {
                    System.out.println("You defeated the " + monster.getName() + " and obtained a key.");
                    player.addItem(new Items("Key", "1/3 Ancient Key, what could it possibly be used for?", false, 0));
                    System.out.println("Your inventory now contains:");
                    
                    for (Items item : player.getInventory()) {
                    System.out.println(item.getItem_name() + " - " + item.getItem_description());
                     }
                break;
                }
            } else if (userInput.equalsIgnoreCase("2")) {
                System.out.println("You go right and find some blueberries...will these be useful?");
                player.addItem(new Items("Blueberries", "Delicious blueberries", false, 0));
                System.out.println("Your inventory now contains:");

                for (Items item : player.getInventory()) {
                    System.out.println(item.getItem_name() + " - " + item.getItem_description());
                     }
                break;
            } else {
                System.out.println("Invalid choice, try again!");
            }
        }

            
    }
    
    
    




     
    










    public static void main(String[] args){

    
    }


        

}



    
    



