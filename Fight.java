public class Fight {
    private Player player;
    private Monster monster;

    public Fight(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
}

private void turn() {
    // Player attacks monster
    int damage = player.getAttackDmg();
    monster.setEnergy(monster.getEnergy() - damage);
    System.out.println("You attacked the monster for " + damage + " damage.");

    // Check if the monster is defeated
    if (monster.getEnergy() <= 0) {
        System.out.println("You defeated the monster!");
        return;
    }

    // Monster attacks player
    damage = monster.getAttackDmg();
    player.setEnergy(player.getEnergy() - damage);
    System.out.println("The monster attacked you for " + damage + " damage.");

    // Check if the player is defeated
    if (player.getEnergy() <= 0) {
        System.out.println("You were defeated by the monster!");
        return;
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


