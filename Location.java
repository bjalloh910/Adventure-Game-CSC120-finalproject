import java.util.ArrayList;

public class Location{

protected  String Road_Name; 
protected  String Road_Adress;
ArrayList<Items> Inventory;

public Location(String Road_Name, String Road_Adress) {
    this.Road_Name = Road_Adress; 
    this.Road_Adress =  Road_Adress;
    this.Inventory = new ArrayList<Items>(Inventory) ;
    
    
} 
public Location() {
    this("<Name Unknown>", "<Address Unknown>");
}










public String getRoad_Name() {
    return this.Road_Name;
}

public String getAddress() {
return this.Road_Adress;
}












public static void main(String[] args) {




}

}