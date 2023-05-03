import java.util.ArrayList;


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
    public void removeItem(Items item){
        this.inventory.remove(item);
}

    //method to see if player has an item or not (you're checking to see if it's true or not so boolean)
    public boolean hasItem(Items item){
        return this.inventory.contains(item);
}
    public String toString(){
        return name + " " + description + " " + inventory;
}
}