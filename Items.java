
public class Items {
   
    private String item_name ;
    private String item_description;
    private boolean digestable;
    private int energy_value; 
    



    public Items(String item_name,String item_description, boolean digestable,int energy_value ) {
        
        this.item_name = item_name ;
        this.item_description = item_description ;
        this.digestable = digestable ;
        this.energy_value = energy_value ;
    }

















    public String getItem_name() {
        return this.item_name;
    }


    public String getItem_description() {
        return this.item_description;
    }


    public boolean getDigestable() {
        return this.digestable;
    }


    public int getEnergy_Value () {
        return this.energy_value;
    }




/* 
 * methods 
 * 
 * check if it is digestable or not 
 * 
 * 
 * 
 * if eatable then assign an energy value
 * 
 */

 public static void main(String[] args) {

    Items Peaches = new Items ("Peaches", "It is a delicious smelling fruit!", true, 10) ;
    System.out.println(Peaches.item_name); 
    

 }   


}
