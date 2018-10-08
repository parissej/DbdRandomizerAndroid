package main;

import java.util.ArrayList;

import characters.*;
import items.*;
import offerings.*;
import perks.*;

/**
 * Gives a randomized killer and survivor with their attributes
 * @author MissBipBip
 *
 */
public class RandomizedAsset {
	//IF ITS A KILLER
	Killer killer;
	ArrayList<KillerPerks> randomKillerPerks;
	KillerOffering kOffering;
	
	//IF ITS A SURVIVOR
	Survivor survivor;
	ArrayList<SurvivorPerks> randomSurvivorPerks;
	SurvivorOffering sOffering;
	Item item;
	
	public RandomizedAsset(){
		this.killer = Killer.randomKiller();
		this.randomKillerPerks = KillerPerks.randomFourKillerPerk();
		this.kOffering = KillerOffering.randomKillerOffering();
		
		this.survivor = Survivor.randomSurvivor();
		this.randomSurvivorPerks = SurvivorPerks.randomFourSurvivorPerk();
		this.sOffering = SurvivorOffering.randomSurvivorOffering();
		this.item = Item.randomItem();
	}
	
	public void printlnSurvivor(){
		System.out.println("Survivor : " + getSurvivor()+"\n"
				+"Perks : " + getSPerk1()+" / "+getSPerk2()+" / "+getSPerk3()+" / "+getSPerk4()+"\n"
				+"Offering : " + getsOffering()+"\n"
				+"Item : " + getItem()+" "+" // Addons : " + getAddOn1()+ " / "+ getAddOn2());
	}
	
	public void printlnKiller(){
		System.out.println("Killer : " + getKiller()+" // AddOns : "+getPowerAddOn1()+" / "+getPowerAddOn2()+"\n"
				+"Perks : " + getkperk1()+" / " + getkperk2()+" / "+getkperk3()+" / "+getkperk4()+ "\n"
				+"Offering : " + getkOffering());
	}

	public void printlnkillersurvivor(){
		printlnKiller();
		System.out.print("\n");
		printlnSurvivor();
	}
	
	public Killer getKiller() {
		return killer;
	}

	public ArrayList<KillerPerks> getRandomKillerPerks() {
		return randomKillerPerks;
	}

	public KillerPerks getkperk1(){
		return getRandomKillerPerks().get(0);
	}
	
	public KillerPerks getkperk2(){
		return getRandomKillerPerks().get(1);
	}
	
	public KillerPerks getkperk3(){
		return getRandomKillerPerks().get(2);
	}
	
	public KillerPerks getkperk4(){
		return getRandomKillerPerks().get(3);
	}
	
	public KillerOffering getkOffering() {
		return kOffering;
	}

	public Survivor getSurvivor() {
		return survivor;
	}

	public ArrayList<SurvivorPerks> getRandomSurvivorPerks() {
		return randomSurvivorPerks;
	}
	
	public SurvivorPerks getSPerk1(){
		return this.getRandomSurvivorPerks().get(0);
	}

	public SurvivorPerks getSPerk2(){
		return this.getRandomSurvivorPerks().get(1);
	}

	public SurvivorPerks getSPerk3(){
		return this.getRandomSurvivorPerks().get(2);
	}

	public SurvivorPerks getSPerk4(){
		return this.getRandomSurvivorPerks().get(3);
	}

	
	
	public SurvivorOffering getsOffering() {
		return sOffering;
	}

	public Item getItem() {
		return item;
	}
	
	public ItemAddOn getAddOn1(){
		return getItem().getAddOn1();
	}
	
	public ItemAddOn getAddOn2(){
		return getItem().getAddOn2();
	}
	
	public PowerAddOn getPowerAddOn1(){
		return getKiller().getPowerAddOn1();
	}
	
	public PowerAddOn getPowerAddOn2(){
		return getKiller().getPowerAddOn2();
	}
}
