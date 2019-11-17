import java.util.ArrayList;

public class Item {
    /**
     * Items name
     */

    public ArrayList<Item> weapons = new ArrayList<Item>();
    //public Item potions = new Item("potion", 20, false);
    static public Item key = new Item("Key", 0, false);
    public void generateAllItems() {
        weapons.add(new Item("Bare hands", 1, true));
        weapons.add(new Item("Stick",2, true));
        weapons.add(new Item("Plunger", 4, true));
        weapons.add(new Item("Swordfish", 4, true));
        weapons.add(new Item("Flail", 6, true));
    }
    Item(){
        generateAllItems();
    }
    Item(String name, int amount, boolean isWeapon) {
        this.name = name;

        if (isWeapon){
            this.damage = amount;
        }
        else {
            this.heal = amount;
        }

    }




    public String name;

    public int damage;

    public int heal;
}
