package items;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import main.Rarity;

/**
 * List of the add-ons for the items
 * @author MissBipBip
 *
 */
public enum ItemAddOn {
	// https://deadbydaylight.gamepedia.com/Add-ons
	
	//Firecrakers
	No_Add_On(TypeOfItem.Firecrackers,null),
	No_AddOn(TypeOfItem.Firecrackers,null),
	
	//Flashlights
	Wide_Lens(TypeOfItem.Flashlight,Rarity.Common),
	Power_Bulb(TypeOfItem.Flashlight,Rarity.Common),
	Leather_Grip(TypeOfItem.Flashlight,Rarity.Common),
	Battery(TypeOfItem.Flashlight,Rarity.Common),
	Tir_Optic(TypeOfItem.Flashlight,Rarity.Uncommon),
	Rubber_Grip(TypeOfItem.Flashlight,Rarity.Uncommon),
	Low_Amp_Filament(TypeOfItem.Flashlight,Rarity.Uncommon),
	Heavy_Duty_Battery(TypeOfItem.Flashlight,Rarity.Uncommon),
	Focus_Lens(TypeOfItem.Flashlight,Rarity.Uncommon),
	Long_Life_Battery(TypeOfItem.Flashlight,Rarity.Rare),
	Intense_Halogen(TypeOfItem.Flashlight,Rarity.Rare),
	High_End_Sapphire_Lens(TypeOfItem.Flashlight,Rarity.Very_Rare),
	Odd_Bulb(TypeOfItem.Flashlight,Rarity.Ultra_Rare),
	
	//Keys
	Prayer_Rope (TypeOfItem.Key,Rarity.Common),
	Scratched_Pearl(TypeOfItem.Key,Rarity.Uncommon),
	Prayer_Beads(TypeOfItem.Key,Rarity.Uncommon),
	Eroded_Token(TypeOfItem.Key,Rarity.Uncommon),
	Gold_Token(TypeOfItem.Key,Rarity.Rare),
	Weaved_Ring(TypeOfItem.Key,Rarity.Very_Rare),
	Milky_Glass(TypeOfItem.Key,Rarity.Very_Rare),
	Blood_Amber(TypeOfItem.Key,Rarity.Very_Rare),
	
	//Maps
	Map_Addendum(TypeOfItem.Map,Rarity.Common),
	Yellow_Wire(TypeOfItem.Map,Rarity.Uncommon),
	Unusual_Stamp(TypeOfItem.Map,Rarity.Uncommon),
	Retardant_Jelly(TypeOfItem.Map,Rarity.Uncommon),
	Red_Twine(TypeOfItem.Map,Rarity.Uncommon),
	Glass_Bead(TypeOfItem.Map,Rarity.Uncommon),
	Odd_Stamp(TypeOfItem.Map,Rarity.Rare),
	Black_Silk_Cord(TypeOfItem.Map,Rarity.Rare),
	Crystal_Bead(TypeOfItem.Map,Rarity.Very_Rare),
	
	//MedKits
	Rubber_Gloves(TypeOfItem.MedKit,Rarity.Common),
	Butterfly_Tape(TypeOfItem.MedKit,Rarity.Common),
	Bandages(TypeOfItem.MedKit,Rarity.Common),
	Sponge(TypeOfItem.MedKit,Rarity.Uncommon),
	Self_Adherent_Wrap(TypeOfItem.MedKit,Rarity.Uncommon),
	Needle_and_Thread(TypeOfItem.MedKit,Rarity.Uncommon),
	Medical_Scissors(TypeOfItem.MedKit,Rarity.Uncommon),
	Gauze_Roll(TypeOfItem.MedKit,Rarity.Uncommon),
	Surgical_Suture(TypeOfItem.MedKit,Rarity.Rare),
	Gel_Dressings(TypeOfItem.MedKit,Rarity.Rare),
	Abdominal_Dressing(TypeOfItem.MedKit,Rarity.Rare),
	Styptic_Agent(TypeOfItem.MedKit,Rarity.Very_Rare),
	Anti_Hemorrhagic_Syringe(TypeOfItem.MedKit,Rarity.Ultra_Rare),
	
	//Toolboxes
	Spring_Clamp(TypeOfItem.Toolbox,Rarity.Common),
	Scraps(TypeOfItem.Toolbox,Rarity.Common),
	Clean_Rag (TypeOfItem.Toolbox,Rarity.Common),
	Wire_Spool (TypeOfItem.Toolbox,Rarity.Uncommon),
	Socket_Swivels (TypeOfItem.Toolbox,Rarity.Uncommon),
	Protective_Gloves (TypeOfItem.Toolbox,Rarity.Uncommon),
	Instructions (TypeOfItem.Toolbox,Rarity.Uncommon),
	Grip_Wrench (TypeOfItem.Toolbox,Rarity.Uncommon),
	Cutting_Wire (TypeOfItem.Toolbox,Rarity.Uncommon),
	Hacksaw (TypeOfItem.Toolbox,Rarity.Rare),
	Brand_New_Part (TypeOfItem.Toolbox,Rarity.Ultra_Rare);	
	
	private final TypeOfItem typeOfItem;
	private final Rarity rarity;
	
	ItemAddOn(TypeOfItem type, Rarity rarity) {
		this.typeOfItem = type;
		this.rarity = rarity;
	}

	/**
	 * @return the typeOfItem
	 */
	public TypeOfItem getTypeOfItem() {
		return typeOfItem;
	}
	
	/**
	 * @return the rarity
	 */
	public Rarity getRarity() {
		return rarity;
	}
	
	/**
	 * List of addons
	 */
	private static final ArrayList<ItemAddOn> listAddOn;
	
	static {
		listAddOn = new ArrayList<>();
	        for (ItemAddOn someEnum : ItemAddOn.values()) {
	        	listAddOn.add(someEnum);
	        }
	}

	public static List<ItemAddOn> getValues() {
		return Collections.unmodifiableList(listAddOn);
	}
	
	/**
	 * List of firecrakers addons
	 */
	private static final ArrayList<ItemAddOn> listAddOnFirecraker;
	
	static {
		listAddOnFirecraker = new ArrayList<>();
	        for (ItemAddOn someEnum : ItemAddOn.values()) {
	        	if(someEnum.typeOfItem.equals(TypeOfItem.Firecrackers)){
	        		listAddOnFirecraker.add(someEnum);
	        	}
	        }
	}

	public static List<ItemAddOn> getFirecrakerValues() {
		return Collections.unmodifiableList(listAddOnFirecraker);
	}
	
	/**
	 * List of flashlight addons
	 */
	private static final ArrayList<ItemAddOn> listAddOnFlashlight;
	
	static {
		listAddOnFlashlight = new ArrayList<>();
	        for (ItemAddOn someEnum : ItemAddOn.values()) {
	        	if(someEnum.typeOfItem.equals(TypeOfItem.Flashlight)){
	        		listAddOnFlashlight.add(someEnum);
	        	}
	        }
	}

	public static List<ItemAddOn> getFlashlightValues() {
		return Collections.unmodifiableList(listAddOnFlashlight);
	}
	
	/**
	 * List of keys addons
	 */
	private static final ArrayList<ItemAddOn> listAddOnKey;
	
	static {
		listAddOnKey = new ArrayList<>();
	        for (ItemAddOn someEnum : ItemAddOn.values()) {
	        	if(someEnum.typeOfItem.equals(TypeOfItem.Key)){
	        		listAddOnKey.add(someEnum);
	        	}
	        }
	}

	public static List<ItemAddOn> getKeyValues() {
		return Collections.unmodifiableList(listAddOnKey);
	}
	
	/**
	 * List of maps addons
	 */
	private static final ArrayList<ItemAddOn> listAddOnMap;
	
	static {
		listAddOnMap = new ArrayList<>();
	        for (ItemAddOn someEnum : ItemAddOn.values()) {
	        	if(someEnum.typeOfItem.equals(TypeOfItem.Map)){
	        		listAddOnMap.add(someEnum);
	        	}
	        }
	}

	public static List<ItemAddOn> getMapValues() {
		return Collections.unmodifiableList(listAddOnMap);
	}
	
	/**
	 * List of medkit addons
	 */
	private static final ArrayList<ItemAddOn> listAddOnMedkit;
	
	static {
		listAddOnMedkit = new ArrayList<>();
	        for (ItemAddOn someEnum : ItemAddOn.values()) {
	        	if(someEnum.typeOfItem.equals(TypeOfItem.MedKit)){
	        		listAddOnMedkit.add(someEnum);
	        	}
	        }
	}

	public static List<ItemAddOn> getMedkitValues() {
		return Collections.unmodifiableList(listAddOnMedkit);
	}
	
	/**
	 * List of toolbox addons
	 */
	private static final ArrayList<ItemAddOn> listAddOnToolbox;
	
	static {
		listAddOnToolbox = new ArrayList<>();
	        for (ItemAddOn someEnum : ItemAddOn.values()) {
	        	if(someEnum.typeOfItem.equals(TypeOfItem.Toolbox)){
	        		listAddOnToolbox.add(someEnum);
	        	}
	        }
	}

	public static List<ItemAddOn> getToolboxValues() {
		return Collections.unmodifiableList(listAddOnToolbox);
	}
	
	 public static ItemAddOn randomAddOn(TypeOfItem type){
		 Random r = new Random();
		 switch (type) {
		 case Firecrackers : return getFirecrakerValues().get(r.nextInt(listAddOnFirecraker.size()));
		 case Flashlight : return getFlashlightValues().get(r.nextInt(listAddOnFlashlight.size()));
		 case Key : return getKeyValues().get(r.nextInt(listAddOnKey.size()));
		 case Map : return getMapValues().get(r.nextInt(listAddOnMap.size()));
		 case MedKit : return getMedkitValues().get(r.nextInt(listAddOnMedkit.size()));
		 case Toolbox : return getToolboxValues().get(r.nextInt(listAddOnToolbox.size())); 
		 }
		 return null;
	 }
	 
	 public static ArrayList<ItemAddOn> randomTwoAddOns(TypeOfItem type){
		 ArrayList<ItemAddOn> twoAddOns = new ArrayList<>();
		 for(int i = 0 ; i<2;i++){
			 ItemAddOn randomAddOn = ItemAddOn.randomAddOn(type);
			 if(!twoAddOns.contains(randomAddOn)){
				 twoAddOns.add(randomAddOn);
			 } else {
				 i--;
			 }
		 }
		return twoAddOns;
	 }

}
