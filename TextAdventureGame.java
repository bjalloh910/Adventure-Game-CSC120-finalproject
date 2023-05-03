import java.util.Scanner;
import java.util.ArrayList;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to Golden Crown!, Enter your name: ");
        String playerName = scanner.nextLine();

        ArrayList<Items> playerInventory = new ArrayList<Items>();
        Player player = new Player(playerName, "Main character", 100, 10, playerInventory);
        Groves grove = new Groves(player);
      
}

}