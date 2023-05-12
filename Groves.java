import java.util.Scanner;
import java.util.ArrayList;

public class Groves extends Location {
    private Monster monster;
    private boolean hasBlueberries;

    public Groves(Player player) {
        super("Grove", "Groves with lots of trees and singing birds", new ArrayList<Items>());
        this.monster = new Monster("Bear", 20, 5);
    }

    public void start(Player player) {
        System.out.println("\nYou are in a Grove \nYou look around and find a path with a fork in it. \nLeft or Right?");

        Scanner Groves_locations = new Scanner(System.in);

        System.out.println("What would you like to do? Pick a number: \n1. Left \n2. Right");

        while (true) {
            String userInput = Groves_locations.nextLine();

            if (userInput.equalsIgnoreCase("1")) {
                System.out.println("You see a figure but can't make anything out except for a shiny key on it's neck.");

                Fight fight = new Fight(player, monster);
                fight.start();

                if (player.getEnergy() <= 0) {
                    System.out.println("Game over!");
                    break;
                } else {
                    System.out.println("You obtained a key from around it's neck.");
                    player.addItem(new Items("Item: Key", "Description: 1/3 Ancient Key, what could it possibly be used for?", false, 0));

                    System.out.println("Your inventory now contains:");

                    for (Items item : player.getInventory()) {
                        System.out.println(item.getItem_name() + " - " + item.getItem_description());
                    }

                    System.out.println("You have made progress on your journey adventurer... \nYou decide to go to the Beach in search for the next key! \n 1. Continue");
                    String userInput3 = Groves_locations.nextLine();

                    if (userInput3.equalsIgnoreCase("1")) {
                        Beach beach = new Beach(player);
                        beach.start(player);
                        break;
                    }
                }
            } else if (userInput.equalsIgnoreCase("2")) {
                System.out.println("You go right and find some blueberries...will these be useful?");
                player.addItem(new Items("Item: Blueberries", "Description: Delicious blueberries", false, 0));

                System.out.println("Your inventory now contains:");

                for (Items item : player.getInventory()) {
                    System.out.println(item.getItem_name() + " - " + item.getItem_description());
                }

                for (Items item : player.getInventory()) {
                    if (item.getItem_name().equalsIgnoreCase("Blueberries")) {
                        hasBlueberries = true;
                        break;
                    }
                }

                if (hasBlueberries = true) {
                    System.out.println("After gathering the blueberries, you head to go check out the other path. \nAs you explore this new path, you suddenly hear a growl and realize you're not alone..");
                    System.out.println("It's a " + monster.getName() + "!, do you want to: 1. Fight it 2. Attempt to give it blueberries");

                    String userInput2 = Groves_locations.nextLine();

                    // If the player picks choice 1, they fight for the key
                    if (userInput2.equalsIgnoreCase("1")) {
                        System.out.println("You decide to fight the bear, you notice a key around the bear's neck.");
                         
                        // Iniitializes fight instance between the player and monster
                        Fight fight2 = new Fight(player, monster);
                        fight2.start();

                        if (player.getEnergy() > 0 ) {
                            System.out.println("You obtained a key from around it's neck.");
                            player.addItem(new Items("Item: Key", "Description: 1/3 Ancient Key, what could it possibly be used for?", false, 0));
                             
                            // Displays inventory now showing that they have the Key
                            System.out.println("Your inventory now contains:");
        
                            for (Items item : player.getInventory()) {
                            System.out.println(item.getItem_name() + " - " + item.getItem_description());
                             }
                    
                        } else {
                            System.out.println("Game over!");
                        }

                    } else if (userInput2.equalsIgnoreCase("2")) {

                        System.out.println("You decide to feed the bear blueberries..while it thanks and snuggles you, you take the opportunity to grab the key from it's neck.");
                        player.removeItem("Item: Blueberries");
                        player.addItem(new Items("Item: Key", "Description: 1/3 Ancient Key, what could it possibly be used for?", false, 0));

                        // Displays inventory now showing that they have the Key
                        System.out.println("Your inventory now contains:");

                        for (Items item : player.getInventory()) {
                        System.out.println(item.getItem_name() + " - " + item.getItem_description());
                        }
                        
                        System.out.println("You have made progress on your journey adventurer... \nYou decide to go to the Beach in search for the next key! \n1. Continue");
                        String userInput4 = Groves_locations.nextLine();

                        if (userInput4.equalsIgnoreCase("1")) {
                            Beach beach = new Beach(player);
                            beach.start(player);
                            break;
                        } else {
                            System.out.println("Invalid choice, try again!");
                        }

                         
                    }
                }
                } else {
                    System.out.println("Invalid choice, try again!");
                }
            }

        }
    }

    



    

        





    
    



