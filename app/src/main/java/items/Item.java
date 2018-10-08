package items;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import main.Rarity;
import items.TypeOfItem;

/**
 * List of the items
 * @author MissBipBip
 *
 */
public enum Item {
	// https://deadbydaylight.gamepedia.com/Items
	
	//Firecrackers
	Chinese_Firecracker (TypeOfItem.Firecrackers,Rarity.Common),
	Winter_Party_Starter(TypeOfItem.Firecrackers,Rarity.Rare),
	
	//Flashlights
	Flashlight(TypeOfItem.Flashlight,Rarity.Uncommon),
	Will_O_Wisp(TypeOfItem.Flashlight,Rarity.Uncommon),
	Sport_Flashlight(TypeOfItem.Flashlight,Rarity.Rare),
	Utility_Flashlight(TypeOfItem.Flashlight,Rarity.Very_Rare),
	
	//Keys
	Broken_Key(TypeOfItem.Key,Rarity.Rare),
	Dull_Key(TypeOfItem.Key,Rarity.Very_Rare),
	Skeleton_Key(TypeOfItem.Key,Rarity.Ultra_Rare),
	
	//Maps
	Map(TypeOfItem.Map,Rarity.Rare),
	Rainbow_Map(TypeOfItem.Map,Rarity.Ultra_Rare),
	
	//MedKits
	Camping_Aid_Kit(TypeOfItem.MedKit,Rarity.Common),
	All_Hallows_Eve_Lunchbox(TypeOfItem.MedKit,Rarity.Common),
	First_Aid_Kit(TypeOfItem.MedKit,Rarity.Uncommon),
	Emergency_MedKit(TypeOfItem.MedKit,Rarity.Rare),
	Ranger_MedKit(TypeOfItem.MedKit,Rarity.Very_Rare),
	
	//Toolboxes
	Worn_Out_Tools (TypeOfItem.Toolbox,Rarity.Common),
	Toolbox(TypeOfItem.Toolbox,Rarity.Uncommon),
	Mechanic_s_Toolbox(TypeOfItem.Toolbox,Rarity.Rare),
	Commodious_Toolbox(TypeOfItem.Toolbox,Rarity.Rare),
	Engineer_s_Toolbox(TypeOfItem.Toolbox,Rarity.Very_Rare),
	Alex_s_Toolbox(TypeOfItem.Toolbox,Rarity.Very_Rare);

	private ArrayList<ItemAddOn> addons;
	private final TypeOfItem type;
	private final Rarity rarity;
	
	Item(TypeOfItem typeOfItem, Rarity rarity) {
        this.setAddons(null);
        this.type = typeOfItem ;
        this.rarity = rarity;
    }
	
	/**
	 * @return the rarity
	 */
	public Rarity getRarity() {
		return rarity;
	}

	/**
	 * @return the addons
	 */
	public ArrayList<ItemAddOn> getAddons() {
		return addons;
	}
	
	public ItemAddOn getAddOn1(){
		return this.getAddons().get(0);
	}

	public ItemAddOn getAddOn2(){
		return this.getAddons().get(1);
	}
	
	/**
	 * @param addons the addons to set
	 */
	public void setAddons(ArrayList<ItemAddOn> addons) {
		this.addons = addons;
	}

	private static final ArrayList<Item> listItems;

	
	static {
		listItems = new ArrayList<>();
	        for (Item someEnum : Item.values()) {
	        	listItems.add(someEnum);
	        }
	}

	public static List<Item> getValues() {
		return Collections.unmodifiableList(listItems);
	}

	/**
	 * 
	 * @return the number of items
	 */
	public static int numberOfItems(){
		return listItems.size();
	}
	
	/**
	 * 
	 * @return a random Item
	 */
	public static Item randomItem(){
		 Random r = new Random();
		 Item i = Item.getValues().get(r.nextInt(numberOfItems()));
		 i.setAddons(ItemAddOn.randomTwoAddOns(i.type));
		 return i ;
	 }

}
