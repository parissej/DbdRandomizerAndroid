package perks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * List of the 45 killer perks
 * @author MissBipBip
 *
 */
public enum KillerPerks {
	Bitter_Mumur ("All"),
	Deerstalker ("All"),
	Distressing ("All"),
	Insidious ("All"),
	Iron_Grasp ("All"),
	Hex_No_One_Escapes_Death ("All"),
	Hex_Thrill_of_the_Hunt ("All"),
	Monstrous_Shrine ("All"),
	Sloppy_Butcher ("All"),
	Spies_From_The_Shadows ("All"),
	Unrelenting ("All"),
	Whispers ("All"),
	
	Unnerving_Presence ("Trapper"),
	Brutal_Strenght ("Trapper"),
	Agitation ("Trapper"),
	
	Predator ("Wraith"),
	Bloodhound ("Wraith"),
	Shadowborn ("Wraith"),
	
	Enduring ("Hillbilly"),
	Lightborn ("Hillbilly"),
	Tinkerer ("Hillbilly"),
	
	Stridor ("Nurse"),
	Thanatophobia ("Nurse"),
	A_Nurse_s_Calling ("Nurse"),
	
	Beast_Of_Prey ("Huntress"),
	Territorial_Imperative ("Huntress"),
	Hex_Huntress_Lullaby ("Huntress"),
	
	Save_The_Best_For_Last ("Shape"),
	Play_With_Your_Food ("Shape"),
	Dying_Light ("Shape"),
	
	Hex_The_Third_Seal ("Hag"),
	Hex_Ruin ("Hag"),
	Hex_Devour_Hope ("Hag"),
	
	Knock_Out ("Cannibal"),
	Barbecue_and_Chilli ("Cannibal"),
	Franklin_s_Demise ("Cannibal"),
	
	Overwhelming_Presence ("Doctor"),
	Monitor_and_Abuse ("Doctor"),
	Overcharge ("Doctor"),
	
	Fire_Up ("Nightmare"),
	Remember_Me ("Nightmare"),
	Blood_Warden ("Nightmare"),
	
	Hangman_s_Trick ("Pig"),
	Surveillance ("Pig"),
	Make_Your_Choice ("Pig"),
	
	Bamboozle("Clown"),
	Coulrophobia("Clown"),
	Pop_Goes_The_Weasel("Clown"),
	
	Spirit_Fury("Spirit"),
	Hex_Haunted_Ground("Spirit"),
	Rancor("Spirit");
		
	@SuppressWarnings("unused")
	private final String killerName;
	
	KillerPerks(String killerName) {
        this.killerName = killerName;
    }
	private static final ArrayList<KillerPerks> listPerks;
	
	 static {
		 listPerks = new ArrayList<>();
	        for (KillerPerks someEnum : KillerPerks.values()) {
	        	listPerks.add(someEnum);
	        }
	    }
	 
	 public static List<KillerPerks> getValues() {
	        return Collections.unmodifiableList(listPerks);
	    }
	 
	 /**
	  * 
	  * @return the number of killer perks
	  */
	 public static int numberOfPerks(){
		 return listPerks.size();
	 }
	 
	 public static KillerPerks randomKillerPerk(){
		 Random r = new Random();
		 return KillerPerks.getValues().get(r.nextInt(numberOfPerks()));
	 }
	 
	 public static ArrayList<KillerPerks> randomFourKillerPerk(){
		 ArrayList<KillerPerks> fourPerks = new ArrayList<>();
		 for(int i = 0 ; i<4;i++){
			 KillerPerks randomPerk = KillerPerks.randomKillerPerk();
			 if(!fourPerks.contains(randomPerk)){
				 fourPerks.add(randomPerk);
			 } else {
				 i--;
			 }
		 }
		return fourPerks;
	 }
}
