package items;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import characters.Killer;
import main.Rarity;

/**
 * List of the add-ons for the killers powers
 * @author MissBipBip
 *
 */
public enum PowerAddOn {
	// https://deadbydaylight.gamepedia.com/Add-ons

	//Trapper
	Trapper_Gloves(Killer.Trapper,Rarity.Common),
	Strong_Coil_Spring(Killer.Trapper,Rarity.Common),
	Serrated_Jaws(Killer.Trapper,Rarity.Common), 
	
	Wax_Brick(Killer.Trapper,Rarity.Uncommon),
	Trapper_Bag(Killer.Trapper,Rarity.Uncommon),
	Trap_Setters(Killer.Trapper,Rarity.Uncommon),
	Secondary_Coil(Killer.Trapper,Rarity.Uncommon),
	Logwood_Dye(Killer.Trapper,Rarity.Uncommon),
	Four_Coil_Spring_Kit(Killer.Trapper,Rarity.Uncommon),
	
	Tar_Bottle(Killer.Trapper,Rarity.Rare),
	Setting_Tools(Killer.Trapper,Rarity.Rare),
	Rusted_Jaws(Killer.Trapper,Rarity.Rare),
	Oily_Coil(Killer.Trapper,Rarity.Rare),
	Fastening_Tools(Killer.Trapper,Rarity.Rare),
	
	Stitched_Bag(Killer.Trapper,Rarity.Very_Rare),
	Honing_Stone(Killer.Trapper,Rarity.Very_Rare),
	Bloody_Coil(Killer.Trapper,Rarity.Very_Rare),
	
	Diamond_Stone(Killer.Trapper,Rarity.Ultra_Rare),
	 
	//Wraith
	 Bone_Clapper(Killer.Wraith,Rarity.Common),
	 Swift_Hunt_Soot(Killer.Wraith,Rarity.Common),
	 Blink_Soot(Killer.Wraith,Rarity.Common),
	 Blind_Warrior_Soot(Killer.Wraith,Rarity.Common),
	 
	 Coxcombed_Clapper(Killer.Wraith,Rarity.Uncommon),
	 Windstorm_Mud(Killer.Wraith,Rarity.Uncommon),
	 Swift_Hunt_Mud(Killer.Wraith,Rarity.Uncommon),
	 Blind_Warrior_Mud(Killer.Wraith,Rarity.Uncommon),
	 All_Seeing_Mud(Killer.Wraith,Rarity.Uncommon),
	 
	 Windstorm_White(Killer.Wraith,Rarity.Rare),
	 The_Ghost_White(Killer.Wraith,Rarity.Rare),
	 Swift_Hunt_White(Killer.Wraith,Rarity.Rare),
	 Blind_Warrior_White(Killer.Wraith,Rarity.Rare),
	 All_Seeing_White(Killer.Wraith,Rarity.Rare),
	 
	 Windstorm_Blood(Killer.Wraith,Rarity.Very_Rare),
	 Blink_Blood(Killer.Wraith,Rarity.Very_Rare),
	 Blind_Warrior_Blood(Killer.Wraith,Rarity.Very_Rare),
	 All_Seeing_Blood(Killer.Wraith,Rarity.Very_Rare),
	 
	 Blind_Warrior_Spirit(Killer.Wraith,Rarity.Ultra_Rare),
	 All_Seeing_Spirit(Killer.Wraith,Rarity.Ultra_Rare),
	 
	//Hillbilly
	 Vegetable_oil(Killer.Hillbilly,Rarity.Common),
	 Spark_plug(Killer.Hillbilly,Rarity.Common),
	 Chainsaw_file(Killer.Hillbilly,Rarity.Common),
	 
	 Spiked_Boots(Killer.Hillbilly,Rarity.Uncommon),
	 Speed_limiter(Killer.Hillbilly,Rarity.Uncommon),
	 Shop_lubricant(Killer.Hillbilly,Rarity.Uncommon),
	 Primer_bulb(Killer.Hillbilly,Rarity.Uncommon),
	 Long_Guide_bar(Killer.Hillbilly,Rarity.Uncommon),
	 Homemade_muffler(Killer.Hillbilly,Rarity.Uncommon),
	 Grisly_chains(Killer.Hillbilly,Rarity.Uncommon),
	 Depth_Gauge_rake(Killer.Hillbilly,Rarity.Uncommon),
	 Death_Engravings(Killer.Hillbilly,Rarity.Uncommon),
	 
	 The_Thompson_s_Mix(Killer.Hillbilly,Rarity.Rare),
	 Rusted_chains(Killer.Hillbilly,Rarity.Rare),
	 Light_chassis(Killer.Hillbilly,Rarity.Rare),
	 Doom_Engravings(Killer.Hillbilly,Rarity.Rare),
	 Carburetor_Tuning_guide(Killer.Hillbilly,Rarity.Rare),
	 
	 Thompson_s_Moonshine(Killer.Hillbilly,Rarity.Very_Rare),
	 Begrimed_chains(Killer.Hillbilly,Rarity.Very_Rare),
	
	//Nurse
	 Wooden_Horse(Killer.Nurse,Rarity.Common),
	 White_Nit_Comb(Killer.Nurse,Rarity.Common),
	 Torn_Bookmark(Killer.Nurse,Rarity.Common),
	 Metal_Spoon(Killer.Nurse,Rarity.Common),
	 Matchbox(Killer.Nurse,Rarity.Common),
	 Bad_Man_Keepsake(Killer.Nurse,Rarity.Common),
	 
	 Pocket_Watch(Killer.Nurse,Rarity.Uncommon),
	 Dull_Bracelet(Killer.Nurse,Rarity.Uncommon),
	 Dark_Cincture(Killer.Nurse,Rarity.Uncommon),
	 Catatonic_Boy_s_Treasure(Killer.Nurse,Rarity.Uncommon),
	 
	 Spasmodic_Breath(Killer.Nurse,Rarity.Rare),
	 Heavy_Panting(Killer.Nurse,Rarity.Rare),
	 Fragile_Wheeze(Killer.Nurse,Rarity.Rare),
	 Ataxic_Respiration(Killer.Nurse,Rarity.Rare),
	 Anxious_Gasp(Killer.Nurse,Rarity.Rare),
	 
	 Plaid_Flannel(Killer.Nurse,Rarity.Very_Rare),
	 Kavanagh_s_Last_Breath(Killer.Nurse,Rarity.Very_Rare),
	 Jenner_s_Last_Breath(Killer.Nurse,Rarity.Very_Rare),
	 Campbell_s_Last_Breath(Killer.Nurse,Rarity.Very_Rare),
	 Bad_Man_s_Last_Breath(Killer.Nurse,Rarity.Very_Rare),
	
	//Huntress
	 Coarse_Stone(Killer.Huntress,Rarity.Common),
	 Berus_Toxin(Killer.Huntress,Rarity.Common),
	 Bandaged_Haft(Killer.Huntress,Rarity.Common),
	 Amanita_Toxin(Killer.Huntress,Rarity.Common),
	 
	 Yew_Seed_Brew(Killer.Huntress,Rarity.Uncommon),
	 Shiny_Pin(Killer.Huntress,Rarity.Uncommon),
	 Oak_Haft(Killer.Huntress,Rarity.Uncommon),
	 Manna_Grass_Braid(Killer.Huntress,Rarity.Uncommon),
	 Leather_Loop(Killer.Huntress,Rarity.Uncommon),
	 Fine_Stone(Killer.Huntress,Rarity.Uncommon),
	 Deerskin_Gloves(Killer.Huntress,Rarity.Uncommon),
	 
	 Yew_Seed_Concoction(Killer.Huntress,Rarity.Rare),
	 Venomous_Concoction(Killer.Huntress,Rarity.Rare),
	 Rusty_Head(Killer.Huntress,Rarity.Rare),
	 Pungent_Fiale(Killer.Huntress,Rarity.Rare),
	 Flower_Babushka(Killer.Huntress,Rarity.Rare),
	 
	 Infantry_Belt(Killer.Huntress,Rarity.Very_Rare),
	 Glowing_Concoction(Killer.Huntress,Rarity.Very_Rare),
	 Begrimed_Head(Killer.Huntress,Rarity.Very_Rare),
	 
	 Iridescent_Head(Killer.Huntress,Rarity.Ultra_Rare),
	
	//Shape
	 Tacky_Earrings(Killer.Shape,Rarity.Common),
	 Boyfriend_s_Memo(Killer.Shape,Rarity.Common),
	 Blond_Hair(Killer.Shape,Rarity.Common),
	 
	 Reflective_Fragment(Killer.Shape,Rarity.Uncommon),
	 Memorial_Flower(Killer.Shape,Rarity.Uncommon),
	 Jewelry(Killer.Shape,Rarity.Uncommon),
	 Hair_Brush(Killer.Shape,Rarity.Uncommon),
	 Glass_Fragment(Killer.Shape,Rarity.Uncommon),
	 Dead_Rabbit(Killer.Shape,Rarity.Uncommon),
	 
	 Mirror_Shard(Killer.Shape,Rarity.Rare),
	 Judith_s_Journal(Killer.Shape,Rarity.Rare),
	 Jewelry_Box(Killer.Shape,Rarity.Rare),
	 J_Myers_Memorial(Killer.Shape,Rarity.Rare),
	 Hair_Bow(Killer.Shape,Rarity.Rare),
	 Vanity_Mirror(Killer.Shape,Rarity.Very_Rare),
	 Tombstone_Piece(Killer.Shape,Rarity.Very_Rare),
	 Scratched_Mirror(Killer.Shape,Rarity.Very_Rare),
	 Lock_of_Hair(Killer.Shape,Rarity.Very_Rare),
	 
	 Judith_s_Tombstone(Killer.Shape,Rarity.Ultra_Rare),
	 Fragrant_Tuft_of_Hair(Killer.Shape,Rarity.Ultra_Rare),
	 
	//Hag
	 Rope_Necklet(Killer.Hag,Rarity.Common),
	 Powdered_Eggshell(Killer.Hag,Rarity.Common),
	 Dead_Fly_Mud(Killer.Hag,Rarity.Common),
	 Bog_Water(Killer.Hag,Rarity.Common),
	 
	 Pussy_Willow_Catkins(Killer.Hag,Rarity.Uncommon),
	 Half_Eggshell(Killer.Hag,Rarity.Uncommon),
	 Dragonfly_Wings(Killer.Hag,Rarity.Uncommon),
	 Cypress_Necklet(Killer.Hag,Rarity.Uncommon),
	 Bloodied_Water(Killer.Hag,Rarity.Uncommon),
	 
	 Willow_Wreath(Killer.Hag,Rarity.Rare), 
	 Swamp_Orchid_Necklet(Killer.Hag,Rarity.Rare), 
	 Dried_Cicada(Killer.Hag,Rarity.Rare),  
	 Cracked_Turtle_Egg(Killer.Hag,Rarity.Rare), 
	 Bloodied_Mud(Killer.Hag,Rarity.Rare), 
	 
	 Scarred_Hand(Killer.Hag,Rarity.Very_Rare), 
	 Rusty_Shackles(Killer.Hag,Rarity.Very_Rare),
	 Granma_s_Heart(Killer.Hag,Rarity.Very_Rare),
	 Disfigured_Ear(Killer.Hag,Rarity.Very_Rare),
	 
	 Waterlogged_Shoe(Killer.Hag,Rarity.Ultra_Rare),
	 Mint_Rag(Killer.Hag,Rarity.Ultra_Rare),
	 
	//Cannibal
	 Vegetable_Oil(Killer.Cannibal,Rarity.Common),
	 Spark_Plug(Killer.Cannibal,Rarity.Common),
	 Chainsaw_File(Killer.Cannibal,Rarity.Common),
	 
	 Speed_Limiter(Killer.Cannibal,Rarity.Uncommon),
	 Shop_Lubricant(Killer.Cannibal,Rarity.Uncommon),
	 Primer_Bulb(Killer.Cannibal,Rarity.Uncommon),
	 Long_Guide_Bar(Killer.Cannibal,Rarity.Uncommon),
	 Knife_Scratches(Killer.Cannibal,Rarity.Uncommon),
	 Homemade_Muffler(Killer.Cannibal,Rarity.Uncommon),
	 Grisly_Chains(Killer.Cannibal,Rarity.Uncommon),
	 Depth_Gauge_Rake(Killer.Cannibal,Rarity.Uncommon),
	 Chilli(Killer.Cannibal,Rarity.Uncommon),
	 
	 The_Grease(Killer.Cannibal,Rarity.Rare),
	 The_Beast_s_Marks(Killer.Cannibal,Rarity.Rare), 
	 Rusted_Chains(Killer.Cannibal,Rarity.Rare),
	 Light_Chassis(Killer.Cannibal,Rarity.Rare), 
	 
	 Carburetor_Tuning_Guide(Killer.Cannibal,Rarity.Rare),
	 Begrimed_Chains(Killer.Cannibal,Rarity.Very_Rare),
	 Award_winning_Chilli(Killer.Cannibal,Rarity.Very_Rare),
	 
	//Doctor
	 Moldy_Electrode(Killer.Doctor,Rarity.Common),
	 Maple_Knight(Killer.Doctor,Rarity.Common),
	 Order_Class_I(Killer.Doctor,Rarity.Common),
	 Calm_Class_I(Killer.Doctor,Rarity.Common),
	 
	 Scrapped_Tape(Killer.Doctor,Rarity.Uncommon),
	 Polished_Electrode(Killer.Doctor,Rarity.Uncommon),
	 Interview_Tape(Killer.Doctor,Rarity.Uncommon),
	 Restraint_Class_II(Killer.Doctor,Rarity.Uncommon),
	 Order_Class_II(Killer.Doctor,Rarity.Uncommon),
	 Discipline_Class_II(Killer.Doctor,Rarity.Uncommon),
	 Calm_Class_II(Killer.Doctor,Rarity.Uncommon),
	 
	 High_Stimulus_Electrode(Killer.Doctor,Rarity.Rare),
	 Restraint_Class_III(Killer.Doctor,Rarity.Rare),
	 Discipline_Class_III(Killer.Doctor,Rarity.Rare),
	 
	 Restraint_Carter_s_Notes(Killer.Doctor,Rarity.Very_Rare),
	 Order_Carter_s_Notes(Killer.Doctor,Rarity.Very_Rare),
	 Obedience_Carter_s_Notes(Killer.Doctor,Rarity.Very_Rare),
	 Discipline_Carter_s_Notes(Killer.Doctor,Rarity.Very_Rare),
	 
	 Calm_Carter_s_Notes(Killer.Doctor,Rarity.Very_Rare),
	 Iridescent_King(Killer.Doctor,Rarity.Ultra_Rare),
	
	//Nightmare
	 Wool_Shirt(Killer.Nightmare,Rarity.Common),
	 Sheep_Block(Killer.Nightmare,Rarity.Common),
	 Kid_s_Drawing(Killer.Nightmare,Rarity.Common),
	 Garden_Rake(Killer.Nightmare,Rarity.Common),
	 
	 Prototype_Claws(Killer.Nightmare,Rarity.Uncommon),
	 Outdoor_Rope(Killer.Nightmare,Rarity.Uncommon),
	 Nancy_s_Sketch(Killer.Nightmare,Rarity.Uncommon),
	 Green_Dress(Killer.Nightmare,Rarity.Uncommon),
	 Cat_Block(Killer.Nightmare,Rarity.Uncommon),
	 
	 Unicorn_Block(Killer.Nightmare,Rarity.Rare),
	 Swing_Chains(Killer.Nightmare,Rarity.Rare),
	 Nancy_s_Masterpiece(Killer.Nightmare,Rarity.Rare),
	 Jump_Rope(Killer.Nightmare,Rarity.Rare),
	 Blue_Dress(Killer.Nightmare,Rarity.Rare),
	 
	 Pill_Bottle(Killer.Nightmare,Rarity.Very_Rare),
	 Paint_Thinner(Killer.Nightmare,Rarity.Very_Rare),
	 Class_Photo(Killer.Nightmare,Rarity.Very_Rare),
	 Z_Block(Killer.Nightmare,Rarity.Very_Rare),
	 
	 Red_Paint_Brush(Killer.Nightmare,Rarity.Ultra_Rare),
	 Black_Box(Killer.Nightmare,Rarity.Ultra_Rare),
		 
	//Pig
	 Workshop_Grease(Killer.Pig,Rarity.Common),
	 Shattered_Syringe(Killer.Pig,Rarity.Common),
	 John_s_Medical_File(Killer.Pig,Rarity.Common),
	 Combat_Straps(Killer.Pig,Rarity.Common),
	 
	 Video_Tape(Killer.Pig,Rarity.Uncommon),
	 Utility_Blades(Killer.Pig,Rarity.Uncommon),
	 Razor_Wires(Killer.Pig,Rarity.Uncommon),
	 Last_Will(Killer.Pig,Rarity.Uncommon),
	 Face_Mask(Killer.Pig,Rarity.Uncommon),
	 
	 Slow_Release_Toxin(Killer.Pig,Rarity.Rare),
	 Rusty_Attachments(Killer.Pig,Rarity.Rare),
	 Jigsaw_s_Sketch(Killer.Pig,Rarity.Rare), 
	 Interlocking_Razor(Killer.Pig,Rarity.Rare),
	 Bag_Of_Gears(Killer.Pig,Rarity.Rare),
	 
	 Tampered_Timer(Killer.Pig,Rarity.Very_Rare),
	 Jigsaw_s_Annotated_Plan(Killer.Pig,Rarity.Very_Rare),
	 Crate_Of_Gears(Killer.Pig,Rarity.Very_Rare),
	 Amanda_s_Secret(Killer.Pig,Rarity.Very_Rare),
	 
	 Rules_Set_No_2(Killer.Pig,Rarity.Ultra_Rare),
	 Amanda_s_Letter(Killer.Pig,Rarity.Ultra_Rare),	 
	 
	//Clown
	 Smelly_Inner_Soles(Killer.Clown,Rarity.Common),	
	 Robin_Feather(Killer.Clown,Rarity.Common),	
	 Fingerless_Parade_Gloves(Killer.Clown,Rarity.Common),	
	 Ether_5_Vol(Killer.Clown,Rarity.Common),	

	 Thick_Cork_Stopper(Killer.Clown,Rarity.Uncommon),	
	 Sticky_Soda_Bottle(Killer.Clown,Rarity.Uncommon),	
	 Starling_Feather(Killer.Clown,Rarity.Uncommon),	
	 Solvent_Jug(Killer.Clown,Rarity.Uncommon),	
	 Kerosene_Can(Killer.Clown,Rarity.Uncommon),	

	 VHS_Porn(Killer.Clown,Rarity.Rare),	
	 Sulphuric_Acid_Vial(Killer.Clown,Rarity.Rare),	
	 Flask_Of_Bleach(Killer.Clown,Rarity.Rare),	
	 Ether_10_Vol(Killer.Clown,Rarity.Rare),	
	 Bottle_Of_Chloroform(Killer.Clown,Rarity.Rare),	

	 Garish_Make_up_it(Killer.Clown,Rarity.Very_Rare),	
	 Ether_15_Vol(Killer.Clown,Rarity.Very_Rare),	
	 Cigar_Box(Killer.Clown,Rarity.Very_Rare),	
	 Cheap_Gin_Bottle(Killer.Clown,Rarity.Very_Rare),	

	 Tattoo_s_Middle_Finger(Killer.Clown,Rarity.Ultra_Rare),	
	 Redhead_s_Pinky_Finger(Killer.Clown,Rarity.Ultra_Rare),	

	
	//Spirit
	Zoki(Killer.Spirit,Rarity.Common),
	Shiawase_Amulet(Killer.Spirit,Rarity.Common),
	Origami_Crane(Killer.Spirit,Rarity.Common),
	Gifted_Bamboo_Comb(Killer.Spirit,Rarity.Common),
	
	White_Hair_Ribbon(Killer.Spirit,Rarity.Uncommon),
	Rin_s_Broken_Watch(Killer.Spirit,Rarity.Uncommon),
	Muddy_Sports_Day_Cap(Killer.Spirit,Rarity.Uncommon),
	Kaiun_Talisman(Killer.Spirit,Rarity.Uncommon),
	Juniper_Bonsai(Killer.Spirit,Rarity.Uncommon),
	
	Rusty_Flute(Killer.Spirit,Rarity.Rare),
	Katsumori_Talisman(Killer.Spirit,Rarity.Rare),
	Katana_Tsuba(Killer.Spirit,Rarity.Rare),
	Dirty_Uwabaki(Killer.Spirit,Rarity.Rare),
	Bloody_Hair_Brooch(Killer.Spirit,Rarity.Rare),
	
	Yakuyoke_Amulet(Killer.Spirit,Rarity.Very_Rare),
	Wakizashi_Saya(Killer.Spirit,Rarity.Very_Rare),
	Prayer_Beads_Bracelet(Killer.Spirit,Rarity.Very_Rare),
	Dried_Cherry_Blossom(Killer.Spirit,Rarity.Very_Rare),
	
	Mother_Daughter_Ring(Killer.Spirit,Rarity.Ultra_Rare),
	Father_s_Glasses(Killer.Spirit,Rarity.Ultra_Rare);
	
	private final Killer referedKiller;
	private final Rarity rarity;
	
	PowerAddOn (Killer killer, Rarity rarity){
		this.referedKiller = killer;
		this.rarity = rarity;
	}

	/**
	 * @return the rarity
	 */
	public Rarity getRarity() {
		return rarity;
	}

	/**
	 * @return the referedKiller
	 */
	public Killer getReferedKiller() {
		return referedKiller;
	}
	
	/**
	 * List of all power addons
	 */
	private static final ArrayList<PowerAddOn> listPowerAddOn;
	
	static {
		listPowerAddOn = new ArrayList<>();
	        for (PowerAddOn someEnum : PowerAddOn.values()) {
	        	listPowerAddOn.add(someEnum);
	        }
	}

	public static List<PowerAddOn> getValues() {
		return Collections.unmodifiableList(listPowerAddOn);
	}
	
	public static ArrayList<PowerAddOn> getPowerAddOnsOf(Killer killer){
		ArrayList<PowerAddOn> addons = new ArrayList<>();
		for (PowerAddOn someEnum : PowerAddOn.values()) {
			if(someEnum.referedKiller.equals(killer)){
				addons.add(someEnum);
        	}
		}
		return addons;	
	}
	
	 public static PowerAddOn randomPowerAddOn(Killer killer){
		 Random r = new Random();
		 return getPowerAddOnsOf(killer).get(r.nextInt(getPowerAddOnsOf(killer).size()));
	 }
	 
	 public static ArrayList<PowerAddOn> randomTwoPowerAddOns(Killer killer){
		 ArrayList<PowerAddOn> twoPowerAddOns = new ArrayList<>();
		 for(int i = 0 ; i<2;i++){
			 PowerAddOn randomAddOn = PowerAddOn.randomPowerAddOn(killer);
			 if(!twoPowerAddOns.contains(randomAddOn)){
				 twoPowerAddOns.add(randomAddOn);
			 } else {
				 i--;
			 }
		 }
		return twoPowerAddOns;
	 }
	
}
