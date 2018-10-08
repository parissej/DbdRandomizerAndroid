package perks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * List of the 50 survivor perks
 * @author MissBipBip
 *
 */
public enum SurvivorPerks {
	Dark_Sense ("All"),
	Deja_Vu ("All"),
	Hope ("All"),
	Kindred ("All"),
	Lighweight ("All"),
	No_One_Left_Behind ("All"),
	Plunderer_s_Instinct ("All"),
	Premonition ("All"),
	Resilience ("All"),
	Slippery_Meat ("All"),
	Small_Game ("All"),
	Spine_Chill ("All"),
	This_Is_Not_Happening ("All"),
	We_ll_Make_It ("All"),
	
	Bond ("Dwight"),
	Prove_Thyself ("Dwight"),
	Leader ("Dwight"),
	
	Quick_and_Quiet ("Meg"),
	Sprint_Burst ("Meg"),
	Adrenaline ("Meg"),
	
	Empathy ("Claudette"),
	Botany_Knowledge ("Claudette"),
	Self_Care ("Claudette"),
	
	Iron_Will ("Jake"),
	Calm_Spirit ("Jake"),
	Saboteur ("Jake"),
	
	Balanced_Landing ("Nea"),
	Urban_Evasion ("Nea"),
	Streetwise ("Nea"),
	
	Left_Behind ("Bill"),
	Borrowed_Time ("Bill"),
	Unbreakable ("Bill"),
	
	We_re_Gonna_Live_Forever ("David"),
	Dead_Hard ("David"),
	No_Mither ("David"),
	
	Sole_Survivor ("Laurie"),
	Object_of_Obsession ("Laurie"),
	Decisive_Strike ("Laurie"),
	
	Open_Handed ("Ace"),
	Up_The_Ante ("Ace"),
	Ace_in_The_Hole ("Ace"),
	
	Technician ("FengMin"),
	Lithe ("FengMin"),
	Alert ("FengMin"),
	
	Wake_Up ("Quentin"),
	Pharmacy ("Quentin"),
	Vigil ("Quentin"),
	
	Tenacity ("DectectiveTapp"),
	Detective_s_Hunch ("DectectiveTapp"),
	Stake_Out ("DectectiveTapp"),
	
	Dance_With_Me("Kate"),
	Windows_Of_Opportunity("Kate"),
	Boil_Over("Kate"),
	
	Diversion("Adam"),
	Deliverance("Adam"),	
	Autodidact("Adam");
	
	private final String survivorName;
	
	SurvivorPerks(String survivorName) {
        this.survivorName = survivorName;
    }
	
	private static final ArrayList<SurvivorPerks> listPerks;
	
	 static {
		 listPerks = new ArrayList<>();
	        for (SurvivorPerks someEnum : SurvivorPerks.values()) {
	        	listPerks.add(someEnum);
	        }
	    }
	 
	 public static List<SurvivorPerks> getValues() {
	        return Collections.unmodifiableList(listPerks);
	    }
	 
	 public static int numberOfPerks(){
		 return listPerks.size();
	 }
	 
	 public static SurvivorPerks randomSurvivorPerk(){
		 Random r = new Random();
		 return SurvivorPerks.getValues().get(r.nextInt(numberOfPerks()));
	 }
	 
	 public static ArrayList<SurvivorPerks> randomFourSurvivorPerk(){
		 ArrayList<SurvivorPerks> fourPerks = new ArrayList<>();
		 for(int i = 0 ; i<4;i++){
			 SurvivorPerks randomPerk = SurvivorPerks.randomSurvivorPerk();
			 if(!fourPerks.contains(randomPerk)){
				 fourPerks.add(randomPerk);
			 } else {
				 i--;
			 }
		 }
		return fourPerks;
	 }

	/**
	 * @return the survivorName
	 */
	public String getSurvivorName() {
		return survivorName;
	}
}
