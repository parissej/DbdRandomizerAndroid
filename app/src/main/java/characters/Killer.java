package characters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import items.PowerAddOn;


/**
 * List of the 11 killers
 * @author MissBipBip
 *
 */
public enum Killer {
	Trapper,
	Wraith,
	Hillbilly,
	Nurse,
	Huntress,
	Shape,
	Hag,
	Cannibal,
	Doctor,
	Nightmare,
	Pig,
	Clown,
	Spirit;
		
	private static final ArrayList<Killer> listKillers;
	private ArrayList<PowerAddOn> addons;
	
	Killer(){
		this.setPowerAddOns(null);
	}
	
	/**
	 * @return the addons
	 */
	public ArrayList<PowerAddOn> getPowerAddOns() {
		return addons;
	}
	
	
	public PowerAddOn getPowerAddOn1(){
		return this.getPowerAddOns().get(0);
	}

	public PowerAddOn getPowerAddOn2(){
		return this.getPowerAddOns().get(1);
	}
	

	/**
	 * @param addons the addons to set
	 */
	public void setPowerAddOns(ArrayList<PowerAddOn> addons) {
		this.addons = addons;
	}

	static {
		listKillers = new ArrayList<>();
	        for (Killer someEnum : Killer.values()) {
	        	listKillers.add(someEnum);
	        }
	}

	public static List<Killer> getValues() {
		return Collections.unmodifiableList(listKillers);
	}

	/**
	 * 
	 * @return the number of killer
	 */
	public static int numberOfKillers(){
		return listKillers.size();
	}
	
	public static Killer randomKiller(){
		Random r = new Random();
		Killer killer;
		killer = Killer.getValues().get(r.nextInt(numberOfKillers()));
		killer.setPowerAddOns(PowerAddOn.randomTwoPowerAddOns(killer));
		return killer;
	 }
}
