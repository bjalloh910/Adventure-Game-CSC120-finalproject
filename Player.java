import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    private int energy;
    private int attack_dmg;
    private String name;
    private ArrayList<Items> inventory;
    private String description;

    public Player(String name, String description, int energy, int attack_dmg, ArrayList<Items> inventory) {
        this.energy = energy;
        this.attack_dmg = attack_dmg;
        this.name = name;
        this.inventory = new ArrayList<Items>();
        this.description = description;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getAttackDmg() {
        return attack_dmg;
    }

    public void setAttackDmg(int attack_dmg) {
        this.attack_dmg = attack_dmg;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Items> getInventory(){
        return this.inventory;
}

    public void setInventory(ArrayList<Items> inventory){
        this.inventory = new ArrayList<Items>(inventory);
}

    public void addItem(Items item){
        this.inventory.add(item);
}

    //method to remove items 
    public void removeItem(String itemName) {
        this.inventory.removeIf(item -> item.getItem_name().equals(itemName));
    }
      
    //method to see if player has an item or not (you're checking to see if it's true or not so boolean)
    public boolean hasItem(Items item){
        return this.inventory.contains(item);
}
    public String toString(){
        return name + " " + description + " " + inventory;
}
    public void consume() {
    // Prompt the player to choose an item to consume
    System.out.println("Choose an item to consume:");
    for (Items item : inventory) {
        System.out.println(item.getItem_name());
    }
    Scanner input = new Scanner(System.in);
    String itemName = input.nextLine();

    // Find the chosen item in the inventory
    Items chosenItem = null;
    for (Items item : inventory) {
        if (item.getItem_name().equalsIgnoreCase(itemName)) {
            chosenItem = item;
            break;
        }
    }

    // Consume the item if it is found
    if (chosenItem != null) {
        if (chosenItem.getDigestable()) {
            int energyValue = chosenItem.getEnergy_Value();
            setEnergy(getEnergy() + energyValue);
            System.out.println("You consumed " + chosenItem.getItem_name() + " and restored " + energyValue + " energy.");
            removeItem(chosenItem.getItem_name());
        } else {
            System.out.println("You can't consume " + chosenItem.getItem_name() + "!");
        }
    } else {
        System.out.println("You don't have that item!");
    }
}
}


