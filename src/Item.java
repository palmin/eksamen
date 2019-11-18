import java.util.ArrayList;

public class Item {
    /**
     * Items name
     */
    /** array list containing viable weapons */
    static public ArrayList<Item> weapons = new ArrayList<Item>();
    public ArrayList<Item> potions = new ArrayList<Item>();
    /** inits all items*/
    static public ArrayList<Item> generateAllItems() {
        ArrayList<Item> weapons = new ArrayList<Item>();
        /** Player weapons */
        weapons.add(new Item("Bare hands", 2, 24, true));
        weapons.add(new Item("Stick",4, 24,true));
        weapons.add(new Item("Plunger", 8, 18, true));
        weapons.add(new Item("Swordfish", 8, 48,true));
        weapons.add(new Item("Flail", 12, 24, true));
        /** Enemy weapons*/
        weapons.add(new Item("Enemy Weap", 3, 14, true));
        return weapons;
    }
    Item(){
        weapons = generateAllItems();
    }
    /** constructor for items and weapons*/
    Item(String name, int amount, int accuracy, boolean isWeapon) {
        this.name = name;

        if (isWeapon){
            this.damage = amount;
            this.accuracy = accuracy;
        }
        else {
            this.heal = amount;
        }

    }




    public String name; // item damage

    public int damage; // item damage

    public int accuracy; // item accuracy/ hit rate

    public int heal; // healing strength
}
