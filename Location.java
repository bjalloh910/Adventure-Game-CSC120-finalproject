import java.util.ArrayList;

public class Location{

//setting the attributes 
private String name;
private String description;
private ArrayList<Items> inventory;

//Constructor 
public Location(String name, String description, ArrayList<Items> inventory) {
    this.name = name; //name of location
    this.description =  description; //describe the location
    this.inventory = inventory; //The items that exist in the location
    
    
    
} 
//Getter methods
public String getName() {
    return this.name;
}

public String getDescription() {
    return this.description;
}

public ArrayList<Items> getInventory(){
    return this.inventory;
}

//Setter methods 
public void setName(String name){
    this.name = name;
}

public void setDescription(String description){
    this.description = description;
}

public void setInventory(ArrayList<Items> inventory){
    this.inventory = new ArrayList<Items>(inventory);
}

//Inventory methods 
//method to add items 
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

public void checkForKeyOne(Player player) {
    Items key = new Items("Item: Key", "Description: 1/3 Ancient Key, what could it possibly be used for?", false, 0);
    if (this.hasItem(key)) {
        System.out.println("You found one of the keys to the Golden Crown, continue your adventure!");
        Beach beach = new Beach(player);
    }
}

 







public static void main(String[] args) {
//adding the location name, and description and inventory 
Location location1 = new Location("Grove", "A dense grove with tall trees and exotic animals", new ArrayList<Items>());


//adding some items to test out
Items sword = new Items("Sword", "a very sharp sword", false, 0);

location1.addItem(sword);


System.out.println("Location 1:");
System.out.println("Name: " + location1.getName());
System.out.println("Description:" + location1.getDescription());
System.out.println("Inventory: " + location1.getInventory());
}


}



 







