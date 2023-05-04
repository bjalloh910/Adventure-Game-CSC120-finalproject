import java.util.Scanner;

public class Fight {
    private Player player;
    private Monster monster;

    public Fight(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
}

private void turn() {
    // Prompt the player for their choice
    System.out.println("What do you want to do?");
    System.out.println("1. Attack with your sword");
    System.out.println("2. Use an item from your inventory to heal");
    Scanner input = new Scanner(System.in);
    int choice = input.nextInt();

    // Apply the corresponding attack
    int damage = 0;
    if (choice == 1) {
        // Player attacks monster with sword
        damage = player.getAttackDmg();
        monster.setEnergy(monster.getEnergy() - damage);
        System.out.println("You attacked " + monster.getName() + " with your sword for " + damage + " damage.");
    } else if (choice == 2) {
        // Player consumes something to heal
        player.consume();
    } else {
        System.out.println("Invalid choice.");
        return;
    }

    // Check if the monster is defeated
    if (monster.getEnergy() <= 0) {
        System.out.println("You defeated " + monster.getName() + "!");
        return;
    }

    // Monster attacks player
    damage = monster.getAttackDmg();
    player.setEnergy(player.getEnergy() - damage);
    System.out.println(monster.getName() + " attacked you for " + damage + " damage.");

    // Check if the player is defeated
    if (player.getEnergy() <= 0) {
        System.out.println("You were defeated by " + monster.getName() + "!");
        return;
    }

    // Add a delay between turns
    try {
        Thread.sleep(1000); // wait for 1 second
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}


public void start() {
    System.out.println("A wild " + monster.getName() + " appeared!");
    while (true) {
        turn();
        if (player.getEnergy() <= 0 || monster.getEnergy() <= 0) {
            break;
        }
    }
  }


}


