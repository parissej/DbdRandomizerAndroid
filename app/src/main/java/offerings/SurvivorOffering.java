package offerings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import main.Rarity;

/**
 * List of all survivors offerings.
 * Note that there are only the rare map modifiers.
 * @author MissBipBip
 *
 */
public enum SurvivorOffering {

	// https://deadbydaylight.gamepedia.com/Offerings

	Bog_Laurel_Sachet(Rarity.Common),
	Fresh_Bog_Sachet(Rarity.Uncommon),
	Fragrant_Bog_Sachet(Rarity.Rare),
	
	Crispleaf_Amaranth_Sachet(Rarity.Common),
	Fresh_Crispleaf_Amaranth(Rarity.Uncommon),
	Fragrant_Crispleaf_Amaranth(Rarity.Rare),
	
	Primrose_Blossom_Sachet(Rarity.Common),
	Fresh_Primrose_Blossom(Rarity.Uncommon),
	Fragrant_Primrose_Blossom(Rarity.Rare),
	
	Sweet_William_Sachet(Rarity.Common),
	Fresh_Sweet_William(Rarity.Uncommon),
	Fragrant_Sweet_William(Rarity.Rare),
	
	Bound_Envelope(Rarity.Rare),
	Sealed_Envelope(Rarity.Uncommon),
	Escape_Cake(Rarity.Uncommon),
	
	Bloody_Party_Streamers(Rarity.Rare),
	
	Chalk_Pouch(Rarity.Common),
	Cream_Chalk_Pouch(Rarity.Uncommon),
	Ivory_Chalk_Pouch(Rarity.Rare),
	
	Salt_Pouch(Rarity.Uncommon),
	Black_Salt_Statuette(Rarity.Rare),
	Vigo_s_Jar_of_Salty_Lips(Rarity.Very_Rare),
	
	Clear_Reagent(Rarity.Common),
	Faint_Reagent(Rarity.Common),
	Hazy_Reagent(Rarity.Uncommon),
	Murky_Reagent(Rarity.Very_Rare),
	
	New_Moon_Bouquet(Rarity.Ultra_Rare),
	Crescent_Moon_Bouquet(Rarity.Uncommon),
	Quarter_Moon_Bouquet(Rarity.Uncommon),
	Full_Moon_Bouquet(Rarity.Very_Rare),
	
	Tarnished_Coin(Rarity.Uncommon),
	Shiny_Coin(Rarity.Very_Rare),
	
	Petrified_Oak(Rarity.Very_Rare),
	
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
	
	Shroud_of_Union(Rarity.Uncommon),
	Vigo_s_Shroud(Rarity.Uncommon),
	
	Shroud_of_Binding(Rarity.Very_Rare),
	
	White_Ward(Rarity.Very_Rare);
	
	private final Rarity rarity;
	
	SurvivorOffering(Rarity r){
		this.rarity = r;
	}
	
/**
	 * @return the rarity
	 */
	public Rarity getRarity() {
		return rarity;
	}

private static final ArrayList<SurvivorOffering> listSurvivorOffering;
	
	static {
		listSurvivorOffering = new ArrayList<>();
	        for (SurvivorOffering someEnum : SurvivorOffering.values()) {
	        	listSurvivorOffering.add(someEnum);
	        }
	}

	public static List<SurvivorOffering> getValues() {
		return Collections.unmodifiableList(listSurvivorOffering);
	}

	/**
	 * 
	 * @return the number of survivor offerings
	 */
	public static int numberOfSurvivorOfferings(){
		return listSurvivorOffering.size();
	}
	
	public static SurvivorOffering randomSurvivorOffering(){
		 Random r = new Random();
		 return SurvivorOffering.getValues().get(r.nextInt(numberOfSurvivorOfferings()));
	 }
	
}
