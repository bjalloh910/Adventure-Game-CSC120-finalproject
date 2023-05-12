import java.util.Random;
import java.util.Scanner;

public class Fight {
    private Player player;
    private Monster monster;

    public Fight(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    private void turn() {
        System.out.println("What do you want to do?");
        System.out.println("1. Attack with your sword");
        System.out.println("2. Use the counter ability");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int damage = 0;
        if (choice == 1) {
            damage = player.getAttackDmg();
            monster.setEnergy(monster.getEnergy() - damage);
            System.out.println("You attacked " + monster.getName() + " with your sword for " + damage + " damage.");
        } else if (choice == 2) {
            // Player uses the counter ability
            counter();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        if (monster.getEnergy() <= 0) {
            System.out.println("You defeated " + monster.getName() + "!");
            return;
        }

        damage = monster.getAttackDmg();
        player.setEnergy(player.getEnergy() - damage);
        System.out.println(monster.getName() + " attacked you for " + damage + " damage.");

        if (player.getEnergy() <= 0) {
            System.out.println("You were defeated by " + monster.getName() + "!");
            return;
        }

        // Display player and monster health after each turn
        System.out.println("Player Health: " + player.getEnergy() + " | " + monster.getName() + " Health: " + monster.getEnergy());

        // Add a delay between turns
        try {
            Thread.sleep(1000); // wait for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void counter() {
        Random random = new Random();
        int successRate = random.nextInt(100);

        int totalDamage = player.getAttackDmg() + monster.getAttackDmg();

        if (successRate < 50) { // 50% chance of success
            System.out.println("Counter successful! You dealt " + totalDamage + " damage to " + monster.getName());
            monster.setEnergy(monster.getEnergy() - totalDamage);
        } else {
            System.out.println("Counter failed! You take " + totalDamage + " damage.");
            player.setEnergy(player.getEnergy() - totalDamage);
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
