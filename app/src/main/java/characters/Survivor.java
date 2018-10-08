package characters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * List of the 12 survivors
 * @author MissBipBip
 *
 */
public enum Survivor {
	Dwight,
	Meg,
	Claudette,
	Jake,
	Nea,
	Laurie,
	Ace,
	Bill,
	FengMin,
	Quentin,
	David,
	Detective_Tapp,
	Kate,
	Adam;
	
	private static final ArrayList<Survivor> listSurvivors;
	
	static {
		listSurvivors = new ArrayList<>();
	        for (Survivor someEnum : Survivor.values()) {
	        	listSurvivors.add(someEnum);
	        }
	}

	public static List<Survivor> getValues() {
		return Collections.unmodifiableList(listSurvivors);
	}

	/**
	 * 
	 * @return the number of survivors
	 */
	public static int numberOfSurvivors(){
		return listSurvivors.size();
	}
	
	public static Survivor randomSurvivor(){
		 Random r = new Random();
		 return Survivor.getValues().get(r.nextInt(numberOfSurvivors()));
	 }
}
