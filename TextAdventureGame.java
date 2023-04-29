import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Bintu", 100, 10);
        System.out.println("Welcome to (name undecided) " + player.getName() + "!");
        
        
        Monster monster = new Monster("Dragon", 50, 10);
        Fight fight = new Fight(player, monster);
        fight.start();
        
    }

}