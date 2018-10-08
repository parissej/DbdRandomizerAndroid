package offerings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import main.Rarity;

/**
 * List of all killers offerings.
 * Note that there are only the rare map modifiers and no splinters.
 * @author MissBipBip
 *
 */
public enum KillerOffering {

	// https://deadbydaylight.gamepedia.com/Offerings

	Tanager_Wreath(Rarity.Common),
	Devout_Tanager_Wreath(Rarity.Uncommon),
	Ardent_Tanager_Wreath(Rarity.Rare),
	
	Raven_Wreath(Rarity.Common),
	Devout_Raven_Wreath(Rarity.Uncommon),
	Ardent_Raven_Wreath(Rarity.Rare),
	
	Spotted_Owl_Wreath(Rarity.Common),
	Devout_Spotted_Owl_Wreath(Rarity.Uncommon),
	Ardent_Spotted_Owl_Wreath(Rarity.Rare),
	
	Shrike_Wreath(Rarity.Common),
	Devout_Shrike_Wreath(Rarity.Uncommon),
	Ardent_Shrike_Wreath(Rarity.Rare),
	
	Hollow_Shell(Rarity.Uncommon),
	Survivor_Pudding(Rarity.Uncommon),
	
	Bloody_Party_Streamers(Rarity.Rare),
	
	Clear_Reagent(Rarity.Common),
	Faint_Reagent(Rarity.Common),
	Hazy_Reagent(Rarity.Uncommon),
	Murky_Reagent(Rarity.Very_Rare),
	
	New_Moon_Bouquet(Rarity.Ultra_Rare),
	Crescent_Moon_Bouquet(Rarity.Uncommon),
	Quarter_Moon_Bouquet(Rarity.Uncommon),
	Full_Moon_Bouquet(Rarity.Very_Rare),
	
	Cut_Coin(Rarity.Very_Rare),
	Scratched_Coin(Rarity.Uncommon),
	
	Moldy_Oak(Rarity.Uncommon),
	Rotten_Oak(Rarity.Rare),
	Putrid_Oak(Rarity.Very_Rare),
	
	Cypress_Memento_Mori(Rarity.Uncommon),
	Ivory_Memento_Mori(Rarity.Rare),
	Ebony_Memento_Mori(Rarity.Ultra_Rare),
	
	//Map modifiers
	MacMillan_s_Phalanx_Bone(Rarity.Rare),
	Azarov_s_Key(Rarity.Rare),
	Heart_Locket(Rarity.Rare),
	Charred_Wedding_Photograph(Rarity.Rare),
	Strode_Realty_Key(Rarity.Rare),
	Granma_s_Cookbook(Rarity.Rare),
	Shattered_Glasses(Rarity.Rare),
	The_Last_Mask(Rarity.Rare),
	The_Pied_Piper(Rarity.Rare),
	Jigsaw_Piece(Rarity.Rare),

	Shroud_of_Separation(Rarity.Uncommon),
	
	Black_Ward(Rarity.Very_Rare);
	
	private final Rarity rarity;
	
	KillerOffering(Rarity r){
		this.rarity = r;
	}
	
	/**
	 * @return the rarity
	 */
	public Rarity getRarity() {
		return rarity;
	}

	private static final ArrayList<KillerOffering> listKillerOffering;
	
	static {
		listKillerOffering = new ArrayList<>();
	        for (KillerOffering someEnum : KillerOffering.values()) {
	        	listKillerOffering.add(someEnum);
	        }
	}

	public static List<KillerOffering> getValues() {
		return Collections.unmodifiableList(listKillerOffering);
	}

	/**
	 * 
	 * @return the number of killer offerings
	 */
	public static int numberOfKillerOfferings(){
		return listKillerOffering.size();
	}
	
	public static KillerOffering randomKillerOffering(){
		 Random r = new Random();
		 return KillerOffering.getValues().get(r.nextInt(numberOfKillerOfferings()));
	 }
	
	
}
