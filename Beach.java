import java.util.Scanner;
import java.util.ArrayList;

//Extending it allows the grove class and location class to connect 
public class Beach extends Location{
    private Monster monster;

    public Beach(Player player){
      super("Beach","A beach with beautiful waves and seashells", new ArrayList<Items>());

      this.monster = new Monster("Giant Crab", 40, 2);

      System.out.println("You are on the beach \nYou see a giant crab walking out the sea towards you");

      Scanner Beach_location = new Scanner(System.in);

      System.out.println("What would you like to do? Pick a number: \n1. Run away \n2. Fight the monster and get the key");

      while (true) {

        String userInput = Beach_location.nextLine();

        if (userInput.equalsIgnoreCase("1"));
            System.out.print("OH NO!! You attempt to run away but the " + monster.getName() + "is too fast and manages to grab you.:/");
            break;
      }
    }
  
    

    



















    public static void main(String[] args) {



    
    }




}
